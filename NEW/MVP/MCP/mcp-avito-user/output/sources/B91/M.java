package B91;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class M implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1081a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1083c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1084d;

    /* renamed from: e, reason: collision with root package name */
    public final NestedScrollView f1085e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioToolbar f1086f;

    public M(ConstraintLayout constraintLayout, LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, NestedScrollView nestedScrollView, SdkBioToolbar sdkBioToolbar) {
        this.f1081a = constraintLayout;
        this.f1082b = linearLayout;
        this.f1083c = sdkBioButton;
        this.f1084d = sdkBioButton2;
        this.f1085e = nestedScrollView;
        this.f1086f = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1081a;
    }
}
