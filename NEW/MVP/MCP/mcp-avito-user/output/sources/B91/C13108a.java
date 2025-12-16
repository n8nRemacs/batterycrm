package B91;

import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* renamed from: B91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13108a implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1087a;

    /* renamed from: b, reason: collision with root package name */
    public final PreviewView f1088b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioSelfieFrame f1089c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioToolbar f1090d;

    public C13108a(ConstraintLayout constraintLayout, PreviewView previewView, SdkBioSelfieFrame sdkBioSelfieFrame, SdkBioToolbar sdkBioToolbar) {
        this.f1087a = constraintLayout;
        this.f1088b = previewView;
        this.f1089c = sdkBioSelfieFrame;
        this.f1090d = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1087a;
    }
}
