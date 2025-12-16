package N91;

import B91.v;
import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes9.dex */
public final class n implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u f11281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f11282c;

    public n(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar, v vVar) {
        this.f11281b = uVar;
        this.f11282c = vVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        O91.o oVar = (O91.o) this.f11281b.f436435i0.getValue();
        String text = this.f11282c.f1179b.getText();
        if (text == null) {
            text = "";
        }
        oVar.a(text);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
