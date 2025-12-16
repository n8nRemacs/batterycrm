package com.avito.android.sbc.autodispatches;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchesCacheImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f258911a;

    public h(Provider<R0> provider) {
        this.f258911a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f258911a.get());
    }
}
