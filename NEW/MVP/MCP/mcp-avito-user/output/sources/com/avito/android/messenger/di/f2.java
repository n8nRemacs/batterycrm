package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessengerSyncModule_ProvideMessengerReadStatusSyncAgent$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class f2 implements dagger.internal.h<com.avito.android.messenger.channels.mvi.sync.G0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195778a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.data.r> f195779b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195780c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195781d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f195782e;

    /* renamed from: f, reason: collision with root package name */
    public final C30713g1 f195783f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f195784g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f195785h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f195786i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.O0> f195787j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.f f195788k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.mvi.rx3.locks.j<IY.a>> f195789l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<io.reactivex.rxjava3.core.H> f195790m;

    public f2(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.f fVar, C30713g1 c30713g1, dagger.internal.f fVar2, Provider provider5, Provider provider6, Provider provider7, dagger.internal.f fVar3, Provider provider8, Provider provider9) {
        this.f195778a = provider;
        this.f195779b = provider2;
        this.f195780c = provider3;
        this.f195781d = provider4;
        this.f195782e = fVar;
        this.f195783f = c30713g1;
        this.f195784g = fVar2;
        this.f195785h = provider5;
        this.f195786i = provider6;
        this.f195787j = provider7;
        this.f195788k = fVar3;
        this.f195789l = provider8;
        this.f195790m = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32024m interfaceC32024m = this.f195778a.get();
        com.avito.android.messenger.channels.mvi.data.r rVar = this.f195779b.get();
        com.avito.android.messenger.w0 w0Var = this.f195780c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195781d.get();
        ru.avito.messenger.W w12 = (ru.avito.messenger.W) this.f195782e.get();
        C30277e1 c30277e1 = (C30277e1) this.f195783f.get();
        ru.avito.messenger.Z z12 = (ru.avito.messenger.Z) this.f195784g.get();
        ru.avito.messenger.A a12 = this.f195785h.get();
        com.avito.android.server_time.h hVar = this.f195786i.get();
        com.avito.android.messenger.conversation.mvi.sync.O0 o02 = this.f195787j.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f195788k.get();
        com.avito.android.mvi.rx3.locks.j<IY.a> jVar = this.f195789l.get();
        io.reactivex.rxjava3.core.H h12 = this.f195790m.get();
        int i12 = W1.f195723a;
        return new com.avito.android.messenger.channels.mvi.sync.U0(interfaceC32024m, rVar, w0Var, interfaceC35745a5, w12, c30277e1, z12, a12, hVar, o02, jVar, h12, interfaceC28373a);
    }
}
