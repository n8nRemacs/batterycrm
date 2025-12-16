package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class hk5 {
    public static final tk5[] c;
    public static final tk5[][] d;
    public static final HashSet e;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        tk5[] tk5VarArr = {new tk5(256, "ImageWidth", 3, 4), new tk5(257, "ImageLength", 3, 4), new tk5("Make", 271, 2), new tk5("Model", 272, 2), new tk5("Orientation", 274, 3), new tk5("XResolution", 282, 5), new tk5("YResolution", 283, 5), new tk5("ResolutionUnit", 296, 3), new tk5("Software", HttpStatus.SC_USE_PROXY, 2), new tk5("DateTime", 306, 2), new tk5("YCbCrPositioning", 531, 3), new tk5("SubIFDPointer", 330, 4), new tk5("ExifIFDPointer", 34665, 4), new tk5("GPSInfoIFDPointer", 34853, 4)};
        tk5[] tk5VarArr2 = {new tk5("ExposureTime", 33434, 5), new tk5("FNumber", 33437, 5), new tk5("ExposureProgram", 34850, 3), new tk5("PhotographicSensitivity", 34855, 3), new tk5("SensitivityType", 34864, 3), new tk5("ExifVersion", 36864, 2), new tk5("DateTimeOriginal", 36867, 2), new tk5("DateTimeDigitized", 36868, 2), new tk5("ComponentsConfiguration", 37121, 7), new tk5("ShutterSpeedValue", 37377, 10), new tk5("ApertureValue", 37378, 5), new tk5("BrightnessValue", 37379, 10), new tk5("ExposureBiasValue", 37380, 10), new tk5("MaxApertureValue", 37381, 5), new tk5("MeteringMode", 37383, 3), new tk5("LightSource", 37384, 3), new tk5("Flash", 37385, 3), new tk5("FocalLength", 37386, 5), new tk5("SubSecTime", 37520, 2), new tk5("SubSecTimeOriginal", 37521, 2), new tk5("SubSecTimeDigitized", 37522, 2), new tk5("FlashpixVersion", 40960, 7), new tk5("ColorSpace", 40961, 3), new tk5(40962, "PixelXDimension", 3, 4), new tk5(40963, "PixelYDimension", 3, 4), new tk5("InteroperabilityIFDPointer", 40965, 4), new tk5("FocalPlaneResolutionUnit", 41488, 3), new tk5("SensingMethod", 41495, 3), new tk5("FileSource", 41728, 7), new tk5("SceneType", 41729, 7), new tk5("CustomRendered", 41985, 3), new tk5("ExposureMode", 41986, 3), new tk5("WhiteBalance", 41987, 3), new tk5("SceneCaptureType", 41990, 3), new tk5("Contrast", 41992, 3), new tk5("Saturation", 41993, 3), new tk5("Sharpness", 41994, 3)};
        tk5[] tk5VarArr3 = {new tk5("GPSVersionID", 0, 1), new tk5("GPSLatitudeRef", 1, 2), new tk5(2, "GPSLatitude", 5, 10), new tk5("GPSLongitudeRef", 3, 2), new tk5(4, "GPSLongitude", 5, 10), new tk5("GPSAltitudeRef", 5, 1), new tk5("GPSAltitude", 6, 5), new tk5("GPSTimeStamp", 7, 5), new tk5("GPSSpeedRef", 12, 2), new tk5("GPSTrackRef", 14, 2), new tk5("GPSImgDirectionRef", 16, 2), new tk5("GPSDestBearingRef", 23, 2), new tk5("GPSDestDistanceRef", 25, 2)};
        c = new tk5[]{new tk5("SubIFDPointer", 330, 4), new tk5("ExifIFDPointer", 34665, 4), new tk5("GPSInfoIFDPointer", 34853, 4), new tk5("InteroperabilityIFDPointer", 40965, 4)};
        d = new tk5[][]{tk5VarArr, tk5VarArr2, tk5VarArr3, new tk5[]{new tk5("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public hk5(ByteOrder byteOrder, ArrayList arrayList) {
        z5j.f("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        z5j.c(i, wy1.e(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
