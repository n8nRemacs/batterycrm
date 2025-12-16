package com.avito.android.freemium.screens.contact_history.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumContactHistoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.contact_history.domain.b f158987a;

    public d(com.avito.android.freemium.screens.contact_history.domain.b bVar) {
        this.f158987a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.freemium.screens.contact_history.domain.a) this.f158987a.get());
    }
}
