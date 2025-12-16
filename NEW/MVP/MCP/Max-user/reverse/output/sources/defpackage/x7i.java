package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* loaded from: classes.dex */
public final class x7i {
    public final i12 a;
    public final y7i b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e;
    public final boolean f;
    public ov8 g;
    public l52 h;
    public cg7 i;
    public ImageWriter j;

    public x7i(i12 i12Var) {
        boolean z;
        this.e = false;
        this.f = false;
        this.a = i12Var;
        int[] iArr = (int[]) i12Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.e = z;
        this.f = rv4.a.e(ZslDisablerQuirk.class) != null;
        this.b = new y7i(3, new fwg(19));
    }
}
