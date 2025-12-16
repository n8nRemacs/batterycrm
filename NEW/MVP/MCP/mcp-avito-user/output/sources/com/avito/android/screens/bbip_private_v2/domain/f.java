package com.avito.android.screens.bbip_private_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;

/* compiled from: BbipPrivateV2PostForecastUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f260938a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f260939b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.data.d f260940c;

    public f(Provider provider, Provider provider2, com.avito.android.screens.bbip_private_v2.data.d dVar) {
        this.f260938a = provider;
        this.f260939b = provider2;
        this.f260940c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f260938a.get(), this.f260939b.get(), (com.avito.android.screens.bbip_private_v2.data.a) this.f260940c.get());
    }
}
