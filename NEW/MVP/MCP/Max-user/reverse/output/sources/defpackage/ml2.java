package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class ml2 extends d2f {
    public void F(yb9 yb9Var, em6 em6Var, sm6 sm6Var) {
        ub ubVar = new ub(em6Var, yb9Var);
        View view = this.a;
        f8j.d(view, 300L, ubVar);
        view.setOnLongClickListener(new yi2(sm6Var, yb9Var, this));
    }
}
