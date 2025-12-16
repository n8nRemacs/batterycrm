package com.avito.android.contact_access.contact_access_service.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessServiceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125985a;

    public d(u uVar) {
        this.f125985a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.contact_access.contact_access_service.domain.a) this.f125985a.get());
    }
}
