package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di;

import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentTooltipHeaderModule_ProvideImageCarouselItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final l f138361a;

    public i(l lVar) {
        this.f138361a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) this.f138361a.f393949a;
        d.f138359a.getClass();
        return new u(1.3333334f, cVar);
    }
}
