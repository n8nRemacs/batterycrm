package com.avito.android.search.filter;

import com.avito.android.remote.model.Location;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Location;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/search/filter/LocationInfo;", "apply", "(Lcom/avito/android/remote/model/Location;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34535a0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261947b;

    public C34535a0(E e12) {
        this.f261947b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return E.B((Location) obj, this.f261947b);
    }
}
