package com.avito.android.sx_address.deeplink;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SxAddressDeleteDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<C35175o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f292854a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f292855b;

    public p(dagger.internal.u uVar, Provider provider) {
        this.f292854a = uVar;
        this.f292855b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35175o((com.avito.android.sx_address.list.domain.b) this.f292854a.get(), this.f292855b.get());
    }
}
