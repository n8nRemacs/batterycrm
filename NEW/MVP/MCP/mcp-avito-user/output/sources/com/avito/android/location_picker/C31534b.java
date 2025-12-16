package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "LuF/a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31534b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182221c;

    public C31534b(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182220b = x0Var;
        this.f182221c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182220b;
        return x0Var.f182811e.f(this.f182221c.f182358c, x0Var.f182828v).z(x0Var.f182812f.a()).F();
    }
}
