package com.avito.android.license;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LicenseViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.license.mvi.e f181523a;

    public k(com.avito.android.license.mvi.e eVar) {
        this.f181523a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.license.mvi.d) this.f181523a.get(), null, 2, null);
    }
}
