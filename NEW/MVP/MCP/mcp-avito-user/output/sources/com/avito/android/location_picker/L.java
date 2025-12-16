package com.avito.android.location_picker;

import android.location.Location;
import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/location/Location;", "userLocation", "Lkotlin/Function1;", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply", "(Landroid/location/Location;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class L<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182139c;

    public L(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182138b = x0Var;
        this.f182139c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new K((Location) obj, this.f182138b, this.f182139c);
    }
}
