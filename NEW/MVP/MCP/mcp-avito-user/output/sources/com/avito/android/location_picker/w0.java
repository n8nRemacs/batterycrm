package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "bounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class w0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AvitoMapBounds, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final w0 f182805l = new w0();

    public w0() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AvitoMapBounds avitoMapBounds) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AvitoMapBounds avitoMapBounds2 = avitoMapBounds;
        RadiusViewState radiusViewState = locationPickerState2.f182375t;
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(radiusViewState, null, null, false, null, 0L, avitoMapBounds2, (radiusViewState.f182386g == 0 || locationPickerState2.f182370o) ? false : true, 0L, null, false, null, false, 32575), false, null, null, false, false, 16515071);
    }
}
