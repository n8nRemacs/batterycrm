package com.avito.android.messenger.di;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.menu.C32115g;
import com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a;

/* compiled from: ChannelFragmentModule_ProvideChannelMenuInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32486o implements dagger.internal.h<InterfaceC32109a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196160a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196161b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196162c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f196163d;

    public C32486o(C32431e c32431e, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.f fVar) {
        this.f196160a = c32431e;
        this.f196161b = lVar;
        this.f196162c = lVar2;
        this.f196163d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ChannelFragment channelFragment = (ChannelFragment) this.f196161b.f393949a;
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f196162c.f393949a;
        com.avito.android.messenger.channels.mvi.di.N n12 = (com.avito.android.messenger.channels.mvi.di.N) this.f196163d.get();
        this.f196160a.getClass();
        androidx.view.P0 p02 = new androidx.view.P0(channelFragment, n12);
        StringBuilder sb2 = new StringBuilder();
        C31685o.p(C32115g.class, sb2, ':');
        return (InterfaceC32109a) C31685o.j(sb2, w12.f189238a, p02, C32115g.class);
    }
}
