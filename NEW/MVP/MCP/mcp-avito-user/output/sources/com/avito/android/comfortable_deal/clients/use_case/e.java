package com.avito.android.comfortable_deal.clients.use_case;

import com.avito.android.comfortable_deal.repository.l;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RequestsCountUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f120462a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f120463b;

    public e(l lVar, Provider provider) {
        this.f120462a = lVar;
        this.f120463b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.comfortable_deal.repository.a) this.f120462a.get(), this.f120463b.get());
    }
}
