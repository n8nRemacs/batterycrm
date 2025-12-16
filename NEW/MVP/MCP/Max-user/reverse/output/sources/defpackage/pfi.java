package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.os.SystemClock;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class pfi {
    public static final zy7[] a = new zy7[0];

    public static Bitmap a(jf7 jf7Var) {
        int format = jf7Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(jf7Var.getWidth(), jf7Var.getHeight(), Bitmap.Config.ARGB_8888);
            jf7Var.s()[0].I().rewind();
            ImageProcessingUtil.f(bitmapCreateBitmap, jf7Var.s()[0].I(), jf7Var.s()[0].M());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(jf7Var);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + jf7Var.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!d(jf7Var.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + jf7Var.getFormat());
        }
        ByteBuffer byteBufferI = jf7Var.s()[0].I();
        int iCapacity = byteBufferI.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferI.rewind();
        byteBufferI.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static nc5 b(an5 an5Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = an5Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (an5Var.s(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new nc5(1, 0, length, i, 2);
    }

    public static Rational c(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean d(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] e(jf7 jf7Var, Rect rect, int i, int i2) {
        if (jf7Var.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + jf7Var.getFormat());
        }
        h08 h08Var = jf7Var.s()[0];
        h08 h08Var2 = jf7Var.s()[1];
        int i3 = 2;
        h08 h08Var3 = jf7Var.s()[2];
        ByteBuffer byteBufferI = h08Var.I();
        ByteBuffer byteBufferI2 = h08Var2.I();
        ByteBuffer byteBufferI3 = h08Var3.I();
        byteBufferI.rewind();
        byteBufferI2.rewind();
        byteBufferI3.rewind();
        int iRemaining = byteBufferI.remaining();
        byte[] bArr = new byte[((jf7Var.getHeight() * jf7Var.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i4 = 0; i4 < jf7Var.getHeight(); i4++) {
            byteBufferI.get(bArr, width, jf7Var.getWidth());
            width += jf7Var.getWidth();
            byteBufferI.position(Math.min(iRemaining, h08Var.M() + (byteBufferI.position() - jf7Var.getWidth())));
        }
        int height = jf7Var.getHeight() / 2;
        int width2 = jf7Var.getWidth() / 2;
        int iM = h08Var3.M();
        int iM2 = h08Var2.M();
        int iK = h08Var3.K();
        int iK2 = h08Var2.K();
        byte[] bArr2 = new byte[iM];
        byte[] bArr3 = new byte[iM2];
        int i5 = 0;
        while (i5 < height) {
            int i6 = i3;
            byteBufferI3.get(bArr2, 0, Math.min(iM, byteBufferI3.remaining()));
            byteBufferI2.get(bArr3, 0, Math.min(iM2, byteBufferI2.remaining()));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < width2; i9++) {
                int i10 = width + 1;
                bArr[width] = bArr2[i7];
                width += 2;
                bArr[i10] = bArr3[i8];
                i7 += iK;
                i8 += iK2;
            }
            i5++;
            i3 = i6;
        }
        int i11 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, jf7Var.getWidth(), jf7Var.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tk5[] tk5VarArr = hk5.c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        gk5 gk5Var = new gk5();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = gk5Var.a;
        gk5Var.c("Orientation", strValueOf, arrayList);
        gk5Var.c("XResolution", "72/1", arrayList);
        gk5Var.c("YResolution", "72/1", arrayList);
        gk5Var.c("ResolutionUnit", String.valueOf(i11), arrayList);
        gk5Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
        gk5Var.c("Make", Build.MANUFACTURER, arrayList);
        gk5Var.c("Model", Build.MODEL, arrayList);
        if (jf7Var.getImageInfo() != null) {
            jf7Var.getImageInfo().d(gk5Var);
        }
        gk5Var.d(i2);
        gk5Var.c("ImageWidth", String.valueOf(jf7Var.getWidth()), arrayList);
        gk5Var.c("ImageLength", String.valueOf(jf7Var.getHeight()), arrayList);
        ArrayList list = Collections.list(new fk5(gk5Var));
        if (!((Map) list.get(1)).isEmpty()) {
            gk5Var.b("ExposureProgram", String.valueOf(0), list);
            gk5Var.b("ExifVersion", "0230", list);
            gk5Var.b("ComponentsConfiguration", "1,2,3,0", list);
            gk5Var.b("MeteringMode", String.valueOf(0), list);
            gk5Var.b("LightSource", String.valueOf(0), list);
            gk5Var.b("FlashpixVersion", "0100", list);
            gk5Var.b("FocalPlaneResolutionUnit", String.valueOf(i11), list);
            gk5Var.b("FileSource", String.valueOf(3), list);
            gk5Var.b("SceneType", String.valueOf(1), list);
            gk5Var.b("CustomRendered", String.valueOf(0), list);
            gk5Var.b("SceneCaptureType", String.valueOf(0), list);
            gk5Var.b("Contrast", String.valueOf(0), list);
            gk5Var.b("Saturation", String.valueOf(0), list);
            gk5Var.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i11)).isEmpty()) {
            gk5Var.b("GPSVersionID", "2300", list);
            gk5Var.b("GPSSpeedRef", "K", list);
            gk5Var.b("GPSTrackRef", "T", list);
            gk5Var.b("GPSImgDirectionRef", "T", list);
            gk5Var.b("GPSDestBearingRef", "T", list);
            gk5Var.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, jf7Var.getWidth(), jf7Var.getHeight()) : rect, i, new sk5(byteArrayOutputStream, new hk5(gk5Var.b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new ImageUtil$CodecFailedException("YuvImage failed to encode jpeg.");
    }
}
