package com.avito.android.location_picker;

import com.avito.android.location_picker.G0;
import com.avito.android.location_picker.entities.LocationPickerState;
import io.reactivex.rxjava3.internal.operators.observable.C41949f1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class E0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182105b;

    public E0(x0 x0Var) {
        this.f182105b = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182105b;
        io.reactivex.rxjava3.core.z<R> zVarY0 = x0Var.f182830x.y0(new G0.a(x0Var.f182831y));
        LocationPickerState locationPickerState = x0Var.f182830x.f364266b.get();
        if (locationPickerState == null) {
            locationPickerState = x0Var.f182807a;
        }
        C41949f1 c41949f1O0 = zVarY0.o0(locationPickerState, D0.f182103b);
        x0Var.f182824r.getF125491k().getClass();
        return c41949f1O0.y(300L, TimeUnit.MILLISECONDS, x0Var.f182812f.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }
}
