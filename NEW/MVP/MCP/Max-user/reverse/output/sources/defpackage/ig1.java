package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ig1 extends d2f implements q41 {
    public final r41 E0;

    public ig1(Context context, r41 r41Var) {
        roe roeVar = new roe(context, 0);
        super(roeVar);
        this.E0 = r41Var;
        roeVar.setThemeDepended(noe.b);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof n01) {
            this.E0.a.a(this);
            ((roe) this.a).setModelItem((ioe) t98Var);
        }
    }
}
