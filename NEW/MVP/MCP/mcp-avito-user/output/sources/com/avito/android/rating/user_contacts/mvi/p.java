package com.avito.android.rating.user_contacts.mvi;

import Mg0.InterfaceC14487a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f247862a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f247863b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f247864c;

    public p(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f247862a = provider;
        this.f247863b = provider2;
        this.f247864c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f247862a.get(), this.f247863b.get(), (String) this.f247864c.f393949a);
    }
}
