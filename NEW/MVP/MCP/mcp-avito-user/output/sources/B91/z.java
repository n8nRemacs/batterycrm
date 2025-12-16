package B91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class z implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1199b;

    /* renamed from: c, reason: collision with root package name */
    public final SwitchCompat f1200c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f1201d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioPassportFrameView f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final PreviewView f1204g;

    /* renamed from: h, reason: collision with root package name */
    public final View f1205h;

    /* renamed from: i, reason: collision with root package name */
    public final SdkBioToolbar f1206i;

    public z(ConstraintLayout constraintLayout, FrameLayout frameLayout, SwitchCompat switchCompat, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, SdkBioPassportFrameView sdkBioPassportFrameView, PreviewView previewView, View view, SdkBioToolbar sdkBioToolbar) {
        this.f1198a = constraintLayout;
        this.f1199b = frameLayout;
        this.f1200c = switchCompat;
        this.f1201d = appCompatImageView;
        this.f1202e = constraintLayout2;
        this.f1203f = sdkBioPassportFrameView;
        this.f1204g = previewView;
        this.f1205h = view;
        this.f1206i = sdkBioToolbar;
    }

    public static z a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_document_camera, viewGroup, false);
        int i12 = R.id.btn_layout;
        FrameLayout frameLayout = (FrameLayout) g2.d.a(viewInflate, R.id.btn_layout);
        if (frameLayout != null) {
            i12 = R.id.btnTakePhoto;
            SwitchCompat switchCompat = (SwitchCompat) g2.d.a(viewInflate, R.id.btnTakePhoto);
            if (switchCompat != null) {
                i12 = R.id.iv_preview;
                AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(viewInflate, R.id.iv_preview);
                if (appCompatImageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i12 = R.id.photoFrame;
                    SdkBioPassportFrameView sdkBioPassportFrameView = (SdkBioPassportFrameView) g2.d.a(viewInflate, R.id.photoFrame);
                    if (sdkBioPassportFrameView != null) {
                        i12 = R.id.pvCameraPreview;
                        PreviewView previewView = (PreviewView) g2.d.a(viewInflate, R.id.pvCameraPreview);
                        if (previewView != null) {
                            i12 = R.id.statusBarView;
                            View viewA = g2.d.a(viewInflate, R.id.statusBarView);
                            if (viewA != null) {
                                i12 = R.id.toolbar;
                                SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) g2.d.a(viewInflate, R.id.toolbar);
                                if (sdkBioToolbar != null) {
                                    return new z(constraintLayout, frameLayout, switchCompat, appCompatImageView, constraintLayout, sdkBioPassportFrameView, previewView, viewA, sdkBioToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1198a;
    }
}
