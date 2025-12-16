package defpackage;

import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class tre extends d2f {
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof v8e) {
            OneMeButton oneMeButton = (OneMeButton) this.a;
            v8e v8eVar = (v8e) t98Var;
            oneMeButton.setText(v8eVar.a.a(this));
            oneMeButton.setTextBadge(v8eVar.c.a(this));
        }
    }
}
