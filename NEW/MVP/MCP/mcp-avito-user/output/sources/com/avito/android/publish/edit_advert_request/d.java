package com.avito.android.publish.edit_advert_request;

import Pd.InterfaceC14769a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: AuctionOfferChecker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14769a> f235464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48373a> f235465b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f235466c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235467d;

    public d(Provider<InterfaceC14769a> provider, Provider<InterfaceC48373a> provider2, Provider<C43617a> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f235464a = provider;
        this.f235465b = provider2;
        this.f235466c = provider3;
        this.f235467d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f235464a.get(), this.f235465b.get(), this.f235466c.get(), this.f235467d.get());
    }
}
