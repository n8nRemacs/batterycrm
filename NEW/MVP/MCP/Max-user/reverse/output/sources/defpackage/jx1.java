package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class jx1 {
    public final k18 a;
    public final k18 b;
    public final c9a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;

    public jx1(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
        long[] jArr = fzd.a;
        this.c = new c9a();
        this.g = "";
    }

    public final void a(boolean z, boolean z2) {
        c9a c9aVar = this.c;
        arb arbVar = arb.CALL_INIT;
        zqb zqbVar = (zqb) c9aVar.f(arbVar);
        if (zqbVar == null || zqbVar.c != -1) {
            return;
        }
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
        if (zqbVar2 != null) {
            c().getClass();
            zqbVar2.c = SystemClock.elapsedRealtime() - zqbVar2.b;
        }
        this.e = z;
        this.f = z2;
        jrb jrbVar = (jrb) this.a.getValue();
        jx1 jx1Var = jrbVar.b;
        boolean z3 = jx1Var.e;
        boolean z4 = jx1Var.d;
        boolean z5 = jx1Var.f;
        gqb gqbVar = gqb.EVENT_CALL_INIT;
        crb crbVarE = jx1Var.e(gqbVar);
        if (crbVarE == null) {
            return;
        }
        jrbVar.d(gqbVar, jrb.a(jrbVar, z4, null, Boolean.valueOf(z3), Boolean.valueOf(z5), null, 1, crbVarE.a, 18));
    }

    public final void b(boolean z) {
        c().getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        arb arbVar = arb.CALL_INIT;
        this.c.m(arbVar, new zqb(arbVar, jElapsedRealtime));
        this.d = z;
    }

    public final erb c() {
        return (erb) this.b.getValue();
    }

    public final void d(int i) {
        String str;
        c9a c9aVar = this.c;
        arb arbVar = arb.INCOMING_CALL_PROCESSING_INIT;
        zqb zqbVar = (zqb) c9aVar.f(arbVar);
        if (zqbVar == null || zqbVar.c != -1) {
            return;
        }
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
        if (zqbVar2 != null) {
            c().getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zqbVar2.c = jElapsedRealtime - zqbVar2.b;
            f(jElapsedRealtime);
        }
        if (i == 0) {
            str = null;
        } else if (i == 1) {
            str = "REPEATING_PUSH_NOTIFICATION";
        } else if (i == 2) {
            str = "CALLING_EACH_OTHER";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "BUSY";
        }
        this.h = str;
        jrb jrbVar = (jrb) this.a.getValue();
        jx1 jx1Var = jrbVar.b;
        String str2 = jx1Var.h;
        gqb gqbVar = gqb.EVENT_INCOMING_CALL_PROCESSING_INIT;
        crb crbVarE = jx1Var.e(gqbVar);
        if (crbVarE == null) {
            return;
        }
        jrbVar.d(gqbVar, jrb.a(jrbVar, true, str2, null, null, null, 1, crbVarE.a, 28));
    }

    public final crb e(gqb gqbVar) {
        o98 o98VarA;
        int iOrdinal = gqbVar.ordinal();
        c9a c9aVar = this.c;
        long j = -1;
        if (iOrdinal == 3) {
            o98 o98VarD = ve3.d();
            zqb zqbVar = (zqb) c9aVar.f(arb.CALL_INIT);
            if (zqbVar != null) {
                j = zqbVar.c;
                o98VarD.add(zqbVar);
            }
            o98VarA = ve3.a(o98VarD);
        } else if (iOrdinal == 4) {
            o98 o98VarD2 = ve3.d();
            zqb zqbVar2 = (zqb) c9aVar.f(arb.CALL_SCREEN_INIT_TO_RENDER);
            if (zqbVar2 != null) {
                o98VarD2.add(zqbVar2);
                j = zqbVar2.c;
            }
            zqb zqbVar3 = (zqb) c9aVar.f(arb.CALL_SCREEN_VIEW_CREATION);
            if (zqbVar3 != null) {
                o98VarD2.add(zqbVar3);
                j += zqbVar3.c;
            }
            zqb zqbVar4 = (zqb) c9aVar.f(arb.CALL_SCREEN_VIEW_CREATED);
            if (zqbVar4 != null) {
                o98VarD2.add(zqbVar4);
                j += zqbVar4.c;
            }
            o98VarA = ve3.a(o98VarD2);
        } else {
            if (iOrdinal != 5) {
                return null;
            }
            o98 o98VarD3 = ve3.d();
            zqb zqbVar5 = (zqb) c9aVar.f(arb.INCOMING_CALL_PROCESSING_INIT);
            if (zqbVar5 != null) {
                j = zqbVar5.c;
                o98VarD3.add(zqbVar5);
            }
            o98VarA = ve3.a(o98VarD3);
        }
        return new crb(j, o98VarA);
    }

    public final void f(long j) {
        zqb zqbVar = (zqb) this.c.f(arb.CALL_SCREEN_VIEW_CREATED);
        if (zqbVar != null) {
            if (zqbVar.c != -1) {
                zqbVar = null;
            }
            if (zqbVar != null) {
                zqbVar.c = j - zqbVar.b;
            }
        }
    }
}
