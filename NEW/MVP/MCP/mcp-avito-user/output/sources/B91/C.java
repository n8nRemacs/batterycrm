package B91;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class C implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1007a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1008b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1009c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioEditText f1010d;

    public C(ConstraintLayout constraintLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, SdkBioEditText sdkBioEditText) {
        this.f1007a = constraintLayout;
        this.f1008b = sdkBioButton;
        this.f1009c = sdkBioButton2;
        this.f1010d = sdkBioEditText;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1007a;
    }
}
