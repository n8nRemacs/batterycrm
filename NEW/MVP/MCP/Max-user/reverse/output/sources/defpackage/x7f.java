package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class x7f implements GLSurfaceView.Renderer, kjb {
    public final float[] X;
    public float Y;
    public float Z;
    public final hzd a;
    public final float[] d;
    public final float[] o;
    public final /* synthetic */ y7f u0;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] s0 = new float[16];
    public final float[] t0 = new float[16];

    public x7f(y7f y7fVar, hzd hzdVar) {
        this.u0 = y7fVar;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.o = fArr2;
        float[] fArr3 = new float[16];
        this.X = fArr3;
        this.a = hzdVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.Z = 3.1415927f;
    }

    @Override // defpackage.kjb
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.Z = f2;
        Matrix.setRotateM(this.o, 0, -this.Y, (float) Math.cos(f2), (float) Math.sin(this.Z), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objD;
        Object objD2;
        Object objD3;
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.t0, 0, this.d, 0, this.X, 0);
            Matrix.multiplyMM(this.s0, 0, this.o, 0, this.t0, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.s0, 0);
        hzd hzdVar = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(16384);
        t6d.b();
        if (hzdVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = hzdVar.t0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            t6d.b();
            if (hzdVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(hzdVar.Y, 0);
            }
            long timestamp = hzdVar.t0.getTimestamp();
            i9g i9gVar = hzdVar.o;
            synchronized (i9gVar) {
                objD = i9gVar.d(timestamp, false);
            }
            Long l = (Long) objD;
            if (l != null) {
                dl6 dl6Var = hzdVar.d;
                float[] fArr3 = hzdVar.Y;
                long jLongValue = l.longValue();
                i9g i9gVar2 = (i9g) dl6Var.d;
                synchronized (i9gVar2) {
                    objD3 = i9gVar2.d(jLongValue, true);
                }
                float[] fArr4 = (float[]) objD3;
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) dl6Var.c;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        fArr = fArr3;
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        fArr = fArr3;
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!dl6Var.a) {
                        dl6.a((float[]) dl6Var.b, (float[]) dl6Var.c);
                        dl6Var.a = true;
                    }
                    Matrix.multiplyMM(fArr, 0, (float[]) dl6Var.b, 0, (float[]) dl6Var.c, 0);
                }
            }
            i9g i9gVar3 = hzdVar.X;
            synchronized (i9gVar3) {
                objD2 = i9gVar3.d(timestamp, true);
            }
            ooc oocVar = (ooc) objD2;
            if (oocVar != null) {
                poc pocVar = hzdVar.c;
                pocVar.getClass();
                if (poc.b(oocVar)) {
                    pocVar.a = oocVar.c;
                    ft0 ft0Var = oocVar.a.a[0];
                    ft0 ft0Var2 = new ft0();
                    float[] fArr6 = (float[]) ft0Var.c;
                    ft0Var2.a = fArr6.length / 3;
                    ft0Var2.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    float[] fArr7 = (float[]) ft0Var.d;
                    ft0Var2.d = (FloatBuffer) ByteBuffer.allocateDirect(fArr7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr7).flip();
                    int i = ft0Var.b;
                    if (i == 1) {
                        ft0Var2.b = 5;
                    } else if (i != 2) {
                        ft0Var2.b = 4;
                    } else {
                        ft0Var2.b = 6;
                    }
                    pocVar.g = ft0Var2;
                    if (!oocVar.d) {
                        ft0 ft0Var3 = oocVar.b.a[0];
                        float[] fArr8 = (float[]) ft0Var3.c;
                        int length2 = fArr8.length;
                        float[] fArr9 = (float[]) ft0Var3.d;
                    }
                }
            }
        }
        Matrix.multiplyMM(hzdVar.Z, 0, fArr2, 0, hzdVar.Y, 0);
        poc pocVar2 = hzdVar.c;
        int i2 = hzdVar.s0;
        float[] fArr10 = hzdVar.Z;
        ft0 ft0Var4 = (ft0) pocVar2.g;
        if (ft0Var4 == null) {
            return;
        }
        int i3 = pocVar2.a;
        GLES20.glUniformMatrix3fv(pocVar2.c, 1, false, i3 == 1 ? poc.j : i3 == 2 ? poc.k : poc.i, 0);
        GLES20.glUniformMatrix4fv(pocVar2.b, 1, false, fArr10, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(pocVar2.f, 0);
        t6d.b();
        GLES20.glVertexAttribPointer(pocVar2.d, 3, 5126, false, 12, (Buffer) ft0Var4.c);
        t6d.b();
        GLES20.glVertexAttribPointer(pocVar2.e, 2, 5126, false, 8, (Buffer) ft0Var4.d);
        t6d.b();
        GLES20.glDrawArrays(ft0Var4.b, 0, ft0Var4.a);
        t6d.b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        y7f y7fVar = this.u0;
        y7fVar.o.post(new aee(y7fVar, 16, this.a.a()));
    }
}
