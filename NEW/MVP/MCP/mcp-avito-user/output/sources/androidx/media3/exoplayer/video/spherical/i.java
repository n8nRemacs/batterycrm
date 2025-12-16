package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.video.spherical.d;
import androidx.media3.exoplayer.video.spherical.j;
import j.P;
import j.k0;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: SphericalGLSurfaceView.java */
@J
/* loaded from: classes.dex */
public final class i extends GLSurfaceView {

    /* compiled from: SphericalGLSurfaceView.java */
    @k0
    public final class a implements GLSurfaceView.Renderer, j.a, d.a {
        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(null, 0, null, 0, null, 0);
                Matrix.multiplyMM(null, 0, null, 0, null, 0);
            }
            Matrix.multiplyMM(null, 0, null, 0, null, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i12, int i13) {
            GLES20.glViewport(0, 0, i12, i13);
            float f12 = i12 / i13;
            Matrix.perspectiveM(null, 0, f12 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f12)) * 2.0d) : 90.0f, f12, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            throw null;
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    public interface b {
    }

    public androidx.media3.exoplayer.video.spherical.a getCameraMotionListener() {
        return null;
    }

    public androidx.media3.exoplayer.video.g getVideoFrameMetadataListener() {
        return null;
    }

    @P
    public Surface getVideoSurface() {
        return null;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public void setDefaultStereoMode(int i12) {
        throw null;
    }

    public void setUseSensorRotation(boolean z12) {
    }
}
