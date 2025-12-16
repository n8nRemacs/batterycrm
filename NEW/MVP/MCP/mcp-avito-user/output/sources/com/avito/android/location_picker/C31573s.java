package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.x0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Function1;", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31573s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f182494c;

    public C31573s(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182493b = locationPickerState;
        this.f182494c = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LocationPickerState locationPickerState = this.f182493b;
        boolean z12 = locationPickerState.f182379x || locationPickerState.f182369n.f182350g;
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = null;
        x0 x0Var = this.f182494c;
        if (z12) {
            x0Var.f182815i.f(null, "PERMISSION DENIED");
            return locationPickerState.f() ? x0.a.a(x0Var) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        LocationPickerFragment locationPickerFragment = x0Var.f182829w;
        if (locationPickerFragment != null) {
            com.avito.android.location.find.o oVar = locationPickerFragment.f182165w0;
            if (oVar == null) {
                oVar = null;
            }
            io.reactivex.rxjava3.core.z zVarB = oVar.b(locationPickerFragment.requireActivity(), (4 & 2) == 0, (4 & 4) == 0);
            if (zVarB != null) {
                b0D0 = zVarB.d0(new L(x0Var, locationPickerState));
            }
        }
        io.reactivex.rxjava3.internal.operators.observable.B0 b02 = b0D0;
        return b02 != null ? b02.E0(3L, TimeUnit.SECONDS, null, x0Var.f182812f.c()).l0(new r(x0Var)) : x0.a.a(x0Var);
    }
}
