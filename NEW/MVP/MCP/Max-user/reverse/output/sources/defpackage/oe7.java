package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class oe7 {
    public static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final h08 a;

    public oe7(InputStream inputStream) {
        this.a = new h08(20, inputStream);
    }

    public final int a() throws IOException {
        int i;
        InputStream inputStream = (InputStream) this.a.b;
        int i2 = 65280;
        short s = 255;
        int i3 = ((inputStream.read() << 8) & 65280) | (inputStream.read() & 255);
        if ((i3 & 65496) == 65496 || i3 == 19789 || i3 == 18761) {
            while (true) {
                short s2 = (short) (inputStream.read() & s);
                if (s2 == s) {
                    short s3 = (short) (inputStream.read() & s);
                    if (s3 == 218) {
                        break;
                    }
                    if (s3 != 217) {
                        i = (((inputStream.read() << 8) & i2) | (inputStream.read() & s)) - 2;
                        if (s3 == 225) {
                            break;
                        }
                        long j = i;
                        long j2 = 0;
                        if (j >= 0) {
                            long j3 = j;
                            while (j3 > 0) {
                                long jSkip = inputStream.skip(j3);
                                if (jSkip > 0) {
                                    j3 -= jSkip;
                                } else {
                                    if (inputStream.read() == -1) {
                                        break;
                                    }
                                    j3--;
                                }
                            }
                            j2 = j - j3;
                        }
                        if (j2 == j) {
                            i2 = 65280;
                            s = 255;
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            StringBuilder sbK = wy1.k("Unable to skip enough data, type: ", s3, ", wanted to skip: ", i, ", but actually skipped: ");
                            sbK.append(j2);
                            Log.d("ImageHeaderParser", sbK.toString());
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    u45.o(s2, "Unknown segmentId=", "ImageHeaderParser");
                }
            }
            i = -1;
            if (i != -1) {
                byte[] bArr = new byte[i];
                int i4 = i;
                while (i4 > 0) {
                    int i5 = inputStream.read(bArr, i - i4, i4);
                    if (i5 == -1) {
                        break;
                    }
                    i4 -= i5;
                }
                int i6 = i - i4;
                if (i6 == i) {
                    byte[] bArr2 = b;
                    boolean z = i > bArr2.length;
                    if (z) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= bArr2.length) {
                                break;
                            }
                            if (bArr[i7] != bArr2[i7]) {
                                z = false;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (z) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        ByteBuffer byteBuffer = (ByteBuffer) byteBufferWrap.order(byteOrder).limit(i);
                        short s4 = byteBuffer.getShort(6);
                        if (s4 != 19789) {
                            if (s4 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                u45.o(s4, "Unknown endianness = ", "ImageHeaderParser");
                            }
                        }
                        byteBuffer.order(byteOrder);
                        int i8 = byteBuffer.getInt(10);
                        short s5 = byteBuffer.getShort(i8 + 6);
                        for (int i9 = 0; i9 < s5; i9++) {
                            int i10 = (i9 * 12) + i8 + 8;
                            short s6 = byteBuffer.getShort(i10);
                            if (s6 == 274) {
                                short s7 = byteBuffer.getShort(i10 + 2);
                                if (s7 >= 1 && s7 <= 12) {
                                    int i11 = byteBuffer.getInt(i10 + 4);
                                    if (i11 >= 0) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder sbK2 = wy1.k("Got tagIndex=", i9, " tagType=", s6, " formatCode=");
                                            sbK2.append((int) s7);
                                            sbK2.append(" componentCount=");
                                            sbK2.append(i11);
                                            Log.d("ImageHeaderParser", sbK2.toString());
                                        }
                                        int i12 = i11 + c[s7];
                                        if (i12 <= 4) {
                                            int i13 = i10 + 8;
                                            if (i13 >= 0 && i13 <= byteBuffer.remaining()) {
                                                if (i12 >= 0 && i12 + i13 <= byteBuffer.remaining()) {
                                                    return byteBuffer.getShort(i13);
                                                }
                                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                    u45.o(s6, "Illegal number of bytes for TI tag data tagType=", "ImageHeaderParser");
                                                }
                                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i13 + " tagType=" + ((int) s6));
                                            }
                                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            u45.o(s7, "Got byte count > 4, not orientation, continuing, formatCode=", "ImageHeaderParser");
                                        }
                                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                        Log.d("ImageHeaderParser", "Negative tiff component count");
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    u45.o(s7, "Got invalid format code = ", "ImageHeaderParser");
                                }
                            }
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + i6);
                    return -1;
                }
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
            u45.o(i3, "Parser doesn't handle magic number: ", "ImageHeaderParser");
            return -1;
        }
        return -1;
    }
}
