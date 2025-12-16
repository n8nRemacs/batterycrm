package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "LuF/f;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31550j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182408c;

    public C31550j(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182407b = x0Var;
        this.f182408c = locationPickerState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x0 x0Var = this.f182407b;
        InterfaceC31564a interfaceC31564a = x0Var.f182811e;
        LocationPickerState locationPickerState = this.f182408c;
        return interfaceC31564a.a(locationPickerState.f182358c, locationPickerState.f182357b).z(x0Var.f182812f.a()).F();
    }
}
