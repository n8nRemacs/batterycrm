package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideQuickRepliesPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.quick_replies.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195683a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195684b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195685c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195686d;

    public P(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195683a = c32431e;
        this.f195684b = lVar;
        this.f195685c = lVar2;
        this.f195686d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195684b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195685c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195686d.get();
        this.f195683a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.quick_replies.f.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.quick_replies.d) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.quick_replies.f.class);
    }
}
