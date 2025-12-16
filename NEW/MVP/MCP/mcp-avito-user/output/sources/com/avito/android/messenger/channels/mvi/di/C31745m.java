package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.di.C;
import javax.inject.Provider;

/* compiled from: ChannelsListAdapterModule_ProvideSwipableItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.di.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31745m implements dagger.internal.h<com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187434a;

    public C31745m(Provider<InterfaceC28373a> provider) {
        this.f187434a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C.c.C31718a) this.f187434a).get();
        C31743k.f187431a.getClass();
        return new com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b(interfaceC28373a);
    }
}
