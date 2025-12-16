package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.location_picker.O0;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "it", "LvW/s;", "apply", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)LvW/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f182510b;

    public D(O0 o02) {
        this.f182510b = o02;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        RadiusViewState radiusViewState = ((LocationPickerState) obj).f182375t;
        long j12 = radiusViewState.f182386g;
        AvitoMapBounds avitoMapBounds = radiusViewState.f182387h;
        return new vW.s(this.f182510b.a(avitoMapBounds != null ? avitoMapBounds.getBottomRight() : null, avitoMapBounds != null ? avitoMapBounds.getTopLeft() : null), j12);
    }
}
