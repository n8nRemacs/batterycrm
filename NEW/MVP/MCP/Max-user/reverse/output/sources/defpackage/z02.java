package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z02 extends i5i {
    @Override // defpackage.i5i
    public final int e(ArrayList arrayList, qee qeeVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.a).captureBurstRequests(arrayList, qeeVar, captureCallback);
    }

    @Override // defpackage.i5i
    public final int q(CaptureRequest captureRequest, qee qeeVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.a).setSingleRepeatingRequest(captureRequest, qeeVar, captureCallback);
    }
}
