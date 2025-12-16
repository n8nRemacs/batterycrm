package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class t6d {
    public static final nme a = new nme("PERFORMANCE_METRICS", 1);

    public static void a(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb = new StringBuilder(str.length() + u45.f(10, strGlGetShaderInfoLog));
            sb.append(strGlGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b();
    }

    public static void b() {
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e("GlUtil", strValueOf.length() != 0 ? "glError: ".concat(strValueOf) : new String("glError: "));
            i = iGlGetError;
        }
        if (i != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i));
            Log.e("GlUtil", strValueOf2.length() != 0 ? "glError: ".concat(strValueOf2) : new String("glError: "));
        }
    }
}
