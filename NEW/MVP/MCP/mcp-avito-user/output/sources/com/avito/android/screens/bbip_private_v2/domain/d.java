package com.avito.android.screens.bbip_private_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;

/* compiled from: BbipPrivateV2PostContextUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f260927a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f260928b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.data.d f260929c;

    public d(Provider provider, Provider provider2, com.avito.android.screens.bbip_private_v2.data.d dVar) {
        this.f260927a = provider;
        this.f260928b = provider2;
        this.f260929c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f260927a.get(), this.f260928b.get(), (com.avito.android.screens.bbip_private_v2.data.a) this.f260929c.get());
    }
}
