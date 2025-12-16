package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Provider;

/* compiled from: CarouselWidgetAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f269280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f269281b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f269282c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H> f269283d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f269284e;

    public F(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f269280a = provider;
        this.f269281b = provider2;
        this.f269282c = lVar;
        this.f269283d = provider3;
        this.f269284e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f269280a.get(), this.f269281b.get(), (SearchParams) this.f269282c.f393949a, this.f269283d.get(), (String) this.f269284e.f393949a);
    }
}
