package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class xc5 implements TextWatcher {
    public boolean a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        this.a = true;
        String string = editable.toString();
        for (int i = 0; i < 66; i++) {
            String[] strArr = a6a.a[i];
            int iIndexOf = string.indexOf(strArr[0]);
            if (iIndexOf != -1) {
                editable.replace(iIndexOf, strArr[0].length() + iIndexOf, strArr[1]);
            }
        }
        this.a = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
