package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "LuF/h;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182180c;

    public O(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182179b = x0Var;
        this.f182180c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182179b;
        com.avito.android.location_picker.providers.C c12 = x0Var.f182816j;
        LocationPickerState locationPickerState = this.f182180c;
        return c12.a(locationPickerState.f182375t.f182381b, locationPickerState.f182373r).z(x0Var.f182812f.a()).F();
    }
}
