package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "item", "Lkotlin/Function1;", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply", "(Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.p<LocationPickerState, T, LocationPickerState> f182839b;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(Y41.p<? super LocationPickerState, ? super T, LocationPickerState> pVar) {
        this.f182839b = pVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new y0(obj, this.f182839b);
    }
}
