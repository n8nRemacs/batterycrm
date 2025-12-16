package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final class g52 extends k02 {
    public final CameraCaptureSession.CaptureCallback a;

    public g52(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
