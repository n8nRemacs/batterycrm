package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class f41 {
    public final k18 a;

    public f41(k18 k18Var) {
        this.a = k18Var;
    }

    public final CameraManager a() {
        Conversation conversationA = ((n64) this.a.getValue()).a();
        if (conversationA != null) {
            return conversationA.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager cameraManagerA = a();
        return cameraManagerA != null && cameraManagerA.isCapturingFromFrontCamera();
    }

    public final void c(boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallCameraControllerTag", xrf.p("CallCameraController camera changed=", " ", z), null);
            }
        }
        CameraManager cameraManagerA = a();
        if (cameraManagerA != null) {
            cameraManagerA.setCameraEnabled(z);
        }
    }
}
