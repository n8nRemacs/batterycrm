package com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar;

import com.avito.konveyor.adapter.j;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesTransportationWidgetToolbarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.services_transportation_widget.item.d> f113133a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f113134b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f113135c;

    public f(Provider<com.avito.android.services_transportation_widget.item.d> provider, Provider<j> provider2, Provider<com.avito.konveyor.adapter.a> provider3) {
        this.f113133a = provider;
        this.f113134b = provider2;
        this.f113135c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f113133a.get(), this.f113134b.get(), this.f113135c.get());
    }
}
