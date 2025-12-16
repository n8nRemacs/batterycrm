package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous parameter 1>", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;Lkotlin/G0;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31570q extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, kotlin.G0, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31570q f182489l = new C31570q();

    public C31570q() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, kotlin.G0 g02) {
        LocationPickerState locationPickerState2 = locationPickerState;
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, T0.a(), true, false, false, false, null, false, null, AddressValidationState.a(locationPickerState2.f182378w, false, false, "", 5), false, false, 2051803);
    }
}
