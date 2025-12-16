package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class hn5 implements dh0, wgg {
    public static final zjd i = wg7.o(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zjd j = wg7.o(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zjd k = wg7.o(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zjd l = wg7.o(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zjd m = wg7.o(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zjd n = wg7.o(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public final Context a;
    public final ah7 b;
    public final boolean c;
    public final fqb d;
    public final k8f e;
    public int f;
    public long g;
    public String h;

    public hn5(Context context, HashMap map, fqb fqbVar, k8f k8fVar) {
        this.a = context == null ? null : context.getApplicationContext();
        this.b = ah7.a(map);
        this.d = fqbVar;
        this.e = k8fVar;
        this.c = true;
        qea qeaVarA = qea.a(context);
        int iB = qeaVarA.b();
        this.f = iB;
        this.g = j(iB);
        qeaVarA.c(new ck4(1, this), if0.a());
    }

    public static boolean k(ze4 ze4Var, boolean z) {
        return z && (ze4Var.i & 8) != 8;
    }

    @Override // defpackage.dh0
    public final synchronized void a(nj4 nj4Var) {
        this.e.e.p(nj4Var);
    }

    @Override // defpackage.dh0
    public final synchronized long b() {
        fqb fqbVar;
        fqbVar = this.d;
        return !fqbVar.e ? (long) fqbVar.b.c(fqbVar.c) : -9223372036854775807L;
    }

    @Override // defpackage.wgg
    public final synchronized void c(se4 se4Var, ze4 ze4Var, boolean z) {
        if (k(ze4Var, z)) {
            fqb fqbVar = this.d;
            kr8 kr8Var = fqbVar.a;
            kr8Var.remove(ze4Var);
            fqbVar.d.getClass();
            kr8Var.put(ze4Var, Long.valueOf(zxg.U(SystemClock.elapsedRealtime())));
            this.e.getClass();
        }
    }

    @Override // defpackage.wgg
    public final synchronized void d(se4 se4Var, ze4 ze4Var, boolean z, int i2) {
        if (k(ze4Var, z)) {
            k8f k8fVar = this.e;
            long j2 = i2;
            k8fVar.h += j2;
            k8fVar.l += j2;
        }
    }

    @Override // defpackage.dh0
    public final wgg e() {
        return this;
    }

    @Override // defpackage.dh0
    public final synchronized long f() {
        long j2;
        j2 = this.e.i;
        if (j2 == Long.MIN_VALUE) {
            j2 = this.g;
        }
        return j2;
    }

    @Override // defpackage.dh0
    public final synchronized void g(Handler handler, nj4 nj4Var) {
        nj4Var.getClass();
        ao6 ao6Var = this.e.e;
        ao6Var.getClass();
        ao6Var.p(nj4Var);
        ((CopyOnWriteArrayList) ao6Var.b).add(new ah0(handler, nj4Var));
    }

    @Override // defpackage.wgg
    public final synchronized void h(se4 se4Var, ze4 ze4Var, boolean z) {
        if (k(ze4Var, z)) {
            this.e.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wgg
    public final synchronized void i(se4 se4Var, ze4 ze4Var, boolean z) {
        if (k(ze4Var, z)) {
            fqb fqbVar = this.d;
            if (((Long) fqbVar.a.remove(ze4Var)) != null) {
                s4f s4fVar = fqbVar.b;
                fqbVar.d.getClass();
                s4fVar.a(1, zxg.U(SystemClock.elapsedRealtime()) - r7.longValue());
                fqbVar.e = false;
            }
            k8f k8fVar = this.e;
            if (k8fVar.f == 0) {
                k8fVar.d.getClass();
                k8fVar.g = SystemClock.elapsedRealtime();
            }
            k8fVar.f++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(int r18) {
        /*
            Method dump skipped, instructions count: 8770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn5.j(int):long");
    }
}
