package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xg2 extends ml2 {
    public static final /* synthetic */ yy7[] G0;
    public xz E0;
    public final t9f F0;

    static {
        z8a z8aVar = new z8a(xg2.class, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        G0 = new yy7[]{z8aVar};
    }

    public xg2(Context context) {
        super(new il2(context));
        this.F0 = c7j.c();
    }

    @Override // defpackage.ml2
    public final void F(yb9 yb9Var, em6 em6Var, sm6 sm6Var) {
        tb9 tb9Var = (tb9) yb9Var;
        z(tb9Var);
        super.F(tb9Var, em6Var, sm6Var);
    }

    @Override // defpackage.d2f
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void z(tb9 tb9Var) {
        il2 il2Var = (il2) this.a;
        il2Var.setId((int) tb9Var.a);
        il2Var.setTitle(tb9Var.o);
        x9f x9fVarE = svi.e(tfh.b(il2Var), null, i84.b, new wg2(tb9Var, this, il2Var, null), 1);
        this.F0.O(this, G0[0], x9fVarE);
    }
}
