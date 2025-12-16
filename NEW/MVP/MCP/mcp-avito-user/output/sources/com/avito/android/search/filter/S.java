package com.avito.android.search.filter;

import com.avito.android.remote.model.Location;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lorg/funktionale/option/a;", "Lcom/avito/android/remote/model/Location;", "kotlin.jvm.PlatformType", "locationOption", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/search/filter/LocationInfo;", "apply", "(Lorg/funktionale/option/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class S<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261901b;

    public S(E e12) {
        this.f261901b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Location location = (Location) ((org.funktionale.option.a) obj).c();
        E e12 = this.f261901b;
        LocationInfo locationInfo = e12.f261789z;
        if (locationInfo != null) {
            if (kotlin.jvm.internal.L.f(locationInfo.f261875b.getId(), location != null ? location.getId() : null) && e12.f261772i != null) {
                return io.reactivex.rxjava3.core.z.c0(locationInfo);
            }
        }
        return location != null ? E.B(location, e12) : e12.F().T(new C34535a0(e12), Integer.MAX_VALUE);
    }
}
