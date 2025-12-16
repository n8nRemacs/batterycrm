package com.avito.android.location_picker.view;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u000b\u0010\u0003\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "Lj41/e;", "first", "second", "", "test", "(Lcom/avito/android/location_picker/entities/LocationPickerState;Lcom/avito/android/location_picker/entities/LocationPickerState;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r<T1, T2> implements l41.d {

    /* renamed from: a, reason: collision with root package name */
    public static final r<T1, T2> f182781a = new r<>();

    @Override // l41.d
    public final boolean a(Object obj, Object obj2) {
        RadiusViewState radiusViewState = ((LocationPickerState) obj).f182375t;
        long j12 = radiusViewState.f182386g;
        RadiusViewState radiusViewState2 = ((LocationPickerState) obj2).f182375t;
        return j12 == radiusViewState2.f182386g && kotlin.jvm.internal.L.f(radiusViewState.f182381b, radiusViewState2.f182381b);
    }
}
