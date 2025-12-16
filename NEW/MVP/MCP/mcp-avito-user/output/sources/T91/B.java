package T91;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes9.dex */
public final class B implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B91.C f15438b;

    public B(B91.C c12) {
        this.f15438b = c12;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f15438b.f1008b.setEnabled(String.valueOf(editable).length() == 12);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
