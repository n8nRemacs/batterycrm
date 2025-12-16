package Ca1;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class g implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkBioEditText f2261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f2262c;

    public g(SdkBioEditText sdkBioEditText, EditText editText) {
        this.f2261b = sdkBioEditText;
        this.f2262c = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SdkBioEditText sdkBioEditText = this.f2261b;
        int i12 = SdkBioEditText.f436531f;
        EditText editText = this.f2262c;
        editText.setCompoundDrawablesRelativeWithIntrinsicBounds(sdkBioEditText.f436533c, (Drawable) null, editText.getText().length() > 0 ? sdkBioEditText.f436535e : null, (Drawable) null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
