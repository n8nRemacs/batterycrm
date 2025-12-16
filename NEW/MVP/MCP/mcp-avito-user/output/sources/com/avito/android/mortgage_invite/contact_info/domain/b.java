package com.avito.android.mortgage_invite.contact_info.domain;

import com.avito.android.mortgage_invite.common.domain.f;
import com.avito.android.mortgage_invite.common.domain.g;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateApplicationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<S10.c> f205639a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f205640b;

    /* renamed from: c, reason: collision with root package name */
    public final g f205641c;

    public b(Provider provider, Provider provider2, g gVar) {
        this.f205639a = provider;
        this.f205640b = provider2;
        this.f205641c = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f205639a.get(), this.f205640b.get(), (f) this.f205641c.get());
    }
}
