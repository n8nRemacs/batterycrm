package com.avito.android.comfortable_deal.deal.player;

import aq.InterfaceC23651a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AudioPlayerHelper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23651a> f121776a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f121777b;

    public h(Provider<InterfaceC23651a> provider, Provider<R0> provider2) {
        this.f121776a = provider;
        this.f121777b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f121776a.get(), this.f121777b.get());
    }
}
