package com.avito.android.referral_contacts;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsPermissionRequester_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f252498a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f252499b;

    public g(u uVar, Provider provider) {
        this.f252498a = uVar;
        this.f252499b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((h) this.f252498a.get(), this.f252499b.get());
    }
}
