package com.avito.android.location_picker;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "suggestion", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.k0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31553k0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AddressSuggestion, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182422l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31553k0(x0 x0Var) {
        super(2);
        this.f182422l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AddressSuggestion addressSuggestion) {
        LocationPickerState locationPickerStateA;
        x0 x0Var;
        LocationPickerState locationPickerState2 = locationPickerState;
        AddressSuggestion addressSuggestion2 = addressSuggestion;
        Coordinates coordinates = addressSuggestion2.getCoordinates();
        x0 x0Var2 = this.f182422l;
        if (coordinates == null) {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, addressSuggestion2.c(), false, null, false, false, "", C42784z0.f406748b, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 2047), false, false, false, false, null, false, addressSuggestion2.getJsonWebToken(), AddressValidationState.a(locationPickerState2.f182378w, false, true, "", 1), false, false, 13624271);
            x0Var = x0Var2;
        } else {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, x0.f(x0Var2, coordinates), false, (locationPickerState2.f182375t.f182381b.length() <= 0 || locationPickerState2.f182375t.f182386g == 0) ? 17.0f : locationPickerState2.f182360e, addressSuggestion2.c(), true, null, false, false, "", C42784z0.f406748b, T0.a(), false, false, false, false, null, false, addressSuggestion2.getJsonWebToken(), AddressValidationState.a(locationPickerState2.f182378w, false, true, "", 1), false, false, 13623749);
            x0Var = x0Var2;
        }
        com.avito.android.location_picker.providers.w wVar = x0Var.f182814h;
        if (wVar != null) {
            wVar.e(locationPickerStateA);
        }
        return locationPickerStateA;
    }
}
