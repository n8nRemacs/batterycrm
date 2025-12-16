package com.avito.android.location_picker;

import com.avito.android.geo_common.model.AddressSuggestionV2;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import tF.AbstractC48544a;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LtF/a;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LtF/a;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AbstractC48544a, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182506l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(LocationPickerState locationPickerState) {
        super(2);
        this.f182506l = locationPickerState;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AbstractC48544a abstractC48544a) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AbstractC48544a abstractC48544a2 = abstractC48544a;
        LocationPickerState locationPickerState3 = this.f182506l;
        if (!kotlin.jvm.internal.L.f(locationPickerState3.f182361f, locationPickerState2.f182361f)) {
            return locationPickerState2;
        }
        if (!(abstractC48544a2 instanceof AbstractC48544a.c)) {
            if (abstractC48544a2 instanceof AbstractC48544a.C12665a) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((AbstractC48544a.C12665a) abstractC48544a2).f439204a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            if (abstractC48544a2 instanceof AbstractC48544a.b) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC48544a.c cVar = (AbstractC48544a.c) abstractC48544a2;
        List<AddressSuggestionV2> listA = cVar.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((AddressSuggestionV2) it.next()).d());
        }
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, locationPickerState3.f182361f, arrayList, !kotlin.jvm.internal.L.f(locationPickerState2.f182368m, cVar.a()) ? T0.a() : locationPickerState2.f182369n, false, false, false, false, null, false, null, null, false, false, 16770047);
    }
}
