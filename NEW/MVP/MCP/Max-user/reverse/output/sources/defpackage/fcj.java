package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fcj {
    public static cji k;
    public static final nji l;
    public final String a;
    public final String b;
    public final dcj c;
    public final sve d;
    public final ybj e;
    public final ybj f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new nji(0, objArr);
    }

    public fcj(Context context, sve sveVar, dcj dcjVar, String str) {
        this.a = context.getPackageName();
        this.b = ri3.a(context);
        this.d = sveVar;
        this.c = dcjVar;
        lcj.q();
        this.g = str;
        h08 h08VarJ = h08.J();
        bm4 bm4Var = new bm4(21, this);
        h08VarJ.getClass();
        this.e = h08.P(bm4Var);
        h08 h08VarJ2 = h08.J();
        Objects.requireNonNull(sveVar);
        y0j y0jVar = new y0j(sveVar, 2);
        h08VarJ2.getClass();
        this.f = h08.P(y0jVar);
        nji njiVar = l;
        this.h = njiVar.containsKey(str) ? d85.d(context, (String) njiVar.get(str), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(ecj ecjVar, v6j v6jVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (d(v6jVar, jElapsedRealtime)) {
            this.i.put(v6jVar, Long.valueOf(jElapsedRealtime));
            spi.a.execute(new b6i(9, this, ecjVar.d(), v6jVar, c(), false));
        }
    }

    public final String c() {
        ybj ybjVar = this.e;
        if (ybjVar.h()) {
            return (String) ybjVar.f();
        }
        return h38.c.a(this.g);
    }

    public final boolean d(v6j v6jVar, long j) {
        HashMap map = this.i;
        return map.get(v6jVar) == null || j - ((Long) map.get(v6jVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
