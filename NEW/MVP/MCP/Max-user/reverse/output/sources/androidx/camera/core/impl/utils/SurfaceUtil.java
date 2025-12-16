package androidx.camera.core.impl.utils;

import android.view.Surface;
import defpackage.osf;

/* loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static osf a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        osf osfVar = new osf();
        int i = iArrNativeGetSurfaceInfo[0];
        int i2 = iArrNativeGetSurfaceInfo[1];
        int i3 = iArrNativeGetSurfaceInfo[2];
        return osfVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
