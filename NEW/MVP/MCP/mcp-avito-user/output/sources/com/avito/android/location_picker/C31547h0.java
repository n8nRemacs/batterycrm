package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vW.t;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LvW/t;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LvW/t;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.h0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31547h0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, vW.t, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31547h0 f182404l = new C31547h0();

    public C31547h0() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, vW.t tVar) {
        LocationPickerState locationPickerStateA;
        LocationPickerState locationPickerState2 = locationPickerState;
        vW.t tVar2 = tVar;
        if (tVar2 instanceof t.b) {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, false, null, null, false, false, 16777087);
        } else {
            if (!(tVar2 instanceof t.a)) {
                throw new NoWhenBranchMatchedException();
            }
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((t.a) tVar2).f440817a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
        }
        return LocationPickerState.a(locationPickerStateA, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, false, null, null, false, false, 16252927);
    }
}
