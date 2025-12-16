package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class jo2 extends xfh implements x37, r19 {
    public static final /* synthetic */ yy7[] W0 = {new toc(jo2.class, "attachClickJob", "getAttachClickJob()Lru/ok/tamtam/coroutines/ReplaceableCompareJob;", 0), u45.h(vid.a, jo2.class, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;"), new z8a(jo2.class, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;"), new z8a(jo2.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final AtomicReference F0;
    public final k18 G0;
    public final vgd H0;
    public final t9f I0;
    public final t9f J0;
    public final t9f K0;
    public final bwf L0;
    public final bwf M0;
    public final tcf N0;
    public tb9 O0;
    public final ci5 P0;
    public final bwf Q0;
    public final bwf R0;
    public final co2 S0;
    public final tcf T0;
    public final hbd U0;
    public final Object V0;
    public final qi9 X;
    public final gx9 Y;
    public final hwa Z;
    public final long b;
    public final dn2 c;
    public final kj1 d;
    public final w63 o;
    public final tw0 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final bwf x0;
    public final k18 y0;
    public final gu5 z0;

    public jo2(long j, dn2 dn2Var, kj1 kj1Var, hl2 hl2Var) {
        fdc fdcVar = fdc.a;
        w63 w63Var = (w63) ((bwf) fdcVar.b()).getValue();
        bwf bwfVarD = fdcVar.getAccessor().d(374);
        bwf bwfVarD2 = fdcVar.getAccessor().d(609);
        bwf bwfVarD3 = fdcVar.getAccessor().d(378);
        bwf bwfVarD4 = fdcVar.getAccessor().d(383);
        nh9 nh9Var = (nh9) fdcVar.getAccessor().c(213);
        k18 k18VarE = fdcVar.e();
        final ve2 ve2Var = (ve2) fdcVar.getAccessor().c(97);
        final ck2 ck2Var = (ck2) fdcVar.getAccessor().d(288).getValue();
        bwf bwfVarD5 = fdcVar.getAccessor().d(610);
        bwf bwfVarD6 = fdcVar.getAccessor().d(523);
        qi9 qi9Var = (qi9) fdcVar.getAccessor().c(143);
        gx9 gx9Var = (gx9) fdcVar.getAccessor().c(138);
        final z7c z7cVar = (z7c) fdcVar.getAccessor().c(32);
        hwa hwaVar = (hwa) ((bwf) fdcVar.a()).getValue();
        final d1g d1gVar = (d1g) fdcVar.getAccessor().c(284);
        final m0g m0gVar = (m0g) fdcVar.getAccessor().c(HttpStatus.SC_FORBIDDEN);
        final yi5 yi5Var = (yi5) fdcVar.getAccessor().d(9).getValue();
        tw0 tw0Var = (tw0) fdcVar.getAccessor().c(49);
        bwf bwfVarD7 = fdcVar.getAccessor().d(454);
        bwf bwfVarD8 = fdcVar.getAccessor().d(534);
        bwf bwfVarD9 = fdcVar.getAccessor().d(524);
        bwf bwfVarD10 = fdcVar.getAccessor().d(528);
        bwf bwfVarD11 = fdcVar.getAccessor().d(513);
        bwf bwfVarD12 = fdcVar.getAccessor().d(522);
        bwf bwfVarD13 = fdcVar.getAccessor().d(140);
        bwf bwfVarD14 = fdcVar.getAccessor().d(526);
        this.b = j;
        this.c = dn2Var;
        this.d = kj1Var;
        this.o = w63Var;
        this.X = qi9Var;
        this.Y = gx9Var;
        this.Z = hwaVar;
        this.s0 = tw0Var;
        this.t0 = bwfVarD;
        this.u0 = bwfVarD2;
        this.v0 = bwfVarD3;
        this.w0 = bwfVarD4;
        this.x0 = new bwf(new zb2(14));
        this.y0 = bwfVarD7;
        this.z0 = z7cVar.e;
        this.A0 = bwfVarD6;
        this.B0 = bwfVarD10;
        this.C0 = bwfVarD12;
        this.D0 = bwfVarD13;
        this.E0 = bwfVarD14;
        this.F0 = new AtomicReference(null);
        this.G0 = k18VarE;
        this.H0 = new vgd(1);
        this.I0 = c7j.c();
        this.J0 = c7j.c();
        this.K0 = c7j.c();
        this.L0 = new bwf(new zb2(15));
        this.M0 = new bwf(new m3(nh9Var, 29, z7cVar));
        k8a k8aVar = new k8a();
        k8aVar.a = new long[16];
        this.N0 = ucf.a(k8aVar);
        this.P0 = new ci5(0);
        this.Q0 = new bwf(new cm6() { // from class: gn2
            @Override // defpackage.cm6
            public final Object invoke() {
                Object obj;
                jo2 jo2Var = this.a;
                pb2 pb2VarZ = jo2Var.z();
                eh9 eh9Var = pb2VarZ != null ? pb2VarZ.c : null;
                if (eh9Var == null) {
                    return null;
                }
                qi9 qi9Var2 = jo2Var.X;
                hwa hwaVar2 = jo2Var.Z;
                m0g m0gVar2 = m0gVar;
                j0e j0eVarB = ((n0g) m0gVar2).b();
                i62 i62Var = new i62(6, m0gVar2);
                pb2 pb2VarZ2 = jo2Var.z();
                si9 si9Var = eh9Var.a;
                int iOrdinal = jo2Var.c.ordinal();
                if (iOrdinal == 0) {
                    obj = ta9.e;
                } else if (iOrdinal == 1) {
                    obj = ta9.g;
                } else if (iOrdinal == 2) {
                    obj = ta9.f;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = jo2Var.z0.x() ? ta9.d : ta9.c;
                }
                Set set = ta9.a.equals(obj) ? s00.C0 : ta9.b.equals(obj) ? s00.F0 : ta9.c.equals(obj) ? s00.G0 : ta9.d.equals(obj) ? s00.H0 : ta9.e.equals(obj) ? s00.D0 : ta9.g.equals(obj) ? s00.I0 : ta9.f.equals(obj) ? s00.E0 : ta9.h.equals(obj) ? s00.J0 : Collections.EMPTY_SET;
                ve2 ve2Var2 = ve2Var;
                gge ggeVar = new gge(pb2VarZ2, si9Var, ve2Var2, set, 3);
                ywf ywfVar = new ywf(ck2Var, qi9Var2, pb2VarZ2, obj);
                b47 b47Var = new b47(ggeVar, ywfVar, new j35(ywfVar, ve2Var2, qi9Var2, z7cVar, hwaVar2, d1gVar, pb2VarZ2, set, jo2Var), 40, new iv6(19, "ul2"), 96);
                StringBuilder sbO = ho7.o("ul2", "#");
                sbO.append(rs4.REGULAR.name().substring(0, 3));
                sbO.append("-");
                sbO.append(pb2VarZ2.a);
                return new ul2(b47Var, i62Var, j0eVarB, yi5Var, sbO.toString());
            }
        });
        this.R0 = new bwf(new hk1(11, this));
        this.S0 = new co2(0, this);
        tcf tcfVarA = ucf.a(in2.d);
        this.T0 = tcfVarA;
        this.U0 = new hbd(tcfVarA);
        this.V0 = ipi.b(3, new p81(z7cVar, ck2Var, this, bwfVarD5, bwfVarD6, bwfVarD8, bwfVarD9, bwfVarD11));
        pb2 pb2VarZ = z();
        eh9 eh9Var = pb2VarZ != null ? pb2VarZ.c : null;
        if (eh9Var != null) {
            tw0Var.d(this);
            if (dn2Var == dn2.b) {
                e4c e4cVar = (e4c) bwfVarD6.getValue();
                ((b8a) e4cVar.a).b(e4cVar.h);
                e4cVar.a();
            }
            ul2 ul2VarB = B();
            if (ul2VarB != null) {
                ul2VarB.o.a(ul2VarB.c.b(new zu(ul2VarB, eh9Var, 0)));
                ul2VarB.Y = this;
            }
            gw0.w(gw0.u(new g56(new x3(new d53(new hbd(ve2Var.S(j)), 12), this, 14), new hn2(this, null), 1), ((q2b) A()).a()), this.a);
            gw0.w(gw0.u(new g56(new gbd(hl2Var.b), new rw(2, this, jo2.class, "handleChatMediaEvent", "handleChatMediaEvent(Lone/me/profile/screens/media/ChatMediaEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 1), ((q2b) A()).a()), this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.jo2 r10, defpackage.fl2 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.t(jo2, fl2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [jo2, kotlin.coroutines.Continuation, tb9] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.jo2 r35, defpackage.tb9 r36, defpackage.q44 r37) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.u(jo2, tb9, q44):java.lang.Object");
    }

    public static final void v(jo2 jo2Var) {
        ccb ccbVarD = jo2Var.D();
        ccbVarD.g(new n5g(x8b.U1));
        ccbVarD.e(new qcb(yud.J));
        ccbVarD.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.jo2 r16, defpackage.xb9 r17, defpackage.q44 r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.w(jo2, xb9, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.jo2 r11, java.util.List r12, defpackage.q44 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.ho2
            if (r0 == 0) goto L13
            r0 = r13
            ho2 r0 = (defpackage.ho2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ho2 r0 = new ho2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.g8j.b(r13)
            return r2
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            long r11 = r0.o
            jo2 r1 = r0.d
            defpackage.g8j.b(r13)
            goto La6
        L3e:
            defpackage.g8j.b(r13)
            tcf r13 = r11.T0
            java.lang.Object r13 = r13.getValue()
            in2 r13 = (defpackage.in2) r13
            java.util.List r13 = r13.a
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto Lc2
            dn2 r13 = r11.c
            dn2 r1 = defpackage.dn2.a
            if (r13 != r1) goto Lc2
            int r13 = r12.size()
            java.util.ListIterator r12 = r12.listIterator(r13)
        L5f:
            boolean r13 = r12.hasPrevious()
            if (r13 == 0) goto L7d
            java.lang.Object r13 = r12.previous()
            r1 = r13
            j37 r1 = (defpackage.j37) r1
            boolean r7 = r1 instanceof defpackage.eh9
            if (r7 == 0) goto L5f
            eh9 r1 = (defpackage.eh9) r1
            si9 r1 = r1.a
            if (r1 == 0) goto L5f
            boolean r1 = r1.t()
            if (r1 != r4) goto L5f
            goto L7e
        L7d:
            r13 = r5
        L7e:
            boolean r12 = r13 instanceof defpackage.eh9
            if (r12 == 0) goto L85
            eh9 r13 = (defpackage.eh9) r13
            goto L86
        L85:
            r13 = r5
        L86:
            if (r13 == 0) goto L8d
            si9 r12 = r13.a
            long r12 = r12.a
            goto L8f
        L8d:
            r12 = 0
        L8f:
            w63 r1 = r11.o
            long r7 = r11.b
            java.util.HashSet r9 = defpackage.s00.D0
            r0.d = r11
            r0.o = r12
            r0.Z = r4
            java.lang.Object r1 = r1.o(r7, r9, r0)
            if (r1 != r6) goto La2
            goto Lc1
        La2:
            r10 = r1
            r1 = r11
            r11 = r12
            r13 = r10
        La6:
            df2 r13 = (defpackage.df2) r13
            long r7 = r13.d
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 == 0) goto Lc2
            w63 r13 = r1.o
            long r7 = r1.b
            io2 r1 = new io2
            r1.<init>(r11, r5)
            r0.d = r5
            r0.Z = r3
            java.lang.Object r11 = r13.e(r7, r1, r0)
            if (r11 != r6) goto Lc2
        Lc1:
            return r6
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.x(jo2, java.util.List, q44):java.lang.Object");
    }

    public final lzf A() {
        return (lzf) this.G0.getValue();
    }

    public final ul2 B() {
        return (ul2) this.Q0.getValue();
    }

    public final eh9 C(long j) {
        Object ipdVar;
        try {
            ipdVar = ((od8) this.t0.getValue()).a(j, true);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        return (eh9) ipdVar;
    }

    public final ccb D() {
        return (ccb) this.y0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r11.z() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r9 = (defpackage.p19) r10.V0.getValue();
        r12 = r10.c;
        r13 = (java.util.Set) r10.R0.getValue();
        r1.d = r10;
        r1.o = r0;
        r1.X = r8;
        r1.Y = r6;
        r1.Z = r6;
        r1.s0 = r3;
        r1.v0 = r5;
        r9.getClass();
        r12 = r12.ordinal();
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r12 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r12 == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if (r12 == 2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r12 != 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
    
        r4 = r9.a(r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r4 = r9.c(r14, r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        r4 = r9.b(r14, r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        r12 = r11.x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (r12 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        r12 = (java.util.List) r12.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r12 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        r15 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0125, code lost:
    
        if (r12.hasNext() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0127, code lost:
    
        r7 = r12.next();
        r5 = (defpackage.w10) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        if (r13.contains(r5.a.toString()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        if (r5.t != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (r5.a == defpackage.s10.d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (r5.h() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        if (r5.d.b == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        r15.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        r15 = defpackage.hd5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:
    
        r2 = ((defpackage.u07) r9.h.getValue()).a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if (r15.size() <= 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0173, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        r4 = defpackage.d7j.a(r1.b);
        r5 = new java.util.ArrayList(defpackage.we3.q(r15, 10));
        r19 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r19.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018f, code lost:
    
        r16 = r2;
        r15 = r7;
        r5.add(defpackage.svi.b(r4, null, new defpackage.o19(r19.next(), null, r14, r15, r16, r9), 3));
        r7 = r15;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ab, code lost:
    
        r4 = defpackage.hui.b(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b0, code lost:
    
        r2 = defpackage.g84.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        if (r4 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r9 = r0;
        r0 = r4;
        r7 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00b3, B:28:0x0096], limit reached: 109 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    /* JADX WARN: Type inference failed for: r15v1, types: [hd5] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01b5 -> B:83:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01c0 -> B:85:0x01c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.util.List r21, defpackage.q44 r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.E(java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        r7 = r8.getValue();
        r9 = (defpackage.in2) r7;
        r0.d = r3;
        r0.o = r1;
        r0.X = r8;
        r0.Y = r7;
        r0.t0 = 1;
        r9 = r3.E(r1, r0);
        r4 = defpackage.g84.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r9 != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r8.c(r7, (defpackage.in2) r9) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long r7, defpackage.q44 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.un2
            if (r0 == 0) goto L13
            r0 = r9
            un2 r0 = (defpackage.un2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            un2 r0 = new un2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            int r1 = r0.t0
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r0.Y
            f9a r8 = r0.X
            java.util.List r1 = r0.o
            jo2 r3 = r0.d
            defpackage.g8j.b(r9)
            goto Lab
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.g8j.b(r9)
            tcf r9 = r6.T0
            java.lang.Object r1 = r9.getValue()
            in2 r1 = (defpackage.in2) r1
            java.util.List r1 = r1.a
            if (r1 == 0) goto L4c
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L4c
            goto Lb3
        L4c:
            java.util.Iterator r1 = r1.iterator()
        L50:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r1.next()
            yb9 r3 = (defpackage.yb9) r3
            long r3 = r3.j()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L50
            eh9 r7 = r6.C(r7)
            if (r7 != 0) goto L6b
            goto Lb3
        L6b:
            ul2 r8 = r6.B()
            if (r8 == 0) goto L82
            zl3 r1 = r8.o
            j0e r3 = r8.c
            zu r4 = new zu
            r5 = 1
            r4.<init>(r8, r7, r5)
            py4 r7 = r3.b(r4)
            r1.a(r7)
        L82:
            ul2 r7 = r6.B()
            if (r7 == 0) goto Lb3
            b47 r7 = r7.b
            java.util.ArrayList r7 = r7.e()
            r3 = r6
            r1 = r7
            r8 = r9
        L91:
            java.lang.Object r7 = r8.getValue()
            r9 = r7
            in2 r9 = (defpackage.in2) r9
            r0.d = r3
            r0.o = r1
            r0.X = r8
            r0.Y = r7
            r0.t0 = r2
            java.lang.Object r9 = r3.E(r1, r0)
            g84 r4 = defpackage.g84.a
            if (r9 != r4) goto Lab
            return r4
        Lab:
            in2 r9 = (defpackage.in2) r9
            boolean r7 = r8.c(r7, r9)
            if (r7 == 0) goto L91
        Lb3:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo2.F(long, q44):java.lang.Object");
    }

    public final void G(yb9 yb9Var) {
        xz xzVar;
        Class<?> cls = null;
        tb9 tb9Var = yb9Var instanceof tb9 ? (tb9) yb9Var : null;
        if (tb9Var != null && (xzVar = (xz) tb9Var.w0.a.getValue()) != null) {
            cls = xzVar.getClass();
        }
        yy7 yy7Var = W0[0];
        ((rl) this.H0.b).c(ve3.j(yb9Var, cls), new m3(this, 28, yb9Var));
    }

    public final void H(int i, yb9 yb9Var) {
        ub9 ub9Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i2 = v8b.c0;
        ci5 ci5Var = this.P0;
        if (i == i2) {
            xfh.r(ci5Var, new gm2(this.b, yb9Var.j()));
            return;
        }
        if (i == v8b.b0) {
            if (yb9Var instanceof tb9) {
                tb9 tb9Var = (tb9) yb9Var;
                xfh.r(ci5Var, new im2(Long.valueOf(tb9Var.c), tb9Var.b, false));
                return;
            }
            if (yb9Var instanceof ub9) {
                ub9 ub9Var2 = (ub9) yb9Var;
                xfh.r(ci5Var, new im2(Long.valueOf(ub9Var2.c), ub9Var2.b, true));
                return;
            }
            if (yb9Var instanceof wb9) {
                wb9 wb9Var = (wb9) yb9Var;
                xfh.r(ci5Var, new im2(Long.valueOf(wb9Var.c), wb9Var.b, true));
                return;
            } else if (yb9Var instanceof sb9) {
                sb9 sb9Var = (sb9) yb9Var;
                xfh.r(ci5Var, new im2(Long.valueOf(sb9Var.c), sb9Var.b, false));
                return;
            } else {
                if (!(yb9Var instanceof xb9)) {
                    throw new NoWhenBranchMatchedException();
                }
                xb9 xb9Var = (xb9) yb9Var;
                xfh.r(ci5Var, new im2(Long.valueOf(xb9Var.c), xb9Var.b, false));
                return;
            }
        }
        int i3 = v8b.g0;
        ContextScope contextScope = this.a;
        if (i == i3) {
            this.I0.O(this, W0[1], svi.d(contextScope, ((q2b) A()).b(), i84.b, new xn2(this, yb9Var, null)));
            return;
        }
        if (i == v8b.a0) {
            y(yb9Var, true);
            return;
        }
        if (i == v8b.Z) {
            y(yb9Var, false);
            return;
        }
        if (i == v8b.d0) {
            ub9Var = yb9Var instanceof ub9 ? (ub9) yb9Var : null;
            if (ub9Var == null || (charSequence3 = ub9Var.Y) == null) {
                return;
            }
            xfh.r(ci5Var, new fm2(charSequence3.toString()));
            return;
        }
        if (i == v8b.Y) {
            ub9Var = yb9Var instanceof ub9 ? (ub9) yb9Var : null;
            if (ub9Var == null || (charSequence2 = ub9Var.Y) == null) {
                return;
            }
            xfh.r(ci5Var, new bm2(charSequence2.toString()));
            ccb ccbVarD = D();
            ccbVarD.g(new n5g(x8b.r1));
            ccbVarD.e(new qcb(yud.v));
            ccbVarD.i();
            return;
        }
        if (i != v8b.f0) {
            if (i == v8b.e0 && (yb9Var instanceof wb9)) {
                svi.e(contextScope, ((q2b) A()).b(), null, new bo2(this, yb9Var, null), 2);
                return;
            }
            return;
        }
        ub9Var = yb9Var instanceof ub9 ? (ub9) yb9Var : null;
        if (ub9Var == null || (charSequence = ub9Var.Y) == null) {
            return;
        }
        xfh.r(ci5Var, new jm2(charSequence.toString()));
    }

    @Override // defpackage.r19
    public final q19 h() {
        q19 q19Var = (q19) this.F0.get();
        if (q19Var != null) {
            return q19Var;
        }
        Set set = (Set) this.R0.getValue();
        ArrayList arrayList = new ArrayList(we3.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(s00.a((String) it.next()));
        }
        return new q19(0L, 0L, ue3.h0(arrayList), this.b);
    }

    @Override // defpackage.x37
    public final void m() {
        ul2 ul2VarB = B();
        if (ul2VarB == null) {
            return;
        }
        svi.e(this.a, ((q2b) A()).b().plus(bia.a), null, new wn2(this, ul2VarB, null), 2);
    }

    @Override // defpackage.xfh
    public final void s() {
        ul2 ul2VarB = B();
        if (ul2VarB != null) {
            wqi.c(ul2VarB.a, "clear", new Object[0]);
            ev evVar = ul2VarB.Z;
            evVar.b();
            evVar.a();
            synchronized (evVar) {
            }
            ev evVar2 = ul2VarB.t0;
            evVar2.b();
            evVar2.a();
            synchronized (evVar2) {
            }
            ev evVar3 = ul2VarB.s0;
            evVar3.b();
            evVar3.a();
            synchronized (evVar3) {
            }
            ul2VarB.o.d();
        }
        this.s0.f(this);
    }

    public final void y(yb9 yb9Var, boolean z) {
        x9f x9fVarD = svi.d(this.a, ((q2b) A()).b(), i84.b, new ln2(this, yb9Var, z, null));
        this.J0.O(this, W0[2], x9fVarD);
    }

    public final pb2 z() {
        return (pb2) this.o.j(this.b).a.getValue();
    }
}
