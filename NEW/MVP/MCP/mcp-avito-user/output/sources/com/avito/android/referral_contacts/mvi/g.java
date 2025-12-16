package com.avito.android.referral_contacts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f252536a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.referral_contacts.g f252537b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.referral_contacts.domain.i f252538c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f252539d;

    public g(Provider provider, com.avito.android.referral_contacts.g gVar, com.avito.android.referral_contacts.domain.i iVar, Provider provider2) {
        this.f252536a = provider;
        this.f252537b = gVar;
        this.f252538c = iVar;
        this.f252539d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f252536a.get(), (com.avito.android.referral_contacts.c) this.f252537b.get(), (com.avito.android.referral_contacts.domain.h) this.f252538c.get(), this.f252539d.get());
    }
}
