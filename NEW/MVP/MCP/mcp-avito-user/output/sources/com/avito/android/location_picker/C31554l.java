package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.job.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.f;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/f;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/f;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31554l extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, uF.f, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31554l(x0 x0Var) {
        super(2);
        this.f182423l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, uF.f fVar) {
        LocationPickerState locationPickerStateA;
        LocationPickerState locationPickerState2 = locationPickerState;
        uF.f fVar2 = fVar;
        if (fVar2 instanceof f.c) {
            com.avito.android.location_picker.job.f fVar3 = this.f182423l.f182823q;
            if (fVar3 instanceof f.b) {
                locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, true, null, null, false, false, 16252927);
            } else {
                if (!(fVar3 instanceof f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, false, null, null, false, false, 16777087);
            }
        } else if (fVar2 instanceof f.b) {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16773119);
        } else if (fVar2 instanceof f.d) {
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((f.d) fVar2).f439870a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
        } else {
            if (!(fVar2 instanceof f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            locationPickerStateA = LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((f.a) fVar2).getMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
        }
        return LocationPickerState.a(locationPickerStateA, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, null, false, null, null, false, false, 16776959);
    }
}
