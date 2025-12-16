package B91;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* renamed from: B91.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13115h implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioEditText f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f1117b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f1118c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f1119d;

    public C13115h(SdkBioEditText sdkBioEditText, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f1116a = sdkBioEditText;
        this.f1117b = appCompatEditText;
        this.f1118c = appCompatTextView;
        this.f1119d = appCompatTextView2;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1116a;
    }
}
