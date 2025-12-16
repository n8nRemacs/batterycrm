package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.EglBase;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class fg1 {
    public final si1 a;
    public final yi1 b;
    public final y6d c;
    public final z6d d;
    public final y8g e;
    public final qf1 f;
    public final xo8 g;
    public final dj1 h;
    public final enb i;
    public final y6i j;
    public final m65 k;
    public final vgd l;
    public final gr1 m;
    public final EglBase n;
    public final ExecutorService o;
    public final ExecutorService p;
    public final ys4 q;
    public final rve r;
    public final wd8 s;
    public final f54 t;
    public final sf1 u;
    public final f0f v;
    public final v06 w;

    public fg1(Context context, si1 si1Var, boolean z, boolean z2, yi1 yi1Var, p64 p64Var, b7d b7dVar, y6d y6dVar, z6d z6dVar, hqa hqaVar, btd btdVar, li liVar, y8g y8gVar, CallAnalyticsSender callAnalyticsSender, t7c t7cVar, h1e h1eVar, d91 d91Var) {
        this.a = si1Var;
        this.b = yi1Var;
        this.c = y6dVar;
        this.d = z6dVar;
        this.e = y8gVar;
        qf1 qf1Var = new qf1();
        this.f = qf1Var;
        xo8 xo8Var = new xo8(qf1Var);
        this.g = xo8Var;
        dj1 dj1Var = new dj1(yi1Var, qf1Var, xo8Var, y6dVar);
        this.h = dj1Var;
        enb enbVar = new enb(y6dVar, 18);
        this.i = enbVar;
        this.j = new y6i(22);
        this.k = new m65(dj1Var, si1Var, y6dVar, b7dVar, qf1Var, y8gVar);
        vgd vgdVar = new vgd(8, new se0(this, 6));
        this.l = vgdVar;
        gr1 gr1Var = new gr1(context, new i21(b7dVar, callAnalyticsSender), y8gVar, (ConnectivityManager) context.getSystemService("connectivity"), (TelephonyManager) context.getSystemService("phone"), y6dVar, vgdVar, p64Var, si1Var);
        this.m = gr1Var;
        EglBase eglBaseCreate = EglBase.create();
        this.n = eglBaseCreate;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.o = executorServiceNewSingleThreadExecutor;
        this.p = Executors.newSingleThreadExecutor();
        ys4 ys4Var = new ys4(y6dVar);
        this.q = ys4Var;
        this.r = new rve(executorServiceNewSingleThreadExecutor, eglBaseCreate, y6dVar, si1Var, ys4Var, gr1Var.k);
        wd8 wd8Var = new wd8(context, y6dVar);
        this.s = wd8Var;
        fo4 fo4Var = new fo4(context);
        fo4Var.d = si1Var.g;
        fo4Var.b = hqaVar;
        fo4Var.o = wd8Var;
        qi1 qi1Var = si1Var.z;
        fo4Var.a = qi1Var.a;
        fo4Var.c = y6dVar;
        if (hqaVar == null) {
            throw new IllegalStateException();
        }
        this.t = new f54(fo4Var);
        sf1 sf1Var = new sf1(dj1Var, y6dVar, xf3.d, new kk4(29), new tv(0, 7, dj1.class, dj1Var, "activeRoomId", "getActiveRoomId()Lru/ok/android/webrtc/sessionroom/SessionRoomId;"), wd8Var, si1Var);
        this.u = sf1Var;
        this.v = new f0f(y6dVar, yi1Var, sf1Var);
        this.w = new v06(gr1Var.k, enbVar, y8gVar, z, z2, qi1Var.w, new se0(this, 1), vgdVar, new o91(0, dj1Var, dj1.class, "size", "size()I", 0, 15), y6dVar);
    }
}
