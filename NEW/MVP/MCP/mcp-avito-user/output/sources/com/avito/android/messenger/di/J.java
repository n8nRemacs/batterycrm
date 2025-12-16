package com.avito.android.messenger.di;

import androidx.view.InterfaceC22982O;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideNewMessagesPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.new_messages.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195648a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195649b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195650c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195651d;

    public J(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195648a = c32431e;
        this.f195649b = lVar;
        this.f195650c = lVar2;
        this.f195651d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195649b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195650c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195651d.get();
        this.f195648a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.new_messages.g.class, sb2, ':');
        Object objJ = C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.new_messages.g.class);
        channelFragment.getLifecycle().a((InterfaceC22982O) objJ);
        return (com.avito.android.messenger.conversation.mvi.new_messages.a) objJ;
    }
}
