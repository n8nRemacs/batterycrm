package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class jg1 extends d2f implements yfd {
    public final zfd E0;

    public jg1(Context context, zfd zfdVar) {
        roe roeVar = new roe(context, 0);
        super(roeVar);
        this.E0 = zfdVar;
        roeVar.setThemeDepended(noe.b);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        this.E0.a.add(this);
        if (t98Var instanceof n01) {
            ((roe) this.a).setModelItem((ioe) t98Var);
        }
    }
}
