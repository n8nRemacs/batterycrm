package com.avito.android.advert_core.messenger;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertMessengerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83791a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f83792b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f83793c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f83791a = uVar;
        this.f83792b = provider;
        this.f83793c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f83791a), this.f83792b.get(), this.f83793c.get());
    }
}
