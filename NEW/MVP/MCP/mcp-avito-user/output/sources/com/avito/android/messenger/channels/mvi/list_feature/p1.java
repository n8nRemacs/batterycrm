package com.avito.android.messenger.channels.mvi.list_feature;

import javax.inject.Provider;
import ru.avito.messenger.internal.connection.InterfaceC47748a;

/* compiled from: ChannelsListViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p1 implements dagger.internal.h<o1> {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f188171a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47748a> f188172b;

    public p1(h1 h1Var, Provider provider) {
        this.f188171a = h1Var;
        this.f188172b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o1((g1) this.f188171a.get(), new com.avito.android.arch.mvi.android.d(kotlinx.coroutines.rx3.y.a(this.f188172b.get().a(true)), 5000L, 0L, 4, null));
    }
}
