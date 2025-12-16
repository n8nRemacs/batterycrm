package com.avito.android.location_picker;

import android.location.Location;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Location f182135l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f182136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182137n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Location location, x0 x0Var, LocationPickerState locationPickerState) {
        super(1);
        this.f182135l = location;
        this.f182136m = x0Var;
        this.f182137n = locationPickerState;
    }

    @Override // Y41.l
    public final LocationPickerState invoke(LocationPickerState locationPickerState) {
        LocationPickerState locationPickerStateA;
        LocationPickerState locationPickerState2 = locationPickerState;
        Location location = this.f182135l;
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null);
        x0 x0Var = this.f182136m;
        x0Var.f182815i.f(location, null);
        boolean z12 = this.f182137n.f182374s;
        com.avito.android.location_picker.providers.w wVar = x0Var.f182814h;
        if (z12) {
            LocationPickerErrors locationPickerErrorsA = T0.a();
            float f12 = locationPickerState2.f182360e;
            if (f12 <= 11.0f) {
                f12 = 17.0f;
            }
            locationPickerStateA = LocationPickerState.a(locationPickerState2, avitoMapPoint, false, f12, null, false, null, false, false, null, null, locationPickerErrorsA, false, false, false, false, null, false, null, AddressValidationState.a(locationPickerState2.f182378w, false, false, "", 5), false, false, 14643153);
            if (wVar != null) {
                wVar.a(locationPickerStateA);
            }
        } else {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, avitoMapPoint, true, 11.0f, null, false, null, false, false, null, null, T0.a(), false, false, false, false, null, false, null, AddressValidationState.a(locationPickerState2.f182378w, false, false, "", 5), false, false, 14643153);
            if (wVar != null) {
                wVar.a(locationPickerStateA);
            }
        }
        return locationPickerStateA;
    }
}
