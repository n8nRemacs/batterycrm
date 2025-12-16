package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;

/* compiled from: ChannelFragmentModule_ProvideMessageListInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C implements dagger.internal.h<InterfaceC32129a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195607a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195608b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195609c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195610d;

    public C(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195607a = c32431e;
        this.f195608b = lVar;
        this.f195609c = lVar2;
        this.f195610d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195608b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195609c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195610d.get();
        this.f195607a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(C32141e.class, sb2, ':');
        return (InterfaceC32129a) C31685o.j(sb2, w12.f189238a, p02, C32141e.class);
    }
}
