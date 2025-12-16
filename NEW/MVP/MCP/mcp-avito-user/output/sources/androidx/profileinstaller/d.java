package androidx.profileinstaller;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
class d {
    public static byte[] a(@N byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    @N
    public static byte[] b(int i12, @N InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i12];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = inputStream.read(bArr, i13, i12 - i13);
            if (i14 < 0) {
                throw new IllegalStateException(AK.c.g(i12, "Not enough bytes to read: "));
            }
            i13 += i14;
        }
        return bArr;
    }

    @N
    public static byte[] c(@N FileInputStream fileInputStream, int i12, int i13) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i13];
            byte[] bArr2 = new byte[2048];
            int i14 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i14 < i12) {
                int i15 = fileInputStream.read(bArr2);
                if (i15 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i12 + " bytes");
                }
                inflater.setInput(bArr2, 0, i15);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i13 - iInflate);
                    i14 += i15;
                } catch (DataFormatException e12) {
                    throw new IllegalStateException(e12.getMessage());
                }
            }
            if (i14 == i12) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i12 + " actual=" + i14);
        } finally {
            inflater.end();
        }
    }

    public static long d(int i12, @N InputStream inputStream) throws IOException {
        byte[] bArrB = b(i12, inputStream);
        long j12 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j12 += (bArrB[i13] & 255) << (i13 * 8);
        }
        return j12;
    }

    public static void e(@N ByteArrayOutputStream byteArrayOutputStream, long j12, int i12) throws IOException {
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13] = (byte) ((j12 >> (i13 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void f(@N ByteArrayOutputStream byteArrayOutputStream, int i12) throws IOException {
        e(byteArrayOutputStream, i12, 2);
    }
}
