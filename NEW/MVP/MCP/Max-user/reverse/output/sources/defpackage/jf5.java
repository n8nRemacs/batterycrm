package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public final class jf5 extends h6g {
    public final /* synthetic */ lf5 a;

    public jf5(lf5 lf5Var) {
        this.a = lf5Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.h6g, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
