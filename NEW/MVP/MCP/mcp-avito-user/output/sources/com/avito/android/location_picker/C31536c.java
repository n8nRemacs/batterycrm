package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.AbstractC48888a;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/a;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/a;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31536c extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AbstractC48888a, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31536c f182223l = new C31536c();

    public C31536c() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AbstractC48888a abstractC48888a) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AbstractC48888a abstractC48888a2 = abstractC48888a;
        if (abstractC48888a2 instanceof AbstractC48888a.d) {
            AbstractC48888a.d dVar = (AbstractC48888a.d) abstractC48888a2;
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, dVar.getFormattedAddress(), true, null, false, false, null, null, T0.a(), false, false, false, false, null, false, dVar.getJsonWebToken(), AddressValidationState.a(locationPickerState2.f182378w, false, true, "", 3), false, false, 13627343);
        }
        if (abstractC48888a2 instanceof AbstractC48888a.c) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, ((AbstractC48888a.c) abstractC48888a2).getMessage(), null, false, false, false, false, 4091), false, false, false, false, null, false, null, null, false, false, 15724543);
        }
        if (abstractC48888a2 instanceof AbstractC48888a.b) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4093), false, false, false, false, RadiusViewState.a(locationPickerState2.f182375t, null, null, false, null, 0L, null, false, -1L, null, false, null, false, 32255), false, null, null, false, false, 15462399);
        }
        if (abstractC48888a2 instanceof AbstractC48888a.C12706a) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((AbstractC48888a.C12706a) abstractC48888a2).f439865a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 15724543);
        }
        throw new NoWhenBranchMatchedException();
    }
}
