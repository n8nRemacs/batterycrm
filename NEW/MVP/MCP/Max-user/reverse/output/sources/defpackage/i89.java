package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final /* synthetic */ class i89 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeMediaSessionService b;
    public final /* synthetic */ w69 c;

    public /* synthetic */ i89(OneMeMediaSessionService oneMeMediaSessionService, w69 w69Var, int i) {
        this.a = i;
        this.b = oneMeMediaSessionService;
        this.c = w69Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w69 w69Var = this.c;
                o79 o79Var = w69Var.a;
                OneMeMediaSessionService oneMeMediaSessionService = this.b;
                f29 f29VarB = oneMeMediaSessionService.b();
                OneMeMediaSessionService oneMeMediaSessionService2 = f29VarB.a;
                HashMap map = f29VarB.Y;
                if (!map.containsKey(w69Var)) {
                    e29 e29Var = new e29(f29VarB, oneMeMediaSessionService2, w69Var);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    tje tjeVar = o79Var.j;
                    tjeVar.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    zxg.z();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    yx8 yx8Var = new yx8(mainLooper);
                    zxg.a0(new Handler(mainLooper), new mx8(yx8Var, new px8(oneMeMediaSessionService2, tjeVar, bundle3, e29Var, mainLooper, yx8Var, tjeVar.a.d() ? new h79(6, new ue4(oneMeMediaSessionService2)) : null), 0));
                    map.put(w69Var, new d29(yx8Var));
                    yx8Var.d(new u02(f29VarB, yx8Var, e29Var, w69Var, 7), f29VarB.o);
                }
                o79Var.w = new r5j(27, oneMeMediaSessionService);
                break;
            default:
                HashMap map2 = this.b.b().Y;
                w69 w69Var2 = this.c;
                d29 d29Var = (d29) map2.remove(w69Var2);
                if (d29Var != null) {
                    yx8 yx8Var2 = d29Var.a;
                    if (!yx8Var2.cancel(false)) {
                        try {
                            ((px8) a6a.a(yx8Var2)).w();
                        } catch (CancellationException | ExecutionException e) {
                            a8i.m("MediaController", "MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                w69Var2.a.w = null;
                break;
        }
    }
}
