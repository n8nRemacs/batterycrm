package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideMultiMessagePresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.multi_message.m> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195641a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195642b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195643c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195644d;

    public I(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195641a = c32431e;
        this.f195642b = lVar;
        this.f195643c = lVar2;
        this.f195644d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195642b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195643c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195644d.get();
        this.f195641a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.multi_message.n.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.multi_message.m) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.multi_message.n.class);
    }
}
