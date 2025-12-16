package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class v14 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(u14 u14Var) {
        x3b x3bVar = (x3b) this.a;
        u14Var.getClass();
        x3bVar.setIcon(yud.G0);
        x3bVar.setTitle(new n5g(v1b.t));
        x3bVar.setSubtitle(new n5g(u14Var.a));
    }

    public final void G(Integer num, cm6 cm6Var) {
        View view = this.a;
        if (num != null) {
            x3b x3bVar = (x3b) view;
            x3bVar.f(x3bVar.getContext().getString(num.intValue()), new j6(cm6Var));
        } else {
            OneMeButton oneMeButton = ((x3b) view).u0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener(null);
            oneMeButton.setVisibility(8);
        }
    }
}
