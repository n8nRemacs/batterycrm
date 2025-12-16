package org.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes9.dex */
public class GlUtil {

    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int i12, String str) {
            super(i12, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            if (iGlGetError == 1285) {
                throw new GlOutOfMemoryException(iGlGetError, str);
            }
            throw new GLException(iGlGetError, str + ": GLES20 error: " + iGlGetError);
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i12) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i13 = iArr[0];
        GLES20.glBindTexture(i12, i13);
        GLES20.glTexParameterf(i12, 10241, 9729.0f);
        GLES20.glTexParameterf(i12, 10240, 9729.0f);
        GLES20.glTexParameterf(i12, 10242, 33071.0f);
        GLES20.glTexParameterf(i12, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i13;
    }
}
