package com.avito.android.messenger.search;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsSearchInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f197172a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f197173b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f197174c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f197175d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197176e;

    public q(Provider<w0> provider, Provider<InterfaceC47842z> provider2, Provider<com.avito.android.messenger.B> provider3, Provider<InterfaceC28373a> provider4, Provider<InterfaceC35745a5> provider5) {
        this.f197172a = provider;
        this.f197173b = provider2;
        this.f197174c = provider3;
        this.f197175d = provider4;
        this.f197176e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f197172a.get(), this.f197173b.get(), this.f197174c.get(), this.f197175d.get(), this.f197176e.get());
    }
}
