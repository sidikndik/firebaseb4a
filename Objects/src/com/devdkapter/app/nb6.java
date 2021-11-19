package com.devdkapter.app;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class nb6 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.devdkapter.app.nb6");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.devdkapter.app.nb6.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _channel = null;
public anywheresoftware.b4j.object.JavaObject _notificationbuilder = null;
public int _sdklevel = 0;
public anywheresoftware.b4j.object.JavaObject _ctxt = null;
public int _s_old = 0;
public int _s_builder = 0;
public int _s_channel = 0;
public int _supportlevel = 0;
public anywheresoftware.b4a.objects.NotificationWrapper _oldnotification = null;
public anywheresoftware.b4j.object.JavaObject _pendingintentstatic = null;
public anywheresoftware.b4j.object.JavaObject _notificationstatic = null;
public anywheresoftware.b4j.object.JavaObject _common = null;
public com.devdkapter.app.main _main = null;
public com.devdkapter.app.starter _starter = null;
public com.devdkapter.app.firebasemessaging _firebasemessaging = null;
public com.devdkapter.app.httputils2service _httputils2service = null;
public com.devdkapter.app.nb6  _addbuttonaction(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _service,String _action) throws Exception{
Object _ac = null;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
 //BA.debugLineNum = 70;BA.debugLine="If IsBuilder = False Then Return Me";
if (_isbuilder()==__c.False) { 
if (true) return (com.devdkapter.app.nb6)(this);};
 //BA.debugLineNum = 71;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
_ac = _createaction(_bmp,_title,_createreceiverpendingintent(_service,_action));
 //BA.debugLineNum = 72;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
_notificationbuilder.RunMethod("addAction",new Object[]{_ac});
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _autocancel(boolean _cancel) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
 //BA.debugLineNum = 120;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 121;BA.debugLine="OldNotification.AutoCancel = Cancel";
_oldnotification.setAutoCancel(_cancel);
 }else {
 //BA.debugLineNum = 123;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
_notificationbuilder.RunMethod("setAutoCancel",new Object[]{(Object)(_cancel)});
 };
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _badgeicontype(String _icontype) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 130;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
 //BA.debugLineNum = 131;BA.debugLine="If SdkLevel >= 26 Then";
if (_sdklevel>=26) { 
 //BA.debugLineNum = 132;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("LARGE"),(Object)(2),(Object)("NONE"),(Object)(0),(Object)("SMALL"),(Object)(1)});
 //BA.debugLineNum = 133;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
_notificationbuilder.RunMethod("setBadgeIconType",new Object[]{_m.Get((Object)(_icontype))});
 };
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _bigpicturestyle(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _largeiconbmp,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture,Object _contenttitle,Object _summarytext) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
 //BA.debugLineNum = 236;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 237;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
_setstyle("android.app.Notification$BigPictureStyle",__c.createMap(new Object[] {(Object)("bigLargeIcon"),(Object)(_largeiconbmp.getObject()),(Object)("bigPicture"),(Object)(_picture.getObject()),(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _bigtextstyle(Object _contenttitle,Object _summarytext,Object _text) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
 //BA.debugLineNum = 248;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 249;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
_setstyle("android.app.Notification$BigTextStyle",__c.createMap(new Object[] {(Object)("bigText"),_text,(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.NotificationWrapper  _build(Object _contenttitle,Object _contenttext,String _tag,Object _activity) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
anywheresoftware.b4j.object.JavaObject _manager = null;
 //BA.debugLineNum = 272;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
 //BA.debugLineNum = 273;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 274;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
_oldnotification.SetInfo2New(ba,BA.ObjectToCharSequence(_contenttitle),BA.ObjectToCharSequence(_contenttext),BA.ObjectToCharSequence(_tag),_activity);
 //BA.debugLineNum = 275;BA.debugLine="Return OldNotification";
if (true) return _oldnotification;
 }else {
 //BA.debugLineNum = 277;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = _createintent(_activity,__c.False);
 //BA.debugLineNum = 278;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
 //BA.debugLineNum = 279;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
_in.PutExtra("Notification_Tag",(Object)(_tag));
 //BA.debugLineNum = 280;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
_pendingintent = _pendingintentstatic.RunMethod("getActivity",new Object[]{(Object)(_ctxt.getObject()),(Object)(__c.Rnd((int) (0),(int) (0x7fffffff))),(Object)(_in.getObject()),(Object)(0)});
 //BA.debugLineNum = 281;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
_notificationbuilder.RunMethodJO("setContentTitle",new Object[]{_contenttitle}).RunMethodJO("setContentText",new Object[]{_contenttext});
 //BA.debugLineNum = 282;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
_notificationbuilder.RunMethod("setContentIntent",new Object[]{_pendingintent});
 //BA.debugLineNum = 284;BA.debugLine="If IsChannel Then";
if (_ischannel()) { 
 //BA.debugLineNum = 285;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
_manager = new anywheresoftware.b4j.object.JavaObject();
_manager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getSystemService",new Object[]{(Object)("notification")})));
 //BA.debugLineNum = 286;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
_manager.RunMethod("createNotificationChannel",new Object[]{(Object)(_channel.getObject())});
 };
 //BA.debugLineNum = 289;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
if (true) return (anywheresoftware.b4a.objects.NotificationWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.NotificationWrapper(), (java.lang.Object)(_notificationbuilder.RunMethod("build",(Object[])(__c.Null))));
 };
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Channel As JavaObject";
_channel = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 4;BA.debugLine="Private NotificationBuilder As JavaObject";
_notificationbuilder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 5;BA.debugLine="Private SdkLevel As Int";
_sdklevel = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 7;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
_s_old = (int) (0);
_s_builder = (int) (1);
_s_channel = (int) (2);
 //BA.debugLineNum = 8;BA.debugLine="Private SupportLevel As Int";
_supportlevel = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private OldNotification As Notification";
_oldnotification = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private PendingIntentStatic As JavaObject";
_pendingintentstatic = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 11;BA.debugLine="Private NotificationStatic As JavaObject";
_notificationstatic = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 12;BA.debugLine="Private common As JavaObject";
_common = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public com.devdkapter.app.nb6  _color(int _clr) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
 //BA.debugLineNum = 140;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 141;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
_notificationbuilder.RunMethod("setColor",new Object[]{(Object)(_clr)});
 };
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public Object  _createaction(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _pendingintent) throws Exception{
anywheresoftware.b4j.object.JavaObject _builder = null;
 //BA.debugLineNum = 306;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
 //BA.debugLineNum = 307;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 308;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{_createiconfrombitmap(_bmp),_title,_pendingintent});
 //BA.debugLineNum = 309;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
if (true) return _builder.RunMethod("build",(Object[])(__c.Null));
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public Object  _createiconfrombitmap(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4j.object.JavaObject _icon = null;
 //BA.debugLineNum = 312;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
 //BA.debugLineNum = 313;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
if (_bmp== null || _bmp.IsInitialized()==__c.False) { 
if (true) return (Object)(0);};
 //BA.debugLineNum = 314;BA.debugLine="Dim icon As JavaObject";
_icon = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 315;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
if (true) return _icon.InitializeStatic("android.graphics.drawable.Icon").RunMethod("createWithBitmap",new Object[]{(Object)(_bmp.getObject())});
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.IntentWrapper  _createintent(Object _target,boolean _receiver) throws Exception{
anywheresoftware.b4j.object.JavaObject _in = null;
 //BA.debugLineNum = 299;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
 //BA.debugLineNum = 300;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
_target = _common.RunMethod("getComponentClass",new Object[]{__c.Null,_target,(Object)(_receiver)});
 //BA.debugLineNum = 301;BA.debugLine="Dim in As JavaObject";
_in = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 302;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
_in.InitializeNewInstance("android.content.Intent",new Object[]{(Object)(_ctxt.getObject()),_target});
 //BA.debugLineNum = 303;BA.debugLine="Return in";
if (true) return (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_in.getObject()));
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public Object  _createreceiverpendingintent(Object _service,String _action) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
 //BA.debugLineNum = 293;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
 //BA.debugLineNum = 294;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = _createintent(_service,__c.True);
 //BA.debugLineNum = 295;BA.debugLine="in.Action = Action";
_in.setAction(_action);
 //BA.debugLineNum = 296;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
if (true) return _pendingintentstatic.RunMethod("getBroadcast",new Object[]{(Object)(_ctxt.getObject()),(Object)(1),(Object)(_in.getObject()),(Object)(0)});
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _customsound(Object _fileprovideruri) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
 //BA.debugLineNum = 209;BA.debugLine="If IsOld Then Return Me";
if (_isold()) { 
if (true) return (com.devdkapter.app.nb6)(this);};
 //BA.debugLineNum = 210;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
_ctxt.RunMethod("grantUriPermission",new Object[]{(Object)("com.android.systemui"),_fileprovideruri,(Object)(1)});
 //BA.debugLineNum = 211;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 212;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
_notificationbuilder.RunMethod("setSound",new Object[]{_fileprovideruri,_notificationstatic.GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 //BA.debugLineNum = 213;BA.debugLine="If IsChannel Then";
if (_ischannel()) { 
 //BA.debugLineNum = 214;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
_channel.RunMethod("setSound",new Object[]{_fileprovideruri,_notificationstatic.GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 };
 };
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _deleteaction(Object _service,String _action) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
 //BA.debugLineNum = 80;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 81;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
_notificationbuilder.RunMethod("setDeleteIntent",new Object[]{_createreceiverpendingintent(_service,_action)});
 };
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _initialize(anywheresoftware.b4a.BA _ba,String _channelid,Object _channelname,String _importancelevel) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.Map _im = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _pm = null;
int _p = 0;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
 //BA.debugLineNum = 28;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
 //BA.debugLineNum = 29;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
_pendingintentstatic.InitializeStatic("android.app.PendingIntent");
 //BA.debugLineNum = 30;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
_notificationstatic.InitializeStatic("android.app.Notification");
 //BA.debugLineNum = 31;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
_common.InitializeStatic("anywheresoftware.b4a.keywords.Common");
 //BA.debugLineNum = 32;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 33;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
_sdklevel = (int)(BA.ObjectToNumber(_jo.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
 //BA.debugLineNum = 34;BA.debugLine="If SdkLevel < 23 Then";
if (_sdklevel<23) { 
 //BA.debugLineNum = 35;BA.debugLine="SupportLevel = S_OLD";
_supportlevel = _s_old;
 }else if(_sdklevel>=26) { 
 //BA.debugLineNum = 37;BA.debugLine="SupportLevel = S_CHANNEL";
_supportlevel = _s_channel;
 }else {
 //BA.debugLineNum = 39;BA.debugLine="SupportLevel = S_BUILDER";
_supportlevel = _s_builder;
 };
 //BA.debugLineNum = 41;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 42;BA.debugLine="OldNotification.Initialize";
_oldnotification.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="OldNotification.Icon = \"icon\"";
_oldnotification.setIcon("icon");
 }else if(_ischannel()) { 
 //BA.debugLineNum = 45;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
_channelid = _channelid+"_"+_importancelevel;
 //BA.debugLineNum = 46;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
_notificationbuilder.InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(_ctxt.getObject()),(Object)(_channelid)});
 //BA.debugLineNum = 47;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
_im = new anywheresoftware.b4a.objects.collections.Map();
_im = __c.createMap(new Object[] {(Object)("MIN"),(Object)(1),(Object)("LOW"),(Object)(2),(Object)("DEFAULT"),(Object)(3),(Object)("HIGH"),(Object)(4)});
 //BA.debugLineNum = 48;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
_i = (int)(BA.ObjectToNumber(_im.Get((Object)(_importancelevel))));
 //BA.debugLineNum = 49;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
_channel.InitializeNewInstance("android.app.NotificationChannel",new Object[]{(Object)(_channelid),(Object)(__c.Application.getLabelName()),(Object)(_i)});
 }else {
 //BA.debugLineNum = 51;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
_notificationbuilder.InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(_ctxt.getObject())});
 //BA.debugLineNum = 52;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
_pm = new anywheresoftware.b4a.objects.collections.Map();
_pm = __c.createMap(new Object[] {(Object)("MIN"),(Object)(-2),(Object)("LOW"),(Object)(-1),(Object)("DEFAULT"),(Object)(0),(Object)("HIGH"),(Object)(1)});
 //BA.debugLineNum = 53;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
_p = (int)(BA.ObjectToNumber(_pm.Get((Object)(_importancelevel))));
 //BA.debugLineNum = 54;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
_notificationbuilder.RunMethod("setPriority",new Object[]{(Object)(_p)});
 };
 //BA.debugLineNum = 56;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
if ((_importancelevel).equals("DEFAULT") || (_importancelevel).equals("HIGH")) { 
 //BA.debugLineNum = 57;BA.debugLine="SetDefaults(True, True, True)";
_setdefaults(__c.True,__c.True,__c.True);
 }else {
 //BA.debugLineNum = 59;BA.debugLine="SetDefaults(False, True, True)";
_setdefaults(__c.False,__c.True,__c.True);
 };
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public boolean  _isbuilder() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Private Sub IsBuilder As Boolean";
 //BA.debugLineNum = 319;BA.debugLine="Return SupportLevel >= S_BUILDER";
if (true) return _supportlevel>=_s_builder;
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return false;
}
public boolean  _ischannel() throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Private Sub IsChannel As Boolean";
 //BA.debugLineNum = 327;BA.debugLine="Return SupportLevel = S_CHANNEL";
if (true) return _supportlevel==_s_channel;
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return false;
}
public boolean  _isold() throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Private Sub IsOld As Boolean";
 //BA.debugLineNum = 323;BA.debugLine="Return SupportLevel = S_OLD";
if (true) return _supportlevel==_s_old;
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return false;
}
public com.devdkapter.app.nb6  _largeicon(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
 //BA.debugLineNum = 104;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 105;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
_notificationbuilder.RunMethod("setLargeIcon",new Object[]{_createiconfrombitmap(_icon)});
 };
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _number(int _num) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub Number (Num As Int) As NB6";
 //BA.debugLineNum = 148;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 149;BA.debugLine="OldNotification.Number = Num";
_oldnotification.setNumber(_num);
 }else {
 //BA.debugLineNum = 151;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
_notificationbuilder.RunMethod("setNumber",new Object[]{(Object)(_num)});
 };
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _oldnotificationicon(String _resourcename) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
 //BA.debugLineNum = 88;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 89;BA.debugLine="OldNotification.Icon = ResourceName";
_oldnotification.setIcon(_resourcename);
 };
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _onlyalertonce(boolean _once) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
 //BA.debugLineNum = 112;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 113;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
_notificationbuilder.RunMethod("setOnlyAlertOnce",new Object[]{(Object)(_once)});
 };
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _progress(int _value,int _maxvalue,boolean _indeterminate) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
 //BA.debugLineNum = 170;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 171;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
_notificationbuilder.RunMethod("setProgress",new Object[]{(Object)(_maxvalue),(Object)(_value),(Object)(_indeterminate)});
 };
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _setdefaults(boolean _sound,boolean _light,boolean _vibrate) throws Exception{
int _currentdefaults = 0;
 //BA.debugLineNum = 186;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
 //BA.debugLineNum = 187;BA.debugLine="If IsOld Then";
if (_isold()) { 
 //BA.debugLineNum = 188;BA.debugLine="OldNotification.Sound = Sound";
_oldnotification.setSound(_sound);
 //BA.debugLineNum = 189;BA.debugLine="OldNotification.Light = Light";
_oldnotification.setLight(_light);
 //BA.debugLineNum = 190;BA.debugLine="OldNotification.Vibrate = Vibrate";
_oldnotification.setVibrate(_vibrate);
 }else {
 //BA.debugLineNum = 192;BA.debugLine="If IsChannel Then";
if (_ischannel()) { 
 //BA.debugLineNum = 193;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
_channel.RunMethod("enableLights",new Object[]{(Object)(_light)});
 //BA.debugLineNum = 194;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
_channel.RunMethod("enableVibration",new Object[]{(Object)(_vibrate)});
 }else {
 //BA.debugLineNum = 196;BA.debugLine="Dim CurrentDefaults As Int";
_currentdefaults = 0;
 //BA.debugLineNum = 197;BA.debugLine="If Sound Then CurrentDefaults = 1";
if (_sound) { 
_currentdefaults = (int) (1);};
 //BA.debugLineNum = 198;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
if (_vibrate) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (2));};
 //BA.debugLineNum = 199;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
if (_light) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (4));};
 //BA.debugLineNum = 200;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
_notificationbuilder.RunMethod("setDefaults",new Object[]{(Object)(_currentdefaults)});
 };
 };
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public String  _setstyle(String _stylename,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.object.JavaObject _style = null;
String _method = "";
Object _value = null;
 //BA.debugLineNum = 255;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
 //BA.debugLineNum = 256;BA.debugLine="Dim style As JavaObject";
_style = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 257;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
_style.InitializeNewInstance(_stylename,(Object[])(__c.Null));
 //BA.debugLineNum = 258;BA.debugLine="For Each method As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _props.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 259;BA.debugLine="Dim value As Object = Props.Get(method)";
_value = _props.Get((Object)(_method));
 //BA.debugLineNum = 260;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
 //BA.debugLineNum = 261;BA.debugLine="style.RunMethod(method, Array(value))";
_style.RunMethod(_method,new Object[]{_value});
 };
 }
};
 //BA.debugLineNum = 264;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
_notificationbuilder.RunMethod("setStyle",new Object[]{(Object)(_style.getObject())});
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public com.devdkapter.app.nb6  _showwhen(long _time) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
 //BA.debugLineNum = 158;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 159;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
_notificationbuilder.RunMethod("setShowWhen",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 160;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
_notificationbuilder.RunMethod("setWhen",new Object[]{(Object)(_time)});
 };
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _smallicon(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
 //BA.debugLineNum = 96;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 97;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
_notificationbuilder.RunMethod("setSmallIcon",new Object[]{_createiconfrombitmap(_icon)});
 };
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _subtext(Object _text) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
 //BA.debugLineNum = 178;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 179;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
_notificationbuilder.RunMethod("setSubText",new Object[]{_text});
 };
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public com.devdkapter.app.nb6  _visibility(String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
 //BA.debugLineNum = 225;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
 //BA.debugLineNum = 226;BA.debugLine="If IsBuilder Then";
if (_isbuilder()) { 
 //BA.debugLineNum = 227;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("PUBLIC"),(Object)(1),(Object)("SECRET"),(Object)(-1),(Object)("PRIVATE"),(Object)(0)});
 //BA.debugLineNum = 228;BA.debugLine="Dim i As Int = m.Get(Value)";
_i = (int)(BA.ObjectToNumber(_m.Get((Object)(_value))));
 //BA.debugLineNum = 229;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
_notificationbuilder.RunMethod("setVisibility",new Object[]{(Object)(_i)});
 };
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (com.devdkapter.app.nb6)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
