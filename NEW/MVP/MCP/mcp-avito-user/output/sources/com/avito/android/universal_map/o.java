package com.avito.android.universal_map;

import Y41.p;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.UniversalMapSettingsDto;
import kotlin.Metadata;

/* compiled from: UniversalMapSettingsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/o;", "", "<init>", "()V", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o {
    @Y61.l
    public static UniversalMapParams.MapSettings a(@Y61.l UniversalMapSettingsDto universalMapSettingsDto, @Y61.k p pVar) {
        if ((universalMapSettingsDto != null ? universalMapSettingsDto.getLocation() : null) == null) {
            if ((universalMapSettingsDto != null ? universalMapSettingsDto.getBeduinForm() : null) == null) {
                if ((universalMapSettingsDto != null ? universalMapSettingsDto.getPointInfoBottomSheetSettings() : null) == null) {
                    return null;
                }
            }
        }
        UniversalMapSettingsDto.LocationSettings location = universalMapSettingsDto.getLocation();
        UniversalMapParams.LocationSettings locationSettings = location != null ? new UniversalMapParams.LocationSettings(location.isEnabledLocationRequest(), location.getOnTapActions()) : null;
        UniversalMapSettingsDto.BeduinForm beduinForm = universalMapSettingsDto.getBeduinForm();
        Long lValueOf = beduinForm != null ? Long.valueOf(((Number) pVar.invoke(beduinForm.getTopMapFormId(), beduinForm.getTopMapComponents())).longValue()) : null;
        UniversalMapSettingsDto.PointInfoBottomSheetSettings pointInfoBottomSheetSettings = universalMapSettingsDto.getPointInfoBottomSheetSettings();
        return new UniversalMapParams.MapSettings(locationSettings, lValueOf, pointInfoBottomSheetSettings != null ? new UniversalMapParams.PointInfoBottomSheetSettings(pointInfoBottomSheetSettings.getTopPadding(), pointInfoBottomSheetSettings.getCompactHeightRatio()) : null);
    }
}
