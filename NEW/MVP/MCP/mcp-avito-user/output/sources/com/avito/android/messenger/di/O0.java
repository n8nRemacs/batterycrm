package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: MessageMenuModule_ProvideMessageMenuCallbacksFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class O0 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.message_menu.i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f195679a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195680b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195681c;

    public O0(dagger.internal.f fVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f195679a = fVar;
        this.f195680b = lVar;
        this.f195681c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195679a.get();
        ChannelFragment channelFragment = (ChannelFragment) this.f195680b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195681c.f393949a;
        int i12 = N0.f195675a;
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.message_menu.j.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.message_menu.i) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.message_menu.j.class);
    }
}
