package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.d;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/d;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/d;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.q0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31571q0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, uF.d, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182490l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31571q0(LocationPickerState locationPickerState) {
        super(2);
        this.f182490l = locationPickerState;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, uF.d dVar) {
        LocationPickerState locationPickerState2 = locationPickerState;
        uF.d dVar2 = dVar;
        LocationPickerState locationPickerState3 = this.f182490l;
        if (!kotlin.jvm.internal.L.f(locationPickerState3.f182361f, locationPickerState2.f182361f)) {
            return locationPickerState2;
        }
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, locationPickerState3.f182361f, cVar.a(), !kotlin.jvm.internal.L.f(locationPickerState2.f182368m, cVar.a()) ? T0.a() : locationPickerState2.f182369n, false, false, false, false, null, false, null, null, false, false, 16770047);
        }
        if (dVar2 instanceof d.a) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((d.a) dVar2).f439866a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
        }
        if (dVar2 instanceof d.b) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16773119);
        }
        throw new NoWhenBranchMatchedException();
    }
}
