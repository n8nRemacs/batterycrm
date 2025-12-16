package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "Lcom/avito/android/location_picker/view/radius/a;", "item", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;Lcom/avito/android/location_picker/view/radius/a;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class U extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, com.avito.android.location_picker.view.radius.a, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182187l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(x0 x0Var) {
        super(2);
        this.f182187l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, com.avito.android.location_picker.view.radius.a aVar) {
        LocationPickerState locationPickerState2 = locationPickerState;
        com.avito.android.location_picker.view.radius.a aVar2 = aVar;
        RadiusViewState radiusViewState = locationPickerState2.f182375t;
        List<Radius> list = radiusViewState.f182382c;
        String str = aVar2.f182785b;
        ArrayList arrayListE = x0.e(this.f182187l, list, str);
        Long l12 = aVar2.f182788e;
        long jLongValue = l12 != null ? l12.longValue() : 0L;
        String str2 = locationPickerState2.f182375t.f182381b;
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(radiusViewState, str, arrayListE, false, null, jLongValue, null, kotlin.jvm.internal.L.f(aVar2.f182785b, str2) && (l12 == null || l12.longValue() != 0), 0L, null, false, null, !kotlin.jvm.internal.L.f(r1, r10.f182381b), 24412), false, null, null, false, false, 16515071);
    }
}
