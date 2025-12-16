package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes2.dex */
public final class l7g extends CharacterStyle implements UpdateAppearance, u6g {
    public final em6 a;
    public int b;

    public l7g(yeb yebVar, em6 em6Var) {
        this.a = em6Var;
        this.b = ((Number) em6Var.invoke(yebVar)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7g) && this.b == ((l7g) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + l7g.class.hashCode();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b = ((Number) this.a.invoke(yebVar)).intValue();
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}
