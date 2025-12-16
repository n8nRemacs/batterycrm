package defpackage;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class j5f extends mid implements lm7 {
    public final int E0;
    public final fm7 F0;
    public final hq3 G0;
    public final /* synthetic */ k5f H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5f(k5f k5fVar, int i, fm7 fm7Var, hq3 hq3Var) {
        super(hq3Var);
        this.H0 = k5fVar;
        this.E0 = i;
        this.F0 = fm7Var;
        this.G0 = hq3Var;
    }

    public final void A(String str) {
        hq3 hq3Var = this.G0;
        hq3Var.setText(str);
        hq3Var.setSelection(hq3Var.length());
    }

    public final String z() {
        Editable text = this.G0.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }
}
