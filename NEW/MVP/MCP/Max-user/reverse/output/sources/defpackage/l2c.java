package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final class l2c extends Surface {
    public static int d;
    public static boolean o;
    public final boolean a;
    public final o65 b;
    public boolean c;

    public l2c(o65 o65Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = o65Var;
        this.a = z;
    }

    public static synchronized boolean a() {
        try {
            if (!o) {
                try {
                } catch (GlUtil$GlException e) {
                    a8i.g("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
                }
                int i = guf.s("EGL_EXT_protected_content") ? guf.s("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
                d = i;
                o = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    o65 o65Var = this.b;
                    o65Var.b.getClass();
                    o65Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
