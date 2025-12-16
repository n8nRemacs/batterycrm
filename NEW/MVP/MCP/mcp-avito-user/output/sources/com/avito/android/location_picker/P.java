package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.h;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/h;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/h;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class P extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, uF.h, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(x0 x0Var) {
        super(2);
        this.f182181l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, uF.h hVar) {
        Object next;
        Long distanceInMeters;
        LocationPickerState locationPickerState2 = locationPickerState;
        uF.h hVar2 = hVar;
        if (!(hVar2 instanceof h.c)) {
            if (hVar2 instanceof h.b) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            if (hVar2 instanceof h.a) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((h.a) hVar2).f439871a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            throw new NoWhenBranchMatchedException();
        }
        h.c cVar = (h.c) hVar2;
        ArrayList arrayListE = x0.e(this.f182181l, cVar.b(), cVar.getSelectedValue());
        String selectedValue = cVar.getSelectedValue();
        Iterator<T> it = cVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((Radius) next).getId(), cVar.getSelectedValue())) {
                break;
            }
        }
        Radius radius = (Radius) next;
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(locationPickerState2.f182375t, cVar.getSelectedValue(), arrayListE, false, selectedValue, (radius == null || (distanceInMeters = radius.getDistanceInMeters()) == null) ? locationPickerState2.f182375t.f182386g : distanceInMeters.longValue(), null, false, 0L, null, false, null, false, 32456), false, null, null, false, false, 16515071);
    }
}
