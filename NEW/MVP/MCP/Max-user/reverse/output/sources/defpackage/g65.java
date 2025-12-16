package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g65 extends tz4 {
    public int o = -1;
    public int p = -1;
    public final mni q;
    public final mni r;

    public g65(mni mniVar, mni mniVar2) {
        this.q = mniVar;
        this.r = mniVar2;
    }

    @Override // defpackage.tz4
    public final fa0 n(u75 u75Var) {
        Map map = Collections.EMPTY_MAP;
        fa0 fa0VarN = super.n(u75Var);
        this.o = ho6.h();
        this.p = ho6.h();
        return fa0VarN;
    }

    @Override // defpackage.tz4
    public final void q() {
        super.q();
        this.o = -1;
        this.p = -1;
    }

    public final void w(long j, Surface surface, fsf fsfVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        ho6.d((AtomicBoolean) this.c, true);
        ho6.c((Thread) this.e);
        wa0 wa0VarL = l(surface);
        if (wa0VarL == ho6.j) {
            wa0VarL = h(surface);
            if (wa0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, wa0VarL);
            }
        }
        wa0 wa0Var = wa0VarL;
        EGLSurface eGLSurface = wa0Var.a;
        if (surface != ((Surface) this.k)) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        x(wa0Var, fsfVar, surfaceTexture, this.q, this.o);
        x(wa0Var, fsfVar, surfaceTexture2, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        gri.i("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        s(surface, false);
    }

    public final void x(wa0 wa0Var, fsf fsfVar, SurfaceTexture surfaceTexture, mni mniVar, int i) {
        v(i);
        int i2 = wa0Var.b;
        int i3 = wa0Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        fsfVar.w(fArr2, fArr);
        fo6 fo6Var = (fo6) this.m;
        fo6Var.getClass();
        if (fo6Var instanceof go6) {
            GLES20.glUniformMatrix4fv(((go6) fo6Var).f, 1, false, fArr2, 0);
            ho6.b("glUniformMatrix4fv");
        }
        mniVar.getClass();
        Size size = new Size((int) (i2 * 1.0f), (int) (i3 * 1.0f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(fo6Var.b, 1, false, fArr5, 0);
        ho6.b("glUniformMatrix4fv");
        GLES20.glUniform1f(fo6Var.c, 1.0f);
        ho6.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        ho6.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
