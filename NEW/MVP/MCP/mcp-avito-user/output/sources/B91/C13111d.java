package B91;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.mts.biometry.sdk.view.SdkBioButton;

/* renamed from: B91.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13111d implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1097a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1098b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f1099c;

    /* renamed from: d, reason: collision with root package name */
    public final NestedScrollView f1100d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f1101e;

    /* renamed from: f, reason: collision with root package name */
    public final View f1102f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f1103g;

    public C13111d(ConstraintLayout constraintLayout, SdkBioButton sdkBioButton, LinearLayout linearLayout, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, View view, TextView textView) {
        this.f1097a = constraintLayout;
        this.f1098b = sdkBioButton;
        this.f1099c = linearLayout;
        this.f1100d = nestedScrollView;
        this.f1101e = appCompatImageView;
        this.f1102f = view;
        this.f1103g = textView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1097a;
    }
}
