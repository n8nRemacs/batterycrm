package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideChannelContextPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32449k implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.context.V> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195812a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195813b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195814c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195815d;

    public C32449k(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195812a = c32431e;
        this.f195813b = lVar;
        this.f195814c = lVar2;
        this.f195815d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195813b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195814c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195815d.get();
        this.f195812a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.context.W.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.context.V) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.context.W.class);
    }
}
