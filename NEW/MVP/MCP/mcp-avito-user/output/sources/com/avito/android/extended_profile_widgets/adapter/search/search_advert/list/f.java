package com.avito.android.extended_profile_widgets.adapter.search.search_advert.list;

import com.avito.android.di.module.C30092k4;
import com.avito.android.serp.adapter.InterfaceC34863v;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobListItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34863v> f154722a;

    /* renamed from: b, reason: collision with root package name */
    public final C30092k4 f154723b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.f f154724c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f154725d;

    /* renamed from: e, reason: collision with root package name */
    public final u f154726e;

    /* renamed from: f, reason: collision with root package name */
    public final l f154727f;

    public f(Provider provider, C30092k4 c30092k4, ru.avito.component.serp.job.geo.f fVar, ru.avito.component.serp.job.geo.d dVar, u uVar, l lVar) {
        this.f154722a = provider;
        this.f154723b = c30092k4;
        this.f154724c = fVar;
        this.f154725d = dVar;
        this.f154726e = uVar;
        this.f154727f = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34863v interfaceC34863v = this.f154722a.get();
        com.avito.android.date_time_formatter.b bVar = (com.avito.android.date_time_formatter.b) this.f154723b.get();
        this.f154724c.getClass();
        ru.avito.component.serp.job.geo.e eVar = new ru.avito.component.serp.job.geo.e();
        this.f154725d.getClass();
        return new d(interfaceC34863v, bVar, eVar, new ru.avito.component.serp.job.geo.b(), (com.avito.android.server_time.f) this.f154726e.get(), (Y41.l) this.f154727f.f393949a);
    }
}
