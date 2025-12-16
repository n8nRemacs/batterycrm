package com.avito.android.important_addresses_selection.data;

import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImportantAddressesSelectionApi_Module_ProvideImportantAddressesSelectionApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169698a;

    public c(dagger.internal.f fVar) {
        this.f169698a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f169698a.get();
        b.f169697a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
