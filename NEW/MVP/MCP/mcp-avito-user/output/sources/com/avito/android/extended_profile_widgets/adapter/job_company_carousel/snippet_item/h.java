package com.avito.android.extended_profile_widgets.adapter.job_company_carousel.snippet_item;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCompanyCarouselSnippetItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f154524a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.f f154525b;

    public h(l lVar, ru.avito.component.serp.job.geo.f fVar) {
        this.f154524a = lVar;
        this.f154525b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f154524a.f393949a;
        this.f154525b.getClass();
        return new f(lVar, new ru.avito.component.serp.job.geo.e());
    }
}
