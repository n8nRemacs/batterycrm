package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class va6 extends d2f {
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        fxg fxgVar = (fxg) t98Var;
        exg exgVar = fxgVar.b;
        exg exgVar2 = exg.a;
        View view = this.a;
        if (exgVar == exgVar2) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(fxgVar.c.a(this));
    }
}
