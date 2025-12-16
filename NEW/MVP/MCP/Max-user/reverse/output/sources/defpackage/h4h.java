package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class h4h {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            pai.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
