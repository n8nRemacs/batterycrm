package com.avito.android.authorization.reset_password;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ResetPasswordInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f94179a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.r> f94180b;

    /* renamed from: c, reason: collision with root package name */
    public final z f94181c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f94182d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94183e;

    public j(Provider provider, Provider provider2, z zVar, dagger.internal.u uVar, Provider provider3) {
        this.f94179a = provider;
        this.f94180b = provider2;
        this.f94181c = zVar;
        this.f94182d = uVar;
        this.f94183e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f94179a), dagger.internal.g.b(this.f94180b), (x) this.f94181c.get(), (com.avito.android.remote.error.f) this.f94182d.get(), this.f94183e.get());
    }
}
