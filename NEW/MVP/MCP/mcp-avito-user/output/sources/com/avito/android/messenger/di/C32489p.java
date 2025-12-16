package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;

/* compiled from: ChannelFragmentModule_ProvideChannelMenuPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32489p implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.menu.l> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196168a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196169b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196170c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f196171d;

    public C32489p(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f196168a = c32431e;
        this.f196169b = lVar;
        this.f196170c = lVar2;
        this.f196171d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f196169b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f196170c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f196171d.get();
        this.f196168a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.menu.m.class, sb2, ':');
        return (com.avito.android.messenger.conversation.mvi.menu.l) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.menu.m.class);
    }
}
