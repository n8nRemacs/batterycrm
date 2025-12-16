package com.avito.android.developments_agency_search.screen.shared;

import com.avito.android.remote.model.SearchParamsConverter;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAgencySearchConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f139042a;

    /* renamed from: b, reason: collision with root package name */
    public final f f139043b;

    public c(u uVar, f fVar) {
        this.f139042a = uVar;
        this.f139043b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SearchParamsConverter) this.f139042a.get(), (e) this.f139043b.get());
    }
}
