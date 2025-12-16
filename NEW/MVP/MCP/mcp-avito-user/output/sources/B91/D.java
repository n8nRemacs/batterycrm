package B91;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioList;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class D implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1011a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1012b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1013c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1014d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f1015e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f1016f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f1017g;

    /* renamed from: h, reason: collision with root package name */
    public final SdkBioList f1018h;

    /* renamed from: i, reason: collision with root package name */
    public final NestedScrollView f1019i;

    /* renamed from: j, reason: collision with root package name */
    public final SdkBioToolbar f1020j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f1021k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f1022l;

    public D(ConstraintLayout constraintLayout, LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, SdkBioList sdkBioList, NestedScrollView nestedScrollView, SdkBioToolbar sdkBioToolbar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f1011a = constraintLayout;
        this.f1012b = linearLayout;
        this.f1013c = sdkBioButton;
        this.f1014d = sdkBioButton2;
        this.f1015e = linearLayout2;
        this.f1016f = appCompatImageView;
        this.f1017g = constraintLayout2;
        this.f1018h = sdkBioList;
        this.f1019i = nestedScrollView;
        this.f1020j = sdkBioToolbar;
        this.f1021k = appCompatTextView;
        this.f1022l = appCompatTextView2;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1011a;
    }
}
