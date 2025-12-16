package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.e;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/e;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/e;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31546h extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, uF.e, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31546h f182403l = new C31546h();

    public C31546h() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, uF.e eVar) {
        LocationPickerState locationPickerState2 = locationPickerState;
        uF.e eVar2 = eVar;
        if (!(eVar2 instanceof e.c)) {
            if (eVar2 instanceof e.a) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((e.a) eVar2).getErrorMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            if (eVar2 instanceof e.b) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            throw new NoWhenBranchMatchedException();
        }
        e.c cVar = (e.c) eVar2;
        boolean isValid = cVar.getIsValid();
        String errorMessage = cVar.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "";
        }
        AddressValidationState addressValidationStateA = AddressValidationState.a(locationPickerState2.f182378w, isValid, false, errorMessage, 1);
        String jsonWebToken = cVar.getJsonWebToken();
        if (jsonWebToken == null) {
            jsonWebToken = locationPickerState2.f182377v;
        }
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, false, jsonWebToken, addressValidationStateA, false, false, 13631487);
    }
}
