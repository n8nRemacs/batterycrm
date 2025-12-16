package com.avito.android.authorization.auth;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: AuthInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.auth.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28640t implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f93057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B3.c> f93058b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93059c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C40806a> f93060d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f93061e;

    public C28640t(Provider<InterfaceC27663a> provider, Provider<B3.c> provider2, Provider<InterfaceC35745a5> provider3, Provider<C40806a> provider4, Provider<InterfaceC28373a> provider5) {
        this.f93057a = provider;
        this.f93058b = provider2;
        this.f93059c = provider3;
        this.f93060d = provider4;
        this.f93061e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f93057a.get(), this.f93058b.get(), this.f93059c.get(), this.f93060d.get(), this.f93061e.get());
    }
}
