package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import android.util.Log;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class dj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dj(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [b86, qy1] */
    @Override // java.lang.Runnable
    public final void run() {
        a4h a4hVar;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                ej ejVar = (ej) this.c;
                ti1 ti1Var = (ti1) this.d;
                if (!z) {
                    if (!ejVar.p) {
                        ejVar.n.log("AniRenderDispatch", "Postponed renderer for " + ti1Var + " is no longer needed, remove it from waiting list");
                        ejVar.l.remove(ti1Var);
                    }
                    return;
                }
                ejVar.b(ti1Var);
                if (ejVar.p) {
                    return;
                }
                ejVar.n.log("AniRenderDispatch", "Renderer for " + ti1Var + " can not be created right now, postpone creation for a while");
                ejVar.l.add(ti1Var);
                return;
            case 1:
                boolean z2 = this.b;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.c;
                tc7 tc7Var = (tc7) this.d;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                List list = tc7Var.b;
                if (z2) {
                    chatsListSearchScreen.C0();
                }
                chatsListSearchScreen.D0(false);
                chatsListSearchScreen.C0.E((List) ((zh0) chatsListSearchScreen.Z.getValue()).Z.a.getValue());
                chatsListSearchScreen.v0.E(!list.isEmpty() ? Collections.singletonList(fdd.a) : hd5.a);
                chatsListSearchScreen.w0.E(list);
                chatsListSearchScreen.x0.E(tc7Var.c);
                return;
            case 2:
                final c86 c86Var = (c86) this.c;
                boolean z3 = this.b;
                final tu1 tu1Var = (tu1) this.d;
                ((HashSet) c86Var.a.b.b).remove(c86Var.u);
                c86Var.t = z3;
                if (!c86Var.d) {
                    tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                final long jA = c86Var.a.A();
                ?? r1 = new qy1() { // from class: b86
                    @Override // defpackage.qy1
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        boolean z4 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        gri.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z4);
                        if (z4 != c86Var.t || !ry1.x(totalCaptureResult, jA)) {
                            return false;
                        }
                        gri.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z4);
                        tu1Var.b(null);
                        return true;
                    }
                };
                c86Var.u = r1;
                c86Var.a.p(r1);
                return;
            case 3:
                Context context = (Context) this.c;
                boolean z4 = this.b;
                n2g n2gVar = (n2g) this.d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = a7j.b(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z4) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    n2gVar.d(null);
                }
            case 4:
                jzf jzfVar = (jzf) this.c;
                Collection collection = (Collection) this.d;
                boolean z5 = this.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    jzfVar.g(collection, z5);
                } catch (Exception e) {
                    wqi.b("jzf", "sync exception", e);
                    ((y3b) jzfVar.j).a(e);
                }
                wqi.c("jzf", "syncWorker: sync %d ids done for %d", Integer.valueOf(collection.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            case 5:
                ((vdg) this.c).a((tu1) this.d, this.b);
                return;
            case 6:
                iy1 iy1Var = (iy1) this.c;
                boolean z6 = this.b;
                a4h a4hVar2 = (a4h) this.d;
                try {
                    synchronized (iy1Var.e) {
                        try {
                            if (!iy1Var.b || !z6) {
                                while (true) {
                                    synchronized (iy1Var.e) {
                                        a4hVar = (a4h) ((ArrayDeque) iy1Var.g).poll();
                                    }
                                    if (a4hVar == null) {
                                        a4hVar2.run();
                                    } else {
                                        a4hVar.run();
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Exception e2) {
                    iy1Var.b(e2);
                    return;
                }
            default:
                r8i r8iVar = (r8i) this.c;
                ae4 ae4Var = (ae4) this.d;
                boolean z7 = this.b;
                jud judVar = r8iVar.a;
                ae4 ae4Var2 = (ae4) judVar.b.get();
                if (judVar.j.get() || ae4Var2 != ae4Var) {
                    return;
                }
                if (z7) {
                    judVar.b();
                    return;
                } else {
                    judVar.a();
                    return;
                }
        }
    }

    public /* synthetic */ dj(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ dj(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
