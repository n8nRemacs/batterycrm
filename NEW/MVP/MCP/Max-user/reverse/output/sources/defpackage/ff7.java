package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ff7 {
    public final ik4 a;
    public final uha b;
    public final q85 c;
    public final kk4 d;
    public final Context e;
    public final v25 f;
    public final ux4 g;
    public final fm4 h;
    public final bk5 i;
    public final be7 j;
    public final we4 k;
    public final nx4 l;
    public final vha m;
    public final vui n;
    public final v5c o;
    public final kme p;
    public final Set q;
    public final rd5 r;
    public final rd5 s;
    public final boolean t;
    public final nx4 u;
    public final k34 v;
    public final pea w;
    public final boolean x;
    public final rha y;
    public final q85 z;

    /* JADX WARN: Multi-variable type inference failed */
    public ff7(ef7 ef7Var) {
        ml6.i();
        lk6 lk6Var = ef7Var.l;
        pea peaVar = new pea();
        peaVar.a = lk6Var.b;
        peaVar.c = new lcj(21);
        peaVar.d = (lx4) lk6Var.c;
        peaVar.b = (r8j) lk6Var.d;
        this.w = peaVar;
        Object systemService = ef7Var.b.getSystemService("activity");
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = new ik4((ActivityManager) systemService);
        this.b = new uha(14);
        this.c = new q85(25);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        kk4 kk4Var = ef7Var.a;
        this.d = kk4Var == null ? kk4.t() : kk4Var;
        Context context = ef7Var.b;
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.e = context;
        this.f = ef7Var.c;
        this.h = new fm4();
        be7 be7Var = ef7Var.e;
        if (be7Var == null) {
            synchronized (uha.class) {
                try {
                    if (uha.b == null) {
                        uha.b = new uha(0);
                    }
                    be7Var = uha.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.j = be7Var;
        this.k = hni.a;
        nx4 nx4Var = ef7Var.f;
        if (nx4Var == null) {
            Context context2 = ef7Var.b;
            ml6.i();
            nx4Var = new nx4(new mx4(context2));
        }
        this.l = nx4Var;
        this.m = vha.b();
        ml6.i();
        vui vuiVar = ef7Var.g;
        this.n = vuiVar == null ? new ka7() : vuiVar;
        v5c v5cVar = ef7Var.h;
        v5cVar = v5cVar == null ? new v5c(new uy5(new fa6())) : v5cVar;
        this.o = v5cVar;
        this.p = new kme(1);
        Set set = ef7Var.i;
        this.q = set == null ? rd5.a : set;
        rd5 rd5Var = rd5.a;
        this.r = rd5Var;
        this.s = rd5Var;
        this.t = true;
        nx4 nx4Var2 = ef7Var.j;
        this.u = nx4Var2 != null ? nx4Var2 : nx4Var;
        this.v = ef7Var.k;
        int i = ((w5c) v5cVar.a.d).d;
        zva zvaVar = ef7Var.d;
        zva zvaVar2 = zvaVar;
        if (zvaVar == null) {
            b4 b4Var = new b4();
            b4Var.a = Executors.newFixedThreadPool(2, new pc4("FrescoIoBoundExecutor", 1));
            b4Var.b = Executors.newFixedThreadPool(i, new pc4("FrescoDecodeExecutor", 1));
            b4Var.c = Executors.newFixedThreadPool(i, new pc4("FrescoBackgroundExecutor", 1));
            b4Var.d = Executors.newFixedThreadPool(1, new pc4("FrescoLightWeightBackgroundExecutor", 1));
            b4Var.o = Executors.newScheduledThreadPool(i, new pc4("FrescoBackgroundExecutor", 1));
            zvaVar2 = b4Var;
        }
        this.i = zvaVar2;
        this.x = true;
        this.y = ef7Var.m;
        this.z = new q85(17);
        this.g = new ux4(new v17(19, (byte) 0), this);
        ml6.i();
    }
}
