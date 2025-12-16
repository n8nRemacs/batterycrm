package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideVoicePlayerControl$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32432e0 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.voice.P> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195765a;

    public C32432e0(C32431e c32431e) {
        this.f195765a = c32431e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f195765a.getClass();
        return new com.avito.android.messenger.conversation.mvi.voice.P();
    }
}
