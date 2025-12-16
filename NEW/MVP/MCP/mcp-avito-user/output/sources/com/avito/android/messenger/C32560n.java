package com.avito.android.messenger;

import com.avito.android.messenger.di.P1;
import com.avito.android.persistence.messenger.InterfaceC33130w0;
import javax.inject.Provider;

/* compiled from: DbPurgerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32560n implements dagger.internal.h<C32529m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32522f> f196912a;

    /* renamed from: b, reason: collision with root package name */
    public final P1 f196913b;

    public C32560n(Provider provider, P1 p12) {
        this.f196912a = provider;
        this.f196913b = p12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32529m(this.f196912a.get(), (InterfaceC33130w0) this.f196913b.get());
    }
}
