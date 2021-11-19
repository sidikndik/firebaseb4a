B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=8.8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	Dim fm As FirebaseMessaging
'	Dim n As Notification
	Dim n As NB6
	Dim notif As Notification
	Dim logo As Bitmap
End Sub

Sub Service_Create
	fm.Initialize("fm")
End Sub
 
Public Sub SubscribeToTopics
	fm.SubscribeToTopic("dkapster_order") 'you can subscribe to more topics
	Log(fm.Token)
'	logo = LoadBitmapResize(File.DirAssets, "logo.png", 24dip, 24dip, False)
'	n.Initialize("default", Application.LabelName, "DEFAULT").AutoCancel(True).SmallIcon(logo)
End Sub

Sub Service_Start (StartingIntent As Intent)
	If StartingIntent.IsInitialized Then fm.HandleIntent(StartingIntent)
	Sleep(0)
	Service.StopAutomaticForeground
End Sub

Sub fm_MessageArrived (Message As RemoteMessage)
	Log("Message arrived")
	Log($"Message data: ${Message.GetData}"$)
'	n.Initialize
'	n.Icon = "icon"
'	n.SetInfo(Message.GetData.Get("title"), Message.GetData.Get("body"), Main)
'	n.Notify(1)
	logo = LoadBitmapResize(File.DirAssets, "logo.png", 24dip, 24dip, False)
	n.Initialize("default", Application.LabelName, "HIGH").AutoCancel(True).SmallIcon(logo)
	notif = n.Build(Message.GetData.Get("title"), Message.GetData.Get("body"), "tag1", Main)
	notif.Notify(1)
	Starter.pv.Vibrate(1000)
	Starter.badge.applyCount(1)
End Sub

Sub Service_Destroy
End Sub


