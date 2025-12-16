package B91;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class K implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1072a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1073b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f1074c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioPassportFrameView f1075d;

    /* renamed from: e, reason: collision with root package name */
    public final PreviewView f1076e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioToolbar f1077f;

    public K(ConstraintLayout constraintLayout, SdkBioButton sdkBioButton, AppCompatImageView appCompatImageView, SdkBioPassportFrameView sdkBioPassportFrameView, PreviewView previewView, SdkBioToolbar sdkBioToolbar) {
        this.f1072a = constraintLayout;
        this.f1073b = sdkBioButton;
        this.f1074c = appCompatImageView;
        this.f1075d = sdkBioPassportFrameView;
        this.f1076e = previewView;
        this.f1077f = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1072a;
    }
}
