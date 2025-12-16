package com.avito.android.search.filter.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FilterAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262644a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f262645b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.analytics.provider.f f262646c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f262647d;

    /* renamed from: e, reason: collision with root package name */
    public final u f262648e;

    public e(u uVar, dagger.internal.l lVar, com.avito.android.analytics.provider.f fVar, dagger.internal.l lVar2, u uVar2) {
        this.f262644a = uVar;
        this.f262645b = lVar;
        this.f262646c = fVar;
        this.f262647d = lVar2;
        this.f262648e = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f262644a.get();
        SearchParams searchParams = (SearchParams) this.f262645b.f393949a;
        this.f262646c.getClass();
        return new d(interfaceC28373a, searchParams, new com.avito.android.analytics.provider.e(), (FilterAnalyticsData) this.f262647d.f393949a, (InterfaceC35745a5) this.f262648e.get());
    }
}
