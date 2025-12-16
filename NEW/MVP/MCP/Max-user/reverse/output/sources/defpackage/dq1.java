package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes.dex */
public final class dq1 implements jzb {
    public static final /* synthetic */ yy7[] m;
    public final tha a;
    public final fde b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final tcf f;
    public final hbd g;
    public final jve h;
    public final gbd i;
    public boolean j;
    public f84 k;
    public final t9f l;

    static {
        z8a z8aVar = new z8a(dq1.class, "updateQuoteStateJob", "getUpdateQuoteStateJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        m = new yy7[]{z8aVar};
    }

    public dq1(tha thaVar, fde fdeVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = thaVar;
        this.b = fdeVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        tcf tcfVarA = ucf.a(new aq1(null, null, wp1.a));
        this.f = tcfVarA;
        this.g = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.h = jveVarB;
        this.i = new gbd(jveVarB);
        this.l = c7j.c();
    }

    @Override // defpackage.jzb
    public final void a() {
        this.k = null;
        yy7[] yy7VarArr = m;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.l;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
        this.b.F(yybVar);
        g();
    }

    @Override // defpackage.jzb
    public final void d(long j) {
        this.b.E(j);
        g();
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.k = contextScope;
        x9f x9fVarD = null;
        if (contextScope != null) {
            x9fVarD = svi.d(contextScope, ((q2b) ((lzf) this.c.getValue())).b(), i84.b, new cq1(this, null, wp1.a, null));
        }
        this.l.O(this, m[0], x9fVarD);
    }

    public final void f() {
        k18 k18Var = this.d;
        if (!((hw1) ((tv1) k18Var.getValue())).t()) {
            this.h.h(jc3.b);
            return;
        }
        String str = ((hw1) ((tv1) k18Var.getValue())).l().d;
        if (str != null && !vmf.F(str)) {
            h(str, Boolean.TRUE);
            return;
        }
        h(null, null);
        tv1 tv1Var = (tv1) k18Var.getValue();
        jx0 jx0Var = new jx0(1, this, dq1.class, "onCreateLinkSuccess", "onCreateLinkSuccess(Ljava/lang/String;)V", 0, 1);
        o91 o91Var = new o91(0, this, dq1.class, "onCreateLinkError", "onCreateLinkError()V", 0, 6);
        hw1 hw1Var = (hw1) tv1Var;
        String str2 = hw1Var.k().d;
        if (str2 != null && str2.length() != 0) {
            wqi.c("CallEngineTag", "join link already exist", new Object[0]);
            jx0Var.invoke(str2);
            return;
        }
        String str3 = hw1Var.k().c;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 == null) {
            wqi.c("CallEngineTag", "create p2p join link failed due to conversationId in null or empty", new Object[0]);
            return;
        }
        x9f x9fVar = hw1Var.R0;
        if (x9fVar == null || !x9fVar.isActive()) {
            hw1Var.R0 = svi.e(hw1Var.a, ((q2b) ((lzf) hw1Var.C0.getValue())).b(), null, new wv1(hw1Var, str3, o91Var, jx0Var, null), 2);
        } else {
            wqi.c("CallEngineTag", "create p2p join link already in progress", new Object[0]);
        }
    }

    public final void g() {
        tcf tcfVar;
        Object value;
        aq1 aq1VarA;
        do {
            tcfVar = this.f;
            value = tcfVar.getValue();
            aq1VarA = (aq1) value;
            zp1 zp1Var = this.b.r().isEmpty() ? wp1.a : aq1VarA.c;
            if (!fni.a(aq1VarA.c, zp1Var)) {
                aq1VarA = aq1.a(aq1VarA, null, null, zp1Var, 3);
            }
        } while (!tcfVar.c(value, aq1VarA));
    }

    public final void h(String str, Boolean bool) {
        tcf tcfVar;
        Object value;
        x9f x9fVarD;
        zp1 zp1Var;
        ShareData shareData = new ShareData(0, null, null, dqi.u(str), null, null, null, 119, null);
        do {
            tcfVar = this.f;
            value = tcfVar.getValue();
            x9fVarD = null;
        } while (!tcfVar.c(value, aq1.a((aq1) value, shareData, null, null, 6)));
        if (bool == null) {
            zp1Var = xp1.a;
        } else if (bool.equals(Boolean.FALSE)) {
            zp1Var = wp1.a;
        } else {
            if (!bool.equals(Boolean.TRUE)) {
                throw new NoWhenBranchMatchedException();
            }
            zp1Var = yp1.a;
        }
        f84 f84Var = this.k;
        if (f84Var != null) {
            x9fVarD = svi.d(f84Var, ((q2b) ((lzf) this.c.getValue())).b(), i84.b, new cq1(this, shareData, zp1Var, null));
        }
        this.l.O(this, m[0], x9fVarD);
    }
}
