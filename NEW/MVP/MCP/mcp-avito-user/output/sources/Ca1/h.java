package Ca1;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class h implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkBioEditText f2263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatEditText f2264c;

    public h(SdkBioEditText sdkBioEditText, AppCompatEditText appCompatEditText) {
        this.f2263b = sdkBioEditText;
        this.f2264c = appCompatEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SdkBioEditText sdkBioEditText = this.f2263b;
        AppCompatEditText appCompatEditText = this.f2264c;
        int i12 = SdkBioEditText.f436531f;
        appCompatEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(sdkBioEditText.f436533c, (Drawable) null, appCompatEditText.getText().length() > 0 ? sdkBioEditText.f436535e : null, (Drawable) null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
