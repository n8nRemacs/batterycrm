package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideMessageSuggestsInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class F implements dagger.internal.h<InterfaceC32119a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195626a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<JY.a> f195627b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_suggests.r f195628c;

    public F(C32431e c32431e, Provider provider, com.avito.android.messenger.conversation.mvi.message_suggests.r rVar) {
        this.f195626a = c32431e;
        this.f195627b = provider;
        this.f195628c = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        JY.a aVar = (JY.a) ((C32453l0.b.C32461i) this.f195627b).get();
        C32120b c32120b = (C32120b) this.f195628c.get();
        this.f195626a.getClass();
        return aVar.k() ? c32120b : new C32434f();
    }
}
