package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class bde implements TextWatcher {
    public final uj9 a;
    public final po9 b;
    public CharSequence c;

    public bde(uj9 uj9Var, po9 po9Var) {
        this.a = uj9Var;
        this.b = po9Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            this.c = null;
            this.b.invoke(charSequence);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            return;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null && i >= 0 && i < spanned.length()) {
            Spanned spanned2 = (Spanned) charSequence;
            if (spanned2.charAt(i) == '\n' && i2 == 0 && i3 == 1) {
                if (i == spanned2.length() - 1) {
                    this.c = kzi.a(spanned);
                    return;
                }
                for (luc lucVar : (luc[]) spanned.getSpans(i, i, luc.class)) {
                    if (spanned.getSpanEnd(lucVar) == i) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
                        spannableStringBuilder.delete(i, i + 1);
                        this.c = spannableStringBuilder;
                        return;
                    }
                }
            }
        }
    }
}
