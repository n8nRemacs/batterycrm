package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.voice.C32306a;

/* compiled from: ChannelFragmentModule_ProvideVoicePlayerPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32435f0 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.voice.Q> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195772a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195773b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f195774c;

    public C32435f0(C32431e c32431e, dagger.internal.l lVar, dagger.internal.f fVar) {
        this.f195772a = c32431e;
        this.f195773b = lVar;
        this.f195774c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195773b.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195774c.get();
        this.f195772a.getClass();
        return (com.avito.android.messenger.conversation.mvi.voice.Q) new androidx.view.P0(channelFragment, n12).a(C32306a.class);
    }
}
