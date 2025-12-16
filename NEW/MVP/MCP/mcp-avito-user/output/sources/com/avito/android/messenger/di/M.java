package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.di.C32453l0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvidePlatformActionsPresenterReducerQueue$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M implements dagger.internal.h<com.avito.android.mvi.rx3.with_monolithic_state.t<f.InterfaceC5732f>> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195670a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195671b;

    public M(C32431e c32431e, Provider<InterfaceC35745a5> provider) {
        this.f195670a = c32431e;
        this.f195671b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C32453l0.b.f0) this.f195671b).get();
        this.f195670a.getClass();
        return new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, null);
    }
}
