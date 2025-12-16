package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideVoiceMessageClickInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32429d0 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.voice.A> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195756a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195757b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195758c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195759d;

    public C32429d0(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195756a = c32431e;
        this.f195757b = lVar;
        this.f195758c = lVar2;
        this.f195759d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195757b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195758c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195759d.get();
        this.f195756a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.voice.E.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.voice.A) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.voice.E.class);
    }
}
