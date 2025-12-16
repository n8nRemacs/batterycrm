package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import defpackage.gri;
import defpackage.if7;
import defpackage.jf7;
import defpackage.kd7;
import defpackage.lf7;
import defpackage.ov8;
import defpackage.z5j;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(jf7 jf7Var) {
        if (!g(jf7Var)) {
            gri.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = jf7Var.getWidth();
        int height = jf7Var.getHeight();
        int iM = jf7Var.s()[0].M();
        int iM2 = jf7Var.s()[1].M();
        int iM3 = jf7Var.s()[2].M();
        int iK = jf7Var.s()[0].K();
        int iK2 = jf7Var.s()[1].K();
        if (nativeShiftPixel(jf7Var.s()[0].I(), iM, jf7Var.s()[1].I(), iM2, jf7Var.s()[2].I(), iM3, iK, iK2, width, height, iK, iK2, iK2) != 0) {
            gri.b("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static jf7 b(ov8 ov8Var, byte[] bArr) {
        z5j.b(ov8Var.f() == 256);
        bArr.getClass();
        Surface surface = ov8Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            gri.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        jf7 jf7VarE = ov8Var.e();
        if (jf7VarE == null) {
            gri.b("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return jf7VarE;
    }

    public static Bitmap c(jf7 jf7Var) {
        if (jf7Var.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = jf7Var.getWidth();
        int height = jf7Var.getHeight();
        int iM = jf7Var.s()[0].M();
        int iM2 = jf7Var.s()[1].M();
        int iM3 = jf7Var.s()[2].M();
        int iK = jf7Var.s()[0].K();
        int iK2 = jf7Var.s()[1].K();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(jf7Var.getWidth(), jf7Var.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(jf7Var.s()[0].I(), iM, jf7Var.s()[1].I(), iM2, jf7Var.s()[2].I(), iM3, iK, iK2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static kd7 d(jf7 jf7Var, lf7 lf7Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!g(jf7Var)) {
            gri.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            gri.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = lf7Var.getSurface();
        int width = jf7Var.getWidth();
        int height = jf7Var.getHeight();
        int iM = jf7Var.s()[0].M();
        int iM2 = jf7Var.s()[1].M();
        int iM3 = jf7Var.s()[2].M();
        int iK = jf7Var.s()[0].K();
        int iK2 = jf7Var.s()[1].K();
        if (nativeConvertAndroid420ToABGR(jf7Var.s()[0].I(), iM, jf7Var.s()[1].I(), iM2, jf7Var.s()[2].I(), iM3, iK, iK2, surface, byteBuffer, width, height, z ? iK : 0, z ? iK2 : 0, z ? iK2 : 0, i) != 0) {
            gri.b("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            gri.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + a);
            a = a + 1;
        }
        jf7 jf7VarE = lf7Var.e();
        if (jf7VarE == null) {
            gri.b("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        kd7 kd7Var = new kd7(jf7VarE);
        kd7Var.c(new if7(jf7VarE, jf7Var, 0));
        return kd7Var;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(jf7 jf7Var) {
        return jf7Var.getFormat() == 35 && jf7Var.s().length == 3;
    }

    public static kd7 h(jf7 jf7Var, lf7 lf7Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        String str;
        if (!g(jf7Var)) {
            gri.b("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            gri.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i > 0) {
            int width = jf7Var.getWidth();
            int height = jf7Var.getHeight();
            int iM = jf7Var.s()[0].M();
            int iM2 = jf7Var.s()[1].M();
            int iM3 = jf7Var.s()[2].M();
            int iK = jf7Var.s()[1].K();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(jf7Var.s()[0].I(), iM, jf7Var.s()[1].I(), iM2, jf7Var.s()[2].I(), iM3, iK, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                jf7 jf7VarE = lf7Var.e();
                if (jf7VarE == null) {
                    gri.b("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                    return null;
                }
                kd7 kd7Var = new kd7(jf7VarE);
                kd7Var.c(new if7(jf7VarE, jf7Var, 1));
                return kd7Var;
            }
            str = "ImageProcessingUtil";
        } else {
            str = "ImageProcessingUtil";
        }
        gri.b(str, "rotate YUV failure");
        return null;
    }

    public static void i(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            gri.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
