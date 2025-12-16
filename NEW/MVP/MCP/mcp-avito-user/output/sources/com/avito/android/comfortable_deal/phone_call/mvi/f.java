package com.avito.android.comfortable_deal.phone_call.mvi;

import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneCallBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f122504a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f122505b;

    public f(com.avito.android.comfortable_deal.repository.l lVar, dagger.internal.l lVar2) {
        this.f122504a = lVar;
        this.f122505b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.comfortable_deal.repository.a) this.f122504a.get(), (PhoneCallArguments) this.f122505b.f393949a);
    }
}
