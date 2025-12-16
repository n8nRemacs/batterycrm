package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class dui {
    public static final void a(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(ho7.i("Unable to locate '", str, "' in program"));
        }
    }

    public static final void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        ozi.a(16);
        throw new RuntimeException(u45.k(str, ": glError 0x", wni.c(16, iGlGetError & 4294967295L)));
    }

    public static final int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        b("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        b("glShaderSource");
        GLES20.glCompileShader(iGlCreateShader);
        b("glCompileShader");
        int[] iArr = {1};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        wqi.e("j", "Could not compile shader " + i + ": " + GLES20.glGetShaderInfoLog(iGlCreateShader), null);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static float d(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int e(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static ByteBuffer f(aua auaVar) {
        ByteBuffer byteBuffer = auaVar.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        byteBufferAllocate.put((byte) ((auaVar.a << 3) | 2));
        int iRemaining = byteBuffer.remaining();
        hsi.b(iRemaining > 0);
        int i = iRemaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        hsi.g(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (iRemaining & 127);
            iRemaining >>= 7;
            if (iRemaining != 0) {
                i4 |= 128;
            }
            byteBufferAllocate2.put((byte) i4);
        }
        byteBufferAllocate2.flip();
        byteBufferAllocate.put(byteBufferAllocate2);
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
