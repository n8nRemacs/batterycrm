package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class y12 extends n2 {
    public void j0(lie lieVar) throws CameraAccessException, CameraAccessExceptionCompat {
        CameraDevice cameraDevice = (CameraDevice) this.b;
        cameraDevice.getClass();
        kie kieVar = lieVar.a;
        kieVar.e().getClass();
        List listF = kieVar.f();
        if (listF == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (kieVar.c() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            String strB = ((ekb) it.next()).a.b();
            if (strB != null && !strB.isEmpty()) {
                gri.i("CameraDeviceCompat", wy1.j("Camera ", id, ": Camera doesn't support physicalCameraId ", strB, ". Ignoring."));
            }
        }
        y02 y02Var = new y02(kieVar.c(), kieVar.e());
        List listF2 = kieVar.f();
        a22 a22Var = (a22) this.c;
        a22Var.getClass();
        Handler handler = a22Var.a;
        im7 im7VarB = kieVar.b();
        try {
            if (im7VarB != null) {
                InputConfiguration inputConfiguration = im7VarB.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, lie.a(listF2), y02Var, handler);
            } else {
                if (kieVar.d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(lie.a(listF2), y02Var, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listF2.size());
                Iterator it2 = listF2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ekb) it2.next()).a.c());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, y02Var, handler);
            }
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
