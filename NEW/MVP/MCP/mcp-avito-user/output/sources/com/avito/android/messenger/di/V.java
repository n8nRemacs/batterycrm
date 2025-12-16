package com.avito.android.messenger.di;

import androidx.view.InterfaceC22982O;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;

/* compiled from: ChannelFragmentModule_ProvideSendMessagePresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class V implements dagger.internal.h<SendMessagePresenter> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195716a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195717b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195718c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195719d;

    public V(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195716a = c32431e;
        this.f195717b = lVar;
        this.f195718c = lVar2;
        this.f195719d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195717b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195718c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195719d.get();
        this.f195716a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.send.D.class, sb2, ':');
        Object objJ = C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.send.D.class);
        channelFragment.getLifecycle().a((InterfaceC22982O) objJ);
        return (SendMessagePresenter) objJ;
    }
}
