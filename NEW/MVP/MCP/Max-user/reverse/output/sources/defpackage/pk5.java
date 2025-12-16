package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class pk5 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final String[] P;
    public static final int[] Q;
    public static final byte[] R;
    public static final mk5 S;
    public static final mk5[][] T;
    public static final mk5[] U;
    public static final HashMap[] V;
    public static final HashMap[] W;
    public static final HashSet X;
    public static final HashMap Y;
    public static final Charset Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final Pattern c0;
    public static final Pattern d0;
    public static final Pattern e0;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final int[] u;
    public static final int[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        u = new int[]{8, 8, 8};
        v = new int[]{8};
        w = new byte[]{-1, -40, -1};
        x = new byte[]{102, 116, 121, 112};
        y = new byte[]{109, 105, 102, 49};
        z = new byte[]{104, 101, 105, 99};
        A = new byte[]{79, 76, 89, 77, 80, 0};
        B = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        C = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        D = new byte[]{101, 88, 73, 102};
        E = new byte[]{73, 72, 68, 82};
        F = new byte[]{73, 69, 78, 68};
        G = new byte[]{82, 73, 70, 70};
        H = new byte[]{87, 69, 66, 80};
        I = new byte[]{69, 88, 73, 70};
        J = new byte[]{-99, 1, 42};
        K = "VP8X".getBytes(Charset.defaultCharset());
        L = "VP8L".getBytes(Charset.defaultCharset());
        M = "VP8 ".getBytes(Charset.defaultCharset());
        N = "ANIM".getBytes(Charset.defaultCharset());
        O = "ANMF".getBytes(Charset.defaultCharset());
        P = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        Q = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        R = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        mk5[] mk5VarArr = {new mk5("NewSubfileType", 254, 4), new mk5("SubfileType", 255, 4), new mk5(256, "ImageWidth", 3, 4), new mk5(257, "ImageLength", 3, 4), new mk5("BitsPerSample", 258, 3), new mk5("Compression", 259, 3), new mk5("PhotometricInterpretation", 262, 3), new mk5("ImageDescription", 270, 2), new mk5("Make", 271, 2), new mk5("Model", 272, 2), new mk5(273, "StripOffsets", 3, 4), new mk5("Orientation", 274, 3), new mk5("SamplesPerPixel", 277, 3), new mk5(278, "RowsPerStrip", 3, 4), new mk5(279, "StripByteCounts", 3, 4), new mk5("XResolution", 282, 5), new mk5("YResolution", 283, 5), new mk5("PlanarConfiguration", 284, 3), new mk5("ResolutionUnit", 296, 3), new mk5("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3), new mk5("Software", HttpStatus.SC_USE_PROXY, 2), new mk5("DateTime", 306, 2), new mk5("Artist", 315, 2), new mk5("WhitePoint", 318, 5), new mk5("PrimaryChromaticities", 319, 5), new mk5("SubIFDPointer", 330, 4), new mk5("JPEGInterchangeFormat", 513, 4), new mk5("JPEGInterchangeFormatLength", 514, 4), new mk5("YCbCrCoefficients", 529, 5), new mk5("YCbCrSubSampling", 530, 3), new mk5("YCbCrPositioning", 531, 3), new mk5("ReferenceBlackWhite", 532, 5), new mk5("Copyright", 33432, 2), new mk5("ExifIFDPointer", 34665, 4), new mk5("GPSInfoIFDPointer", 34853, 4), new mk5("SensorTopBorder", 4, 4), new mk5("SensorLeftBorder", 5, 4), new mk5("SensorBottomBorder", 6, 4), new mk5("SensorRightBorder", 7, 4), new mk5("ISO", 23, 3), new mk5("JpgFromRaw", 46, 7), new mk5("Xmp", 700, 1)};
        mk5[] mk5VarArr2 = {new mk5("ExposureTime", 33434, 5), new mk5("FNumber", 33437, 5), new mk5("ExposureProgram", 34850, 3), new mk5("SpectralSensitivity", 34852, 2), new mk5("PhotographicSensitivity", 34855, 3), new mk5("OECF", 34856, 7), new mk5("SensitivityType", 34864, 3), new mk5("StandardOutputSensitivity", 34865, 4), new mk5("RecommendedExposureIndex", 34866, 4), new mk5("ISOSpeed", 34867, 4), new mk5("ISOSpeedLatitudeyyy", 34868, 4), new mk5("ISOSpeedLatitudezzz", 34869, 4), new mk5("ExifVersion", 36864, 2), new mk5("DateTimeOriginal", 36867, 2), new mk5("DateTimeDigitized", 36868, 2), new mk5("OffsetTime", 36880, 2), new mk5("OffsetTimeOriginal", 36881, 2), new mk5("OffsetTimeDigitized", 36882, 2), new mk5("ComponentsConfiguration", 37121, 7), new mk5("CompressedBitsPerPixel", 37122, 5), new mk5("ShutterSpeedValue", 37377, 10), new mk5("ApertureValue", 37378, 5), new mk5("BrightnessValue", 37379, 10), new mk5("ExposureBiasValue", 37380, 10), new mk5("MaxApertureValue", 37381, 5), new mk5("SubjectDistance", 37382, 5), new mk5("MeteringMode", 37383, 3), new mk5("LightSource", 37384, 3), new mk5("Flash", 37385, 3), new mk5("FocalLength", 37386, 5), new mk5("SubjectArea", 37396, 3), new mk5("MakerNote", 37500, 7), new mk5("UserComment", 37510, 7), new mk5("SubSecTime", 37520, 2), new mk5("SubSecTimeOriginal", 37521, 2), new mk5("SubSecTimeDigitized", 37522, 2), new mk5("FlashpixVersion", 40960, 7), new mk5("ColorSpace", 40961, 3), new mk5(40962, "PixelXDimension", 3, 4), new mk5(40963, "PixelYDimension", 3, 4), new mk5("RelatedSoundFile", 40964, 2), new mk5("InteroperabilityIFDPointer", 40965, 4), new mk5("FlashEnergy", 41483, 5), new mk5("SpatialFrequencyResponse", 41484, 7), new mk5("FocalPlaneXResolution", 41486, 5), new mk5("FocalPlaneYResolution", 41487, 5), new mk5("FocalPlaneResolutionUnit", 41488, 3), new mk5("SubjectLocation", 41492, 3), new mk5("ExposureIndex", 41493, 5), new mk5("SensingMethod", 41495, 3), new mk5("FileSource", 41728, 7), new mk5("SceneType", 41729, 7), new mk5("CFAPattern", 41730, 7), new mk5("CustomRendered", 41985, 3), new mk5("ExposureMode", 41986, 3), new mk5("WhiteBalance", 41987, 3), new mk5("DigitalZoomRatio", 41988, 5), new mk5("FocalLengthIn35mmFilm", 41989, 3), new mk5("SceneCaptureType", 41990, 3), new mk5("GainControl", 41991, 3), new mk5("Contrast", 41992, 3), new mk5("Saturation", 41993, 3), new mk5("Sharpness", 41994, 3), new mk5("DeviceSettingDescription", 41995, 7), new mk5("SubjectDistanceRange", 41996, 3), new mk5("ImageUniqueID", 42016, 2), new mk5("CameraOwnerName", 42032, 2), new mk5("BodySerialNumber", 42033, 2), new mk5("LensSpecification", 42034, 5), new mk5("LensMake", 42035, 2), new mk5("LensModel", 42036, 2), new mk5("Gamma", 42240, 5), new mk5("DNGVersion", 50706, 1), new mk5(50720, "DefaultCropSize", 3, 4)};
        mk5[] mk5VarArr3 = {new mk5("GPSVersionID", 0, 1), new mk5("GPSLatitudeRef", 1, 2), new mk5(2, "GPSLatitude", 5, 10), new mk5("GPSLongitudeRef", 3, 2), new mk5(4, "GPSLongitude", 5, 10), new mk5("GPSAltitudeRef", 5, 1), new mk5("GPSAltitude", 6, 5), new mk5("GPSTimeStamp", 7, 5), new mk5("GPSSatellites", 8, 2), new mk5("GPSStatus", 9, 2), new mk5("GPSMeasureMode", 10, 2), new mk5("GPSDOP", 11, 5), new mk5("GPSSpeedRef", 12, 2), new mk5("GPSSpeed", 13, 5), new mk5("GPSTrackRef", 14, 2), new mk5("GPSTrack", 15, 5), new mk5("GPSImgDirectionRef", 16, 2), new mk5("GPSImgDirection", 17, 5), new mk5("GPSMapDatum", 18, 2), new mk5("GPSDestLatitudeRef", 19, 2), new mk5("GPSDestLatitude", 20, 5), new mk5("GPSDestLongitudeRef", 21, 2), new mk5("GPSDestLongitude", 22, 5), new mk5("GPSDestBearingRef", 23, 2), new mk5("GPSDestBearing", 24, 5), new mk5("GPSDestDistanceRef", 25, 2), new mk5("GPSDestDistance", 26, 5), new mk5("GPSProcessingMethod", 27, 7), new mk5("GPSAreaInformation", 28, 7), new mk5("GPSDateStamp", 29, 2), new mk5("GPSDifferential", 30, 3), new mk5("GPSHPositioningError", 31, 5)};
        mk5[] mk5VarArr4 = {new mk5("InteroperabilityIndex", 1, 2)};
        mk5[] mk5VarArr5 = {new mk5("NewSubfileType", 254, 4), new mk5("SubfileType", 255, 4), new mk5(256, "ThumbnailImageWidth", 3, 4), new mk5(257, "ThumbnailImageLength", 3, 4), new mk5("BitsPerSample", 258, 3), new mk5("Compression", 259, 3), new mk5("PhotometricInterpretation", 262, 3), new mk5("ImageDescription", 270, 2), new mk5("Make", 271, 2), new mk5("Model", 272, 2), new mk5(273, "StripOffsets", 3, 4), new mk5("ThumbnailOrientation", 274, 3), new mk5("SamplesPerPixel", 277, 3), new mk5(278, "RowsPerStrip", 3, 4), new mk5(279, "StripByteCounts", 3, 4), new mk5("XResolution", 282, 5), new mk5("YResolution", 283, 5), new mk5("PlanarConfiguration", 284, 3), new mk5("ResolutionUnit", 296, 3), new mk5("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3), new mk5("Software", HttpStatus.SC_USE_PROXY, 2), new mk5("DateTime", 306, 2), new mk5("Artist", 315, 2), new mk5("WhitePoint", 318, 5), new mk5("PrimaryChromaticities", 319, 5), new mk5("SubIFDPointer", 330, 4), new mk5("JPEGInterchangeFormat", 513, 4), new mk5("JPEGInterchangeFormatLength", 514, 4), new mk5("YCbCrCoefficients", 529, 5), new mk5("YCbCrSubSampling", 530, 3), new mk5("YCbCrPositioning", 531, 3), new mk5("ReferenceBlackWhite", 532, 5), new mk5("Copyright", 33432, 2), new mk5("ExifIFDPointer", 34665, 4), new mk5("GPSInfoIFDPointer", 34853, 4), new mk5("DNGVersion", 50706, 1), new mk5(50720, "DefaultCropSize", 3, 4)};
        S = new mk5("StripOffsets", 273, 3);
        T = new mk5[][]{mk5VarArr, mk5VarArr2, mk5VarArr3, mk5VarArr4, mk5VarArr5, mk5VarArr, new mk5[]{new mk5("ThumbnailImage", 256, 7), new mk5("CameraSettingsIFDPointer", 8224, 4), new mk5("ImageProcessingIFDPointer", 8256, 4)}, new mk5[]{new mk5("PreviewImageStart", 257, 4), new mk5("PreviewImageLength", 258, 4)}, new mk5[]{new mk5("AspectFrame", 4371, 3)}, new mk5[]{new mk5("ColorSpace", 55, 3)}};
        U = new mk5[]{new mk5("SubIFDPointer", 330, 4), new mk5("ExifIFDPointer", 34665, 4), new mk5("GPSInfoIFDPointer", 34853, 4), new mk5("InteroperabilityIFDPointer", 40965, 4), new mk5("CameraSettingsIFDPointer", 8224, 1), new mk5("ImageProcessingIFDPointer", 8256, 1)};
        V = new HashMap[10];
        W = new HashMap[10];
        X = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        Y = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        Z = charsetForName;
        a0 = "Exif\u0000\u0000".getBytes(charsetForName);
        b0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            mk5[][] mk5VarArr6 = T;
            if (i >= mk5VarArr6.length) {
                HashMap map = Y;
                mk5[] mk5VarArr7 = U;
                map.put(Integer.valueOf(mk5VarArr7[0].a), 5);
                map.put(Integer.valueOf(mk5VarArr7[1].a), 1);
                map.put(Integer.valueOf(mk5VarArr7[2].a), 2);
                map.put(Integer.valueOf(mk5VarArr7[3].a), 3);
                map.put(Integer.valueOf(mk5VarArr7[4].a), 7);
                map.put(Integer.valueOf(mk5VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                c0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                d0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                e0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            V[i] = new HashMap();
            W[i] = new HashMap();
            for (mk5 mk5Var : mk5VarArr6[i]) {
                V[i].put(Integer.valueOf(mk5Var.a), mk5Var);
                W[i].put(mk5Var.b, mk5Var);
            }
            i++;
        }
    }

    public pk5(String str) throws Throwable {
        mk5[][] mk5VarArr = T;
        this.e = new HashMap[mk5VarArr.length];
        this.f = new HashSet(mk5VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (s(fileInputStream2.getFD())) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                u(fileInputStream2);
                zaj.c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                zaj.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(kk5 kk5Var, qx0 qx0Var, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (kk5Var.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = Z;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = kk5Var.readInt();
            qx0Var.write(bArr3);
            qx0Var.d(i);
            if (i % 2 == 1) {
                i++;
            }
            zaj.e(kk5Var, qx0Var, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair q(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairQ2 = q(strArrSplit[i]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean s(FileDescriptor fileDescriptor) {
        try {
            qk5.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!t) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static ByteOrder x(kk5 kk5Var) throws IOException {
        short s = kk5Var.readShort();
        boolean z2 = t;
        if (s == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void A(String str) {
        for (int i = 0; i < T.length; i++) {
            this.e[i].remove(str);
        }
    }

    public final void B(int i, String str, String str2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        kk5 kk5Var = new kk5(bufferedInputStream);
        qx0 qx0Var = new qx0(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (kk5Var.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        qx0Var.c(-1);
        if (kk5Var.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        qx0Var.c(-40);
        String strD = d("Xmp");
        HashMap[] mapArr = this.e;
        lk5 lk5Var = (strD == null || !this.s) ? null : (lk5) mapArr[0].remove("Xmp");
        qx0Var.c(-1);
        qx0Var.c(-31);
        K(qx0Var);
        if (lk5Var != null) {
            mapArr[0].put("Xmp", lk5Var);
        }
        byte[] bArr = new byte[4096];
        while (kk5Var.readByte() == -1) {
            byte b = kk5Var.readByte();
            if (b == -39 || b == -38) {
                qx0Var.c(-1);
                qx0Var.c(b);
                zaj.f(kk5Var, qx0Var);
                return;
            }
            if (b != -31) {
                qx0Var.c(-1);
                qx0Var.c(b);
                int unsignedShort = kk5Var.readUnsignedShort();
                qx0Var.i((short) unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = kk5Var.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        qx0Var.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = kk5Var.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (kk5Var.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, a0)) {
                        kk5Var.c(unsignedShort2 - 8);
                    }
                }
                qx0Var.c(-1);
                qx0Var.c(b);
                qx0Var.i((short) unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    qx0Var.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = kk5Var.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        qx0Var.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        kk5 kk5Var = new kk5(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        qx0 qx0Var = new qx0(bufferedOutputStream, byteOrder);
        zaj.e(kk5Var, qx0Var, C.length);
        if (this.o == 0) {
            int i = kk5Var.readInt();
            qx0Var.d(i);
            zaj.e(kk5Var, qx0Var, i + 8);
        } else {
            zaj.e(kk5Var, qx0Var, (r2 - r7.length) - 8);
            kk5Var.c(kk5Var.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                qx0 qx0Var2 = new qx0(byteArrayOutputStream2, byteOrder);
                K(qx0Var2);
                byte[] byteArray = ((ByteArrayOutputStream) qx0Var2.b).toByteArray();
                qx0Var.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                qx0Var.d((int) crc32.getValue());
                zaj.c(byteArrayOutputStream2);
                zaj.f(kk5Var, qx0Var);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                zaj.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r17;
        qx0 qx0Var;
        if (t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        kk5 kk5Var = new kk5(bufferedInputStream, byteOrder);
        qx0 qx0Var2 = new qx0(bufferedOutputStream, byteOrder);
        byte[] bArr = G;
        zaj.e(kk5Var, qx0Var2, bArr.length);
        byte[] bArr2 = H;
        kk5Var.c(bArr2.length + 4);
        kk5 kk5Var2 = null;
        try {
            try {
                ?? byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    qx0 qx0Var3 = new qx0(byteArrayOutputStream, byteOrder);
                    int i6 = this.o;
                    try {
                        try {
                            if (i6 != 0) {
                                zaj.e(kk5Var, qx0Var3, (i6 - ((bArr.length + 4) + bArr2.length)) - 8);
                                kk5Var.c(4);
                                int i7 = kk5Var.readInt();
                                if (i7 % 2 != 0) {
                                    i7++;
                                }
                                kk5Var.c(i7);
                                K(qx0Var3);
                            } else {
                                byte[] bArr3 = new byte[4];
                                if (kk5Var.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = K;
                                boolean zEquals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = M;
                                byte[] bArr6 = L;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                        int i8 = kk5Var.readInt();
                                        int i9 = i8 % 2 == 1 ? i8 + 1 : i8;
                                        byte[] bArr7 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr3, bArr5);
                                        boolean z2 = true;
                                        byte[] bArr8 = J;
                                        if (zEquals2) {
                                            kk5Var.read(bArr7);
                                            byte[] bArr9 = new byte[3];
                                            int i10 = i9;
                                            if (kk5Var.read(bArr9) != 3 || !Arrays.equals(bArr8, bArr9)) {
                                                throw new IOException("Encountered error while checking VP8 signature");
                                            }
                                            i2 = kk5Var.readInt();
                                            i3 = (i2 << 18) >> 18;
                                            i = i10 - 10;
                                            i4 = (i2 << 2) >> 18;
                                            z2 = false;
                                        } else {
                                            int i11 = i9;
                                            if (!Arrays.equals(bArr3, bArr6)) {
                                                i = i11;
                                                i2 = 0;
                                                i3 = 0;
                                                i4 = 0;
                                                z2 = false;
                                            } else {
                                                if (kk5Var.readByte() != 47) {
                                                    throw new IOException("Encountered error while checking VP8L signature");
                                                }
                                                i2 = kk5Var.readInt();
                                                int i12 = (i2 & 16383) + 1;
                                                int i13 = ((268419072 & i2) >>> 14) + 1;
                                                if ((i2 & 268435456) == 0) {
                                                    z2 = false;
                                                }
                                                i3 = i12;
                                                i = i11 - 5;
                                                i4 = i13;
                                            }
                                        }
                                        qx0Var3.write(bArr4);
                                        qx0Var3.d(10);
                                        byte[] bArr10 = new byte[10];
                                        if (z2) {
                                            i5 = i3;
                                            bArr10[0] = (byte) (bArr10[0] | 16);
                                        } else {
                                            i5 = i3;
                                        }
                                        bArr10[0] = (byte) (bArr10[0] | 8);
                                        int i14 = i5 - 1;
                                        r17 = byteArrayOutputStream;
                                        int i15 = i4 - 1;
                                        qx0Var = qx0Var2;
                                        try {
                                            bArr10[4] = (byte) i14;
                                            bArr10[5] = (byte) (i14 >> 8);
                                            bArr10[6] = (byte) (i14 >> 16);
                                            bArr10[7] = (byte) i15;
                                            bArr10[8] = (byte) (i15 >> 8);
                                            bArr10[9] = (byte) (i15 >> 16);
                                            qx0Var3.write(bArr10);
                                            qx0Var3.write(bArr3);
                                            qx0Var3.d(i8);
                                        } catch (Exception e) {
                                            e = e;
                                            kk5Var = r17;
                                            kk5Var2 = kk5Var;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            kk5Var = r17;
                                            kk5Var2 = kk5Var;
                                            zaj.c(kk5Var2);
                                            throw th;
                                        }
                                        try {
                                            if (Arrays.equals(bArr3, bArr5)) {
                                                qx0Var3.write(bArr7);
                                                qx0Var3.write(bArr8);
                                                qx0Var3.d(i2);
                                            } else {
                                                if (Arrays.equals(bArr3, bArr6)) {
                                                    qx0Var3.write(47);
                                                    qx0Var3.d(i2);
                                                }
                                                zaj.e(kk5Var, qx0Var3, i);
                                                K(qx0Var3);
                                                r17 = r17;
                                            }
                                            zaj.e(kk5Var, qx0Var3, i);
                                            K(qx0Var3);
                                            r17 = r17;
                                        } catch (Exception e2) {
                                            e = e2;
                                            kk5Var2 = r17;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            kk5Var2 = r17;
                                            zaj.c(kk5Var2);
                                            throw th;
                                        }
                                    }
                                    zaj.f(kk5Var, qx0Var3);
                                    qx0 qx0Var4 = qx0Var;
                                    qx0Var4.d(r17.size() + bArr2.length);
                                    qx0Var4.write(bArr2);
                                    ByteArrayOutputStream byteArrayOutputStream2 = r17;
                                    byteArrayOutputStream2.writeTo(qx0Var4);
                                    zaj.c(byteArrayOutputStream2);
                                }
                                int i16 = kk5Var.readInt();
                                byte[] bArr11 = new byte[i16 % 2 == 1 ? i16 + 1 : i16];
                                kk5Var.read(bArr11);
                                byte b = (byte) (bArr11[0] | 8);
                                bArr11[0] = b;
                                boolean z3 = ((b >> 1) & 1) == 1;
                                qx0Var3.write(bArr4);
                                qx0Var3.d(i16);
                                qx0Var3.write(bArr11);
                                if (z3) {
                                    c(kk5Var, qx0Var3, N, null);
                                    while (true) {
                                        byte[] bArr12 = new byte[4];
                                        bufferedInputStream.read(bArr12);
                                        if (!Arrays.equals(bArr12, O)) {
                                            break;
                                        }
                                        int i17 = kk5Var.readInt();
                                        qx0Var3.write(bArr12);
                                        qx0Var3.d(i17);
                                        if (i17 % 2 == 1) {
                                            i17++;
                                        }
                                        zaj.e(kk5Var, qx0Var3, i17);
                                    }
                                    K(qx0Var3);
                                } else {
                                    c(kk5Var, qx0Var3, bArr5, bArr6);
                                    K(qx0Var3);
                                }
                            }
                            qx0Var = qx0Var2;
                            r17 = byteArrayOutputStream;
                            zaj.f(kk5Var, qx0Var3);
                            qx0 qx0Var42 = qx0Var;
                            qx0Var42.d(r17.size() + bArr2.length);
                            qx0Var42.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream22 = r17;
                            byteArrayOutputStream22.writeTo(qx0Var42);
                            zaj.c(byteArrayOutputStream22);
                        } catch (Exception e3) {
                            e = e3;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        kk5Var2 = byteArrayOutputStream;
                    } catch (Throwable th4) {
                        th = th4;
                        kk5Var2 = byteArrayOutputStream;
                    }
                } catch (Exception e5) {
                    e = e5;
                    kk5Var = byteArrayOutputStream;
                } catch (Throwable th5) {
                    th = th5;
                    kk5Var = byteArrayOutputStream;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.lang.String r22, java.lang.String r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.F(java.lang.String, java.lang.String):void");
    }

    public final void G(kk5 kk5Var) throws IOException {
        lk5 lk5Var;
        int iH;
        HashMap map = this.e[4];
        lk5 lk5Var2 = (lk5) map.get("Compression");
        if (lk5Var2 == null) {
            this.n = 6;
            r(kk5Var, map);
            return;
        }
        int iH2 = lk5Var2.h(this.g);
        this.n = iH2;
        if (iH2 != 1) {
            if (iH2 == 6) {
                r(kk5Var, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        lk5 lk5Var3 = (lk5) map.get("BitsPerSample");
        if (lk5Var3 != null) {
            int[] iArr = (int[]) lk5Var3.j(this.g);
            int[] iArr2 = u;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (lk5Var = (lk5) map.get("PhotometricInterpretation")) != null && (((iH = lk5Var.h(this.g)) == 1 && Arrays.equals(iArr, v)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                lk5 lk5Var4 = (lk5) map.get("StripOffsets");
                lk5 lk5Var5 = (lk5) map.get("StripByteCounts");
                if (lk5Var4 == null || lk5Var5 == null) {
                    return;
                }
                long[] jArrD = zaj.d(lk5Var4.j(this.g));
                long[] jArrD2 = zaj.d(lk5Var5.j(this.g));
                if (jArrD == null || jArrD.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrD2 == null || jArrD2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrD.length != jArrD2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrD2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.j = true;
                this.i = true;
                this.h = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < jArrD.length; i4++) {
                    int i5 = (int) jArrD[i4];
                    int i6 = (int) jArrD2[i4];
                    if (i4 < jArrD.length - 1 && i5 + i6 != jArrD[i4 + 1]) {
                        this.j = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i7;
                    if (kk5Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (kk5Var.read(bArr2) != i6) {
                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                        return;
                    }
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.m = bArr;
                if (this.j) {
                    this.k = (int) jArrD[0];
                    this.l = i;
                    return;
                }
                return;
            }
        }
        if (t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void H(int i, int i2) {
        HashMap[] mapArr = this.e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = t;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        lk5 lk5Var = (lk5) mapArr[i].get("ImageLength");
        lk5 lk5Var2 = (lk5) mapArr[i].get("ImageWidth");
        lk5 lk5Var3 = (lk5) mapArr[i2].get("ImageLength");
        lk5 lk5Var4 = (lk5) mapArr[i2].get("ImageWidth");
        if (lk5Var == null || lk5Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (lk5Var3 == null || lk5Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = lk5Var.h(this.g);
        int iH2 = lk5Var2.h(this.g);
        int iH3 = lk5Var3.h(this.g);
        int iH4 = lk5Var4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void I(ok5 ok5Var, int i) throws IOException {
        lk5 lk5VarE;
        lk5 lk5VarE2;
        HashMap[] mapArr = this.e;
        lk5 lk5Var = (lk5) mapArr[i].get("DefaultCropSize");
        lk5 lk5Var2 = (lk5) mapArr[i].get("SensorTopBorder");
        lk5 lk5Var3 = (lk5) mapArr[i].get("SensorLeftBorder");
        lk5 lk5Var4 = (lk5) mapArr[i].get("SensorBottomBorder");
        lk5 lk5Var5 = (lk5) mapArr[i].get("SensorRightBorder");
        if (lk5Var != null) {
            if (lk5Var.a == 5) {
                nk5[] nk5VarArr = (nk5[]) lk5Var.j(this.g);
                if (nk5VarArr == null || nk5VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(nk5VarArr));
                    return;
                } else {
                    lk5VarE = lk5.d(new nk5[]{nk5VarArr[0]}, this.g);
                    lk5VarE2 = lk5.d(new nk5[]{nk5VarArr[1]}, this.g);
                }
            } else {
                int[] iArr = (int[]) lk5Var.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                lk5VarE = lk5.e(iArr[0], this.g);
                lk5VarE2 = lk5.e(iArr[1], this.g);
            }
            mapArr[i].put("ImageWidth", lk5VarE);
            mapArr[i].put("ImageLength", lk5VarE2);
            return;
        }
        if (lk5Var2 != null && lk5Var3 != null && lk5Var4 != null && lk5Var5 != null) {
            int iH = lk5Var2.h(this.g);
            int iH2 = lk5Var4.h(this.g);
            int iH3 = lk5Var5.h(this.g);
            int iH4 = lk5Var3.h(this.g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            lk5 lk5VarE3 = lk5.e(iH2 - iH, this.g);
            lk5 lk5VarE4 = lk5.e(iH3 - iH4, this.g);
            mapArr[i].put("ImageLength", lk5VarE3);
            mapArr[i].put("ImageWidth", lk5VarE4);
            return;
        }
        lk5 lk5Var6 = (lk5) mapArr[i].get("ImageLength");
        lk5 lk5Var7 = (lk5) mapArr[i].get("ImageWidth");
        if (lk5Var6 == null || lk5Var7 == null) {
            lk5 lk5Var8 = (lk5) mapArr[i].get("JPEGInterchangeFormat");
            lk5 lk5Var9 = (lk5) mapArr[i].get("JPEGInterchangeFormatLength");
            if (lk5Var8 == null || lk5Var9 == null) {
                return;
            }
            int iH5 = lk5Var8.h(this.g);
            int iH6 = lk5Var8.h(this.g);
            ok5Var.d(iH5);
            byte[] bArr = new byte[iH6];
            ok5Var.read(bArr);
            h(new kk5(bArr), iH5, i);
        }
    }

    public final void J() {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.e;
        lk5 lk5Var = (lk5) mapArr[1].get("PixelXDimension");
        lk5 lk5Var2 = (lk5) mapArr[1].get("PixelYDimension");
        if (lk5Var != null && lk5Var2 != null) {
            mapArr[0].put("ImageWidth", lk5Var);
            mapArr[0].put("ImageLength", lk5Var2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!t(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(qx0 qx0Var) throws IOException {
        HashMap[] mapArr;
        char c;
        char c2;
        int i;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        mk5[][] mk5VarArr = T;
        int[] iArr4 = new int[mk5VarArr.length];
        int[] iArr5 = new int[mk5VarArr.length];
        mk5[] mk5VarArr2 = U;
        for (mk5 mk5Var : mk5VarArr2) {
            A(mk5Var.b);
        }
        if (this.h) {
            if (this.i) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = mk5VarArr.length;
            mapArr = this.e;
            if (i2 >= length) {
                break;
            }
            Object[] array = mapArr[i2].entrySet().toArray();
            int length2 = array.length;
            int i3 = 0;
            while (i3 < length2) {
                Map.Entry entry = (Map.Entry) array[i3];
                if (entry.getValue() == null) {
                    iArr3 = iArr4;
                    mapArr[i2].remove(entry.getKey());
                } else {
                    iArr3 = iArr4;
                }
                i3++;
                iArr4 = iArr3;
            }
            i2++;
        }
        int[] iArr6 = iArr4;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(mk5VarArr2[1].b, lk5.b(0L, this.g));
        }
        if (mapArr[2].isEmpty()) {
            c = 2;
        } else {
            c = 2;
            mapArr[0].put(mk5VarArr2[2].b, lk5.b(0L, this.g));
        }
        if (mapArr[3].isEmpty()) {
            c2 = 3;
        } else {
            c2 = 3;
            mapArr[1].put(mk5VarArr2[3].b, lk5.b(0L, this.g));
        }
        if (!this.h) {
            i = 1;
            iArr = iArr5;
        } else if (this.i) {
            mapArr[4].put("StripOffsets", lk5.e(0, this.g));
            mapArr[4].put("StripByteCounts", lk5.e(this.l, this.g));
            i = 1;
            iArr = iArr5;
        } else {
            mapArr[4].put("JPEGInterchangeFormat", lk5.b(0L, this.g));
            i = 1;
            iArr = iArr5;
            mapArr[4].put("JPEGInterchangeFormatLength", lk5.b(this.l, this.g));
        }
        int i4 = 0;
        while (true) {
            int length3 = mk5VarArr.length;
            iArr2 = Q;
            if (i4 >= length3) {
                break;
            }
            Iterator it = mapArr[i4].entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                lk5 lk5Var = (lk5) ((Map.Entry) it.next()).getValue();
                lk5Var.getClass();
                int i6 = iArr2[lk5Var.a] * lk5Var.b;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr[i4] = iArr[i4] + i5;
            i4++;
        }
        int size = 8;
        for (int i7 = 0; i7 < mk5VarArr.length; i7++) {
            if (!mapArr[i7].isEmpty()) {
                iArr6[i7] = size;
                size = (mapArr[i7].size() * 12) + 6 + iArr[i7] + size;
            }
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", lk5.e(size, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", lk5.b(size, this.g));
            }
            this.k = size;
            size += this.l;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (t) {
            for (int i8 = 0; i8 < mk5VarArr.length; i8++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i8), Integer.valueOf(iArr6[i8]), Integer.valueOf(mapArr[i8].size()), Integer.valueOf(iArr[i8]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(mk5VarArr2[i].b, lk5.b(iArr6[i], this.g));
        }
        if (!mapArr[c].isEmpty()) {
            mapArr[0].put(mk5VarArr2[c].b, lk5.b(iArr6[c], this.g));
        }
        if (!mapArr[c2].isEmpty()) {
            mapArr[i].put(mk5VarArr2[c2].b, lk5.b(iArr6[c2], this.g));
        }
        int i9 = this.d;
        if (i9 == 4) {
            qx0Var.i((short) size);
            qx0Var.write(a0);
        } else if (i9 == 13) {
            qx0Var.d(size);
            qx0Var.write(D);
        } else if (i9 == 14) {
            qx0Var.write(I);
            qx0Var.d(size);
        }
        qx0Var.i(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        qx0Var.c = this.g;
        qx0Var.i((short) 42);
        qx0Var.d((int) 8);
        for (int i10 = 0; i10 < mk5VarArr.length; i10++) {
            if (!mapArr[i10].isEmpty()) {
                qx0Var.i((short) mapArr[i10].size());
                int size2 = (mapArr[i10].size() * 12) + iArr6[i10] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i10].entrySet()) {
                    int i11 = ((mk5) W[i10].get(entry2.getKey())).a;
                    lk5 lk5Var2 = (lk5) entry2.getValue();
                    lk5Var2.getClass();
                    int i12 = lk5Var2.b;
                    int i13 = lk5Var2.a;
                    int i14 = iArr2[i13] * i12;
                    qx0Var.i((short) i11);
                    qx0Var.i((short) i13);
                    qx0Var.d(i12);
                    if (i14 > 4) {
                        qx0Var.d(size2);
                        size2 += i14;
                    } else {
                        qx0Var.write(lk5Var2.d);
                        if (i14 < 4) {
                            while (i14 < 4) {
                                qx0Var.c(0);
                                i14++;
                            }
                        }
                    }
                }
                if (i10 != 0 || mapArr[4].isEmpty()) {
                    qx0Var.d((int) 0);
                } else {
                    qx0Var.d(iArr6[4]);
                }
                Iterator it2 = mapArr[i10].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((lk5) ((Map.Entry) it2.next()).getValue()).d;
                    if (bArr.length > 4) {
                        qx0Var.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            qx0Var.write(o());
        }
        if (this.d == 14 && size % 2 == i) {
            qx0Var.c(0);
        }
        qx0Var.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strD = d("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strD != null && d("DateTime") == null) {
            mapArr[0].put("DateTime", lk5.a(strD));
        }
        if (d("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", lk5.b(0L, this.g));
        }
        if (d("ImageLength") == null) {
            mapArr[0].put("ImageLength", lk5.b(0L, this.g));
        }
        if (d("Orientation") == null) {
            mapArr[0].put("Orientation", lk5.b(0L, this.g));
        }
        if (d("LightSource") == null) {
            mapArr[1].put("LightSource", lk5.b(0L, this.g));
        }
    }

    public final String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        lk5 lk5VarF = f(str);
        if (lk5VarF != null) {
            int i = lk5VarF.a;
            if (!X.contains(str)) {
                return lk5VarF.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                nk5[] nk5VarArr = (nk5[]) lk5VarF.j(this.g);
                if (nk5VarArr == null || nk5VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(nk5VarArr));
                    return null;
                }
                nk5 nk5Var = nk5VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (nk5Var.a / nk5Var.b));
                nk5 nk5Var2 = nk5VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (nk5Var2.a / nk5Var2.b));
                nk5 nk5Var3 = nk5VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (nk5Var3.a / nk5Var3.b)));
            }
            try {
                return Double.toString(lk5VarF.g(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int e(int i, String str) {
        lk5 lk5VarF = f(str);
        if (lk5VarF == null) {
            return i;
        }
        try {
            return lk5VarF.h(this.g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final lk5 f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < T.length; i++) {
            lk5 lk5Var = (lk5) this.e[i].get(str);
            if (lk5Var != null) {
                return lk5Var;
            }
        }
        return null;
    }

    public final void g(ok5 ok5Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                rk5.a(mediaMetadataRetriever, new jk5(ok5Var));
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
                HashMap[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", lk5.e(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", lk5.e(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", lk5.e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    ok5Var.d(i2);
                    byte[] bArr = new byte[6];
                    if (ok5Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, a0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (ok5Var.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.o = i4;
                    y(0, bArr2);
                }
                if (t) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x019b, code lost:
    
        r24.b = r23.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.kk5 r24, int r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.h(kk5, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:167|12|158|13|150|14|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|162|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:156|90|154|91|92|(1:94)(1:95)|96|(1:110)(3:112|(2:113|(2:115|(2:169|117)(1:118))(2:168|119))|(1:121)(4:123|(2:124|(2:126|(1:171)(1:129))(3:170|130|(2:131|(1:172)(2:133|(1:173)(1:136)))))|128|(1:138)(1:140)))))|16|162|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0101, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.i(java.io.BufferedInputStream):int");
    }

    public final void j(ok5 ok5Var) throws IOException {
        int i;
        int i2;
        m(ok5Var);
        HashMap[] mapArr = this.e;
        lk5 lk5Var = (lk5) mapArr[1].get("MakerNote");
        if (lk5Var != null) {
            ok5 ok5Var2 = new ok5(lk5Var.d);
            ok5Var2.b = this.g;
            byte[] bArr = A;
            byte[] bArr2 = new byte[bArr.length];
            ok5Var2.readFully(bArr2);
            ok5Var2.d(0L);
            byte[] bArr3 = B;
            byte[] bArr4 = new byte[bArr3.length];
            ok5Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                ok5Var2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                ok5Var2.d(12L);
            }
            z(ok5Var2, 6);
            lk5 lk5Var2 = (lk5) mapArr[7].get("PreviewImageStart");
            lk5 lk5Var3 = (lk5) mapArr[7].get("PreviewImageLength");
            if (lk5Var2 != null && lk5Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", lk5Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", lk5Var3);
            }
            lk5 lk5Var4 = (lk5) mapArr[8].get("AspectFrame");
            if (lk5Var4 != null) {
                int[] iArr = (int[]) lk5Var4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                lk5 lk5VarE = lk5.e(i5, this.g);
                lk5 lk5VarE2 = lk5.e(i6, this.g);
                mapArr[0].put("ImageWidth", lk5VarE);
                mapArr[0].put("ImageLength", lk5VarE2);
            }
        }
    }

    public final void k(kk5 kk5Var) throws IOException {
        if (t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + kk5Var);
        }
        kk5Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = C;
        kk5Var.c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = kk5Var.readInt();
                byte[] bArr2 = new byte[4];
                if (kk5Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, E)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, F)) {
                    return;
                }
                if (Arrays.equals(bArr2, D)) {
                    byte[] bArr3 = new byte[i];
                    if (kk5Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + zaj.a(bArr2));
                    }
                    int i3 = kk5Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.o = i2;
                        y(0, bArr3);
                        J();
                        G(new kk5(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                kk5Var.c(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(kk5 kk5Var) throws IOException {
        boolean z2 = t;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + kk5Var);
        }
        kk5Var.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        kk5Var.read(bArr);
        kk5Var.read(bArr2);
        kk5Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        kk5Var.c(i - kk5Var.c);
        kk5Var.read(bArr4);
        h(new kk5(bArr4), i, 5);
        kk5Var.c(i3 - kk5Var.c);
        kk5Var.b = ByteOrder.BIG_ENDIAN;
        int i4 = kk5Var.readInt();
        if (z2) {
            u45.o(i4, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = kk5Var.readUnsignedShort();
            int unsignedShort2 = kk5Var.readUnsignedShort();
            if (unsignedShort == S.a) {
                short s = kk5Var.readShort();
                short s2 = kk5Var.readShort();
                lk5 lk5VarE = lk5.e(s, this.g);
                lk5 lk5VarE2 = lk5.e(s2, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", lk5VarE);
                mapArr[0].put("ImageWidth", lk5VarE2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            kk5Var.c(unsignedShort2);
        }
    }

    public final void m(ok5 ok5Var) throws IOException {
        v(ok5Var);
        z(ok5Var, 0);
        I(ok5Var, 0);
        I(ok5Var, 5);
        I(ok5Var, 4);
        J();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            lk5 lk5Var = (lk5) mapArr[1].get("MakerNote");
            if (lk5Var != null) {
                ok5 ok5Var2 = new ok5(lk5Var.d);
                ok5Var2.b = this.g;
                ok5Var2.c(6);
                z(ok5Var2, 9);
                lk5 lk5Var2 = (lk5) mapArr[9].get("ColorSpace");
                if (lk5Var2 != null) {
                    mapArr[1].put("ColorSpace", lk5Var2);
                }
            }
        }
    }

    public final void n(ok5 ok5Var) throws IOException {
        if (t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + ok5Var);
        }
        m(ok5Var);
        HashMap[] mapArr = this.e;
        lk5 lk5Var = (lk5) mapArr[0].get("JpgFromRaw");
        if (lk5Var != null) {
            h(new kk5(lk5Var.d), (int) lk5Var.c, 5);
        }
        lk5 lk5Var2 = (lk5) mapArr[0].get("ISO");
        lk5 lk5Var3 = (lk5) mapArr[1].get("PhotographicSensitivity");
        if (lk5Var2 == null || lk5Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", lk5Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x0087, Exception -> 0x0089, TRY_ENTER, TryCatch #3 {Exception -> 0x0089, blocks: (B:32:0x005a, B:35:0x0070, B:37:0x007c, B:46:0x008b, B:47:0x0090, B:48:0x0091, B:49:0x0096), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091 A[Catch: all -> 0x0087, Exception -> 0x0089, TryCatch #3 {Exception -> 0x0089, blocks: (B:32:0x005a, B:35:0x0070, B:37:0x007c, B:46:0x008b, B:47:0x0090, B:48:0x0091, B:49:0x0096), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] o() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.h
            r2 = 0
            if (r1 != 0) goto L9
            goto Lab
        L9:
            byte[] r1 = r9.m
            if (r1 == 0) goto Le
            return r1
        Le:
            android.content.res.AssetManager$AssetInputStream r1 = r9.c     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            if (r1 == 0) goto L30
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            if (r3 == 0) goto L27
            r1.reset()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
        L1b:
            r3 = r2
            goto L5a
        L1d:
            r0 = move-exception
            r3 = r2
        L1f:
            r2 = r1
            goto Lac
        L22:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L9e
        L27:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            defpackage.zaj.c(r1)
            return r2
        L30:
            java.lang.String r1 = r9.a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            if (r1 == 0) goto L45
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            java.lang.String r3 = r9.a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            goto L1b
        L3c:
            r0 = move-exception
            r3 = r2
            goto Lac
        L40:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L9e
        L45:
            java.io.FileDescriptor r1 = r9.b     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            java.io.FileDescriptor r1 = defpackage.qk5.b(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r4 = 0
            defpackage.qk5.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r8 = r3
            r3 = r1
            r1 = r8
        L5a:
            int r4 = r9.k     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r5 = r9.o     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            long r4 = r1.skip(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r9.k     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r7 = r9.o     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L91
            int r4 = r9.l     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r1.read(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r7 = r9.l     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            if (r6 != r7) goto L8b
            r9.m = r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            defpackage.zaj.c(r1)
            if (r3 == 0) goto L86
            defpackage.zaj.b(r3)
        L86:
            return r4
        L87:
            r0 = move-exception
            goto L1f
        L89:
            r4 = move-exception
            goto L9e
        L8b:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            throw r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
        L91:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            throw r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
        L97:
            r0 = move-exception
            r3 = r1
            goto Lac
        L9a:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L9e:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L87
            defpackage.zaj.c(r1)
            if (r3 == 0) goto Lab
            defpackage.zaj.b(r3)
        Lab:
            return r2
        Lac:
            defpackage.zaj.c(r2)
            if (r3 == 0) goto Lb4
            defpackage.zaj.b(r3)
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.o():byte[]");
    }

    public final void p(kk5 kk5Var) throws IOException {
        if (t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + kk5Var);
        }
        kk5Var.b = ByteOrder.LITTLE_ENDIAN;
        kk5Var.c(G.length);
        int i = kk5Var.readInt() + 8;
        byte[] bArr = H;
        kk5Var.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (kk5Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = kk5Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(I, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (kk5Var.read(bArr3) == i2) {
                        this.o = i3;
                        y(0, bArr3);
                        G(new kk5(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + zaj.a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                kk5Var.c(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(kk5 kk5Var, HashMap map) throws IOException {
        lk5 lk5Var = (lk5) map.get("JPEGInterchangeFormat");
        lk5 lk5Var2 = (lk5) map.get("JPEGInterchangeFormatLength");
        if (lk5Var == null || lk5Var2 == null) {
            return;
        }
        int iH = lk5Var.h(this.g);
        int iH2 = lk5Var2.h(this.g);
        if (this.d == 7) {
            iH += this.p;
        }
        if (iH > 0 && iH2 > 0) {
            this.h = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[iH2];
                kk5Var.skip(iH);
                kk5Var.read(bArr);
                this.m = bArr;
            }
            this.k = iH;
            this.l = iH2;
        }
        if (t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final boolean t(HashMap map) {
        lk5 lk5Var = (lk5) map.get("ImageLength");
        lk5 lk5Var2 = (lk5) map.get("ImageWidth");
        if (lk5Var == null || lk5Var2 == null) {
            return false;
        }
        return lk5Var.h(this.g) <= 512 && lk5Var2.h(this.g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.pk5.t
            r1 = 0
            r2 = r1
        L4:
            mk5[][] r3 = defpackage.pk5.T     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.i(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.d = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            ok5 r8 = new ok5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.g(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.j(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.n(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.m(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.o     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.d(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.G(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            kk5 r8 = new kk5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.h(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.k(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.l(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.p(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.a()
            if (r0 == 0) goto La8
            r7.w()
            return
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.a()
            if (r0 == 0) goto L9f
            r7.w()
        L9f:
            throw r8
        La0:
            r7.a()
            if (r0 == 0) goto La8
            r7.w()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.u(java.io.InputStream):void");
    }

    public final void v(ok5 ok5Var) throws IOException {
        ByteOrder byteOrderX = x(ok5Var);
        this.g = byteOrderX;
        ok5Var.b = byteOrderX;
        int unsignedShort = ok5Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = ok5Var.readInt();
        if (i2 < 8) {
            throw new IOException(ho7.f(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            ok5Var.c(i3);
        }
    }

    public final void w() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM = ho7.m(i, "The size of tag group[", "]: ");
            sbM.append(mapArr[i].size());
            Log.d("ExifInterface", sbM.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                lk5 lk5Var = (lk5) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + lk5Var.toString() + ", tagValue: '" + lk5Var.i(this.g) + "'");
            }
            i++;
        }
    }

    public final void y(int i, byte[] bArr) throws IOException {
        ok5 ok5Var = new ok5(bArr);
        v(ok5Var);
        z(ok5Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.ok5 r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.z(ok5, int):void");
    }

    public pk5(FileDescriptor fileDescriptor) throws Throwable {
        boolean z2;
        FileInputStream fileInputStream;
        Throwable th;
        mk5[][] mk5VarArr = T;
        this.e = new HashMap[mk5VarArr.length];
        this.f = new HashSet(mk5VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.c = null;
            this.a = null;
            if (s(fileDescriptor)) {
                this.b = fileDescriptor;
                try {
                    fileDescriptor = qk5.b(fileDescriptor);
                    z2 = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } else {
                this.b = null;
                z2 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    u(fileInputStream);
                    zaj.c(fileInputStream);
                    if (z2) {
                        zaj.b(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zaj.c(fileInputStream);
                    if (z2) {
                        zaj.b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pk5(java.io.InputStream r4) {
        /*
            r3 = this;
            r3.<init>()
            mk5[][] r0 = defpackage.pk5.T
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.g = r0
            r0 = 0
            r3.a = r0
            boolean r1 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r1 == 0) goto L25
            r1 = r4
            android.content.res.AssetManager$AssetInputStream r1 = (android.content.res.AssetManager.AssetInputStream) r1
            r3.c = r1
            r3.b = r0
            goto L43
        L25:
            boolean r1 = r4 instanceof java.io.FileInputStream
            if (r1 == 0) goto L3f
            r1 = r4
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileDescriptor r2 = r1.getFD()
            boolean r2 = s(r2)
            if (r2 == 0) goto L3f
            r3.c = r0
            java.io.FileDescriptor r0 = r1.getFD()
            r3.b = r0
            goto L43
        L3f:
            r3.c = r0
            r3.b = r0
        L43:
            r3.u(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.<init>(java.io.InputStream):void");
    }
}
