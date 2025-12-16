package com.avito.android.mortgage.applications_list;

import com.avito.android.mortgage.applications_list.mvi.i;
import com.avito.android.mortgage.applications_list.mvi.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationsListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final j f198403a;

    public h(j jVar) {
        this.f198403a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((i) this.f198403a.get(), null, 2, null);
    }
}
