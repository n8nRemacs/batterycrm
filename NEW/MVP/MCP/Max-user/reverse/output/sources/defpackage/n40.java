package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class n40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s40 b;
    public final /* synthetic */ m40 c;

    public /* synthetic */ n40(s40 s40Var, m40 m40Var, int i) {
        this.a = i;
        this.b = s40Var;
        this.c = m40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                em6 em6Var = this.b.a;
                m40 m40Var = this.c;
                em6Var.invoke(new rp9(m40Var.b, m40Var));
                break;
            default:
                em6 em6Var2 = this.b.a;
                m40 m40Var2 = this.c;
                em6Var2.invoke(new rp9(m40Var2.b, m40Var2));
                break;
        }
    }
}
