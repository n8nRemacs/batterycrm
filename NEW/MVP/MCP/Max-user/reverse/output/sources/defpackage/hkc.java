package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class hkc extends xfh {
    public static final /* synthetic */ yy7[] A0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final jve s0;
    public final t9f t0;
    public final jve u0;
    public final gbd v0;
    public final ci5 w0;
    public final AtomicLong x0;
    public final tcf y0;
    public su7 z0;

    static {
        z8a z8aVar = new z8a(hkc.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        A0 = new yy7[]{z8aVar};
    }

    public hkc(long j, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.b = j;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var3;
        this.X = k18Var6;
        this.Y = k18Var5;
        this.Z = k18Var7;
        jve jveVarB = kve.b(0, 0, 7);
        this.s0 = jveVarB;
        int i = 12;
        u92 u92VarY = gw0.y(new uxb(((ui0) k18Var4.getValue()).b, this, 9), new d53(jveVarB, i));
        this.t0 = c7j.c();
        jve jveVarA = kve.a(1, 1, 2);
        this.u0 = jveVarA;
        this.v0 = new gbd(jveVarA);
        this.w0 = new ci5(0);
        this.x0 = new AtomicLong(-9223372036854775807L);
        this.y0 = ucf.a(new ujc(false, false, false, false, false));
        rt7 rt7VarA = eoi.a();
        rt7VarA.D();
        this.z0 = rt7VarA;
        gw0.w(gw0.u(new mwd(new fkc(new uxb(new d53(((w63) k18Var.getValue()).j(j), i), this, 8), null, this)), ((q2b) ((lzf) k18Var2.getValue())).a()), this.a);
        gw0.w(gw0.u(new g56(u92VarY, new yjc(this, null), 1), ((q2b) ((lzf) k18Var2.getValue())).a()), this.a);
    }

    public static final Object t(hkc hkcVar, ujc ujcVar, q44 q44Var) throws Throwable {
        o98 o98VarD = ve3.d();
        o98VarD.add(new a8e(new n5g(u8b.o1), null, 14));
        int i = r8b.m0;
        o98VarD.add(new a7(i, new toe(i, 0, new n5g(u8b.m1), null, null, baj.a(yud.u0), new doe(ujcVar.a, true), null, null, HttpStatus.SC_REQUEST_TIMEOUT), 536871936));
        int i2 = r8b.k0;
        n5g n5gVar = new n5g(u8b.k1);
        s18 s18VarA = baj.a(yud.b);
        boolean z = ujcVar.b;
        o98VarD.add(new a7(i2, new toe(i2, 0, n5gVar, null, null, s18VarA, new doe(z, true), null, null, HttpStatus.SC_REQUEST_TIMEOUT), 1073742848));
        int i3 = r8b.n0;
        o98VarD.add(new a7(i3, new toe(i3, 0, new n5g(u8b.n1), null, null, baj.a(yud.A1), new doe(ujcVar.c, true), null, null, HttpStatus.SC_REQUEST_TIMEOUT), 1073742848));
        k18 k18Var = hkcVar.Z;
        if (((gu5) ((rt5) k18Var.getValue())).u()) {
            gu5 gu5Var = (gu5) ((rt5) k18Var.getValue());
            gu5Var.getClass();
            if (gu5Var.j(PmsKey.gcmpe, false)) {
                int i4 = r8b.l0;
                o98VarD.add(new a7(i4, new toe(i4, 0, new n5g(u8b.l1), null, null, baj.a(yud.x1), new doe(ujcVar.d, true), null, null, HttpStatus.SC_REQUEST_TIMEOUT), 1073742848));
            }
        }
        gu5 gu5Var2 = (gu5) ((rt5) k18Var.getValue());
        gu5Var2.getClass();
        if (gu5Var2.j(PmsKey.f29chatinvitelinkpermissionsenabled, false)) {
            int i5 = r8b.o0;
            o98VarD.add(new a7(i5, new toe(i5, 0, new n5g(u8b.p1), null, null, baj.a(yud.a1), new doe(ujcVar.e, z), null, null, HttpStatus.SC_REQUEST_TIMEOUT), 1073742848));
        }
        Object obj = o98VarD.get(ve3.i(o98VarD));
        a7 a7Var = obj instanceof a7 ? (a7) obj : null;
        if (a7Var != null) {
            o98VarD.set(ve3.i(o98VarD), new a7(a7Var.a, a7Var.b, -2147482624));
        }
        Object objA = hkcVar.u0.a(ve3.a(o98VarD), q44Var);
        return objA == g84.a ? objA : qqg.a;
    }

    public static final ujc u(hkc hkcVar, pb2 pb2Var) {
        ff2 ff2Var = pb2Var.b.H;
        return new ujc(!ff2Var.b, !ff2Var.d, ff2Var.e, !ff2Var.f, ff2Var.i);
    }

    public final void v(HashMap map) {
        x9f x9fVarD = svi.d(this.a, ((q2b) ((lzf) this.d.getValue())).b(), i84.b, new gkc(this, map, null));
        this.t0.O(this, A0[0], x9fVarD);
    }
}
