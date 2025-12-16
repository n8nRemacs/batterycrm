package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BlacklistPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f186374a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31683m> f186375b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f186376c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f186377d;

    public L(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f186374a = provider;
        this.f186375b = provider2;
        this.f186376c = uVar;
        this.f186377d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f186374a.get(), this.f186375b.get(), (com.avito.android.date_time_formatter.a) this.f186376c.get(), this.f186377d.get());
    }
}
