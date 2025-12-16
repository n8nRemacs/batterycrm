package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.new_messages.k;
import com.avito.android.messenger.di.C32453l0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideNewMessagesPresenterViewModel$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<androidx.view.M0> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195653a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195654b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195655c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f195656d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195657e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.E0> f195658f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C30277e1> f195659g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f195660h;

    public K(C32431e c32431e, dagger.internal.l lVar, Provider provider, dagger.internal.u uVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f195653a = c32431e;
        this.f195654b = lVar;
        this.f195655c = provider;
        this.f195656d = uVar;
        this.f195657e = provider2;
        this.f195658f = provider3;
        this.f195659g = provider4;
        this.f195660h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195654b.f393949a;
        InterfaceC32024m interfaceC32024m = this.f195655c.get();
        InterfaceC31987a interfaceC31987a = (InterfaceC31987a) this.f195656d.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C32453l0.b.f0) this.f195657e).get();
        com.avito.android.messenger.channels.mvi.sync.E0 e02 = (com.avito.android.messenger.channels.mvi.sync.E0) ((C32453l0.b.R) this.f195658f).get();
        C30277e1 c30277e1C = ((C32453l0.b.P) this.f195659g).f195920a.C();
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((C32453l0.b.i0) this.f195660h).get();
        this.f195653a.getClass();
        return new com.avito.android.messenger.conversation.mvi.new_messages.g(w12.f189238a, interfaceC32024m, e02, fVar, c30277e1C, interfaceC31987a, interfaceC35745a5, new k.b.a(null, 1, null));
    }
}
