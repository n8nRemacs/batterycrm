package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public interface xwg extends a2g, re7 {
    public static final s90 h0 = new s90("camerax.core.useCase.defaultSessionConfig", hie.class, null);
    public static final s90 i0 = new s90("camerax.core.useCase.defaultCaptureConfig", h52.class, null);
    public static final s90 j0 = new s90("camerax.core.useCase.sessionConfigUnpacker", f02.class, null);
    public static final s90 k0 = new s90("camerax.core.useCase.captureConfigUnpacker", kz1.class, null);
    public static final s90 l0;
    public static final s90 m0;
    public static final s90 n0;
    public static final s90 o0;
    public static final s90 p0;
    public static final s90 q0;
    public static final s90 r0;

    static {
        Class cls = Integer.TYPE;
        l0 = new s90("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        m0 = new s90("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        n0 = new s90("camerax.core.useCase.zslDisabled", cls2, null);
        o0 = new s90("camerax.core.useCase.highResolutionDisabled", cls2, null);
        p0 = new s90("camerax.core.useCase.captureType", zwg.class, null);
        q0 = new s90("camerax.core.useCase.previewStabilizationMode", cls, null);
        r0 = new s90("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    default int B() {
        return ((Integer) d(q0, 0)).intValue();
    }

    default zwg w() {
        return (zwg) f(p0);
    }

    default int x() {
        return ((Integer) d(r0, 0)).intValue();
    }
}
