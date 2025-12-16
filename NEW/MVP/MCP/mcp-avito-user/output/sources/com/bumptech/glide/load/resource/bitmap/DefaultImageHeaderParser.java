package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.ImageHeaderParser;
import j.N;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f339327a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f339328b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        long skip(long j12);
    }

    public static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f339329a;

        public a(ByteBuffer byteBuffer) {
            this.f339329a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f339329a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j12) {
            ByteBuffer byteBuffer = this.f339329a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j12);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f339330a;

        public b(byte[] bArr, int i12) {
            this.f339330a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i12);
        }

        public final short a(int i12) {
            ByteBuffer byteBuffer = this.f339330a;
            if (byteBuffer.remaining() - i12 >= 2) {
                return byteBuffer.getShort(i12);
            }
            return (short) -1;
        }
    }

    public static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f339331a;

        public c(InputStream inputStream) {
            this.f339331a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() throws IOException {
            int i12 = this.f339331a.read();
            if (i12 != -1) {
                return (short) i12;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j12) throws IOException {
            if (j12 < 0) {
                return 0L;
            }
            long j13 = j12;
            while (j13 > 0) {
                InputStream inputStream = this.f339331a;
                long jSkip = inputStream.skip(j13);
                if (jSkip > 0) {
                    j13 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j13--;
                }
            }
            return j12 - j13;
        }
    }

    @N
    public static ImageHeaderParser.ImageType d(Reader reader) {
        try {
            int iA2 = reader.a();
            if (iA2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iB2 = (iA2 << 8) | reader.b();
            if (iB2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iB3 = (iB2 << 8) | reader.b();
            if (iB3 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iB3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (reader.a() << 16) | reader.a();
            if ((iA3 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i12 = iA3 & 255;
            if (i12 == 88) {
                reader.skip(4L);
                return (reader.b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i12 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int e(c cVar, byte[] bArr, int i12) throws Reader.EndOfFileException {
        ByteOrder byteOrder;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12 && (i14 = cVar.f339331a.read(bArr, i13, i12 - i13)) != -1) {
            i13 += i14;
        }
        if (i13 == 0 && i14 == -1) {
            throw new Reader.EndOfFileException();
        }
        if (i13 != i12) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = f339327a;
        boolean z12 = bArr != null && i12 > bArr2.length;
        if (z12) {
            int i15 = 0;
            while (true) {
                if (i15 >= bArr2.length) {
                    break;
                }
                if (bArr[i15] != bArr2[i15]) {
                    z12 = false;
                    break;
                }
                i15++;
            }
        }
        if (!z12) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        b bVar = new b(bArr, i12);
        short sA2 = bVar.a(6);
        if (sA2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sA2 != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        ByteBuffer byteBuffer = bVar.f339330a;
        byteBuffer.order(byteOrder);
        int i16 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sA3 = bVar.a(i16 + 6);
        for (int i17 = 0; i17 < sA3; i17++) {
            int i18 = (i17 * 12) + i16 + 8;
            if (bVar.a(i18) == 274) {
                short sA4 = bVar.a(i18 + 2);
                if (sA4 < 1 || sA4 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i19 = i18 + 4;
                    int i22 = byteBuffer.remaining() - i19 >= 4 ? byteBuffer.getInt(i19) : -1;
                    if (i22 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i23 = i22 + f339328b[sA4];
                        if (i23 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i24 = i18 + 8;
                            if (i24 < 0 || i24 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i23 >= 0 && i23 + i24 <= byteBuffer.remaining()) {
                                    return bVar.a(i24);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@N InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) throws IOException {
        int iA2;
        c cVar = new c(inputStream);
        com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
        try {
            int iA3 = cVar.a();
            if (!((iA3 & 65496) == 65496 || iA3 == 19789 || iA3 == 18761)) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (cVar.b() == 255) {
                    short sB2 = cVar.b();
                    if (sB2 == 218) {
                        break;
                    }
                    if (sB2 != 217) {
                        iA2 = cVar.a() - 2;
                        if (sB2 == 225) {
                            break;
                        }
                        long j12 = iA2;
                        if (cVar.skip(j12) != j12) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            break;
                        }
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                } else {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
            }
            iA2 = -1;
            if (iA2 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) jVar.d(byte[].class, iA2);
            try {
                int iE2 = e(cVar, bArr, iA2);
                jVar.i(bArr);
                return iE2;
            } catch (Throwable th2) {
                jVar.i(bArr);
                throw th2;
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @N
    public final ImageHeaderParser.ImageType b(@N ByteBuffer byteBuffer) {
        com.bumptech.glide.util.k.c(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @N
    public final ImageHeaderParser.ImageType c(@N InputStream inputStream) {
        return d(new c(inputStream));
    }
}
