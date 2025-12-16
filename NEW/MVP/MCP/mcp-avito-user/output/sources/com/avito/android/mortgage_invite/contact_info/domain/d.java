package com.avito.android.mortgage_invite.contact_info.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;
import javax.inject.Provider;

/* compiled from: LoadContactInfoFormUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39928a> f205648a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.domain.mapper.c f205649b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f205650c;

    public d(Provider provider, com.avito.android.mortgage_invite.contact_info.domain.mapper.c cVar, Provider provider2) {
        this.f205648a = provider;
        this.f205649b = cVar;
        this.f205650c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC39928a interfaceC39928a = this.f205648a.get();
        this.f205649b.getClass();
        return new c(interfaceC39928a, new com.avito.android.mortgage_invite.contact_info.domain.mapper.b(), this.f205650c.get());
    }
}
