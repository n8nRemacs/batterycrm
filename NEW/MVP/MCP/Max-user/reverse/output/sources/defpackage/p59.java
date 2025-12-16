package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class p59 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x59 b;

    public /* synthetic */ p59(x59 x59Var, int i) {
        this.a = i;
        this.b = x59Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                x59 x59Var = this.b;
                if (x59Var.s0.g()) {
                    x59Var.X.getClass();
                    l69.g(2);
                }
                x59Var.dismiss();
                break;
        }
    }
}
