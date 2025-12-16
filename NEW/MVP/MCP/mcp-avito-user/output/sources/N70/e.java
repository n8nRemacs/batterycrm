package N70;

import Y61.k;
import com.avito.android.util.V2;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: ExifUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002*&\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"", "", "ExifAttributesCollection", "_avito_photo-storage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Set<String> f11210a = C42756l.l0(new String[]{"ImageWidth", "ImageLength", "XResolution", "YResolution", "ResolutionUnit", "DateTime", "ImageDescription", "Make", "Model", "Software", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "MakerNote", "UserComment", "DateTimeOriginal", "DateTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential"});

    @k
    public static final LinkedHashMap a(@k androidx.exifinterface.media.a aVar) {
        Set<String> set = f11210a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : set) {
            linkedHashMap.put(str, aVar.c(str));
        }
        return linkedHashMap;
    }

    public static final void b(@k androidx.exifinterface.media.a aVar, @k Map<String, String> map) throws Throwable {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.H(entry.getKey(), entry.getValue());
        }
        try {
            aVar.D();
        } catch (IOException e12) {
            V2.f318762a.f(e12);
        }
    }
}
