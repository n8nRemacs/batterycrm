package B91;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* renamed from: B91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13110c implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1092b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1093c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1094d;

    /* renamed from: e, reason: collision with root package name */
    public final NestedScrollView f1095e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioToolbar f1096f;

    public C13110c(ConstraintLayout constraintLayout, LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, NestedScrollView nestedScrollView, SdkBioToolbar sdkBioToolbar) {
        this.f1091a = constraintLayout;
        this.f1092b = linearLayout;
        this.f1093c = sdkBioButton;
        this.f1094d = sdkBioButton2;
        this.f1095e = nestedScrollView;
        this.f1096f = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1091a;
    }
}
