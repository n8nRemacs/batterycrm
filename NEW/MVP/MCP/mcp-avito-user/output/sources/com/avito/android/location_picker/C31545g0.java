package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.job.f;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vW.t;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "LvW/t;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.g0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31545g0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182402c;

    public C31545g0(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182401b = x0Var;
        this.f182402c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182401b;
        com.avito.android.location_picker.job.f fVar = x0Var.f182823q;
        if (!(fVar instanceof f.b)) {
            if (!(fVar instanceof f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            V2.f318762a.f(new IllegalStateException("currentState.sendLocationToJobAssistant must not be true in case of sendLocationToJobAssistant is Default"));
            return io.reactivex.rxjava3.core.z.c0(new t.a(null, 1, null));
        }
        String str = ((f.b) fVar).f182420a;
        LocationPickerState locationPickerState = this.f182402c;
        return x0Var.f182822p.a(str, locationPickerState.f182358c.getLatitude(), locationPickerState.f182358c.getLongitude(), locationPickerState.f182361f).z(x0Var.f182812f.a()).F();
    }
}
