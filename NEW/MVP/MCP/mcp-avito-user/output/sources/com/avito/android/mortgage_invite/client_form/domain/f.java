package com.avito.android.mortgage_invite.client_form.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationClientFormActionProcessorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f205158a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.common.domain.g f205159b;

    /* renamed from: c, reason: collision with root package name */
    public final j f205160c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.domain.check_access.b> f205161d;

    public f(Provider provider, com.avito.android.mortgage_invite.common.domain.g gVar, j jVar, Provider provider2) {
        this.f205158a = provider;
        this.f205159b = gVar;
        this.f205160c = jVar;
        this.f205161d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f205158a.get(), (com.avito.android.mortgage_invite.common.domain.f) this.f205159b.get(), (i) this.f205160c.get(), this.f205161d.get());
    }
}
