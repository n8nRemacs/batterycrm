package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class lt4 extends ugc {
    public lt4(Context context) {
        OneMeButton oneMeButton = new OneMeButton(context, null);
        super(oneMeButton);
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.c);
        oneMeButton.setAppearance(gza.b);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        View view = this.a;
        ((OneMeButton) view).setText(((mt4) t98Var).a.b(view.getContext()));
    }
}
