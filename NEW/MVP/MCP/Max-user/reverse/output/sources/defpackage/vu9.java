package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class vu9 extends xfh {
    public static final /* synthetic */ yy7[] U1 = {new z8a(vu9.class, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, vu9.class, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;"), new toc(vu9.class, "attachClickJob", "getAttachClickJob()Lru/ok/tamtam/coroutines/ReplaceableCompareJob;", 0), new z8a(vu9.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new z8a(vu9.class, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;"), new z8a(vu9.class, "saveVideoProgressJob", "getSaveVideoProgressJob()Lkotlinx/coroutines/Job;")};
    public final f00 A0;
    public final n9a A1;
    public final yad B0;
    public final hbd B1;
    public final String C0;
    public final tcf C1;
    public final z74 D0;
    public final hbd D1;
    public final k18 E0;
    public final hbd E1;
    public final k18 F0;
    public imb F1;
    public final k18 G0;
    public final bwf G1;
    public final k18 H0;
    public final bwf H1;
    public final k18 I0;
    public final ci5 I1;
    public final k18 J0;
    public final ci5 J1;
    public final k18 K0;
    public final ConcurrentHashMap K1;
    public final k18 L0;
    public final n8a L1;
    public final k18 M0;
    public final bwf M1;
    public final k18 N0;
    public final AtomicLong N1;
    public final k18 O0;
    public final bwf O1;
    public final k18 P0;
    public final x26 P1;
    public final k18 Q0;
    public final tcf Q1;
    public final k18 R0;
    public final hbd R1;
    public final k18 S0;
    public final Object S1;
    public final k18 T0;
    public int T1;
    public final k18 U0;
    public final k18 V0;
    public final k18 W0;
    public final lzf X;
    public final k18 X0;
    public final e4c Y;
    public final k18 Y0;
    public final w63 Z;
    public final k18 Z0;
    public final k18 a1;
    public final cw9 b;
    public final k18 b1;
    public final kj1 c;
    public final k18 c1;
    public final xw d;
    public final k18 d1;
    public final k18 e1;
    public final k18 f1;
    public final k18 g1;
    public final k18 h1;
    public final k18 i1;
    public final k18 j1;
    public final k18 k1;
    public final k18 l1;
    public final k18 m1;
    public final k18 n1;
    public final wo8 o;
    public final ci5 o1;
    public final te8 p1;
    public final t9f q1;
    public final t9f r1;
    public final xpb s0;
    public final vgd s1;
    public final xo8 t0;
    public final t9f t1;
    public final sxd u0;
    public final t9f u1;
    public final vl3 v0;
    public final t9f v1;
    public final fde w0;
    public x9f w1;
    public final pb3 x0;
    public x9f x1;
    public final sxg y0;
    public x9f y1;
    public final rt5 z0;
    public final n9a z1;

    public vu9(cw9 cw9Var, kj1 kj1Var, xw xwVar, wo8 wo8Var, i5i i5iVar, yad yadVar) {
        int i;
        Object objC;
        ku3 ku3VarN;
        gq9 gq9Var = gq9.a;
        lzf dispatchers = gq9Var.getDispatchers();
        e4c e4cVar = (e4c) gq9Var.getAccessor().c(523);
        w63 w63Var = (w63) gq9Var.getAccessor().c(109);
        bwf bwfVarD = gq9Var.getAccessor().d(47);
        gq9Var.getAccessor().getClass();
        xpb xpbVar = new xpb(bwfVarD, gq9Var.getAccessor().d(232), false, 18);
        xo8 xo8Var = new xo8(gq9Var.getAccessor().d(252));
        sxd sxdVarB = gq9Var.b();
        Context context = (Context) gq9Var.getAccessor().c(12);
        z74 z74VarB = ((q2b) ((lzf) gq9Var.getAccessor().c(8))).b();
        bwf bwfVarD2 = gq9Var.getAccessor().d(139);
        bwf bwfVarD3 = gq9Var.getAccessor().d(138);
        sxd sxdVarB2 = gq9Var.b();
        vl3 vl3Var = new vl3();
        vl3Var.a = context;
        vl3Var.b = z74VarB;
        vl3Var.c = sxdVarB2;
        vl3Var.d = bwfVarD3;
        vl3Var.o = bwfVarD2;
        vl3Var.X = ipi.b(3, new ps3(10));
        vl3Var.Y = ipi.b(3, new ps3(11));
        bwf bwfVarD4 = gq9Var.getAccessor().d(79);
        bwf bwfVarD5 = gq9Var.getAccessor().d(49);
        bwf bwfVarD6 = gq9Var.getAccessor().d(138);
        fde fdeVar = new fde();
        fdeVar.a = fde.class.getName();
        fdeVar.b = bwfVarD4;
        fdeVar.c = bwfVarD5;
        fdeVar.d = bwfVarD6;
        pb3 pb3Var = (pb3) gq9Var.getAccessor().c(46);
        sxg sxgVar = (sxg) gq9Var.getAccessor().c(61);
        rt5 rt5Var = (rt5) gq9Var.getAccessor().c(48);
        f00 f00Var = (f00) gq9Var.getAccessor().c(524);
        k18 k18Var = fq9.a;
        bwf bwfVarD7 = gq9Var.getAccessor().d(79);
        bwf bwfVarD8 = gq9Var.getAccessor().d(454);
        bwf bwfVarD9 = gq9Var.getAccessor().d(14);
        bwf bwfVarD10 = gq9Var.getAccessor().d(47);
        bwf bwfVarD11 = gq9Var.getAccessor().d(123);
        bwf bwfVarD12 = gq9Var.getAccessor().d(138);
        bwf bwfVarD13 = gq9Var.getAccessor().d(213);
        bwf bwfVarD14 = gq9Var.getAccessor().d(378);
        bwf bwfVarD15 = gq9Var.getAccessor().d(221);
        bwf bwfVarD16 = gq9Var.getAccessor().d(380);
        bwf bwfVarD17 = gq9Var.getAccessor().d(379);
        bwf bwfVarD18 = gq9Var.getAccessor().d(374);
        bwf bwfVarD19 = gq9Var.getAccessor().d(222);
        bwf bwfVarD20 = gq9Var.getAccessor().d(542);
        bwf bwfVarD21 = gq9Var.getAccessor().d(377);
        bwf bwfVarD22 = gq9Var.getAccessor().d(251);
        bwf bwfVarD23 = gq9Var.getAccessor().d(381);
        bwf bwfVarD24 = gq9Var.getAccessor().d(383);
        sq9 sq9Var = new sq9(cw9Var.a, ((w4e) ((pb3) gq9Var.getAccessor().c(46))).s(), (tw0) gq9Var.getAccessor().c(49), gq9Var.getDispatchers());
        hw9 hw9Var = new hw9((tw0) gq9Var.getAccessor().c(49), gq9Var.getDispatchers());
        bwf bwfVarD25 = gq9Var.getAccessor().d(186);
        bwf bwfVarD26 = gq9Var.getAccessor().d(124);
        bwf bwfVarD27 = gq9Var.getAccessor().d(140);
        bwf bwfVarD28 = gq9Var.getAccessor().d(139);
        bwf bwfVarD29 = gq9Var.getAccessor().d(281);
        bwf bwfVarD30 = gq9Var.getAccessor().d(148);
        bwf bwfVarD31 = gq9Var.getAccessor().d(288);
        bwf bwfVarD32 = gq9Var.getAccessor().d(133);
        bwf bwfVarD33 = gq9Var.getAccessor().d(156);
        bwf bwfVarD34 = gq9Var.getAccessor().d(528);
        bwf bwfVarD35 = gq9Var.getAccessor().d(516);
        bwf bwfVarD36 = gq9Var.getAccessor().d(527);
        bwf bwfVarD37 = gq9Var.getAccessor().d(84);
        bwf bwfVarD38 = gq9Var.getAccessor().d(49);
        bwf bwfVarD39 = gq9Var.getAccessor().d(159);
        k18 k18Var2 = fq9.b;
        k18 k18Var3 = fq9.c;
        bwf bwfVarD40 = gq9Var.getAccessor().d(543);
        bwf bwfVarD41 = gq9Var.getAccessor().d(544);
        bwf bwfVarD42 = gq9Var.getAccessor().d(526);
        this.b = cw9Var;
        this.c = kj1Var;
        this.d = xwVar;
        this.o = wo8Var;
        this.X = dispatchers;
        this.Y = e4cVar;
        this.Z = w63Var;
        this.s0 = xpbVar;
        this.t0 = xo8Var;
        this.u0 = sxdVarB;
        this.v0 = vl3Var;
        this.w0 = fdeVar;
        this.x0 = pb3Var;
        this.y0 = sxgVar;
        this.z0 = rt5Var;
        this.A0 = f00Var;
        this.B0 = yadVar;
        this.C0 = vu9.class.getName();
        q2b q2bVar = (q2b) dispatchers;
        this.D0 = q2bVar.b().limitedParallelism(1, "messages-list-vm-io");
        bwf bwfVar = bwfVarD7;
        this.E0 = bwfVar;
        this.F0 = bwfVarD10;
        this.G0 = bwfVarD9;
        this.H0 = bwfVarD13;
        this.I0 = bwfVarD12;
        this.J0 = bwfVarD16;
        this.K0 = bwfVarD8;
        this.L0 = bwfVarD11;
        this.M0 = bwfVarD21;
        this.N0 = bwfVarD14;
        this.O0 = bwfVarD17;
        this.P0 = bwfVarD15;
        this.Q0 = bwfVarD19;
        this.R0 = bwfVarD18;
        this.S0 = bwfVarD22;
        this.T0 = bwfVarD23;
        this.U0 = bwfVarD24;
        this.V0 = bwfVarD25;
        this.W0 = bwfVarD26;
        this.X0 = bwfVarD27;
        this.Y0 = bwfVarD28;
        this.Z0 = bwfVarD29;
        this.a1 = bwfVarD30;
        this.b1 = bwfVarD31;
        this.c1 = bwfVarD32;
        this.d1 = bwfVarD33;
        this.e1 = bwfVarD20;
        this.f1 = bwfVarD34;
        this.g1 = bwfVarD35;
        this.h1 = bwfVarD36;
        this.i1 = bwfVarD39;
        this.j1 = k18Var2;
        this.k1 = k18Var3;
        this.l1 = bwfVarD40;
        this.m1 = bwfVarD41;
        this.n1 = bwfVarD42;
        this.o1 = new ci5(0);
        List listJ = ve3.j(new xf2(i5iVar), new q92());
        te8 te8Var = new te8();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            bwf bwfVar2 = bwfVar;
            if (obj instanceof or9) {
                arrayList.add(obj);
            }
            bwfVar = bwfVar2;
        }
        bwf bwfVar3 = bwfVar;
        te8Var.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            it.next();
        }
        te8Var.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listJ.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        te8Var.c = arrayList3;
        this.p1 = te8Var;
        this.q1 = c7j.c();
        this.r1 = c7j.c();
        this.s1 = new vgd(1);
        this.t1 = c7j.c();
        this.u1 = c7j.c();
        this.v1 = c7j.c();
        Symbol symbol = o9a.a;
        this.z1 = new n9a();
        this.A1 = new n9a();
        hbd hbdVarJ = w63Var.j(cw9Var.a);
        this.B1 = hbdVarJ;
        tcf tcfVarA = ucf.a(hr9.d);
        this.C1 = tcfVarA;
        hbd hbdVar = new hbd(tcfVarA);
        this.D1 = hbdVar;
        b66 b66Var = null;
        z41 z41Var = new z41(hbdVarJ, hbdVar, new s3(this, b66Var, 19), 3);
        ContextScope contextScope = this.a;
        lcj lcjVar = yve.a;
        this.E1 = gw0.C(z41Var, contextScope, lcjVar, hd5.a);
        final int i2 = 0;
        this.G1 = new bwf(new cm6(this) { // from class: gs9
            public final /* synthetic */ vu9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        vu9 vu9Var = this.b;
                        return new csg(vu9Var.B1, vu9Var.D1, vu9Var.a, vu9Var.X);
                    default:
                        vu9 vu9Var2 = this.b;
                        return new ay9(vu9Var2.b, vu9Var2.D0, vu9Var2.a, vu9Var2.B1, vu9Var2.D1, new ir9(2, vu9Var2, vu9.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 2), new wu7(17, vu9Var2));
                }
            }
        });
        final int i3 = 1;
        this.H1 = new bwf(new cm6(this) { // from class: gs9
            public final /* synthetic */ vu9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        vu9 vu9Var = this.b;
                        return new csg(vu9Var.B1, vu9Var.D1, vu9Var.a, vu9Var.X);
                    default:
                        vu9 vu9Var2 = this.b;
                        return new ay9(vu9Var2.b, vu9Var2.D0, vu9Var2.a, vu9Var2.B1, vu9Var2.D1, new ir9(2, vu9Var2, vu9.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 2), new wu7(17, vu9Var2));
                }
            }
        });
        this.I1 = new ci5(0);
        this.J1 = new ci5(0);
        this.K1 = new ConcurrentHashMap(0);
        this.L1 = new n8a((Object) null);
        this.M1 = new bwf(new es9(bwfVarD13, this));
        this.N1 = new AtomicLong();
        this.O1 = new bwf(new jh6(this, bwfVar3, bwfVarD38, bwfVarD12, bwfVarD37, 1));
        this.P1 = gw0.u(new yh0(tcfVarA, 9), q2bVar.a());
        tcf tcfVarA2 = ucf.a(null);
        this.Q1 = tcfVarA2;
        yh0 yh0Var = new yh0(tcfVarA, 10);
        d53 d53Var = new d53(hbdVarJ, 12);
        pb2 pb2Var = (pb2) hbdVarJ.a.getValue();
        this.R1 = gw0.C(gw0.u(gw0.j(yh0Var, d53Var, tcfVarA2, gw0.l((pb2Var == null || (ku3VarN = pb2Var.n()) == null) ? new m11(13, null) : new d53(((l24) bwfVarD11.getValue()).c(ku3VarN.p()), 12), new cj0(20)), new x33(this, b66Var, 1)), q2bVar.b()), this.a, lcjVar, null);
        gu5 gu5Var = (gu5) rt5Var;
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f155viewscountenabled, false)) {
            i = 12;
            objC = gw0.C(gw0.u(new bc2(new d53(hbdVarJ, 12), 10), q2bVar.a()), this.a, lcjVar, Boolean.FALSE);
        } else {
            objC = ucf.a(Boolean.FALSE);
            i = 12;
        }
        this.S1 = objC;
        gw0.w(gw0.u(new g56(new mwd(new tu9(new z41(new d53(hbdVarJ, i), xwVar.z, new ld0(3, b66Var, 25), 3), null, this)), new hs9(this, null), 1), q2bVar.a()), this.a);
        xfh.o(this, q2bVar.b(), new is9(this, null), 2);
        gw0.w(new g56((x26) sq9Var.f.getValue(), new js9(this, null), 1), this.a);
        gw0.w(new g56(new gbd(hw9Var.a), new ks9(this, null), 1), this.a);
        ((b8a) e4cVar.a).b(e4cVar.h);
        e4cVar.a();
        svi.e(this.a, null, null, new ls9(this, null), 3);
        gw0.w(gw0.u(new g56(tcfVarA, new uu9(this, null), 1), q2bVar.b()), this.a);
    }

    public static ei4 C(long j, long j2, String str, boolean z) {
        qr9.c.getClass();
        return new ei4(":attach/viewer?chat_id=" + j + "&attach_id=" + str + "&msg_id=" + j2 + "&single=" + z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.sd5 t(defpackage.vu9 r14, defpackage.wv3 r15, defpackage.pb2 r16, defpackage.n5g r17, defpackage.n5g r18) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu9.t(vu9, wv3, pb2, n5g, n5g):sd5");
    }

    public static final eh9 u(vu9 vu9Var, long j) {
        vu9Var.getClass();
        try {
            return ((od8) vu9Var.R0.getValue()).a(j, true);
        } catch (IllegalStateException e) {
            wqi.e(vu9Var.C0, "Failed to get message", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.vu9 r8, long r9, defpackage.q44 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ss9
            if (r0 == 0) goto L13
            r0 = r11
            ss9 r0 = (defpackage.ss9) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ss9 r0 = new ss9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r11)
            goto L43
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            defpackage.g8j.b(r11)
            k18 r8 = r8.H0
            java.lang.Object r8 = r8.getValue()
            nh9 r8 = (defpackage.nh9) r8
            r0.X = r2
            java.io.Serializable r11 = r8.c(r9, r0)
            g84 r8 = defpackage.g84.a
            if (r11 != r8) goto L43
            return r8
        L43:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            at r8 = new at
            r9 = 2
            r8.<init>(r9, r11)
            wm7 r9 = new wm7
            r10 = 21
            r9.<init>(r10)
            oz5 r8 = defpackage.lee.h(r8, r9)
            ts9 r0 = new ts9
            r6 = 0
            r7 = 0
            r1 = 1
            ih9 r2 = defpackage.ih9.a
            java.lang.Class<ih9> r3 = defpackage.ih9.class
            java.lang.String r4 = "convert"
            java.lang.String r5 = "convert$message_list_release(Lru/ok/tamtam/messages/MessageAction;)Lone/me/sdk/contextmenu/ContextMenuAction;"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            nhg r9 = new nhg
            r9.<init>(r8, r0)
            java.util.List r8 = defpackage.lee.o(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu9.v(vu9, long, q44):java.lang.Object");
    }

    public static final gx9 w(vu9 vu9Var) {
        return (gx9) vu9Var.I0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.vu9 r19, defpackage.si9 r20, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu9.x(vu9, si9, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r5.a(r5, r7, r9, defpackage.p10.o, r11) == r13) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.vu9 r26, defpackage.si9 r27, defpackage.q44 r28) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu9.y(vu9, si9, q44):java.lang.Object");
    }

    public static final void z(vu9 vu9Var) {
        ccb ccbVar = (ccb) vu9Var.K0.getValue();
        ccbVar.e(new qcb(yud.J));
        ccbVar.g(new n5g(l7b.k0));
        vu9Var.R(ccbVar);
        ccbVar.i();
    }

    public final void A(long j, sj3 sj3Var) {
        xfh.o(this, ((q2b) this.X).b(), new ps9(this, sj3Var, j, null), 2);
    }

    public final f7f B() {
        pb2 pb2Var = (pb2) this.B1.a.getValue();
        if (pb2Var == null) {
            return null;
        }
        return fbj.a(pb2Var);
    }

    public final p6a D() {
        return (p6a) this.M1.getValue();
    }

    public final ay9 E() {
        return (ay9) this.H1.getValue();
    }

    public final csg F() {
        return (csg) this.G1.getValue();
    }

    public final void G(String str) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.X).b(), i84.b, new ct9(this, str, null));
        this.t1.O(this, U1[3], x9fVarD);
    }

    public final void H(cj9 cj9Var, long j) {
        String strA;
        if (D().g()) {
            D().h(j);
            return;
        }
        if (ms9.$EnumSwitchMapping$2[cj9Var.c.ordinal()] == 1) {
            long j2 = cj9Var.a;
            if (j2 > 0) {
                I(j2);
                return;
            }
            String str = cj9Var.b;
            if (str == null || (strA = ((j98) this.W0.getValue()).a(str)) == null) {
                return;
            }
            G(strA);
        }
    }

    public final void I(long j) {
        svi.e(this.a, null, null, new gt9(this, j, null), 3);
    }

    public final boolean J(final m00 m00Var, final long j, final String str) {
        xz xzVar;
        if (D().g()) {
            D().h(j);
            return true;
        }
        if (m00Var instanceof ru3) {
            return false;
        }
        if (((m00Var instanceof ae3) && str == null) || (m00Var instanceof m40) || (m00Var instanceof b5h)) {
            return false;
        }
        Class<?> cls = null;
        hv5 hv5Var = m00Var instanceof hv5 ? (hv5) m00Var : null;
        if (hv5Var != null && (xzVar = (xz) hv5Var.m.a.getValue()) != null) {
            cls = xzVar.getClass();
        }
        yy7 yy7Var = U1[2];
        ((rl) this.s1.b).c(ve3.j(m00Var, Long.valueOf(j), str, cls), new cm6() { // from class: fs9
            @Override // defpackage.cm6
            public final Object invoke() {
                vu9 vu9Var = this.a;
                return svi.d(vu9Var.a, vu9Var.D0, i84.b, new it9(m00Var, vu9Var, j, str, null));
            }
        });
        return true;
    }

    public final boolean K(MessageModel messageModel) {
        this.r1.O(this, U1[1], svi.d(this.a, this.D0, i84.b, new kt9(this, messageModel, null)));
        return messageModel.b != 0;
    }

    public final void L(int i, List list) {
        long jLongValue;
        MessageModel messageModelE;
        m00 m00Var;
        Long l;
        int i2 = j7b.y;
        ci5 ci5Var = this.I1;
        if (i == i2) {
            Long l2 = (Long) ue3.I(list);
            if (l2 != null) {
                xfh.r(ci5Var, new oye(l2.longValue()));
                return;
            }
            return;
        }
        int i3 = j7b.v;
        hbd hbdVar = this.D1;
        ci5 ci5Var2 = this.J1;
        if (i == i3) {
            if (list.size() != 1) {
                qr9.c.getClass();
                xfh.r(ci5Var2, qr9.L0(list, false));
                return;
            }
            Long l3 = (Long) ue3.I(list);
            if (l3 != null) {
                MessageModel messageModelE2 = ((hr9) hbdVar.a.getValue()).e(l3.longValue());
                if (messageModelE2 == null) {
                    return;
                }
                qr9 qr9Var = qr9.c;
                boolean z = messageModelE2.t0.b instanceof hv5;
                qr9Var.getClass();
                xfh.r(ci5Var2, qr9.L0(list, z));
                return;
            }
            return;
        }
        int i4 = j7b.q;
        lzf lzfVar = this.X;
        if (i == i4) {
            xfh.o(this, ((q2b) lzfVar).b(), new ot9(this, list, null), 2);
            return;
        }
        if (i == j7b.z) {
            xfh.o(this, ((q2b) lzfVar).b(), new rt9(this, list, null), 2);
            return;
        }
        int i5 = j7b.w;
        ContextScope contextScope = this.a;
        if (i == i5) {
            this.q1.O(this, U1[0], svi.d(contextScope, ((q2b) lzfVar).b(), i84.b, new tt9(this, list, null)));
            return;
        }
        if (i == j7b.s) {
            xfh.o(this, ((q2b) lzfVar).b(), new ut9(this, list, null), 2);
            return;
        }
        if (i == j7b.m) {
            xfh.o(this, ((q2b) lzfVar).b(), new vt9(this, list, null), 2);
            return;
        }
        if (i == j7b.n) {
            xfh.o(this, ((q2b) lzfVar).b(), new wt9(this, list, null), 2);
            return;
        }
        if (i == j7b.k) {
            Long l4 = (Long) ue3.I(list);
            if (l4 != null) {
                A(l4.longValue(), sj3.SPAM);
                return;
            }
            return;
        }
        if (i == j7b.j) {
            Long l5 = (Long) ue3.I(list);
            if (l5 != null) {
                A(l5.longValue(), sj3.PORNO);
                return;
            }
            return;
        }
        if (i == j7b.g) {
            Long l6 = (Long) ue3.I(list);
            if (l6 != null) {
                A(l6.longValue(), sj3.EXTREMISM);
                return;
            }
            return;
        }
        if (i == j7b.h) {
            Long l7 = (Long) ue3.I(list);
            if (l7 != null) {
                A(l7.longValue(), sj3.FAKE);
                return;
            }
            return;
        }
        if (i == j7b.l) {
            Long l8 = (Long) ue3.I(list);
            if (l8 != null) {
                A(l8.longValue(), sj3.THREAT);
                return;
            }
            return;
        }
        if (i == j7b.i) {
            Long l9 = (Long) ue3.I(list);
            if (l9 != null) {
                A(l9.longValue(), sj3.OTHER);
                return;
            }
            return;
        }
        if (i == j7b.x) {
            pb2 pb2Var = (pb2) this.B1.a.getValue();
            if (pb2Var == null || (l = (Long) ue3.I(list)) == null) {
                return;
            }
            if (pb2Var.o != null) {
                pq3 pq3Var = hh9.a;
                xfh.r(ci5Var, new lxe(Collections.singletonList(l), pb2Var.M() ? new n5g(l7b.b) : new n5g(l7b.K), null, ve3.j(new pq3(j7b.o, new n5g(l7b.I), 3, 56), new pq3(j7b.p, new n5g(l7b.J), 3, 56), hh9.a), true));
                return;
            } else {
                pq3 pq3Var2 = hh9.a;
                xfh.r(ci5Var, new lxe(Collections.singletonList(l), pb2Var.M() ? new n5g(l7b.a) : new n5g(l7b.H), null, ve3.j(new pq3(j7b.o, new n5g(l7b.I), 3, 56), new pq3(j7b.p, new n5g(l7b.J), 3, 56), hh9.a), true));
                return;
            }
        }
        if (i == j7b.o) {
            Long l10 = (Long) ue3.I(list);
            if (l10 != null) {
                xfh.o(this, null, new fu9(this, l10.longValue(), true, true, null), 3);
                return;
            }
            return;
        }
        if (i == j7b.p) {
            Long l11 = (Long) ue3.I(list);
            if (l11 != null) {
                xfh.o(this, null, new fu9(this, l11.longValue(), false, true, null), 3);
                return;
            }
            return;
        }
        if (i == j7b.C) {
            xfh.o(this, null, new yt9(this, list, null), 3);
            return;
        }
        if (i == j7b.B) {
            Long l12 = (Long) ue3.I(list);
            if (l12 != null) {
                D().h(l12.longValue());
                return;
            }
            return;
        }
        if (i == j7b.u) {
            Long l13 = (Long) ue3.I(list);
            if (l13 != null) {
                xfh.r(ci5Var, new nxe(l13.longValue()));
                return;
            }
            return;
        }
        if (i == j7b.c) {
            xfh.o(this, ((q2b) lzfVar).b(), new au9(this, list, null), 2);
            return;
        }
        if (i == j7b.b) {
            xfh.o(this, ((q2b) lzfVar).b(), new cu9(this, null), 2);
            return;
        }
        if (i == j7b.a) {
            xfh.o(this, ((q2b) lzfVar).b(), new mt9(this, list, null), 2);
            return;
        }
        int i6 = j7b.A;
        n8a n8aVar = this.L1;
        if (i == i6) {
            Long l14 = (Long) ue3.I(list);
            if (l14 != null) {
                long jLongValue2 = l14.longValue();
                if (n8aVar.d(jLongValue2)) {
                    return;
                }
                n8aVar.a(jLongValue2);
                xfh.o(this, ((q2b) lzfVar).b(), new rs9(this, jLongValue2, null), 2);
                return;
            }
            return;
        }
        if (i == j7b.r) {
            Long l15 = (Long) ue3.I(list);
            if (l15 != null) {
                long jLongValue3 = l15.longValue();
                if (n8aVar.d(jLongValue3)) {
                    return;
                }
                n8aVar.a(jLongValue3);
                vl3 vl3Var = this.v0;
                vl3Var.getClass();
                gw0.w(new g56(gw0.u(new mwd(new l74(vl3Var, jLongValue3, null)), (z74) vl3Var.b), new qs9(this, jLongValue3, null), 1), contextScope);
                return;
            }
            return;
        }
        if (i != bzc.messages_list_context_action_share_externally) {
            if (i == bzc.messages_list_context_action_share_post) {
                xfh.o(this, ((q2b) lzfVar).b(), new nt9(this, list, null), 2);
                return;
            }
            return;
        }
        Long l16 = (Long) ue3.I(list);
        if (l16 == null || (messageModelE = ((hr9) hbdVar.a.getValue()).e((jLongValue = l16.longValue()))) == null || (m00Var = messageModelE.t0.b) == null) {
            return;
        }
        boolean z2 = m00Var instanceof hv5;
        o05 o05Var = o05.a;
        if (z2) {
            hv5 hv5Var = (hv5) m00Var;
            qr9 qr9Var2 = qr9.c;
            long j = hv5Var.a;
            String str = hv5Var.c;
            int iV = az1.v(hv5Var.i);
            if (iV == 0) {
                o05Var = o05.c;
            } else if (iV != 1) {
                if (iV == 2) {
                    o05Var = o05.d;
                } else {
                    if (iV != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o05Var = o05.X;
                }
            }
            qr9Var2.getClass();
            xfh.r(ci5Var2, qr9.O0(jLongValue, j, str, o05Var));
            return;
        }
        if (m00Var instanceof s3f) {
            s3f s3fVar = (s3f) m00Var;
            qr9 qr9Var3 = qr9.c;
            long j2 = s3fVar.c.a;
            String str2 = s3fVar.b;
            qr9Var3.getClass();
            xfh.r(ci5Var2, qr9.O0(jLongValue, j2, str2, o05Var));
            return;
        }
        if (m00Var instanceof b5h) {
            b5h b5hVar = (b5h) m00Var;
            qr9 qr9Var4 = qr9.c;
            long j3 = b5hVar.c.a;
            String str3 = b5hVar.b;
            qr9Var4.getClass();
            xfh.r(ci5Var2, qr9.O0(jLongValue, j3, str3, o05Var));
        }
    }

    public final void M(long j) {
        MessageModel messageModelE = ((hr9) this.C1.getValue()).e(j);
        if (D().g()) {
            D().h(j);
            return;
        }
        if ((messageModelE != null ? messageModelE.Y : null) == ghh.X) {
            N(j);
            return;
        }
        x9f x9fVar = this.y1;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.N1.set(j);
            this.y1 = svi.e(this.a, ((q2b) this.X).a(), null, new ou9(this, j, null), 2);
        }
    }

    public final void N(long j) {
        int size = ((hr9) this.C1.getValue()).c().size();
        pq3 pq3Var = hh9.a;
        pb2 pb2Var = (pb2) this.B1.a.getValue();
        boolean z = false;
        if (pb2Var != null && pb2Var.M()) {
            z = true;
        }
        List listSingletonList = Collections.singletonList(Long.valueOf(j));
        n5g n5gVar = z ? new n5g(l7b.f) : new n5g(l7b.o0);
        o98 o98VarD = ve3.d();
        o98VarD.add(new pq3(j7b.c, z ? new n5g(l7b.e) : new n5g(l7b.n0), 3, 56));
        if (size > 1) {
            o98VarD.add(new pq3(j7b.b, z ? new p5g(l7b.d, ys.D(new Object[]{Integer.valueOf(size)})) : new p5g(l7b.m0, ys.D(new Object[]{Integer.valueOf(size)})), 3, 56));
        }
        o98VarD.add(new pq3(j7b.a, z ? new n5g(l7b.c) : new n5g(l7b.l0), 1, 56));
        xfh.r(this.I1, new lxe(listSingletonList, n5gVar, null, ve3.a(o98VarD), false));
    }

    public final void O(long j) {
        ay9 ay9VarE = E();
        ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new ux9(ay9VarE, j, null)));
    }

    public final void P(long j, boolean z, boolean z2, boolean z3) {
        this.L1.l(j);
        k18 k18Var = this.K0;
        if (!z) {
            ccb ccbVar = (ccb) k18Var.getValue();
            ccbVar.e(new qcb(yud.J));
            ccbVar.g(new n5g(l7b.v0));
            R(ccbVar);
            ccbVar.i();
            return;
        }
        int i = z2 ? l7b.u0 : z3 ? l7b.s0 : l7b.t0;
        ccb ccbVar2 = (ccb) k18Var.getValue();
        ccbVar2.e(new qcb(yud.n));
        ccbVar2.g(new n5g(i));
        R(ccbVar2);
        ccbVar2.i();
    }

    public final void Q(boolean z) {
        ay9 ay9VarE = E();
        String str = ay9VarE.i;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("Update scroll to bottom state, visible:", z), null);
            }
        }
        tcf tcfVar = ay9VarE.o;
        while (true) {
            Object value = tcfVar.getValue();
            boolean z2 = z;
            if (tcfVar.c(value, o3e.a((o3e) value, 0, z2, false, null, 13))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void R(ccb ccbVar) {
        ccbVar.c(new kcb(0, 0, this.T1, 3));
    }

    @Override // defpackage.xfh
    public final void s() {
        this.d.e();
        e4c e4cVar = this.Y;
        t9f t9fVar = e4cVar.e;
        yy7[] yy7VarArr = e4c.j;
        qt7 qt7Var = (qt7) t9fVar.D(e4cVar, yy7VarArr[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        e4cVar.e.O(e4cVar, yy7VarArr[0], null);
        e4cVar.f.setValue(null);
        ((b8a) e4cVar.a).r(e4cVar.h);
        this.K1.clear();
        this.L1.c();
        f00 f00Var = this.A0;
        t9f t9fVar2 = f00Var.d;
        yy7[] yy7VarArr2 = f00.f;
        qt7 qt7Var2 = (qt7) t9fVar2.D(f00Var, yy7VarArr2[0]);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        f00Var.d.O(f00Var, yy7VarArr2[0], null);
        f00Var.e.setValue(null);
        d7j.c((f84) ((dn9) this.O1.getValue()).f.getValue(), null);
        this.N1.set(0L);
    }
}
