package BN;

import Y61.l;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import kotlin.Metadata;

/* compiled from: AmenityMarkerIconFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_item-map_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int a(@l String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1062811118:
                    if (str.equals("museum")) {
                        return R.drawable.museum_16;
                    }
                    break;
                case -907977868:
                    if (str.equals("school")) {
                        return R.drawable.school_16;
                    }
                    break;
                case -303628742:
                    if (str.equals("hospital")) {
                        return R.drawable.hospital_16;
                    }
                    break;
                case 3045789:
                    if (str.equals("cafe")) {
                        return R.drawable.cafe_16;
                    }
                    break;
                case 3433450:
                    if (str.equals("park")) {
                        return R.drawable.park_16;
                    }
                    break;
                case 93818879:
                    if (str.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
                        return R.drawable.amenity_black_pin;
                    }
                    break;
                case 109413437:
                    if (str.equals("shops")) {
                        return R.drawable.shop_16;
                    }
                    break;
                case 109651828:
                    if (str.equals("sport")) {
                        return R.drawable.sport_16;
                    }
                    break;
                case 678639248:
                    if (str.equals(AvitoMapMarkerKt.AMENITY_TYPE_DEFAULT_RED)) {
                        return AvitoMapMarker.Type.MARKER_PIN_DEFAULT_RED.getDrawableRes();
                    }
                    break;
                case 1544803905:
                    if (str.equals("default")) {
                        return AvitoMapMarker.Type.MARKER_PIN_DEFAULT.getDrawableRes();
                    }
                    break;
                case 1795432646:
                    if (str.equals("kindergarten")) {
                        return R.drawable.kindergarten_16;
                    }
                    break;
            }
        }
        return AvitoMapMarker.Type.MARKER_PIN_DEFAULT.getDrawableRes();
    }
}
