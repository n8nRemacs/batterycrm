package com.avito.android.comfortable_deal.deal.di;

import android.content.Context;
import aq.InterfaceC23651a;
import com.avito.android.comfortable_deal.deal.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealModule_Companion_ProvideAudioFocusHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<com.avito.android.comfortable_deal.deal.player.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f121068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC23651a> f121069b;

    public n(Provider<Context> provider, Provider<InterfaceC23651a> provider2) {
        this.f121068a = provider;
        this.f121069b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context contextG = ((a.b.f) this.f121068a).f121042a.g();
        InterfaceC23651a interfaceC23651a = (InterfaceC23651a) ((a.b.C3569b) this.f121069b).get();
        m.f121066a.getClass();
        return new com.avito.android.comfortable_deal.deal.player.c(interfaceC23651a.a(), contextG);
    }
}
