package com.avito.android.referral_contacts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.referral_contacts.domain.i f252545a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.referral_contacts.g f252546b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f252547c;

    public i(com.avito.android.referral_contacts.domain.i iVar, com.avito.android.referral_contacts.g gVar, Provider provider) {
        this.f252545a = iVar;
        this.f252546b = gVar;
        this.f252547c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.referral_contacts.domain.h) this.f252545a.get(), (com.avito.android.referral_contacts.c) this.f252546b.get(), this.f252547c.get());
    }
}
