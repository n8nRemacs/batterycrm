package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public interface bf7 extends ebd {
    public static final s90 A;
    public static final s90 B;
    public static final s90 C;
    public static final s90 D;
    public static final s90 E;
    public static final s90 F;
    public static final s90 G;
    public static final s90 H;
    public static final s90 I;
    public static final s90 z = new s90("camerax.core.imageOutput.targetAspectRatio", gt.class, null);

    static {
        Class cls = Integer.TYPE;
        A = new s90("camerax.core.imageOutput.targetRotation", cls, null);
        B = new s90("camerax.core.imageOutput.appTargetRotation", cls, null);
        C = new s90("camerax.core.imageOutput.mirrorMode", cls, null);
        D = new s90("camerax.core.imageOutput.targetResolution", Size.class, null);
        E = new s90("camerax.core.imageOutput.defaultResolution", Size.class, null);
        F = new s90("camerax.core.imageOutput.maxResolution", Size.class, null);
        G = new s90("camerax.core.imageOutput.supportedResolutions", List.class, null);
        H = new s90("camerax.core.imageOutput.resolutionSelector", aod.class, null);
        I = new s90("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void F(bf7 bf7Var) {
        boolean zI = bf7Var.i(z);
        boolean z2 = ((Size) bf7Var.d(D, null)) != null;
        if (zI && z2) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (((aod) bf7Var.d(H, null)) != null) {
            if (zI || z2) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int G(int i) {
        return ((Integer) d(A, Integer.valueOf(i))).intValue();
    }
}
