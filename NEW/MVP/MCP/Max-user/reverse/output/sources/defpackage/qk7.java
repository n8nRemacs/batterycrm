package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;

/* loaded from: classes2.dex */
public final class qk7 {
    public static final /* synthetic */ yy7[] n = {new z8a(qk7.class, "autohideJob", "getAutohideJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, qk7.class, "animojiFetchJob", "getAnimojiFetchJob()Lkotlinx/coroutines/Job;")};
    public final f84 a;
    public final gk7 b;
    public final wj c;
    public final k18 e;
    public final k18 f;
    public String i;
    public final tcf j;
    public final hbd k;
    public final jve l;
    public final gbd m;
    public final String d = qk7.class.getName();
    public final t9f g = c7j.c();
    public final t9f h = c7j.c();

    public qk7(ContextScope contextScope, gk7 gk7Var, wj wjVar, k18 k18Var, k18 k18Var2, xnb xnbVar, xia xiaVar) {
        this.a = contextScope;
        this.b = gk7Var;
        this.c = wjVar;
        this.e = k18Var;
        this.f = k18Var2;
        tcf tcfVarA = ucf.a(yk7.a);
        this.j = tcfVarA;
        this.k = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, 1, 5);
        this.l = jveVarB;
        this.m = new gbd(jveVarB);
        zs0.e(new g56(new z41(new m36(new hk7(2, null), gw0.m(xnbVar)), new m36(new ik7(2, null), xiaVar.b), new uh0(3, null, 1), 3), new jk7(this, null), 1), contextScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c A[LOOP:0: B:77:0x0200->B:86:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a A[EDGE_INSN: B:91:0x022a->B:83:0x022a BREAK  A[LOOP:0: B:77:0x0200->B:86:0x024c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qk7 r22, defpackage.q44 r23) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk7.a(qk7, q44):java.lang.Object");
    }

    public static RLottieDrawable b(vh vhVar) {
        int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        String str = vhVar.c;
        if (str == null) {
            str = "";
        }
        return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str, true, iD, iD, true), false, false, true, false, 18, null));
    }
}
