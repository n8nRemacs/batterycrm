package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.exifinterface.media.b;
import j.N;
import j.P;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: U, reason: collision with root package name */
    public static final f f46208U;

    /* renamed from: V, reason: collision with root package name */
    public static final f[][] f46209V;

    /* renamed from: W, reason: collision with root package name */
    public static final f[] f46210W;

    /* renamed from: X, reason: collision with root package name */
    public static final HashMap<Integer, f>[] f46211X;

    /* renamed from: Y, reason: collision with root package name */
    public static final HashMap<String, f>[] f46212Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final HashSet<String> f46213Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f46214a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final Charset f46215b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f46216c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f46217d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f46218e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f46219f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f46220g0;

    /* renamed from: a, reason: collision with root package name */
    public String f46228a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f46229b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f46230c;

    /* renamed from: d, reason: collision with root package name */
    public int f46231d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, d>[] f46232e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f46233f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f46234g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46235h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46236i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f46237j;

    /* renamed from: k, reason: collision with root package name */
    public int f46238k;

    /* renamed from: l, reason: collision with root package name */
    public int f46239l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f46240m;

    /* renamed from: n, reason: collision with root package name */
    public int f46241n;

    /* renamed from: o, reason: collision with root package name */
    public int f46242o;

    /* renamed from: p, reason: collision with root package name */
    public int f46243p;

    /* renamed from: q, reason: collision with root package name */
    public int f46244q;

    /* renamed from: r, reason: collision with root package name */
    public int f46245r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f46246s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f46221t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List<Integer> f46222u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List<Integer> f46223v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f46224w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f46225x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f46226y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f46227z = {102, 116, 121, 112};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f46188A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f46189B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f46190C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f46191D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f46192E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f46193F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f46194G = {73, 72, 68, 82};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f46195H = {73, 69, 78, 68};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f46196I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f46197J = {87, 69, 66, 80};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f46198K = {69, 88, 73, 70};

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f46199L = {-99, 1, 42};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f46200M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f46201N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f46202O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f46203P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f46204Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    public static final String[] f46205R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f46206S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T, reason: collision with root package name */
    public static final byte[] f46207T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    public static class c extends FilterOutputStream {

        /* renamed from: b, reason: collision with root package name */
        public final OutputStream f46254b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f46255c;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f46254b = outputStream;
            this.f46255c = byteOrder;
        }

        public final void a(int i12) throws IOException {
            this.f46254b.write(i12);
        }

        public final void b(int i12) throws IOException {
            ByteOrder byteOrder = this.f46255c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f46254b;
            if (byteOrder == byteOrder2) {
                outputStream.write(i12 & 255);
                outputStream.write((i12 >>> 8) & 255);
                outputStream.write((i12 >>> 16) & 255);
                outputStream.write((i12 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i12 >>> 24) & 255);
                outputStream.write((i12 >>> 16) & 255);
                outputStream.write((i12 >>> 8) & 255);
                outputStream.write(i12 & 255);
            }
        }

        public final void c(short s5) throws IOException {
            ByteOrder byteOrder = this.f46255c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f46254b;
            if (byteOrder == byteOrder2) {
                outputStream.write(s5 & 255);
                outputStream.write((s5 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s5 >>> 8) & 255);
                outputStream.write(s5 & 255);
            }
        }

        public final void d(long j12) throws IOException {
            if (j12 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            b((int) j12);
        }

        public final void f(int i12) throws IOException {
            if (i12 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            c((short) i12);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f46254b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) throws IOException {
            this.f46254b.write(bArr, i12, i13);
        }
    }

    /* compiled from: ExifInterface.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f46256a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46257b;

        /* renamed from: c, reason: collision with root package name */
        public final long f46258c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f46259d;

        public d(int i12, int i13, byte[] bArr) {
            this(-1L, bArr, i12, i13);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.f46215b0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j12, ByteOrder byteOrder) {
            return c(new long[]{j12}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f46206S[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j12 : jArr) {
                byteBufferWrap.putInt((int) j12);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d d(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f46206S[5] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f46264a);
                byteBufferWrap.putInt((int) hVar.f46265b);
            }
            return new d(5, hVarArr.length, byteBufferWrap.array());
        }

        public static d e(int i12, ByteOrder byteOrder) {
            return f(new int[]{i12}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f46206S[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i12 : iArr) {
                byteBufferWrap.putShort((short) i12);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                if (((long[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                if (((int[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) objJ;
            if (hVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            h hVar = hVarArr[0];
            return hVar.f46264a / hVar.f46265b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i12 < jArr.length) {
                    sb2.append(jArr[i12]);
                    i12++;
                    if (i12 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i12 < iArr.length) {
                    sb2.append(iArr[i12]);
                    i12++;
                    if (i12 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i12 < dArr.length) {
                    sb2.append(dArr[i12]);
                    i12++;
                    if (i12 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objJ instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) objJ;
            while (i12 < hVarArr.length) {
                sb2.append(hVarArr[i12].f46264a);
                sb2.append('/');
                sb2.append(hVarArr[i12].f46265b);
                i12++;
                if (i12 != hVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:59|(2:61|(2:62|(2:64|(2:148|66)(1:67))(2:149|68)))|69|(2:71|(6:151|73|79|123|80|81)(3:74|(2:76|153)(2:77|152)|78))|150|79|123|80|81) */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v18, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [androidx.exifinterface.media.a$h[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v21, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [androidx.exifinterface.media.a$h[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v23, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v24, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable j(java.nio.ByteOrder r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.f46205R[this.f46256a]);
            sb2.append(", data length:");
            return AK.c.i(this.f46259d.length, ")", sb2);
        }

        public d(long j12, byte[] bArr, int i12, int i13) {
            this.f46256a = i12;
            this.f46257b = i13;
            this.f46258c = j12;
            this.f46259d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    /* compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface g {
    }

    /* compiled from: ExifInterface.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final long f46264a;

        /* renamed from: b, reason: collision with root package name */
        public final long f46265b;

        public h(long j12, long j13) {
            if (j13 == 0) {
                this.f46264a = 0L;
                this.f46265b = 1L;
            } else {
                this.f46264a = j12;
                this.f46265b = j13;
            }
        }

        public final String toString() {
            return this.f46264a + "/" + this.f46265b;
        }
    }

    static {
        f[] fVarArr = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ImageWidth", 256, 3, 4), new f("ImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", 270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("Orientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", 318, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", 513, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("SensorTopBorder", 4, 4), new f("SensorLeftBorder", 5, 4), new f("SensorBottomBorder", 6, 4), new f("SensorRightBorder", 7, 4), new f("ISO", 23, 3), new f("JpgFromRaw", 46, 7), new f("Xmp", 700, 1)};
        f[] fVarArr2 = {new f("ExposureTime", 33434, 5), new f("FNumber", 33437, 5), new f("ExposureProgram", 34850, 3), new f("SpectralSensitivity", 34852, 2), new f("PhotographicSensitivity", 34855, 3), new f("OECF", 34856, 7), new f("SensitivityType", 34864, 3), new f("StandardOutputSensitivity", 34865, 4), new f("RecommendedExposureIndex", 34866, 4), new f("ISOSpeed", 34867, 4), new f("ISOSpeedLatitudeyyy", 34868, 4), new f("ISOSpeedLatitudezzz", 34869, 4), new f("ExifVersion", 36864, 2), new f("DateTimeOriginal", 36867, 2), new f("DateTimeDigitized", 36868, 2), new f("OffsetTime", 36880, 2), new f("OffsetTimeOriginal", 36881, 2), new f("OffsetTimeDigitized", 36882, 2), new f("ComponentsConfiguration", 37121, 7), new f("CompressedBitsPerPixel", 37122, 5), new f("ShutterSpeedValue", 37377, 10), new f("ApertureValue", 37378, 5), new f("BrightnessValue", 37379, 10), new f("ExposureBiasValue", 37380, 10), new f("MaxApertureValue", 37381, 5), new f("SubjectDistance", 37382, 5), new f("MeteringMode", 37383, 3), new f("LightSource", 37384, 3), new f("Flash", 37385, 3), new f("FocalLength", 37386, 5), new f("SubjectArea", 37396, 3), new f("MakerNote", 37500, 7), new f("UserComment", 37510, 7), new f("SubSecTime", 37520, 2), new f("SubSecTimeOriginal", 37521, 2), new f("SubSecTimeDigitized", 37522, 2), new f("FlashpixVersion", 40960, 7), new f("ColorSpace", 40961, 3), new f("PixelXDimension", 40962, 3, 4), new f("PixelYDimension", 40963, 3, 4), new f("RelatedSoundFile", 40964, 2), new f("InteroperabilityIFDPointer", 40965, 4), new f("FlashEnergy", 41483, 5), new f("SpatialFrequencyResponse", 41484, 7), new f("FocalPlaneXResolution", 41486, 5), new f("FocalPlaneYResolution", 41487, 5), new f("FocalPlaneResolutionUnit", 41488, 3), new f("SubjectLocation", 41492, 3), new f("ExposureIndex", 41493, 5), new f("SensingMethod", 41495, 3), new f("FileSource", 41728, 7), new f("SceneType", 41729, 7), new f("CFAPattern", 41730, 7), new f("CustomRendered", 41985, 3), new f("ExposureMode", 41986, 3), new f("WhiteBalance", 41987, 3), new f("DigitalZoomRatio", 41988, 5), new f("FocalLengthIn35mmFilm", 41989, 3), new f("SceneCaptureType", 41990, 3), new f("GainControl", 41991, 3), new f("Contrast", 41992, 3), new f("Saturation", 41993, 3), new f("Sharpness", 41994, 3), new f("DeviceSettingDescription", 41995, 7), new f("SubjectDistanceRange", 41996, 3), new f("ImageUniqueID", 42016, 2), new f("CameraOwnerName", 42032, 2), new f("BodySerialNumber", 42033, 2), new f("LensSpecification", 42034, 5), new f("LensMake", 42035, 2), new f("LensModel", 42036, 2), new f("Gamma", 42240, 5), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        f[] fVarArr3 = {new f("GPSVersionID", 0, 1), new f("GPSLatitudeRef", 1, 2), new f("GPSLatitude", 2, 5, 10), new f("GPSLongitudeRef", 3, 2), new f("GPSLongitude", 4, 5, 10), new f("GPSAltitudeRef", 5, 1), new f("GPSAltitude", 6, 5), new f("GPSTimeStamp", 7, 5), new f("GPSSatellites", 8, 2), new f("GPSStatus", 9, 2), new f("GPSMeasureMode", 10, 2), new f("GPSDOP", 11, 5), new f("GPSSpeedRef", 12, 2), new f("GPSSpeed", 13, 5), new f("GPSTrackRef", 14, 2), new f("GPSTrack", 15, 5), new f("GPSImgDirectionRef", 16, 2), new f("GPSImgDirection", 17, 5), new f("GPSMapDatum", 18, 2), new f("GPSDestLatitudeRef", 19, 2), new f("GPSDestLatitude", 20, 5), new f("GPSDestLongitudeRef", 21, 2), new f("GPSDestLongitude", 22, 5), new f("GPSDestBearingRef", 23, 2), new f("GPSDestBearing", 24, 5), new f("GPSDestDistanceRef", 25, 2), new f("GPSDestDistance", 26, 5), new f("GPSProcessingMethod", 27, 7), new f("GPSAreaInformation", 28, 7), new f("GPSDateStamp", 29, 2), new f("GPSDifferential", 30, 3), new f("GPSHPositioningError", 31, 5)};
        f[] fVarArr4 = {new f("InteroperabilityIndex", 1, 2)};
        f[] fVarArr5 = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ThumbnailImageWidth", 256, 3, 4), new f("ThumbnailImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", 270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("ThumbnailOrientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", 318, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", 513, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        f46208U = new f("StripOffsets", 273, 3);
        f46209V = new f[][]{fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, new f[]{new f("ThumbnailImage", 256, 7), new f("CameraSettingsIFDPointer", 8224, 4), new f("ImageProcessingIFDPointer", 8256, 4)}, new f[]{new f("PreviewImageStart", 257, 4), new f("PreviewImageLength", 258, 4)}, new f[]{new f("AspectFrame", 4371, 3)}, new f[]{new f("ColorSpace", 55, 3)}};
        f46210W = new f[]{new f("SubIFDPointer", 330, 4), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("InteroperabilityIFDPointer", 40965, 4), new f("CameraSettingsIFDPointer", 8224, 1), new f("ImageProcessingIFDPointer", 8256, 1)};
        f46211X = new HashMap[10];
        f46212Y = new HashMap[10];
        f46213Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f46214a0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f46215b0 = charsetForName;
        f46216c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f46217d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i12 = 0;
        while (true) {
            f[][] fVarArr6 = f46209V;
            if (i12 >= fVarArr6.length) {
                HashMap<Integer, Integer> map = f46214a0;
                f[] fVarArr7 = f46210W;
                map.put(Integer.valueOf(fVarArr7[0].f46260a), 5);
                map.put(Integer.valueOf(fVarArr7[1].f46260a), 1);
                map.put(Integer.valueOf(fVarArr7[2].f46260a), 2);
                map.put(Integer.valueOf(fVarArr7[3].f46260a), 3);
                map.put(Integer.valueOf(fVarArr7[4].f46260a), 7);
                map.put(Integer.valueOf(fVarArr7[5].f46260a), 8);
                Pattern.compile(".*[1-9].*");
                f46218e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f46219f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f46220g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f46211X[i12] = new HashMap<>();
            f46212Y[i12] = new HashMap<>();
            for (f fVar : fVarArr6[i12]) {
                f46211X[i12].put(Integer.valueOf(fVar.f46260a), fVar);
                f46212Y[i12].put(fVar.f46261b, fVar);
            }
            i12++;
        }
    }

    public a(@N File file) throws Throwable {
        f[][] fVarArr = f46209V;
        this.f46232e = new HashMap[fVarArr.length];
        this.f46233f = new HashSet(fVarArr.length);
        this.f46234g = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        t(file.getAbsolutePath());
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d12 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d13 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d14 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d13 / 60.0d) + d12;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d14;
            }
            return -d14;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair<Integer, Integer> r(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                Pair<Integer, Integer> pairR2 = r(strArrSplit[i12]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j12 = Long.parseLong(str);
                    return (j12 < 0 || j12 > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? j12 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j13 = (long) Double.parseDouble(strArrSplit2[0]);
                long j14 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j13 >= 0 && j14 >= 0) {
                    if (j13 <= 2147483647L && j14 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder y(b bVar) throws IOException {
        short s5 = bVar.readShort();
        if (s5 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s5 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(r.m(s5, new StringBuilder("Invalid byte order: ")));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(androidx.exifinterface.media.a.i r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.A(androidx.exifinterface.media.a$i, int):void");
    }

    public final void B(String str) {
        for (int i12 = 0; i12 < f46209V.length; i12++) {
            this.f46232e[i12].remove(str);
        }
    }

    public final void C(int i12, String str, String str2) {
        HashMap<String, d>[] mapArr = this.f46232e;
        if (mapArr[i12].isEmpty() || mapArr[i12].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i12];
        map.put(str2, map.get(str));
        mapArr[i12].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.D():void");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f46221t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String strC = c("Xmp");
        HashMap<String, d>[] mapArr = this.f46232e;
        d dVarRemove = (strC == null || !this.f46246s) ? null : mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        M(cVar);
        if (dVarRemove != null) {
            mapArr[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b12 = bVar.readByte();
            if (b12 == -39 || b12 == -38) {
                cVar.a(-1);
                cVar.a(b12);
                androidx.exifinterface.media.b.c(bVar, cVar);
                return;
            }
            if (b12 != -31) {
                cVar.a(-1);
                cVar.a(b12);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.f(unsignedShort);
                int i12 = unsignedShort - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i12 > 0) {
                    int i13 = bVar.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 >= 0) {
                        cVar.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i14 = unsignedShort2 - 2;
                if (i14 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i14 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f46216c0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b12);
                cVar.f(unsignedShort2);
                if (i14 >= 6) {
                    i14 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i14 > 0) {
                    int i15 = bVar.read(bArr, 0, Math.min(i14, 4096));
                    if (i15 >= 0) {
                        cVar.write(bArr, 0, i15);
                        i14 -= i15;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f46221t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        androidx.exifinterface.media.b.d(bVar, cVar, f46192E.length);
        if (this.f46242o == 0) {
            int i12 = bVar.readInt();
            cVar.b(i12);
            androidx.exifinterface.media.b.d(bVar, cVar, i12 + 8);
        } else {
            androidx.exifinterface.media.b.d(bVar, cVar, (r2 - r7.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                M(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f46254b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                androidx.exifinterface.media.b.a(byteArrayOutputStream2);
                androidx.exifinterface.media.b.c(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i12;
        int i13;
        boolean z12;
        int i14;
        c cVar;
        byte[] bArr;
        byte[] bArr2;
        boolean z13;
        if (f46221t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr3 = f46196I;
        androidx.exifinterface.media.b.d(bVar, cVar2, bArr3.length);
        byte[] bArr4 = f46197J;
        bVar.a(bArr4.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
        }
        try {
            c cVar3 = new c(byteArrayOutputStream, byteOrder);
            int i15 = this.f46242o;
            if (i15 != 0) {
                androidx.exifinterface.media.b.d(bVar, cVar3, (i15 - ((bArr3.length + 4) + bArr4.length)) - 8);
                bVar.a(4);
                int i16 = bVar.readInt();
                if (i16 % 2 != 0) {
                    i16++;
                }
                bVar.a(i16);
                M(cVar3);
            } else {
                byte[] bArr5 = new byte[4];
                bVar.readFully(bArr5);
                byte[] bArr6 = f46200M;
                boolean zEquals = Arrays.equals(bArr5, bArr6);
                byte[] bArr7 = f46202O;
                byte[] bArr8 = f46201N;
                if (!zEquals) {
                    if (Arrays.equals(bArr5, bArr7) || Arrays.equals(bArr5, bArr8)) {
                        int i17 = bVar.readInt();
                        int i18 = i17 % 2 == 1 ? i17 + 1 : i17;
                        byte[] bArr9 = new byte[3];
                        boolean zEquals2 = Arrays.equals(bArr5, bArr7);
                        byte[] bArr10 = f46199L;
                        if (zEquals2) {
                            bVar.readFully(bArr9);
                            byte[] bArr11 = new byte[3];
                            bVar.readFully(bArr11);
                            if (!Arrays.equals(bArr10, bArr11)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            i12 = bVar.readInt();
                            i18 -= 10;
                            i13 = (i12 << 18) >> 18;
                            i14 = (i12 << 2) >> 18;
                            z12 = false;
                        } else if (!Arrays.equals(bArr5, bArr8)) {
                            i12 = 0;
                            i13 = 0;
                            z12 = false;
                            i14 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i12 = bVar.readInt();
                            z12 = true;
                            i13 = (i12 & 16383) + 1;
                            i14 = ((i12 & 268419072) >>> 14) + 1;
                            if ((i12 & 268435456) == 0) {
                                z12 = false;
                            }
                            i18 -= 5;
                        }
                        cVar3.write(bArr6);
                        cVar3.b(10);
                        byte[] bArr12 = new byte[10];
                        if (z12) {
                            cVar = cVar2;
                            bArr12[0] = (byte) (bArr12[0] | 16);
                        } else {
                            cVar = cVar2;
                        }
                        bArr = bArr4;
                        bArr12[0] = (byte) (bArr12[0] | 8);
                        int i19 = i13 - 1;
                        int i22 = i14 - 1;
                        bArr12[4] = (byte) i19;
                        bArr12[5] = (byte) (i19 >> 8);
                        bArr12[6] = (byte) (i19 >> 16);
                        bArr12[7] = (byte) i22;
                        bArr12[8] = (byte) (i22 >> 8);
                        bArr12[9] = (byte) (i22 >> 16);
                        cVar3.write(bArr12);
                        cVar3.write(bArr5);
                        cVar3.b(i17);
                        if (Arrays.equals(bArr5, bArr7)) {
                            cVar3.write(bArr9);
                            cVar3.write(bArr10);
                            cVar3.b(i12);
                        } else if (Arrays.equals(bArr5, bArr8)) {
                            cVar3.write(47);
                            cVar3.b(i12);
                        }
                        androidx.exifinterface.media.b.d(bVar, cVar3, i18);
                        M(cVar3);
                    }
                    androidx.exifinterface.media.b.c(bVar, cVar3);
                    byte[] bArr13 = bArr;
                    c cVar4 = cVar;
                    cVar4.b(byteArrayOutputStream.size() + bArr13.length);
                    cVar4.write(bArr13);
                    byteArrayOutputStream.writeTo(cVar4);
                    androidx.exifinterface.media.b.a(byteArrayOutputStream);
                }
                int i23 = bVar.readInt();
                byte[] bArr14 = new byte[i23 % 2 == 1 ? i23 + 1 : i23];
                bVar.readFully(bArr14);
                byte b12 = (byte) (8 | bArr14[0]);
                bArr14[0] = b12;
                boolean z14 = ((b12 >> 1) & 1) == 1;
                cVar3.write(bArr6);
                cVar3.b(i23);
                cVar3.write(bArr14);
                if (z14) {
                    byte[] bArr15 = f46203P;
                    do {
                        bArr2 = new byte[4];
                        bVar.readFully(bArr2);
                        int i24 = bVar.readInt();
                        cVar3.write(bArr2);
                        cVar3.b(i24);
                        if (i24 % 2 == 1) {
                            i24++;
                        }
                        androidx.exifinterface.media.b.d(bVar, cVar3, i24);
                    } while (!Arrays.equals(bArr2, bArr15));
                    while (true) {
                        byte[] bArr16 = new byte[4];
                        try {
                            bVar.readFully(bArr16);
                            z13 = !Arrays.equals(bArr16, f46204Q);
                        } catch (EOFException unused) {
                            z13 = true;
                        }
                        if (z13) {
                            break;
                        }
                        int i25 = bVar.readInt();
                        cVar3.write(bArr16);
                        cVar3.b(i25);
                        if (i25 % 2 == 1) {
                            i25++;
                        }
                        androidx.exifinterface.media.b.d(bVar, cVar3, i25);
                    }
                    M(cVar3);
                } else {
                    while (true) {
                        byte[] bArr17 = new byte[4];
                        bVar.readFully(bArr17);
                        int i26 = bVar.readInt();
                        cVar3.write(bArr17);
                        cVar3.b(i26);
                        if (i26 % 2 == 1) {
                            i26++;
                        }
                        androidx.exifinterface.media.b.d(bVar, cVar3, i26);
                        if (Arrays.equals(bArr17, bArr7) || (bArr8 != null && Arrays.equals(bArr17, bArr8))) {
                            break;
                        }
                    }
                    M(cVar3);
                }
            }
            cVar = cVar2;
            bArr = bArr4;
            androidx.exifinterface.media.b.c(bVar, cVar3);
            byte[] bArr132 = bArr;
            c cVar42 = cVar;
            cVar42.b(byteArrayOutputStream.size() + bArr132.length);
            cVar42.write(bArr132);
            byteArrayOutputStream.writeTo(cVar42);
            androidx.exifinterface.media.b.a(byteArrayOutputStream);
        } catch (Exception e13) {
            e = e13;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.a(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(@j.N java.lang.String r19, @j.P java.lang.String r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.H(java.lang.String, java.lang.String):void");
    }

    public final void I(b bVar) throws Throwable {
        d dVar;
        HashMap<String, d> map = this.f46232e[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.f46241n = 6;
            s(bVar, map);
            return;
        }
        int iH2 = dVar2.h(this.f46234g);
        this.f46241n = iH2;
        if (iH2 != 1) {
            if (iH2 == 6) {
                s(bVar, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f46234g);
            int[] iArr2 = f46224w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f46231d != 3 || (dVar = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH3 = dVar.h(this.f46234g);
                if ((iH3 != 1 || !Arrays.equals(iArr, f46225x)) && (iH3 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            d dVar4 = map.get("StripOffsets");
            d dVar5 = map.get("StripByteCounts");
            if (dVar4 == null || dVar5 == null) {
                return;
            }
            long[] jArrB = androidx.exifinterface.media.b.b(dVar4.j(this.f46234g));
            long[] jArrB2 = androidx.exifinterface.media.b.b(dVar5.j(this.f46234g));
            if (jArrB == null || jArrB.length == 0 || jArrB2 == null || jArrB2.length == 0 || jArrB.length != jArrB2.length) {
                return;
            }
            long j12 = 0;
            for (long j13 : jArrB2) {
                j12 += j13;
            }
            int i12 = (int) j12;
            byte[] bArr = new byte[i12];
            this.f46237j = true;
            this.f46236i = true;
            this.f46235h = true;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < jArrB.length; i15++) {
                int i16 = (int) jArrB[i15];
                int i17 = (int) jArrB2[i15];
                if (i15 < jArrB.length - 1 && i16 + i17 != jArrB[i15 + 1]) {
                    this.f46237j = false;
                }
                int i18 = i16 - i13;
                if (i18 < 0) {
                    return;
                }
                try {
                    bVar.a(i18);
                    int i19 = i13 + i18;
                    byte[] bArr2 = new byte[i17];
                    bVar.readFully(bArr2);
                    i13 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i14, i17);
                    i14 += i17;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.f46240m = bArr;
            if (this.f46237j) {
                this.f46238k = (int) jArrB[0];
                this.f46239l = i12;
            }
        }
    }

    public final void J(int i12, int i13) throws Throwable {
        HashMap<String, d>[] mapArr = this.f46232e;
        if (mapArr[i12].isEmpty() || mapArr[i13].isEmpty()) {
            return;
        }
        d dVar = mapArr[i12].get("ImageLength");
        d dVar2 = mapArr[i12].get("ImageWidth");
        d dVar3 = mapArr[i13].get("ImageLength");
        d dVar4 = mapArr[i13].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iH2 = dVar.h(this.f46234g);
        int iH3 = dVar2.h(this.f46234g);
        int iH4 = dVar3.h(this.f46234g);
        int iH5 = dVar4.h(this.f46234g);
        if (iH2 >= iH4 || iH3 >= iH5) {
            return;
        }
        HashMap<String, d> map = mapArr[i12];
        mapArr[i12] = mapArr[i13];
        mapArr[i13] = map;
    }

    public final void K(i iVar, int i12) throws Throwable {
        d dVarE;
        d dVarE2;
        HashMap<String, d>[] mapArr = this.f46232e;
        d dVar = mapArr[i12].get("DefaultCropSize");
        d dVar2 = mapArr[i12].get("SensorTopBorder");
        d dVar3 = mapArr[i12].get("SensorLeftBorder");
        d dVar4 = mapArr[i12].get("SensorBottomBorder");
        d dVar5 = mapArr[i12].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f46256a == 5) {
                h[] hVarArr = (h[]) dVar.j(this.f46234g);
                if (hVarArr == null || hVarArr.length != 2) {
                    Arrays.toString(hVarArr);
                    return;
                }
                dVarE = d.d(new h[]{hVarArr[0]}, this.f46234g);
                dVarE2 = d.d(new h[]{hVarArr[1]}, this.f46234g);
            } else {
                int[] iArr = (int[]) dVar.j(this.f46234g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVarE = d.e(iArr[0], this.f46234g);
                    dVarE2 = d.e(iArr[1], this.f46234g);
                }
            }
            mapArr[i12].put("ImageWidth", dVarE);
            mapArr[i12].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH2 = dVar2.h(this.f46234g);
            int iH3 = dVar4.h(this.f46234g);
            int iH4 = dVar5.h(this.f46234g);
            int iH5 = dVar3.h(this.f46234g);
            if (iH3 <= iH2 || iH4 <= iH5) {
                return;
            }
            d dVarE3 = d.e(iH3 - iH2, this.f46234g);
            d dVarE4 = d.e(iH4 - iH5, this.f46234g);
            mapArr[i12].put("ImageLength", dVarE3);
            mapArr[i12].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = mapArr[i12].get("ImageLength");
        d dVar7 = mapArr[i12].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i12].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i12].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH6 = dVar8.h(this.f46234g);
            int iH7 = dVar8.h(this.f46234g);
            iVar.b(iH6);
            byte[] bArr = new byte[iH7];
            iVar.readFully(bArr);
            h(new b(bArr), iH6, i12);
        }
    }

    public final void L() throws Throwable {
        J(0, 5);
        J(0, 4);
        J(5, 4);
        HashMap<String, d>[] mapArr = this.f46232e;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && u(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        u(mapArr[4]);
        C(0, "ThumbnailOrientation", "Orientation");
        C(0, "ThumbnailImageLength", "ImageLength");
        C(0, "ThumbnailImageWidth", "ImageWidth");
        C(5, "ThumbnailOrientation", "Orientation");
        C(5, "ThumbnailImageLength", "ImageLength");
        C(5, "ThumbnailImageWidth", "ImageWidth");
        C(4, "Orientation", "ThumbnailOrientation");
        C(4, "ImageLength", "ThumbnailImageLength");
        C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void M(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        int[] iArr;
        Object[] objArr;
        f[][] fVarArr = f46209V;
        int[] iArr2 = new int[fVarArr.length];
        int[] iArr3 = new int[fVarArr.length];
        f[] fVarArr2 = f46210W;
        for (f fVar : fVarArr2) {
            B(fVar.f46261b);
        }
        if (this.f46235h) {
            if (this.f46236i) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i12 = 0;
        while (true) {
            int length = fVarArr.length;
            mapArr = this.f46232e;
            if (i12 >= length) {
                break;
            }
            Object[] array = mapArr[i12].entrySet().toArray();
            int length2 = array.length;
            int i13 = 0;
            while (i13 < length2) {
                Map.Entry entry = (Map.Entry) array[i13];
                if (entry.getValue() == null) {
                    objArr = array;
                    mapArr[i12].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i13++;
                array = objArr;
            }
            i12++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(fVarArr2[1].f46261b, d.b(0L, this.f46234g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(fVarArr2[2].f46261b, d.b(0L, this.f46234g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(fVarArr2[3].f46261b, d.b(0L, this.f46234g));
        }
        if (this.f46235h) {
            if (this.f46236i) {
                mapArr[4].put("StripOffsets", d.e(0, this.f46234g));
                mapArr[4].put("StripByteCounts", d.e(this.f46239l, this.f46234g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f46234g));
                mapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f46239l, this.f46234g));
            }
        }
        int i14 = 0;
        while (true) {
            int length3 = fVarArr.length;
            iArr = f46206S;
            if (i14 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i14].entrySet().iterator();
            int i15 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i16 = iArr[value.f46256a] * value.f46257b;
                if (i16 > 4) {
                    i15 += i16;
                }
            }
            iArr3[i14] = iArr3[i14] + i15;
            i14++;
        }
        int size = 8;
        for (int i17 = 0; i17 < fVarArr.length; i17++) {
            if (!mapArr[i17].isEmpty()) {
                iArr2[i17] = size;
                size = (mapArr[i17].size() * 12) + 6 + iArr3[i17] + size;
            }
        }
        if (this.f46235h) {
            if (this.f46236i) {
                mapArr[4].put("StripOffsets", d.e(size, this.f46234g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(size, this.f46234g));
            }
            this.f46238k = size;
            size += this.f46239l;
        }
        if (this.f46231d == 4) {
            size += 8;
        }
        if (f46221t) {
            for (int i18 = 0; i18 < fVarArr.length; i18++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i18), Integer.valueOf(iArr2[i18]), Integer.valueOf(mapArr[i18].size()), Integer.valueOf(iArr3[i18]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(fVarArr2[1].f46261b, d.b(iArr2[1], this.f46234g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(fVarArr2[2].f46261b, d.b(iArr2[2], this.f46234g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(fVarArr2[3].f46261b, d.b(iArr2[3], this.f46234g));
        }
        int i19 = this.f46231d;
        if (i19 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(G.e(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.f(size);
            cVar.write(f46216c0);
        } else if (i19 == 13) {
            cVar.b(size);
            cVar.write(f46193F);
        } else if (i19 == 14) {
            cVar.write(f46198K);
            cVar.b(size);
        }
        cVar.c(this.f46234g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f46255c = this.f46234g;
        cVar.f(42);
        cVar.d(8L);
        for (int i22 = 0; i22 < fVarArr.length; i22++) {
            if (!mapArr[i22].isEmpty()) {
                cVar.f(mapArr[i22].size());
                int size2 = (mapArr[i22].size() * 12) + iArr2[i22] + 2 + 4;
                for (Map.Entry<String, d> entry2 : mapArr[i22].entrySet()) {
                    int i23 = f46212Y[i22].get(entry2.getKey()).f46260a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i24 = value2.f46256a;
                    int i25 = iArr[i24];
                    int i26 = value2.f46257b;
                    int i27 = i25 * i26;
                    cVar.f(i23);
                    cVar.f(i24);
                    cVar.b(i26);
                    if (i27 > 4) {
                        cVar.d(size2);
                        size2 += i27;
                    } else {
                        cVar.write(value2.f46259d);
                        if (i27 < 4) {
                            while (i27 < 4) {
                                cVar.a(0);
                                i27++;
                            }
                        }
                    }
                }
                if (i22 != 0 || mapArr[4].isEmpty()) {
                    cVar.d(0L);
                } else {
                    cVar.d(iArr2[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = mapArr[i22].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f46259d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f46235h) {
            cVar.write(p());
        }
        if (this.f46231d == 14 && size % 2 == 1) {
            cVar.a(0);
        }
        cVar.f46255c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.f46232e;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.f46234g));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.f46234g));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.f46234g));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.f46234g));
        }
    }

    @P
    public final String c(@N String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarF = f(str);
        if (dVarF != null) {
            if (!f46213Z.contains(str)) {
                return dVarF.i(this.f46234g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i12 = dVarF.f46256a;
                if (i12 != 5 && i12 != 10) {
                    return null;
                }
                h[] hVarArr = (h[]) dVarF.j(this.f46234g);
                if (hVarArr == null || hVarArr.length != 3) {
                    Arrays.toString(hVarArr);
                    return null;
                }
                h hVar = hVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (hVar.f46264a / hVar.f46265b));
                h hVar2 = hVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (hVar2.f46264a / hVar2.f46265b));
                h hVar3 = hVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (hVar3.f46264a / hVar3.f46265b)));
            }
            try {
                return Double.toString(dVarF.g(this.f46234g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final double d(@N String str, double d12) {
        d dVarF = f(str);
        if (dVarF == null) {
            return d12;
        }
        try {
            return dVarF.g(this.f46234g);
        } catch (NumberFormatException unused) {
            return d12;
        }
    }

    public final int e(int i12, @N String str) {
        d dVarF = f(str);
        if (dVarF == null) {
            return i12;
        }
        try {
            return dVarF.h(this.f46234g);
        } catch (NumberFormatException unused) {
            return i12;
        }
    }

    @P
    public final d f(@N String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i12 = 0; i12 < f46209V.length; i12++) {
            d dVar = this.f46232e[i12].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void g(i iVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C1788b.a(mediaMetadataRetriever, new C1787a(iVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, d>[] mapArr = this.f46232e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.f46234g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.f46234g));
                }
                if (strExtractMetadata3 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", d.e(i12 != 90 ? i12 != 180 ? i12 != 270 ? 1 : 8 : 3 : 6, this.f46234g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.b(i13);
                    byte[] bArr = new byte[6];
                    iVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f46216c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    iVar.readFully(bArr2);
                    this.f46242o = i15;
                    z(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        r23.f46251d = r22.f46234g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[LOOP:0: B:10:0x0023->B:78:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.exifinterface.media.a.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.h(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.i(java.io.BufferedInputStream):int");
    }

    public final void j(i iVar) throws Throwable {
        int i12;
        int i13;
        m(iVar);
        HashMap<String, d>[] mapArr = this.f46232e;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            i iVar2 = new i(dVar.f46259d);
            iVar2.f46251d = this.f46234g;
            byte[] bArr = f46190C;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.b(0L);
            byte[] bArr3 = f46191D;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.b(12L);
            }
            A(iVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f46234g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i14 = iArr[2];
                int i15 = iArr[0];
                if (i14 <= i15 || (i12 = iArr[3]) <= (i13 = iArr[1])) {
                    return;
                }
                int i16 = (i14 - i15) + 1;
                int i17 = (i12 - i13) + 1;
                if (i16 < i17) {
                    int i18 = i16 + i17;
                    i17 = i18 - i17;
                    i16 = i18 - i17;
                }
                d dVarE = d.e(i16, this.f46234g);
                d dVarE2 = d.e(i17, this.f46234g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        if (f46221t) {
            Objects.toString(bVar);
        }
        bVar.f46251d = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f46192E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i12 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i13 = length + 8;
                if (i13 == 16 && !Arrays.equals(bArr2, f46194G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f46195H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f46193F)) {
                    byte[] bArr3 = new byte[i12];
                    bVar.readFully(bArr3);
                    int i14 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i14) {
                        this.f46242o = i13;
                        z(0, bArr3);
                        L();
                        I(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i14 + ", calculated CRC value: " + crc32.getValue());
                }
                int i15 = i12 + 4;
                bVar.a(i15);
                length = i13 + i15;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(b bVar) throws Throwable {
        if (f46221t) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i12 = ByteBuffer.wrap(bArr).getInt();
        int i13 = ByteBuffer.wrap(bArr2).getInt();
        int i14 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i13];
        bVar.a(i12 - bVar.f46250c);
        bVar.readFully(bArr4);
        h(new b(bArr4), i12, 5);
        bVar.a(i14 - bVar.f46250c);
        bVar.f46251d = ByteOrder.BIG_ENDIAN;
        int i15 = bVar.readInt();
        for (int i16 = 0; i16 < i15; i16++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f46208U.f46260a) {
                short s5 = bVar.readShort();
                short s12 = bVar.readShort();
                d dVarE = d.e(s5, this.f46234g);
                d dVarE2 = d.e(s12, this.f46234g);
                HashMap<String, d>[] mapArr = this.f46232e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void m(i iVar) throws Throwable {
        w(iVar);
        A(iVar, 0);
        K(iVar, 0);
        K(iVar, 5);
        K(iVar, 4);
        L();
        if (this.f46231d == 8) {
            HashMap<String, d>[] mapArr = this.f46232e;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                i iVar2 = new i(dVar.f46259d);
                iVar2.f46251d = this.f46234g;
                iVar2.a(6);
                A(iVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final int n() {
        switch (e(1, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void o(i iVar) throws Throwable {
        if (f46221t) {
            Objects.toString(iVar);
        }
        m(iVar);
        HashMap<String, d>[] mapArr = this.f46232e;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f46259d), (int) dVar.f46258c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] p() throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.f46235h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r7.f46240m
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r7.f46230c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L24
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L50
        L1a:
            r2 = move-exception
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L7b
        L21:
            r2 = r1
            goto L84
        L24:
            androidx.exifinterface.media.b.a(r0)
            return r1
        L28:
            java.lang.String r0 = r7.f46228a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r0 == 0) goto L3b
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            java.lang.String r2 = r7.f46228a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            goto L18
        L34:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L7b
        L38:
            r0 = r1
            r2 = r0
            goto L84
        L3b:
            java.io.FileDescriptor r0 = r7.f46229b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            java.io.FileDescriptor r0 = androidx.exifinterface.media.b.a.b(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            r3 = 0
            androidx.exifinterface.media.b.a.c(r0, r3, r2)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            r6 = r2
            r2 = r0
            r0 = r6
        L50:
            androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            int r4 = r7.f46238k     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            int r5 = r7.f46242o     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            int r4 = r4 + r5
            r3.a(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            int r4 = r7.f46239l     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            r7.f46240m = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L84
            androidx.exifinterface.media.b.a(r0)
            if (r2 == 0) goto L6e
            androidx.exifinterface.media.b.a.a(r2)     // Catch: java.lang.Exception -> L6e
        L6e:
            return r4
        L6f:
            r1 = move-exception
            r6 = r1
            r1 = r0
        L72:
            r0 = r6
            goto L7b
        L74:
            r2 = move-exception
            r6 = r2
            r2 = r0
            goto L72
        L78:
            r2 = r0
            r0 = r1
            goto L84
        L7b:
            androidx.exifinterface.media.b.a(r1)
            if (r2 == 0) goto L83
            androidx.exifinterface.media.b.a.a(r2)     // Catch: java.lang.Exception -> L83
        L83:
            throw r0
        L84:
            androidx.exifinterface.media.b.a(r0)
            if (r2 == 0) goto L8c
            androidx.exifinterface.media.b.a.a(r2)     // Catch: java.lang.Exception -> L8c
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.p():byte[]");
    }

    public final void q(b bVar) throws Throwable {
        if (f46221t) {
            Objects.toString(bVar);
        }
        bVar.f46251d = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f46196I.length);
        int i12 = bVar.readInt() + 8;
        byte[] bArr = f46197J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i13 = bVar.readInt();
                int i14 = length + 8;
                if (Arrays.equals(f46198K, bArr2)) {
                    byte[] bArr3 = new byte[i13];
                    bVar.readFully(bArr3);
                    this.f46242o = i14;
                    z(0, bArr3);
                    I(new b(bArr3));
                    return;
                }
                if (i13 % 2 == 1) {
                    i13++;
                }
                length = i14 + i13;
                if (length == i12) {
                    return;
                }
                if (length > i12) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i13);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void s(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH2 = dVar.h(this.f46234g);
        int iH3 = dVar2.h(this.f46234g);
        if (this.f46231d == 7) {
            iH2 += this.f46243p;
        }
        if (iH2 <= 0 || iH3 <= 0) {
            return;
        }
        this.f46235h = true;
        if (this.f46228a == null && this.f46230c == null && this.f46229b == null) {
            byte[] bArr = new byte[iH3];
            bVar.a(iH2);
            bVar.readFully(bArr);
            this.f46240m = bArr;
        }
        this.f46238k = iH2;
        this.f46239l = iH3;
    }

    public final void t(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z12;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f46230c = null;
        this.f46228a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z12 = true;
            } catch (Exception unused) {
                z12 = false;
            }
            if (z12) {
                this.f46229b = fileInputStream.getFD();
            } else {
                this.f46229b = null;
            }
            v(fileInputStream);
            androidx.exifinterface.media.b.a(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.a(fileInputStream2);
            throw th;
        }
    }

    public final boolean u(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f46234g) <= 512 && dVar2.h(this.f46234g) <= 512;
    }

    public final void v(@N InputStream inputStream) throws Throwable {
        boolean z12 = f46221t;
        for (int i12 = 0; i12 < f46209V.length; i12++) {
            try {
                this.f46232e[i12] = new HashMap<>();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (!z12) {
                    return;
                }
            } catch (Throwable th2) {
                a();
                if (z12) {
                    x();
                }
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int i13 = i(bufferedInputStream);
        this.f46231d = i13;
        if (i13 == 4 || i13 == 9 || i13 == 13 || i13 == 14) {
            b bVar = new b(bufferedInputStream);
            int i14 = this.f46231d;
            if (i14 == 4) {
                h(bVar, 0, 0);
            } else if (i14 == 13) {
                k(bVar);
            } else if (i14 == 9) {
                l(bVar);
            } else if (i14 == 14) {
                q(bVar);
            }
        } else {
            i iVar = new i(bufferedInputStream);
            int i15 = this.f46231d;
            if (i15 == 12) {
                g(iVar);
            } else if (i15 == 7) {
                j(iVar);
            } else if (i15 == 10) {
                o(iVar);
            } else {
                m(iVar);
            }
            iVar.b(this.f46242o);
            I(iVar);
        }
        a();
        if (!z12) {
            return;
        }
        x();
    }

    public final void w(i iVar) throws IOException {
        ByteOrder byteOrderY = y(iVar);
        this.f46234g = byteOrderY;
        iVar.f46251d = byteOrderY;
        int unsignedShort = iVar.readUnsignedShort();
        int i12 = this.f46231d;
        if (i12 != 7 && i12 != 10 && unsignedShort != 42) {
            throw new IOException(r.m(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i13 = iVar.readInt();
        if (i13 < 8) {
            throw new IOException(AK.c.g(i13, "Invalid first Ifd offset: "));
        }
        int i14 = i13 - 8;
        if (i14 > 0) {
            iVar.a(i14);
        }
    }

    public final void x() throws Throwable {
        int i12 = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f46232e;
            if (i12 >= mapArr.length) {
                return;
            }
            mapArr[i12].size();
            for (Map.Entry<String, d> entry : mapArr[i12].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.i(this.f46234g);
            }
            i12++;
        }
    }

    public final void z(int i12, byte[] bArr) throws IOException {
        i iVar = new i(bArr);
        w(iVar);
        A(iVar, i12);
    }

    /* compiled from: ExifInterface.java */
    public static class b extends InputStream implements DataInput {

        /* renamed from: b, reason: collision with root package name */
        public final DataInputStream f46249b;

        /* renamed from: c, reason: collision with root package name */
        public int f46250c;

        /* renamed from: d, reason: collision with root package name */
        public ByteOrder f46251d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f46252e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46253f;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f46253f = bArr.length;
        }

        public final void a(int i12) throws IOException {
            int i13 = 0;
            while (i13 < i12) {
                DataInputStream dataInputStream = this.f46249b;
                int i14 = i12 - i13;
                int iSkip = (int) dataInputStream.skip(i14);
                if (iSkip <= 0) {
                    if (this.f46252e == null) {
                        this.f46252e = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f46252e, 0, Math.min(8192, i14));
                    if (iSkip == -1) {
                        throw new EOFException(G.e(i12, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i13 += iSkip;
            }
            this.f46250c += i13;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f46249b.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i12) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f46250c++;
            return this.f46249b.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f46250c++;
            return this.f46249b.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f46250c++;
            int i12 = this.f46249b.read();
            if (i12 >= 0) {
                return (byte) i12;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f46250c += 2;
            return this.f46249b.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i12, int i13) throws IOException {
            this.f46250c += i13;
            this.f46249b.readFully(bArr, i12, i13);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f46250c += 4;
            DataInputStream dataInputStream = this.f46249b;
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            if ((i12 | i13 | i14 | i15) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f46251d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i15 << 24) + (i14 << 16) + (i13 << 8) + i12;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i12 << 24) + (i13 << 16) + (i14 << 8) + i15;
            }
            throw new IOException("Invalid byte order: " + this.f46251d);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f46250c += 8;
            DataInputStream dataInputStream = this.f46249b;
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            int i18 = dataInputStream.read();
            int i19 = dataInputStream.read();
            if ((i12 | i13 | i14 | i15 | i16 | i17 | i18 | i19) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f46251d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i19 << 56) + (i18 << 48) + (i17 << 40) + (i16 << 32) + (i15 << 24) + (i14 << 16) + (i13 << 8) + i12;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i12 << 56) + (i13 << 48) + (i14 << 40) + (i15 << 32) + (i16 << 24) + (i17 << 16) + (i18 << 8) + i19;
            }
            throw new IOException("Invalid byte order: " + this.f46251d);
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f46250c += 2;
            DataInputStream dataInputStream = this.f46249b;
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f46251d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i13 << 8) + i12);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i12 << 8) + i13);
            }
            throw new IOException("Invalid byte order: " + this.f46251d);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f46250c += 2;
            return this.f46249b.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f46250c++;
            return this.f46249b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f46250c += 2;
            DataInputStream dataInputStream = this.f46249b;
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f46251d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 8) + i12;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f46251d);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i12) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = this.f46249b.read(bArr, i12, i13);
            this.f46250c += i14;
            return i14;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f46250c += bArr.length;
            this.f46249b.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f46249b = dataInputStream;
            dataInputStream.mark(0);
            this.f46250c = 0;
            this.f46251d = byteOrder;
            this.f46253f = inputStream instanceof b ? ((b) inputStream).f46253f : -1;
        }
    }

    /* compiled from: ExifInterface.java */
    public static class i extends b {
        public i(byte[] bArr) {
            super(bArr);
            this.f46249b.mark(Integer.MAX_VALUE);
        }

        public final void b(long j12) throws IOException {
            int i12 = this.f46250c;
            if (i12 > j12) {
                this.f46250c = 0;
                this.f46249b.reset();
            } else {
                j12 -= i12;
            }
            a((int) j12);
        }

        public i(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f46249b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f46260a;

        /* renamed from: b, reason: collision with root package name */
        public final String f46261b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46262c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46263d;

        public f(String str, int i12, int i13) {
            this.f46261b = str;
            this.f46260a = i12;
            this.f46262c = i13;
            this.f46263d = -1;
        }

        public f(String str, int i12, int i13, int i14) {
            this.f46261b = str;
            this.f46260a = i12;
            this.f46262c = i13;
            this.f46263d = i14;
        }
    }

    public a(@N String str) throws Throwable {
        f[][] fVarArr = f46209V;
        this.f46232e = new HashMap[fVarArr.length];
        this.f46233f = new HashSet(fVarArr.length);
        this.f46234g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            t(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(@N FileDescriptor fileDescriptor) throws Throwable {
        boolean z12;
        FileInputStream fileInputStream;
        Throwable th2;
        f[][] fVarArr = f46209V;
        this.f46232e = new HashMap[fVarArr.length];
        this.f46233f = new HashSet(fVarArr.length);
        this.f46234g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f46230c = null;
            this.f46228a = null;
            try {
                b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.f46229b = fileDescriptor;
                try {
                    fileDescriptor = b.a.b(fileDescriptor);
                    z12 = true;
                } catch (Exception e12) {
                    throw new IOException("Failed to duplicate file descriptor", e12);
                }
            } catch (Exception unused) {
                this.f46229b = null;
                z12 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    v(fileInputStream);
                    androidx.exifinterface.media.b.a(fileInputStream);
                    if (z12) {
                        try {
                            b.a.a(fileDescriptor);
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    androidx.exifinterface.media.b.a(fileInputStream);
                    if (z12) {
                        try {
                            b.a.a(fileDescriptor);
                        } catch (Exception unused3) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    public class C1787a extends MediaDataSource {

        /* renamed from: b, reason: collision with root package name */
        public long f46247b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f46248c;

        public C1787a(i iVar) {
            this.f46248c = iVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j12, byte[] bArr, int i12, int i13) throws IOException {
            if (i13 == 0) {
                return 0;
            }
            if (j12 < 0) {
                return -1;
            }
            try {
                long j13 = this.f46247b;
                i iVar = this.f46248c;
                if (j13 != j12) {
                    if (j13 >= 0 && j12 >= j13 + iVar.f46249b.available()) {
                        return -1;
                    }
                    iVar.b(j12);
                    this.f46247b = j12;
                }
                if (i13 > iVar.f46249b.available()) {
                    i13 = iVar.f46249b.available();
                }
                int i14 = iVar.read(bArr, i12, i13);
                if (i14 >= 0) {
                    this.f46247b += i14;
                    return i14;
                }
            } catch (IOException unused) {
            }
            this.f46247b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public a(@N InputStream inputStream) throws Throwable {
        f[][] fVarArr = f46209V;
        this.f46232e = new HashMap[fVarArr.length];
        this.f46233f = new HashSet(fVarArr.length);
        this.f46234g = ByteOrder.BIG_ENDIAN;
        this.f46228a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f46230c = (AssetManager.AssetInputStream) inputStream;
            this.f46229b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f46230c = null;
                this.f46229b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.f46230c = null;
            this.f46229b = null;
        }
        v(inputStream);
    }
}
