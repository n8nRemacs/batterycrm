package com.avito.android.details;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectParameterClickListenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Integer> f135916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.x> f135917b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.select.i> f135918c;

    /* renamed from: d, reason: collision with root package name */
    public final u f135919d;

    public l(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f135916a = provider;
        this.f135917b = provider2;
        this.f135918c = provider3;
        this.f135919d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f135916a.get().intValue(), this.f135917b.get(), this.f135918c.get(), (u3.l) this.f135919d.get());
    }
}
