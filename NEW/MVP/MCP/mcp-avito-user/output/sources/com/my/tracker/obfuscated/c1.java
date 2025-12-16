package com.my.tracker.obfuscated;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f365569a = Charset.forName(Constants.ENCODING);

    public static int a(double d12, OutputStream outputStream) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d12);
        outputStream.write(((int) jDoubleToRawLongBits) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 8)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 16)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 24)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 32)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 40)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 48)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    public static int b(int i12, int i13, OutputStream outputStream) {
        return b(i13, outputStream) + a(i12, 0, outputStream);
    }

    public static int a(float f12, OutputStream outputStream) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f12);
        outputStream.write(iFloatToRawIntBits & 255);
        outputStream.write((iFloatToRawIntBits >> 8) & 255);
        outputStream.write((iFloatToRawIntBits >> 16) & 255);
        outputStream.write((iFloatToRawIntBits >> 24) & 255);
        return 4;
    }

    public static int b(int i12, OutputStream outputStream) {
        return i12 < 0 ? a(i12, outputStream) : a(i12, outputStream);
    }

    public static int a(int i12, double d12, OutputStream outputStream) {
        return a(d12, outputStream) + a(i12, 1, outputStream);
    }

    public static int a(int i12, float f12, OutputStream outputStream) {
        return a(f12, outputStream) + a(i12, 5, outputStream);
    }

    public static int a(int i12, int i13, OutputStream outputStream) {
        return a((i12 << 3) | i13, outputStream);
    }

    public static int a(int i12, long j12, OutputStream outputStream) {
        return a(j12, outputStream) + a(i12, 0, outputStream);
    }

    public static int a(int i12, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (byteArrayOutputStream == null) {
            return 0;
        }
        return a(byteArrayOutputStream, outputStream) + a(i12, 2, outputStream);
    }

    public static int a(int i12, OutputStream outputStream) throws IOException {
        int i13 = 0;
        while (true) {
            i13++;
            if ((i12 & (-128)) == 0) {
                outputStream.write(i12);
                return i13;
            }
            outputStream.write((i12 & 127) | 128);
            i12 >>>= 7;
        }
    }

    public static int a(int i12, String str, OutputStream outputStream) {
        if (str == null) {
            return 0;
        }
        return a(str, outputStream) + a(i12, 2, outputStream);
    }

    public static int a(int i12, byte[] bArr, OutputStream outputStream) {
        if (bArr == null) {
            return 0;
        }
        return a(bArr, outputStream) + a(i12, 2, outputStream);
    }

    public static int a(int i12, String[] strArr, OutputStream outputStream) {
        if (strArr == null) {
            return 0;
        }
        int iA2 = 0;
        for (String str : strArr) {
            iA2 += a(i12, str, outputStream);
        }
        return iA2;
    }

    public static int a(long j12, OutputStream outputStream) throws IOException {
        int i12 = 0;
        while (true) {
            i12++;
            if (((-128) & j12) == 0) {
                outputStream.write((int) j12);
                return i12;
            }
            outputStream.write(((int) (127 & j12)) | 128);
            j12 >>>= 7;
        }
    }

    public static int a(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        int size = byteArrayOutputStream.size();
        int iB2 = b(size, outputStream) + size;
        byteArrayOutputStream.writeTo(outputStream);
        return iB2;
    }

    public static int a(String str, OutputStream outputStream) {
        return a(str.getBytes(f365569a), outputStream);
    }

    public static int a(byte[] bArr, OutputStream outputStream) throws IOException {
        int iB2 = b(bArr.length, outputStream) + bArr.length;
        outputStream.write(bArr);
        return iB2;
    }
}
