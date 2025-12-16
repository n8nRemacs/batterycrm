package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;

/* compiled from: ChannelFragmentModule_ProvideChannelIacInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32452l implements dagger.internal.h<ChannelIacInteractor> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195817a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195818b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195819c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195820d;

    public C32452l(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f195817a = c32431e;
        this.f195818b = lVar;
        this.f195819c = lVar2;
        this.f195820d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f195818b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195819c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f195820d.get();
        this.f195817a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(com.avito.android.messenger.conversation.mvi.in_app_calls.a.class, sb2, ':');
        return (ChannelIacInteractor) C31685o.j(sb2, w12.f189238a, p02, com.avito.android.messenger.conversation.mvi.in_app_calls.a.class);
    }
}
