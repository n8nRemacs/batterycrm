package com.avito.android.location_picker.view;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "it", "LvW/e;", "apply", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)LvW/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final z<T, R> f182803b = new z<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        RadiusViewState radiusViewState = ((LocationPickerState) obj).f182375t;
        return new vW.e(radiusViewState.f182391l, radiusViewState.f182392m);
    }
}
