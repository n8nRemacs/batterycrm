package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class cq5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq5 b;
    public final /* synthetic */ bq5 c;

    public /* synthetic */ cq5(dq5 dq5Var, bq5 bq5Var, int i) {
        this.a = i;
        this.b = dq5Var;
        this.c = bq5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jx0 jx0Var = this.b.E0;
                if (jx0Var != null) {
                    jx0Var.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            case 1:
                jx0 jx0Var2 = this.b.F0;
                if (jx0Var2 != null) {
                    jx0Var2.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            case 2:
                jx0 jx0Var3 = this.b.E0;
                if (jx0Var3 != null) {
                    jx0Var3.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            default:
                jx0 jx0Var4 = this.b.F0;
                if (jx0Var4 != null) {
                    jx0Var4.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
        }
    }
}
