package com.avito.android.travel_search.di;

import com.avito.android.serp.adapter.constructor.rich.D;
import com.avito.android.serp.adapter.constructor.rich.E;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: TravelSearchItemsModule_ProvideBlueprintsIntoSet$_avito_travel_search_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<Set<TV0.b<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final E f303070a;

    public k(E e12) {
        this.f303070a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = (D) this.f303070a.get();
        i.f303068a.getClass();
        Set setSingleton = Collections.singleton(d12);
        dagger.internal.t.d(setSingleton);
        return setSingleton;
    }
}
