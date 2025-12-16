package com.avito.android.photo_picker.camera;

import android.hardware.Camera;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class y implements io.reactivex.rxjava3.core.C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Camera f219042c;

    public /* synthetic */ y(int i12, Camera camera) {
        this.f219041b = i12;
        this.f219042c = camera;
    }

    @Override // io.reactivex.rxjava3.core.C
    public final void f(final io.reactivex.rxjava3.core.B b12) {
        switch (this.f219041b) {
            case 0:
                this.f219042c.takePicture(null, null, new Camera.PictureCallback() { // from class: com.avito.android.photo_picker.camera.z
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        io.reactivex.rxjava3.core.B b13 = b12;
                        if (b13.i()) {
                            return;
                        }
                        b13.onNext(bArr);
                        b13.e();
                    }
                });
                break;
            default:
                Camera camera = this.f219042c;
                camera.cancelAutoFocus();
                camera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.avito.android.photo_picker.camera.A
                    @Override // android.hardware.Camera.AutoFocusCallback
                    public final void onAutoFocus(boolean z12, Camera camera2) {
                        io.reactivex.rxjava3.core.B b13 = b12;
                        if (b13.i()) {
                            return;
                        }
                        b13.onNext(Boolean.valueOf(z12));
                        b13.e();
                    }
                });
                break;
        }
    }
}
