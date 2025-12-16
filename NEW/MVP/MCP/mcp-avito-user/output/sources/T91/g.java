package T91;

import android.text.Editable;
import android.text.TextWatcher;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class g implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15454b;

    public g(ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        this.f15454b = hVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        Object value;
        z zVarE5 = this.f15454b.e5();
        String strValueOf = String.valueOf(charSequence);
        Z1 z12 = zVarE5.f15493L;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, new C15344b(strValueOf, ((C15344b) value).f15442c, strValueOf.length() != 12)));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
