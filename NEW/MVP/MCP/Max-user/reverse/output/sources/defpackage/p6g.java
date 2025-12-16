package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
public final class p6g {
    public final FloatBuffer a;
    public final float[] c;
    public int d;
    public int f;
    public int g;
    public int h;
    public int i;
    public final float j;
    public final boolean k;
    public final float[] b = new float[16];
    public int e = -12345;

    public p6g(float f, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.j = f;
        this.k = z;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("TextureRender", str + ": glError " + iGlGetError);
        throw new RuntimeException(xc0.e(iGlGetError, str, ": glError "));
    }

    public static int b(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("TextureRender", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("TextureRender", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
