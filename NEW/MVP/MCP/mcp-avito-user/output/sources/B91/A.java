package B91;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioList;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class A implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f976a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f977b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f978c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f979d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f980e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioList f981f;

    /* renamed from: g, reason: collision with root package name */
    public final NestedScrollView f982g;

    /* renamed from: h, reason: collision with root package name */
    public final SdkBioToolbar f983h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f984i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f985j;

    public A(ConstraintLayout constraintLayout, LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, AppCompatImageView appCompatImageView, SdkBioList sdkBioList, NestedScrollView nestedScrollView, SdkBioToolbar sdkBioToolbar, TextView textView, TextView textView2) {
        this.f976a = constraintLayout;
        this.f977b = linearLayout;
        this.f978c = sdkBioButton;
        this.f979d = sdkBioButton2;
        this.f980e = appCompatImageView;
        this.f981f = sdkBioList;
        this.f982g = nestedScrollView;
        this.f983h = sdkBioToolbar;
        this.f984i = textView;
        this.f985j = textView2;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f976a;
    }
}
