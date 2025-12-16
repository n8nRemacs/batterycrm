package com.avito.android.location_picker;

import io.reactivex.rxjava3.internal.operators.observable.C41953h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/avito_map/AvitoMapBounds;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.s0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31574s0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182495b;

    public C31574s0(x0 x0Var) {
        this.f182495b = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.jakewharton.rxrelay3.b f182664a = this.f182495b.f182809c.getF182664A();
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = io.reactivex.rxjava3.core.z.F0(1L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(C31572r0.f182492b);
        f182664a.getClass();
        return new C41953h(new io.reactivex.rxjava3.core.E[]{f182664a, b0D0}, null);
    }
}
