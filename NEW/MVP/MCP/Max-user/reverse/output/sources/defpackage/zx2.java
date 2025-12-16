package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class zx2 extends xfh {
    public static final /* synthetic */ yy7[] h1 = {new z8a(zx2.class, "sendMediaJob", "getSendMediaJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, zx2.class, "sendStickerJob", "getSendStickerJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "sendContactsJob", "getSendContactsJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "sendLocationJob", "getSendLocationJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "sendBotCommandJob", "getSendBotCommandJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "joinChatJob", "getJoinChatJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "subscribeChannelJob", "getSubscribeChannelJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "saveDraftJob", "getSaveDraftJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "restoreDraftJob", "getRestoreDraftJob()Lkotlinx/coroutines/Job;"), new z8a(zx2.class, "clearDraftJob", "getClearDraftJob()Lkotlinx/coroutines/Job;")};
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final bwf E0;
    public final k18 F0;
    public final k18 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final bwf L0;
    public final t9f M0;
    public final t9f N0;
    public final t9f O0;
    public final t9f P0;
    public final t9f Q0;
    public final t9f R0;
    public final t9f S0;
    public final t9f T0;
    public final t9f U0;
    public final t9f V0;
    public final t9f W0;
    public final w63 X;
    public final t9f X0;
    public final y85 Y;
    public final bwf Y0;
    public final zw1 Z;
    public final hbd Z0;
    public final hbd a1;
    public String b;
    public final hbd b1;
    public final tw0 c;
    public final jve c1;
    public final uo5 d;
    public final ci5 d1;
    public final y83 e1;
    public final hbd f1;
    public final hbd g1;
    public final ux5 o;
    public final ra3 s0;
    public final j35 t0;
    public final dy9 u0;
    public final i5i v0;
    public final eza w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public zx2(long j, uf2 uf2Var, String str, i5i i5iVar) {
        int i;
        hbd hbdVarJ;
        Object m11Var;
        Continuation continuation;
        ku3 ku3VarN;
        uv2 uv2Var = uv2.a;
        uv2Var.getClass();
        bwf bwfVar = new bwf(new fu2(4));
        k18 k18Var = tv2.a;
        bwf bwfVarD = uv2Var.getAccessor().d(459);
        bwf bwfVarD2 = uv2Var.getAccessor().d(546);
        bwf bwfVarD3 = uv2Var.getAccessor().d(79);
        bwf bwfVarD4 = uv2Var.getAccessor().d(46);
        bwf bwfVarD5 = uv2Var.getAccessor().d(47);
        bwf bwfVarD6 = uv2Var.getAccessor().d(48);
        bwf bwfVarD7 = uv2Var.getAccessor().d(8);
        bwf bwfVarD8 = uv2Var.getAccessor().d(388);
        ks3 ks3Var = (ks3) uv2Var.getAccessor().c(566);
        v28 v28Var = (v28) uv2Var.getAccessor().c(560);
        bwf bwfVarD9 = uv2Var.getAccessor().d(331);
        bwf bwfVarD10 = uv2Var.getAccessor().d(186);
        bwf bwfVarD11 = uv2Var.getAccessor().d(547);
        bwf bwfVarD12 = uv2Var.getAccessor().d(216);
        bwf bwfVarD13 = uv2Var.getAccessor().d(600);
        uv2Var.getClass();
        bwf bwfVar2 = new bwf(new fu2(5));
        tw0 tw0Var = (tw0) uv2Var.getAccessor().c(49);
        uo5 uo5Var = new uo5(uv2Var.getDispatchers(), tw0Var, j, uf2Var, uv2Var.getAccessor().d(109));
        ux5 ux5Var = (ux5) uv2Var.getAccessor().c(601);
        w63 w63Var = (w63) uv2Var.getAccessor().c(109);
        l24 l24Var = (l24) uv2Var.getAccessor().c(123);
        y85 y85Var = new y85(uv2Var.getAccessor().d(548), uv2Var.getAccessor().d(138), uv2Var.getAccessor().d(8), uv2Var.getAccessor().d(186));
        zw1 zw1Var = new zw1(uv2Var.getAccessor().d(109), uv2Var.getAccessor().d(HttpStatus.SC_GONE), uv2Var.getAccessor().d(8));
        ra3 ra3VarA = uv2Var.a();
        uv2Var.getClass();
        oa3 oa3Var = new oa3(uv2Var.getAccessor().d(8), uv2Var.getAccessor().d(170));
        ra3 ra3VarA2 = uv2Var.a();
        uv2Var.getAccessor().getClass();
        j35 j35Var = new j35(uv2Var.getAccessor().d(109), uv2Var.getAccessor().d(46), uv2Var.getAccessor().d(47), uv2Var.getAccessor().d(79), uv2Var.getAccessor().d(548), uv2Var.getAccessor().d(8), ra3VarA2, oa3Var);
        dy9 dy9VarB = uv2Var.b();
        eza ezaVar = (eza) uv2Var.getAccessor().c(81);
        bwf bwfVarD14 = uv2Var.getAccessor().d(570);
        yb8 yb8Var = (yb8) uv2Var.getAccessor().c(594);
        Context context = (Context) uv2Var.getAccessor().c(12);
        this.b = str;
        this.c = tw0Var;
        this.d = uo5Var;
        this.o = ux5Var;
        this.X = w63Var;
        this.Y = y85Var;
        this.Z = zw1Var;
        this.s0 = ra3VarA;
        this.t0 = j35Var;
        this.u0 = dy9VarB;
        this.v0 = i5iVar;
        this.w0 = ezaVar;
        this.x0 = bwfVarD3;
        this.y0 = bwfVarD4;
        this.z0 = bwfVarD5;
        this.A0 = bwfVarD6;
        this.B0 = bwfVarD7;
        this.C0 = bwfVarD8;
        this.D0 = bwfVarD9;
        this.E0 = bwfVar;
        this.F0 = bwfVarD;
        this.G0 = bwfVarD2;
        this.H0 = bwfVarD10;
        this.I0 = bwfVarD11;
        this.J0 = bwfVarD12;
        this.K0 = bwfVarD13;
        this.L0 = bwfVar2;
        this.M0 = c7j.c();
        this.N0 = c7j.c();
        this.O0 = c7j.c();
        this.P0 = c7j.c();
        this.Q0 = c7j.c();
        this.R0 = c7j.c();
        this.S0 = c7j.c();
        this.T0 = c7j.c();
        this.U0 = c7j.c();
        this.V0 = c7j.c();
        this.W0 = c7j.c();
        this.X0 = c7j.c();
        this.Y0 = new bwf(new hk1(14, this));
        z41 z41Var = new z41((hbd) a93.s0.x(context).Y, yb8Var, context, 1);
        ContextScope contextScope = this.a;
        lcj lcjVar = yve.a;
        this.Z0 = gw0.C(z41Var, contextScope, lcjVar, null);
        int iOrdinal = uf2Var.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        w63Var.getClass();
        int iV = az1.v(i);
        if (iV == 0) {
            hbdVarJ = w63Var.j(j);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            hbdVarJ = w63Var.k(j);
        }
        mcf mcfVar = hbdVarJ.a;
        this.a1 = hbdVarJ;
        this.b1 = gw0.C(new bc2(new d53(hbdVarJ, 12), 4), this.a, lcjVar, null);
        this.c1 = kve.b(0, 0, 7);
        this.d1 = new ci5(0);
        x26 x26VarM = gw0.m(new bi1(gw0.m(new x3(v28Var.d, this, 20)), bwfVarD14, 1));
        x26 x26VarM2 = gw0.m(new x3(new hbd(ks3Var.a), this, 21));
        int i2 = s65.d;
        this.e1 = gw0.i(gw0.l(new d53(zs0.g(hbdVarJ, v9j.h(1, y65.SECONDS)), 12), new cj0(7)), x26VarM, x26VarM2, new xx2(this, bwfVarD4, bwfVarD6, null));
        pb2 pb2Var = (pb2) mcfVar.getValue();
        if (pb2Var == null || (ku3VarN = pb2Var.n()) == null) {
            continuation = null;
            m11Var = new m11(13, null);
        } else {
            m11Var = l24Var.c(ku3VarN.p());
            continuation = null;
        }
        this.f1 = gw0.C(new z41(new d53(hbdVarJ, 12), m11Var, new s3(bwfVarD4, continuation, 7), 3), this.a, lcjVar, continuation);
        this.g1 = gw0.C(gw0.u(new sx2(new gbd(uo5Var.b), 0), ((q2b) ((lzf) bwfVarD7.getValue())).b()), this.a, lcjVar, Boolean.FALSE);
        gw0.w(gw0.u(new mwd(new ux2(new d53(hbdVarJ, 12), null, this)), ((q2b) y()).b()), this.a);
        gw0.w(new g56(new gbd(ux5Var.b), new zv2(this, null), 1), this.a);
        pb2 pb2Var2 = (pb2) mcfVar.getValue();
        ug2 ug2Var = new ug2(pb2Var2 != null ? pb2Var2.a : j, tw0Var, (lzf) bwfVarD7.getValue());
        gw0.w(new n46(new g56(zs0.g(new ph0(ug2Var.e, 26), v9j.h(HttpStatus.SC_MULTIPLE_CHOICES, y65.MILLISECONDS)), new aw2(this, null), 1), new er(ug2Var, (Continuation) null, 4)), this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4.j(ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder, false) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rfb t(final defpackage.zx2 r3, boolean r4, final long r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L14
            rt5 r1 = r3.z()
            gu5 r1 = (defpackage.gu5) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder
            boolean r1 = r1.j(r2, r0)
            if (r1 != 0) goto L27
        L14:
            if (r4 != 0) goto L35
            rt5 r4 = r3.z()
            gu5 r4 = (defpackage.gu5) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder
            boolean r4 = r4.j(r1, r0)
            if (r4 != 0) goto L35
        L27:
            rfb r4 = new rfb
            int r0 = defpackage.yud.e0
            yv2 r1 = new yv2
            r2 = 0
            r1.<init>(r3)
            r4.<init>(r0, r1)
            return r4
        L35:
            rfb r4 = new rfb
            int r0 = defpackage.yud.h2
            yv2 r1 = new yv2
            r2 = 1
            r1.<init>(r3)
            r4.<init>(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx2.t(zx2, boolean, long):rfb");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r9.j(ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder, false) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rfb u(defpackage.zx2 r8, boolean r9, long r10, java.lang.String r12) {
        /*
            r0 = 0
            if (r9 == 0) goto L14
            rt5 r1 = r8.z()
            gu5 r1 = (defpackage.gu5) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder
            boolean r1 = r1.j(r2, r0)
            if (r1 != 0) goto L27
        L14:
            if (r9 != 0) goto L38
            rt5 r9 = r8.z()
            gu5 r9 = (defpackage.gu5) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f11calliconsreorder
            boolean r9 = r9.j(r1, r0)
            if (r9 != 0) goto L38
        L27:
            rfb r9 = new rfb
            int r0 = defpackage.yud.e0
            xv2 r1 = new xv2
            r6 = 0
            r2 = r8
            r3 = r10
            r5 = r12
            r1.<init>(r2, r3, r5, r6)
            r9.<init>(r0, r1)
            return r9
        L38:
            r2 = r8
            r3 = r10
            r5 = r12
            rfb r8 = new rfb
            int r9 = defpackage.yud.h2
            r6 = r5
            r4 = r3
            r3 = r2
            xv2 r2 = new xv2
            r7 = 1
            r2.<init>(r3, r4, r6, r7)
            r8.<init>(r9, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx2.u(zx2, boolean, long, java.lang.String):rfb");
    }

    public static final c6i v(zx2 zx2Var) {
        return (c6i) zx2Var.H0.getValue();
    }

    public final boolean A() {
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        return pb2Var != null && pb2Var.M();
    }

    public final boolean B() {
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        return pb2Var != null && pb2Var.Q();
    }

    public final void C() {
        xfh.r(this.d1, new fw2(new n5g(avd.J), ve3.j(new pq3(zud.p0, new n5g(avd.L), 3, 56), new pq3(zud.q0, new n5g(avd.M), 3, 56), new pq3(zud.o0, new n5g(avd.K), 3, 56), new pq3(zud.r0, new n5g(avd.N), 1, 56), new pq3(zud.C, new n5g(mvd.p), 3, 56))));
    }

    public final Object D(dtf dtfVar) {
        return svi.i(((q2b) y()).b(), new zw2(this, null), dtfVar);
    }

    public final void E() {
        String str;
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        if (pb2Var == null || !pb2Var.K() || pb2Var.a0() || (str = this.b) == null || str.length() == 0) {
            return;
        }
        xfh.o(this, ((q2b) y()).b(), new tw2(this, null), 2);
    }

    public final void F(Uri uri, Long l, vf6 vf6Var) {
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        if (pb2Var != null) {
            long j = pb2Var.a;
            I(svi.d(this.a, ((q2b) y()).b(), i84.b, new ex2(uri, j, this, l, vf6Var, null)));
        }
    }

    public final void G(cf8 cf8Var, float f, long j, Long l, vf6 vf6Var) {
        String name = zx2.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "sendLocation " + cf8Var, null);
            }
        }
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        if (pb2Var != null) {
            this.Q0.O(this, h1[4], svi.d(this.a, ((q2b) y()).b(), i84.b, new gx2(pb2Var.a, cf8Var, f, j, this, l, vf6Var, null)));
        }
    }

    public final void H(CharSequence charSequence, List list, boolean z, Long l, vf6 vf6Var) {
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        if (pb2Var != null) {
            I(xfh.o(this, null, new ix2(this, pb2Var.a, charSequence, list, z, l, vf6Var, null), 1));
        }
    }

    public final void I(x9f x9fVar) {
        this.M0.O(this, h1[0], x9fVar);
    }

    @Override // defpackage.xfh
    public final void s() {
        uo5 uo5Var = this.d;
        uo5Var.a.f(uo5Var);
        ux5 ux5Var = this.o;
        ux5Var.a.f(ux5Var);
    }

    public final void w() {
        wqi.c(zx2.class.getName(), "clear draft", new Object[0]);
        x9f x9fVarD = svi.d(this.a, ((q2b) y()).b(), i84.b, new mw2(this, null));
        this.X0.O(this, h1[11], x9fVarD);
    }

    public final void x(CharSequence charSequence, Long l, ArrayList arrayList, boolean z) {
        pb2 pb2Var = (pb2) this.a1.a.getValue();
        Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
        if (l == null || lValueOf == null) {
            return;
        }
        this.S0.O(this, h1[6], xfh.o(this, null, new rw2(this, l, lValueOf, charSequence, arrayList, z, null), 1));
        w();
    }

    public final lzf y() {
        return (lzf) this.B0.getValue();
    }

    public final rt5 z() {
        return (rt5) this.A0.getValue();
    }
}
