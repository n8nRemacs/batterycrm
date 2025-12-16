package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ps1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs1 b;

    public /* synthetic */ ps1(vs1 vs1Var, int i) {
        this.a = i;
        this.b = vs1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ts1 ts1Var = this.b.g1;
                if (ts1Var != null) {
                    ts1Var.j();
                    break;
                }
                break;
            default:
                vs1 vs1Var = this.b;
                ts1 ts1Var2 = vs1Var.g1;
                if (ts1Var2 != null) {
                    ts1Var2.i(vs1Var.j1);
                    break;
                }
                break;
        }
    }
}
