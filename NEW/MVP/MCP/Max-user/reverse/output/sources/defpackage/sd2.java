package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sd2 extends i82 {
    public static final /* synthetic */ yy7[] B;
    public final AtomicBoolean A;
    public final cfc j;
    public final k18 k;
    public final k18 l;
    public final k18 m;
    public final k18 n;
    public final bwf o;
    public final k18 p;
    public final k18 q;
    public final k18 r;
    public final k18 s;
    public final x26 t;
    public final jve u;
    public final gbd v;
    public final t9f w;
    public final AtomicLong x;
    public final AtomicLong y;
    public final AtomicLong z;

    static {
        z8a z8aVar = new z8a(sd2.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        B = new yy7[]{z8aVar};
    }

    public sd2(long j, ContextScope contextScope, cfc cfcVar) {
        yec yecVar = yec.a;
        bwf bwfVarD = yecVar.getAccessor().d(14);
        k18 k18VarC = yecVar.c();
        k18 k18VarB = yecVar.b();
        bwf bwfVarD2 = yecVar.getAccessor().d(142);
        bwf bwfVar = new bwf(new zb2(1));
        bwf bwfVarD3 = yecVar.getAccessor().d(108);
        k18 k18VarA = yecVar.a();
        bwf bwfVar2 = new bwf(new zb2(2));
        bwf bwfVarD4 = yecVar.getAccessor().d(44);
        bwf bwfVarD5 = yecVar.getAccessor().d(83);
        bwf bwfVarD6 = yecVar.getAccessor().d(84);
        super(j, contextScope);
        this.j = cfcVar;
        this.k = bwfVarD;
        this.l = k18VarC;
        this.m = k18VarB;
        this.n = bwfVarD2;
        this.o = bwfVar;
        this.p = bwfVarD3;
        this.q = k18VarA;
        this.r = bwfVarD5;
        this.s = bwfVarD6;
        bwf bwfVar3 = (bwf) k18VarC;
        this.t = gw0.u(new z41(new d53(this.c, 12), this.d, nd2.Z, 3), ((q2b) ((lzf) bwfVar3.getValue())).a());
        jve jveVarB = kve.b(0, 0, 7);
        this.u = jveVarB;
        this.v = new gbd(jveVarB);
        this.w = c7j.c();
        this.x = new AtomicLong();
        this.y = new AtomicLong();
        this.z = new AtomicLong();
        this.A = new AtomicBoolean();
        gw0.w(gw0.u(new g56(this.i, new xc2(this, null), 1), ((q2b) ((lzf) bwfVar3.getValue())).a()), contextScope);
        gw0.w(gw0.u(new g56(new x3(new g56(new mwd(new md2(new d53(((w63) ((bwf) k18VarB).getValue()).j(j), 12), null, this)), new yc2(this, null), 1), this, 11), new zc2(this, null), 1), ((q2b) ((lzf) bwfVar3.getValue())).b()), contextScope);
        gw0.w(new g56(new x3(((ui0) bwfVarD4.getValue()).b, this, 12), new rw(2, this, sd2.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 1), contextScope);
        gw0.w(new g56(new gbd(((pfc) bwfVar2.getValue()).a), new vc2(this, j, null), 1), contextScope);
    }

    public static final void m(sd2 sd2Var, pb2 pb2Var) {
        x82 x82VarV = v(pb2Var);
        sd2Var.h.m(null, x82VarV);
        tcf tcfVar = sd2Var.i;
        tcfVar.m(null, x82VarV);
        x82 x82Var = (x82) tcfVar.getValue();
        if ((x82Var != null ? x82Var.b : null) == w82.b) {
            tcfVar.m(null, x82VarV);
        }
        sd2Var.d(sd2Var.u());
    }

    public static x82 v(pb2 pb2Var) {
        String str;
        String lastPathSegment;
        Object next;
        Uri uri;
        rf2 rf2Var = pb2Var.b;
        int i = rf2Var.o0;
        if (i == 1) {
            str = "PUBLIC";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "PRIVATE";
        }
        Iterator it = w82.d.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            lastPathSegment = null;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (fni.a(((w82) next).name(), str)) {
                break;
            }
        }
        w82 w82Var = (w82) next;
        w82 w82Var2 = w82.b;
        if (w82Var == null) {
            w82Var = w82Var2;
        }
        if (w82Var == w82Var2) {
            lastPathSegment = rf2Var.I;
        } else {
            String str2 = rf2Var.I;
            if (str2 != null && (uri = Uri.parse(str2)) != null) {
                lastPathSegment = uri.getLastPathSegment();
            }
        }
        return new x82(w82Var, lastPathSegment);
    }

    @Override // defpackage.i82
    public final void a() {
        svi.e(this.b, ((q2b) q()).a(), null, new bd2(this, null), 2);
    }

    @Override // defpackage.i82
    public final void b() {
        yy7[] yy7VarArr = B;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.w;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    @Override // defpackage.i82
    public final Object c(s82 s82Var) {
        Object objN = n(s82Var);
        return objN == g84.a ? objN : qqg.a;
    }

    @Override // defpackage.i82
    public final void e() {
        o(true);
    }

    @Override // defpackage.i82
    public final x26 f() {
        return this.t;
    }

    @Override // defpackage.i82
    public final void g(int i) {
        svi.e(this.b, (a84) this.s.getValue(), null, new ed2(i, this, null), 2);
    }

    @Override // defpackage.i82
    public final void h(int i) {
        svi.e(this.b, ((q2b) q()).a().plus((a84) this.s.getValue()), null, new fd2(i, this, null), 2);
    }

    @Override // defpackage.i82
    public final void i(int i) {
        svi.e(this.b, ((q2b) q()).a().plus((a84) this.s.getValue()), null, new gd2(i, this, null), 2);
    }

    @Override // defpackage.i82
    public final Object j(t82 t82Var) throws Throwable {
        x82 x82Var;
        pb2 pb2VarP = p();
        if (pb2VarP != null && (x82Var = (x82) this.i.getValue()) != null) {
            cfc cfcVar = this.j;
            cfc cfcVar2 = cfc.b;
            jve jveVar = this.f;
            g84 g84Var = g84.a;
            if (cfcVar == cfcVar2 && pb2VarP.M() && fni.a(r(), Boolean.FALSE)) {
                Object objA = jveVar.a(new xcc(this.a), t82Var);
                if (objA == g84Var) {
                    return objA;
                }
            } else if (x82Var.f) {
                Object objA2 = jveVar.a(new cdc(x82Var.d, null, 14), t82Var);
                if (objA2 == g84Var) {
                    return objA2;
                }
            } else {
                Object objI = svi.i(((q2b) q()).b(), new od2(this, x82Var, pb2VarP, null), t82Var);
                if (objI == g84Var) {
                    return objI;
                }
            }
        }
        return qqg.a;
    }

    @Override // defpackage.i82
    public final void k(String str) {
        svi.e(this.b, ((q2b) q()).c().getImmediate(), null, new rd2(this, str, null), 2);
    }

    @Override // defpackage.i82
    public final void l(int i) {
        int i2 = r8b.h0;
        tcf tcfVar = this.i;
        tcf tcfVar2 = this.h;
        if (i == i2) {
            x82 x82Var = (x82) tcfVar2.getValue();
            w82 w82Var = x82Var != null ? x82Var.b : null;
            w82 w82Var2 = w82.b;
            tcfVar.setValue(w82Var == w82Var2 ? (x82) tcfVar2.getValue() : new x82(w82Var2, null));
            return;
        }
        if (i == r8b.i0) {
            x82 x82Var2 = (x82) tcfVar2.getValue();
            w82 w82Var3 = x82Var2 != null ? x82Var2.b : null;
            w82 w82Var4 = w82.a;
            tcfVar.setValue(w82Var3 == w82Var4 ? (x82) tcfVar2.getValue() : new x82(w82Var4, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd2.n(q44):java.lang.Object");
    }

    public final void o(boolean z) {
        x9f x9fVarE = svi.e(this.b, ((q2b) q()).b().plus((a84) this.s.getValue()), null, new dd2(this, z, null), 2);
        this.w.O(this, B[0], x9fVarE);
    }

    public final pb2 p() {
        return (pb2) ((w63) this.m.getValue()).j(this.a).a.getValue();
    }

    public final lzf q() {
        return (lzf) this.l.getValue();
    }

    public final Boolean r() {
        x82 x82Var = (x82) this.h.getValue();
        if (x82Var != null) {
            return Boolean.valueOf(x82Var.b((z82) this.i.getValue()));
        }
        return null;
    }

    public final Object s(n82 n82Var, Continuation continuation) throws Throwable {
        boolean zA = fni.a(n82Var, k82.a);
        g84 g84Var = g84.a;
        jve jveVar = this.f;
        if (zA) {
            Object objA = jveVar.a(new cdc(new n5g(u8b.R1), new n5g(u8b.P1), true, new Integer(yud.J)), continuation);
            if (objA == g84Var) {
                return objA;
            }
        } else if (fni.a(n82Var, l82.a)) {
            Object objA2 = jveVar.a(new cdc(new n5g(u8b.S1), new n5g(u8b.Q1), true, new Integer(yud.J)), continuation);
            if (objA2 == g84Var) {
                return objA2;
            }
        } else if (n82Var instanceof j82) {
            Object objA3 = jveVar.a(new cdc(((j82) n82Var).a, null, 14), continuation);
            if (objA3 == g84Var) {
                return objA3;
            }
        } else {
            if (!(n82Var instanceof m82)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objA4 = jveVar.a(new cdc(((m82) n82Var).a, null, 14), continuation);
            if (objA4 == g84Var) {
                return objA4;
            }
        }
        return qqg.a;
    }

    public final boolean t() {
        pb2 pb2VarP = p();
        return pb2VarP != null && pb2VarP.M();
    }

    public final h82 u() {
        return new h82(new v82(t() ? u8b.G1 : u8b.M1, false, true, false), ((o82) this.g.getValue()).a(this));
    }
}
