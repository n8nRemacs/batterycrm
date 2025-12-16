package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class dt1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ it1 b;

    public /* synthetic */ dt1(it1 it1Var, int i) {
        this.a = i;
        this.b = it1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                it1 it1Var = this.b;
                ft1 ft1Var = it1Var.b1;
                if (ft1Var != null) {
                    ft1Var.k(it1Var.h1);
                    break;
                }
                break;
            case 1:
                ft1 ft1Var2 = this.b.b1;
                if (ft1Var2 != null) {
                    ft1Var2.q();
                    break;
                }
                break;
            default:
                it1 it1Var2 = this.b;
                ft1 ft1Var3 = it1Var2.b1;
                if (ft1Var3 != null) {
                    ft1Var3.i(it1Var2.h1);
                    break;
                }
                break;
        }
    }
}
