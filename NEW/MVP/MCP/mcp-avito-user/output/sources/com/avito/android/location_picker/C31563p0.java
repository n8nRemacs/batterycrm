package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapBounds;", "visibleRegion", "Lio/reactivex/rxjava3/core/E;", "LuF/d;", "apply", "(Lcom/avito/android/avito_map/AvitoMapBounds;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.p0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31563p0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182434c;

    public C31563p0(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182433b = x0Var;
        this.f182434c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182433b;
        return x0Var.f182811e.d(this.f182434c.f182361f, (AvitoMapBounds) obj).z(x0Var.f182812f.a()).F();
    }
}
