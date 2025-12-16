package B91;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* renamed from: B91.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13112e implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1104a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f1105b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f1106c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioSelfieFrame f1107d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f1108e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioToolbar f1109f;

    public C13112e(ConstraintLayout constraintLayout, ProgressBar progressBar, AppCompatImageView appCompatImageView, SdkBioSelfieFrame sdkBioSelfieFrame, ImageView imageView, SdkBioToolbar sdkBioToolbar) {
        this.f1104a = constraintLayout;
        this.f1105b = progressBar;
        this.f1106c = appCompatImageView;
        this.f1107d = sdkBioSelfieFrame;
        this.f1108e = imageView;
        this.f1109f = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1104a;
    }
}
