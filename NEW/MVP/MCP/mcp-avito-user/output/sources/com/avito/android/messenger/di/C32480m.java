package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideChannelIacPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32480m implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.in_app_calls.h> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196113a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196114b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196115c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f196116d;

    public C32480m(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f196113a = c32431e;
        this.f196114b = lVar;
        this.f196115c = lVar2;
        this.f196116d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f196114b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f196115c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f196116d.get();
        this.f196113a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.in_app_calls.i.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.in_app_calls.h) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.in_app_calls.i.class);
    }
}
