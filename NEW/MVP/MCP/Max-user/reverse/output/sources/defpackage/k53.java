package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class k53 extends xfh {
    public static final /* synthetic */ yy7[] d1;
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final k18 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final tcf L0;
    public final hbd M0;
    public final tcf N0;
    public final tcf O0;
    public final hbd P0;
    public final hbd Q0;
    public final tcf R0;
    public final hbd S0;
    public final ci5 T0;
    public final ci5 U0;
    public volatile n8a V0;
    public final m8a W0;
    public final Context X;
    public final tcf X0;
    public final lzf Y;
    public final t9f Y0;
    public final k18 Z;
    public final jve Z0;
    public final x26 a1;
    public final ay3 b;
    public final x9f b1;
    public final String c;
    public x9f c1;
    public final kj1 d;
    public final z13 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    static {
        z8a z8aVar = new z8a(k53.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        d1 = new yy7[]{z8aVar};
    }

    public k53(ay3 ay3Var, String str, kj1 kj1Var) {
        bwf bwfVar;
        bwf bwfVar2;
        cl7 h79Var;
        e03 e03Var = e03.a;
        z13 z13VarA = ((c13) e03Var.getAccessor().c(559)).a(str);
        Context context = (Context) e03Var.getAccessor().c(12);
        v28 v28Var = (v28) e03Var.getAccessor().c(560);
        lzf lzfVar = (lzf) e03Var.getAccessor().c(8);
        bwf bwfVarD = e03Var.getAccessor().d(255);
        bwf bwfVarD2 = e03Var.getAccessor().d(254);
        bwf bwfVarD3 = e03Var.getAccessor().d(109);
        bwf bwfVarD4 = e03Var.getAccessor().d(97);
        bwf bwfVarD5 = e03Var.getAccessor().d(329);
        bwf bwfVarD6 = e03Var.getAccessor().d(331);
        bwf bwfVarD7 = e03Var.getAccessor().d(46);
        bwf bwfVarD8 = e03Var.getAccessor().d(48);
        bwf bwfVarD9 = e03Var.getAccessor().d(47);
        bwf bwfVarD10 = e03Var.getAccessor().d(252);
        w5 w5Var = ((dl7) e03Var.getAccessor().c(564)).a;
        if (str.equals("all.chat.folder")) {
            bwfVar = bwfVarD;
            bwfVar2 = bwfVarD6;
            h79Var = new h79((q5b) w5Var.c(HttpStatus.SC_LOCKED), 2, w5Var.d(48));
        } else {
            bwfVar = bwfVarD;
            bwfVar2 = bwfVarD6;
            h79Var = cl7.J;
        }
        bwf bwfVarD11 = e03Var.getAccessor().d(149);
        bwf bwfVarD12 = e03Var.getAccessor().d(150);
        cl7 cl7Var = h79Var;
        bwf bwfVarD13 = e03Var.getAccessor().d(567);
        bwf bwfVarD14 = e03Var.getAccessor().d(140);
        bwf bwfVarD15 = e03Var.getAccessor().d(389);
        bwf bwfVarD16 = e03Var.getAccessor().d(186);
        bwf bwfVarD17 = e03Var.getAccessor().d(108);
        bwf bwfVarD18 = e03Var.getAccessor().d(228);
        bwf bwfVarD19 = e03Var.getAccessor().d(84);
        bwf bwfVarD20 = e03Var.getAccessor().d(568);
        bwf bwfVarD21 = e03Var.getAccessor().d(526);
        this.b = ay3Var;
        this.c = str;
        this.d = kj1Var;
        this.o = z13VarA;
        this.X = context;
        this.Y = lzfVar;
        this.Z = bwfVarD2;
        this.s0 = bwfVarD7;
        this.t0 = bwfVarD8;
        this.u0 = bwfVarD9;
        this.v0 = bwfVarD3;
        this.w0 = bwfVarD4;
        this.x0 = bwfVarD5;
        this.y0 = bwfVar2;
        this.z0 = bwfVar;
        this.A0 = bwfVarD10;
        this.B0 = bwfVarD11;
        this.C0 = bwfVarD12;
        this.D0 = bwfVarD14;
        this.E0 = bwfVarD15;
        this.F0 = bwfVarD16;
        this.G0 = bwfVarD17;
        this.H0 = bwfVarD18;
        this.I0 = bwfVarD19;
        this.J0 = bwfVarD20;
        this.K0 = bwfVarD21;
        tcf tcfVarA = ucf.a(cl7Var.k());
        this.L0 = tcfVarA;
        this.M0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.N0 = tcfVarA2;
        tcf tcfVarA3 = ucf.a(tcfVarA2.getValue());
        this.O0 = tcfVarA3;
        int i = 3;
        yh0 yh0Var = new yh0(tcfVarA3, i);
        Object value = tcfVarA3.getValue();
        lcj lcjVar = yve.a;
        this.P0 = gw0.C(yh0Var, this.a, lcjVar, value);
        this.Q0 = gw0.C(new yh0(tcfVarA3, 4), this.a, lcjVar, tcfVarA3.getValue());
        tcf tcfVarA4 = ucf.a(Boolean.FALSE);
        this.R0 = tcfVarA4;
        this.S0 = new hbd(tcfVarA4);
        this.T0 = new ci5(0);
        this.U0 = new ci5(0);
        this.V0 = dk8.a;
        m8a m8aVar = zj8.a;
        this.W0 = new m8a();
        this.X0 = ucf.a(0L);
        this.Y0 = c7j.c();
        int i2 = 20;
        this.Z0 = kve.a(20, 20, 2);
        wqi.c(u45.k(k53.class.getName(), "-", str), this + " init", new Object[0]);
        int i3 = 1;
        Continuation continuation = null;
        if (fni.a(str, "all.chat.folder")) {
            k0a k0aVar = (k0a) bwfVarD13.getValue();
            k0aVar.getClass();
            String name = k0a.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, k0aVar + " startObserve", null);
                }
            }
            m11 m11Var = new m11(17, new d53(z13VarA.w0, 8));
            int i4 = s65.d;
            x9f x9fVarE = zs0.e(gw0.d(new m36(gw0.u(new g56(gw0.u(new y83(gw0.l(new y83(zs0.g(m11Var, v9j.h(3, y65.SECONDS)), 22, k0aVar), new cj0(21)), 23, k0aVar), k0aVar.d), new i0a(k0aVar, null), 1), k0aVar.c), new w41(i, continuation, i))), k0aVar.e);
            x9fVarE.invokeOnCompletion(new wu7(i2, k0aVar));
            this.b1 = x9fVarE;
        }
        q2b q2bVar = (q2b) lzfVar;
        gw0.w(gw0.u(new g56(new o43(new z41(z13VarA.w0, v28Var.d, new s3(this, continuation, 8), i), this, 0), new rw(2, tcfVarA, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), 1), q2bVar.a()), this.a);
        ContextScope contextScope = this.a;
        l5c l5cVar = (l5c) ((age) bwfVarD9.getValue());
        l5cVar.getClass();
        if (l5cVar.j(PmsKey.f48fakechats, false)) {
            pe8 pe8Var = (pe8) ((pb3) bwfVarD7.getValue());
            String str2 = (String) pe8Var.o0.D(pe8Var, pe8.U0[1]);
            str2 = str2 == null ? "" : str2;
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = str2.charAt(i5);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            gw0.w(gw0.u(new m36(new x43(this, null), gw0.x(new fe1(new z41(this.b.b(), new m36(new u43(2, null), new x3(new x3(this.X0, this, 26), this, 27)), new v43(3, null, 0), i), new vi5(2, new s55(18)), this, cnf.i(sb.toString()), 1), new w43(this, null))), q2bVar.a()), contextScope);
            gw0.w(gw0.u(new g56(this.M0, new y43(this, null), 1), q2bVar.a()), contextScope);
        }
        svi.e(this.a, ((q2b) this.Y).a().plus(x()), null, new d43(this, null), 2);
        d53 d53Var = new d53(gw0.m(this.Z0), 0);
        int i6 = s65.d;
        gw0.w(gw0.u(new m36(new g56(new m11(7, new x3(gw0.f(new i36(v9j.h(5, y65.SECONDS), d53Var, null)), this, 28)), new g53(this, null), 1), new w41(i, continuation, 2)), ((q2b) this.Y).b().limitedParallelism(1, "missed")), this.a);
        gw0.w(gw0.u(new g56(this.L0, new h53(this, null), 1), ((q2b) this.Y).b()), this.a);
        this.a1 = gw0.u(new ph0(gw0.m(new o43(new z41(this.L0, ((va4) this.B0.getValue()).v0, new ld0(i, continuation, 10), i), this, i3)), 29), ((q2b) this.Y).a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public static final boolean t(k53 k53Var, v03 v03Var) {
        return v03Var.a.size() <= 10 && !v03Var.b;
    }

    public static final void u(k53 k53Var, long j, long j2) {
        ve2 ve2VarV = k53Var.v();
        long jG = s65.g(j2) + ((w4e) ((pb3) k53Var.s0.getValue())).j();
        pb2 pb2VarM = ve2VarV.M(j);
        if (pb2VarM != null) {
            ve2VarV.v(pb2VarM, jG);
            ((hwa) ve2VarV.q.get()).m(pb2VarM.a);
        }
    }

    public final void A() {
        x9f x9fVar = this.c1;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.c1 = xfh.o(this, ((q2b) this.Y).c().plus(x()), new l43(this, null), 2);
        }
    }

    public final void B(long j) {
        pb2 pb2Var = (pb2) w().j(j).a.getValue();
        xfh.r(this.U0, new ixe(new n5g((pb2Var == null || !pb2Var.c0((rt5) this.t0.getValue())) ? mvd.a2 : mvd.Z1), new c43(this, j, 0)));
    }

    public final void C(long j) {
        svi.d(this.a, ((q2b) this.Y).b().plus(bia.a).plus(x()), i84.c, new i53(this, j, null));
    }

    @Override // defpackage.xfh
    public final void s() {
        wqi.c(u45.k(k53.class.getName(), "-", this.c), this + " onCleared()", new Object[0]);
        x9f x9fVar = this.b1;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
    }

    public final ve2 v() {
        return (ve2) this.w0.getValue();
    }

    public final w63 w() {
        return (w63) this.v0.getValue();
    }

    public final a84 x() {
        return (a84) this.I0.getValue();
    }

    public final void y() {
        tcf tcfVar = this.X0;
        tcfVar.m(null, Long.valueOf(((Number) tcfVar.getValue()).longValue() + 1));
    }

    public final void z(long j) {
        pb2 pb2Var = (pb2) w().j(j).a.getValue();
        xfh.r(this.U0, new ixe(new n5g((pb2Var == null || !pb2Var.c0((rt5) this.t0.getValue())) ? mvd.z : mvd.y), new c43(this, j, 1)));
    }
}
