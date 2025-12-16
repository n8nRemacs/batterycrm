package B91;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class F implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f1029b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioPassportFrameView f1030c;

    /* renamed from: d, reason: collision with root package name */
    public final PreviewView f1031d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioToolbar f1032e;

    public F(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SdkBioPassportFrameView sdkBioPassportFrameView, PreviewView previewView, SdkBioToolbar sdkBioToolbar) {
        this.f1028a = constraintLayout;
        this.f1029b = appCompatImageView;
        this.f1030c = sdkBioPassportFrameView;
        this.f1031d = previewView;
        this.f1032e = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1028a;
    }
}
