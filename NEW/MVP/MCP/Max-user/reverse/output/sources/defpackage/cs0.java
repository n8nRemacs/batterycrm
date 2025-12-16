package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class cs0 {
    public static final cs0 c = new cs0(false, false);
    public boolean a;
    public boolean b;

    public cs0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public cs0(i17 i17Var, int i) {
        boolean z;
        switch (i) {
            case 3:
                this.b = false;
                this.a = i17Var.e(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 4:
                Iterator it = i17Var.f(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                        z = true;
                    }
                }
                this.a = z;
                this.b = i17Var.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.a = i17Var.d(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = rv4.a.e(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }
}
