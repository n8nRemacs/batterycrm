package com.avito.android.mortgage.applications_list;

import com.avito.android.mortgage.deeplink.domain.i;
import com.avito.android.mortgage.deeplink.domain.k;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationsListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final k f198394a;

    public e(k kVar) {
        this.f198394a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((i) this.f198394a.get());
    }
}
