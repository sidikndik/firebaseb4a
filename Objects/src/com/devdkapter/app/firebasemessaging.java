package com.devdkapter.app;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class firebasemessaging extends  android.app.Service{
	public static class firebasemessaging_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (firebasemessaging) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, firebasemessaging.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, BA.class);
		}

	}
    static firebasemessaging mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return firebasemessaging.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "com.devdkapter.app", "com.devdkapter.app.firebasemessaging");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.devdkapter.app.firebasemessaging", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (firebasemessaging) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (firebasemessaging) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (firebasemessaging) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (firebasemessaging) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (firebasemessaging) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper _fm = null;
public static com.devdkapter.app.nb6 _n = null;
public static anywheresoftware.b4a.objects.NotificationWrapper _notif = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _logo = null;
public com.devdkapter.app.main _main = null;
public com.devdkapter.app.starter _starter = null;
public com.devdkapter.app.httputils2service _httputils2service = null;
public static String  _fm_messagearrived(anywheresoftware.b4a.objects.FirebaseNotificationsService.RemoteMessageWrapper _message) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub fm_MessageArrived (Message As RemoteMessage)";
 //BA.debugLineNum = 32;BA.debugLine="Log(\"Message arrived\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83538945","Message arrived",0);
 //BA.debugLineNum = 33;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("83538946",("Message data: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_message.GetData().getObject()))+""),0);
 //BA.debugLineNum = 38;BA.debugLine="logo = LoadBitmapResize(File.DirAssets, \"logo.png";
_logo = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"logo.png",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 39;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"H";
_n._initialize /*com.devdkapter.app.nb6*/ (processBA,"default",(Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName()),"HIGH")._autocancel /*com.devdkapter.app.nb6*/ (anywheresoftware.b4a.keywords.Common.True)._smallicon /*com.devdkapter.app.nb6*/ (_logo);
 //BA.debugLineNum = 40;BA.debugLine="notif = n.Build(Message.GetData.Get(\"title\"), Mes";
_notif = _n._build /*anywheresoftware.b4a.objects.NotificationWrapper*/ (_message.GetData().Get((Object)("title")),_message.GetData().Get((Object)("body")),"tag1",(Object)(mostCurrent._main.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="notif.Notify(1)";
_notif.Notify((int) (1));
 //BA.debugLineNum = 42;BA.debugLine="Starter.pv.Vibrate(1000)";
mostCurrent._starter._pv /*anywheresoftware.b4a.phone.Phone.PhoneVibrate*/ .Vibrate(processBA,(long) (1000));
 //BA.debugLineNum = 43;BA.debugLine="Starter.badge.applyCount(1)";
mostCurrent._starter._badge /*de.donmanfred.ShortcutBadgerwrapper*/ .applyCount(processBA,(int) (1));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim fm As FirebaseMessaging";
_fm = new anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim n As NB6";
_n = new com.devdkapter.app.nb6();
 //BA.debugLineNum = 10;BA.debugLine="Dim notif As Notification";
_notif = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim logo As Bitmap";
_logo = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 15;BA.debugLine="fm.Initialize(\"fm\")";
_fm.Initialize(processBA,"fm");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(com.devdkapter.app.firebasemessaging parent,anywheresoftware.b4a.objects.IntentWrapper _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
com.devdkapter.app.firebasemessaging parent;
anywheresoftware.b4a.objects.IntentWrapper _startingintent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 26;BA.debugLine="If StartingIntent.IsInitialized Then fm.HandleInt";
if (true) break;

case 1:
//if
this.state = 6;
if (_startingintent.IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._fm.HandleIntent((android.content.Intent)(_startingintent.getObject()));
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 27;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,this,(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 28;BA.debugLine="Service.StopAutomaticForeground";
parent.mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _subscribetotopics() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub SubscribeToTopics";
 //BA.debugLineNum = 19;BA.debugLine="fm.SubscribeToTopic(\"dkapster_order\") 'you can su";
_fm.SubscribeToTopic("dkapster_order");
 //BA.debugLineNum = 20;BA.debugLine="Log(fm.Token)";
anywheresoftware.b4a.keywords.Common.LogImpl("83407874",_fm.getToken(),0);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
}
