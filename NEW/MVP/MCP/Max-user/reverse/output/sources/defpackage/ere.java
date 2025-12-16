package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class ere extends xfh {
    public static final /* synthetic */ yy7[] R0 = {new z8a(ere.class, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, ere.class, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;"), new z8a(ere.class, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;"), new z8a(ere.class, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;"), new z8a(ere.class, "updateContentLevelAccessJob", "getUpdateContentLevelAccessJob()Lkotlinx/coroutines/Job;"), new z8a(ere.class, "updateUnsafeFilesJob", "getUpdateUnsafeFilesJob()Lkotlinx/coroutines/Job;"), new z8a(ere.class, "disableSafeModeJob", "getDisableSafeModeJob()Lkotlinx/coroutines/Job;")};
    public final hbd A0;
    public final t9f B0;
    public final t9f C0;
    public final t9f D0;
    public final t9f E0;
    public final t9f F0;
    public final t9f G0;
    public final t9f H0;
    public Long I0;
    public Long J0;
    public xhe K0;
    public final ArrayList L0;
    public final String M0;
    public long N0;
    public final jve O0;
    public final gbd P0;
    public final ci5 Q0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final wle b;
    public final vhb c;
    public final lzf d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final tcf z0;

    public ere(wle wleVar, vhb vhbVar, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, mo3 mo3Var) {
        bqe bqeVar = bqe.a;
        bwf bwfVarD = bqeVar.getAccessor().d(392);
        bwf bwfVarD2 = bqeVar.getAccessor().d(393);
        bwf bwfVarD3 = bqeVar.getAccessor().d(394);
        bwf bwfVarD4 = bqeVar.getAccessor().d(395);
        bwf bwfVarD5 = bqeVar.getAccessor().d(196);
        bwf bwfVarD6 = bqeVar.getAccessor().d(110);
        this.b = wleVar;
        this.c = vhbVar;
        this.d = lzfVar;
        this.o = k18Var;
        this.X = k18Var4;
        this.Y = k18Var5;
        this.Z = k18Var2;
        this.s0 = k18Var3;
        this.t0 = bwfVarD;
        this.u0 = bwfVarD2;
        this.v0 = bwfVarD3;
        this.w0 = bwfVarD4;
        this.x0 = bwfVarD5;
        this.y0 = bwfVarD6;
        tcf tcfVarA = ucf.a(hd5.a);
        this.z0 = tcfVarA;
        this.A0 = new hbd(tcfVarA);
        this.B0 = c7j.c();
        this.C0 = c7j.c();
        this.D0 = c7j.c();
        this.E0 = c7j.c();
        this.F0 = c7j.c();
        this.G0 = c7j.c();
        this.H0 = c7j.c();
        this.L0 = new ArrayList();
        this.M0 = ere.class.getName();
        jve jveVarB = kve.b(1, Integer.MAX_VALUE, 4);
        this.O0 = jveVarB;
        this.P0 = new gbd(jveVarB);
        this.Q0 = new ci5(0);
        if (this.I0 == null) {
            hwa hwaVarW = w();
            this.I0 = Long.valueOf(hwa.q(hwaVarW, new sie(hwaVarW.t().a.k(), 1)));
        }
        klc klcVar = (klc) bwfVarD6.getValue();
        long jS = ((w4e) y()).s();
        gw0.w(new g56(new hbd((f9a) klcVar.f.computeIfAbsent(Long.valueOf(jS), new ni(26, new k03(klcVar, jS, 2)))), new lqe(this, null), 1), this.a);
        gw0.w(new g56(new gbd(wleVar.b), new mqe(this, null), 1), this.a);
        gw0.w(gw0.u(new g56(new gbd(mo3Var.a), new nqe(this, null), 1), ((q2b) lzfVar).a()), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.ere r26, defpackage.o98 r27, defpackage.q44 r28) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ere.t(ere, o98, q44):java.lang.Object");
    }

    public static final void u(ere ereVar, Throwable th) {
        s5g r5gVar;
        s5g n5gVar = new n5g(mvd.D);
        if (th instanceof TamErrorException) {
            uzf uzfVarB = a6a.b(((TamErrorException) th).a);
            if (uzfVarB.equals(qzf.a)) {
                r5gVar = new n5g(mvd.E);
            } else if (uzfVarB.equals(rzf.a)) {
                r5gVar = new n5g(mvd.F);
            } else if (uzfVarB.equals(szf.a)) {
                r5gVar = new n5g(mvd.I);
            } else {
                if (!(uzfVarB instanceof tzf)) {
                    throw new NoWhenBranchMatchedException();
                }
                r5gVar = new r5g(((tzf) uzfVarB).a);
            }
            n5gVar = r5gVar;
        }
        ereVar.A(new gme(n5gVar));
    }

    public static final Object v(ere ereVar, dtf dtfVar) {
        Object objI = svi.i(((q2b) ereVar.d).a(), new zqe(ereVar, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public static n5g z(String str) {
        int i = oqe.$EnumSwitchMapping$0[az1.v(xrf.b(str))];
        return i != 1 ? i != 2 ? new n5g(mvd.b) : new n5g(mvd.J0) : new n5g(mvd.O);
    }

    public final void A(cda cdaVar) {
        this.O0.h(cdaVar);
    }

    public final void B(boolean z) {
        wqi.c(this.M0, "updateContentLevelAccess", new Object[0]);
        x9f x9fVarO = xfh.o(this, null, new wqe(this, z, null), 3);
        this.F0.O(this, R0[4], x9fVarO);
    }

    public final void C(boolean z) {
        wqi.c(this.M0, "updateHowSeeOnlineState", new Object[0]);
        x9f x9fVarO = xfh.o(this, null, new xqe(this, z, null), 3);
        this.B0.O(this, R0[0], x9fVarO);
    }

    public final void D(boolean z) {
        wqi.c(this.M0, "updateUnsafeFiles", new Object[0]);
        x9f x9fVarO = xfh.o(this, null, new are(this, z, null), 3);
        this.G0.O(this, R0[5], x9fVarO);
    }

    public final void E(int i) {
        wqi.c(this.M0, "updateWhoCanSearchMeByPhone", new Object[0]);
        x9f x9fVarO = xfh.o(this, null, new dre(this, i, null), 3);
        this.E0.O(this, R0[3], x9fVarO);
    }

    @Override // defpackage.xfh
    public final void s() {
        wle wleVar = this.b;
        ((tw0) wleVar.a.getValue()).f(wleVar);
    }

    public final hwa w() {
        return (hwa) this.X.getValue();
    }

    public final sxg x() {
        return (sxg) this.o.getValue();
    }

    public final pb3 y() {
        return (pb3) this.Z.getValue();
    }
}
