package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.O0;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.Radius;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "it", "LvW/f;", "apply", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)LvW/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.view.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31596s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f182796b;

    public C31596s(O0 o02) {
        this.f182796b = o02;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LocationPickerState locationPickerState = (LocationPickerState) obj;
        RadiusViewState radiusViewState = locationPickerState.f182375t;
        List<Radius> list = radiusViewState.f182382c;
        O0 o02 = this.f182796b;
        AvitoMapPoint avitoMapPoint = locationPickerState.f182358c;
        long j12 = radiusViewState.f182386g;
        return new vW.f(list, o02.b(avitoMapPoint, j12), Long.valueOf(j12));
    }
}
