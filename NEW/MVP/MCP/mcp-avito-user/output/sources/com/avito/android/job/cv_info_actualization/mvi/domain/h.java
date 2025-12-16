package com.avito.android.job.cv_info_actualization.mvi.domain;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationLoadInfoInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PP.a> f174151a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.job.cv_info_actualization.data.mapper.b f174152b;

    /* renamed from: c, reason: collision with root package name */
    public final l f174153c;

    public h(Provider provider, com.avito.android.job.cv_info_actualization.data.mapper.b bVar, l lVar) {
        this.f174151a = provider;
        this.f174152b = bVar;
        this.f174153c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f174151a);
        this.f174152b.getClass();
        return new g(eVarB, new com.avito.android.job.cv_info_actualization.data.mapper.a(), (String) this.f174153c.f393949a);
    }
}
