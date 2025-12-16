package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class e02 extends ukd {
    public static final s90 X = new s90("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final s90 Y = new s90("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final s90 Z = new s90("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final s90 s0 = new s90("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final s90 t0 = new s90("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final s90 u0 = new s90("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static s90 N(CaptureRequest.Key key) {
        return new s90("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
