package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BigFiltersReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136754a;

    public t(u uVar) {
        this.f136754a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.developments_agency_search.screen.big_filters.converter.e) this.f136754a.get());
    }
}
