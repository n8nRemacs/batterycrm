package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class gre extends d2f {
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof t8e) {
            View view = this.a;
            ((roe) view).setId(Long.hashCode(((t8e) t98Var).d));
            ((roe) view).setModelItem((ioe) t98Var);
        }
    }
}
