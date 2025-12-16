package com.google.android.play.core.assetpacks.internal;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.internal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37142l {
    public static void a(AbstractC37143m abstractC37143m, InputStream inputStream, OutputStream outputStream, long j12) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i12 = dataInputStream.readInt();
        if (i12 != -771763713) {
            throw new al("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i12))));
        }
        int i13 = dataInputStream.read();
        if (i13 != 4) {
            throw new al(AK.c.g(i13, "Unexpected version="));
        }
        long j13 = 0;
        while (true) {
            long j14 = j12 - j13;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j14);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j14);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, abstractC37143m, outputStream, unsignedShort2, unsignedShort, j14);
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, abstractC37143m, outputStream, unsignedShort3, unsignedShort, j14);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, abstractC37143m, outputStream, unsignedShort4, unsignedShort, j14);
                        break;
                    case 252:
                        long j15 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, abstractC37143m, outputStream, j15, unsignedShort, j14);
                        break;
                    case 253:
                        long j16 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, abstractC37143m, outputStream, j16, unsignedShort, j14);
                        break;
                    case 254:
                        long j17 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, abstractC37143m, outputStream, j17, unsignedShort, j14);
                        break;
                    case 255:
                        long j18 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, abstractC37143m, outputStream, j18, unsignedShort, j14);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, unsignedShort, j14);
                        break;
                }
                j13 += unsignedShort;
            } catch (Throwable th2) {
                outputStream.flush();
                throw th2;
            }
        }
    }

    public static void b(byte[] bArr, AbstractC37143m abstractC37143m, OutputStream outputStream, long j12, int i12, long j13) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamB;
        int i13 = i12;
        if (i13 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j12 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j14 = i13;
        if (j14 > j13) {
            throw new IOException("Output length overrun");
        }
        try {
            C37144n c37144n = new C37144n(abstractC37143m, j12, j14);
            synchronized (c37144n) {
                inputStreamB = c37144n.b(0L, c37144n.a());
            }
            while (i13 > 0) {
                try {
                    int iMin = Math.min(i13, Http2.INITIAL_MAX_FRAME_SIZE);
                    int i14 = 0;
                    while (i14 < iMin) {
                        int i15 = inputStreamB.read(bArr, i14, iMin - i14);
                        if (i15 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i14 += i15;
                    }
                    outputStream.write(bArr, 0, iMin);
                    i13 -= iMin;
                } finally {
                }
            }
            inputStreamB.close();
        } catch (EOFException e12) {
            throw new IOException("patch underrun", e12);
        }
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i12, long j12) throws IOException {
        if (i12 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i12 > j12) {
            throw new IOException("Output length overrun");
        }
        while (i12 > 0) {
            try {
                int iMin = Math.min(i12, Http2.INITIAL_MAX_FRAME_SIZE);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i12 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
