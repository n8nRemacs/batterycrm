package com.avito.android.comfortable_deal.clients.use_case;

import com.avito.android.comfortable_deal.repository.l;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageReturnToWorkUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f120436a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f120437b;

    public b(l lVar, Provider provider) {
        this.f120436a = lVar;
        this.f120437b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.comfortable_deal.repository.a) this.f120436a.get(), this.f120437b.get());
    }
}
