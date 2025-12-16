package defpackage;

import android.graphics.PorterDuff;
import android.net.http.X509TrustManagerExtensions;
import java.util.Iterator;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$NoAvailableCameraException;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class kvf implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kvf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Object ipdVar;
        zkg zkgVar;
        Object ipdVar2;
        zkg zkgVar2;
        Object next;
        Object next2;
        zkg zkgVar3 = null;
        boolean z = true;
        boolean z2 = true;
        final int i = 0;
        switch (this.a) {
            case 0:
                SwipeWidget swipeWidget = (SwipeWidget) this.b;
                int i2 = SwipeWidget.c;
                return Boolean.valueOf(swipeWidget.Y());
            case 1:
                return ((g4b) ((u0g) this.b).s0.getValue()).g();
            case 2:
                usb usbVar = usb.v0;
                r2g r2gVar = (r2g) this.b;
                return "Cancelling task of type=" + usbVar + ", task=" + r2gVar.f.getClass().getName() + ", id=" + r2gVar.a + ", status=" + r2gVar.b;
            case 3:
                return new X509TrustManagerExtensions(((y1g) this.b).c);
            case 4:
                enb enbVar = (enb) this.b;
                String str = kca.TENSORFLOW.a;
                try {
                    System.loadLibrary(str);
                } catch (UnsatisfiedLinkError e) {
                    ((y6d) enbVar.b).reportException("CallsSdk", ho7.i("library ", str, " not found"), e);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return new uyg(((c7g) this.b).a);
            case 6:
                final ThreadsStateViewerScreen threadsStateViewerScreen = (ThreadsStateViewerScreen) this.b;
                yy7[] yy7VarArr = ThreadsStateViewerScreen.o;
                yfb yfbVar = new yfb(threadsStateViewerScreen.getContext(), 6);
                yfbVar.setId(lyc.threads_state_toolbar);
                yfbVar.setTitle("Состояние потоков");
                yfbVar.setForm(qfb.a);
                yfbVar.setLeftActions(new gfb(new em6() { // from class: c8g
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        int i3 = i;
                        qqg qqgVar = qqg.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        yy7[] yy7VarArr2 = ThreadsStateViewerScreen.o;
                        switch (i3) {
                            case 0:
                                jva onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                    break;
                                }
                                break;
                            default:
                                a8g a8gVar = (a8g) threadsStateViewerScreen2.c.getValue();
                                a8gVar.getClass();
                                a8gVar.c.O(a8gVar, a8g.o[0], xfh.o(a8gVar, null, new z7g(a8gVar, null), 1));
                                break;
                        }
                        return qqgVar;
                    }
                }));
                int i3 = yud.I1;
                int i4 = w9b.a;
                final boolean z3 = z2 ? 1 : 0;
                yfbVar.setRightActions(new lfb(null, new sfb(i3, new em6() { // from class: c8g
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        int i32 = z3;
                        qqg qqgVar = qqg.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        yy7[] yy7VarArr2 = ThreadsStateViewerScreen.o;
                        switch (i32) {
                            case 0:
                                jva onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                    break;
                                }
                                break;
                            default:
                                a8g a8gVar = (a8g) threadsStateViewerScreen2.c.getValue();
                                a8gVar.getClass();
                                a8gVar.c.O(a8gVar, a8g.o[0], xfh.o(a8gVar, null, new z7g(a8gVar, null), 1));
                                break;
                        }
                        return qqgVar;
                    }
                }, 6), null));
                return yfbVar;
            case 7:
                xkg xkgVar = (xkg) this.b;
                up7 up7Var = xkgVar.d;
                if (up7Var != null && (zkgVar = up7Var.o) != null) {
                    return zkgVar;
                }
                gu5 gu5Var = (gu5) ((rt5) xkgVar.Z.getValue());
                gu5Var.getClass();
                String strL = gu5Var.l(PmsKey.f36creation2faconfig, "");
                if (strL != null && strL.length() != 0) {
                    try {
                        ipdVar = new JSONObject(strL);
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    boolean z4 = ipdVar instanceof ipd;
                    Object obj = ipdVar;
                    if (z4) {
                        obj = null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        zkgVar3 = new zkg(jSONObject.optInt("pass_min_len"), jSONObject.optInt("pass_max_len"), jSONObject.optInt("hint_max_len"));
                    }
                }
                return zkgVar3 == null ? zkg.d : zkgVar3;
            case 8:
                emg emgVar = (emg) this.b;
                up7 up7Var2 = emgVar.X;
                if (up7Var2 != null && (zkgVar2 = up7Var2.o) != null) {
                    return zkgVar2;
                }
                gu5 gu5Var2 = (gu5) ((rt5) emgVar.s0.getValue());
                gu5Var2.getClass();
                String strL2 = gu5Var2.l(PmsKey.f36creation2faconfig, "");
                if (strL2 != null && strL2.length() != 0) {
                    try {
                        ipdVar2 = new JSONObject(strL2);
                    } catch (Throwable th2) {
                        ipdVar2 = new ipd(th2);
                    }
                    boolean z5 = ipdVar2 instanceof ipd;
                    Object obj2 = ipdVar2;
                    if (z5) {
                        obj2 = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    if (jSONObject2 != null) {
                        zkgVar3 = new zkg(jSONObject2.optInt("pass_min_len"), jSONObject2.optInt("pass_max_len"), jSONObject2.optInt("hint_max_len"));
                    }
                }
                return zkgVar3 == null ? zkg.d : zkgVar3;
            case 9:
                TwoFASettingsScreen twoFASettingsScreen = (TwoFASettingsScreen) this.b;
                int i5 = TwoFASettingsScreen.X;
                return new sp7(twoFASettingsScreen.getRouter());
            case 10:
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.b;
                yy7[] yy7VarArr2 = TwoFAStartRestoreScreen.s0;
                return new sp7(twoFAStartRestoreScreen.getRouter());
            case 11:
                UnknownContactBottomSheet unknownContactBottomSheet = (UnknownContactBottomSheet) this.b;
                hs hsVar = unknownContactBottomSheet.C0;
                yy7[] yy7VarArr3 = UnknownContactBottomSheet.J0;
                yy7 yy7Var = yy7VarArr3[0];
                String str2 = (String) hsVar.a(unknownContactBottomSheet);
                hs hsVar2 = unknownContactBottomSheet.D0;
                yy7 yy7Var2 = yy7VarArr3[1];
                return new nrg(str2, ((Number) hsVar2.a(unknownContactBottomSheet)).longValue());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new lwg((q9b) ((bwf) this.b).getValue());
            case 13:
                ValueBottomSheet valueBottomSheet = (ValueBottomSheet) this.b;
                yy7[] yy7VarArr4 = ValueBottomSheet.H0;
                api.c(valueBottomSheet);
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                float fIntValue = ((Number) ((t0h) this.b).c.getValue()).intValue();
                return Integer.valueOf((int) (fIntValue - (0.4f * fIntValue)));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                l5h l5hVar = (l5h) this.b;
                ewe eweVar = new ewe();
                eweVar.setCallback(l5hVar.d);
                ulc ulcVar = new ulc(4);
                bwe bweVar = (bwe) ulcVar.b;
                bweVar.j = false;
                ulcVar.q(-1);
                ulcVar.p(0.1f);
                bweVar.d = -1;
                bweVar.d = (((int) (Math.min(1.0f, Math.max(0.0f, 0.7f)) * 255.0f)) << 24) | (bweVar.d & 16777215);
                ulcVar.r(2000L);
                bweVar.k = PorterDuff.Mode.SRC_OVER;
                eweVar.b(ulcVar.k());
                eweVar.setBounds(0, 0, l5hVar.getMeasuredWidth(), l5hVar.getMeasuredHeight());
                return eweVar;
            case 16:
                a8h a8hVar = (a8h) this.b;
                a8hVar.u0 = true;
                a8hVar.c();
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                q8h q8hVar = (q8h) this.b;
                w9c w9cVar = q8hVar.f;
                if (w9cVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f32 f32Var = f32.b;
                boolean zR = q8hVar.r(w9cVar, f32Var);
                f32 f32Var2 = f32.c;
                boolean zR2 = q8hVar.r(w9cVar, f32Var2);
                if (zR) {
                    return f32Var;
                }
                if (zR2) {
                    return f32Var2;
                }
                throw new VideoMessageRecordDelegate$NoAvailableCameraException(0);
            case 18:
                return new zah((wah) this.b);
            case 19:
                Iterator<E> it = ((dbh) this.b).X.q().a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((jgg) next).b.c == 2) {
                        }
                    } else {
                        next = null;
                    }
                }
                jgg jggVar = (jgg) next;
                if (jggVar == null) {
                    return null;
                }
                Iterator it2 = n7j.h(0, jggVar.a).iterator();
                while (true) {
                    so7 so7Var = (so7) it2;
                    if (so7Var.c) {
                        next2 = so7Var.next();
                        if (jggVar.e[((Number) next2).intValue()]) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                Integer num = (Integer) next2;
                if (num == null) {
                    return null;
                }
                hf6 hf6Var = jggVar.b.d[num.intValue()];
                if (hf6Var != null) {
                    return m7j.c(hf6Var.u, hf6Var.v);
                }
                return null;
            case 20:
                VideoViewerWidget videoViewerWidget = (VideoViewerWidget) this.b;
                yy7[] yy7VarArr5 = VideoViewerWidget.u0;
                rdh rdhVarA0 = videoViewerWidget.A0();
                if (rdhVarA0 != null) {
                    return ((ChatMediaViewerScreen) rdhVarA0).O0();
                }
                return null;
            case 21:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                hs hsVar3 = videoWebViewScreen.d;
                yy7[] yy7VarArr6 = VideoWebViewScreen.H0;
                yy7 yy7Var3 = yy7VarArr6[0];
                long jLongValue = ((Number) hsVar3.a(videoWebViewScreen)).longValue();
                hs hsVar4 = videoWebViewScreen.o;
                yy7 yy7Var4 = yy7VarArr6[1];
                String str3 = (String) hsVar4.a(videoWebViewScreen);
                hs hsVar5 = videoWebViewScreen.X;
                yy7 yy7Var5 = yy7VarArr6[2];
                return new aeh(jLongValue, ((Number) hsVar5.a(videoWebViewScreen)).longValue(), str3);
            case 22:
                return ((lv4) ((aoh) this.b).d.getValue()).a();
            case 23:
                return ((uvh) this.b).v().l;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                WelcomeScreen welcomeScreen = (WelcomeScreen) this.b;
                yy7[] yy7VarArr7 = WelcomeScreen.Z;
                return new jp7(welcomeScreen.getRouter());
            case 25:
                return Widget.childWidgetContainer_delegate$lambda$19((Widget) this.b);
            case 26:
                return new s2i(((s2i) this.b).b, 1);
            case 27:
                a5i a5iVar = (a5i) this.b;
                uaj uajVar = new uaj(2);
                uajVar.d = a5iVar.a;
                uajVar.b = Math.min(100, 50);
                k18 k18Var = a5iVar.c;
                uajVar.e = ((g4b) k18Var.getValue()).c();
                uajVar.c = ((g4b) k18Var.getValue()).a();
                return new qo3(uajVar);
            default:
                g5i g5iVar = (g5i) this.b;
                wqi.c("g5i", "start init property workManager", new Object[0]);
                c5i c5iVarD = c5i.d(new f5i(g5iVar, g5iVar.a));
                wqi.c("g5i", "workManager property inited!", new Object[0]);
                d5i d5iVar = new d5i();
                synchronized (cei.a) {
                    cei.b = d5iVar;
                }
                return c5iVarD;
        }
    }
}
