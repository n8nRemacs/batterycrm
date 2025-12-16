package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<C31829d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f188531a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f188532b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f188533c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f188534d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.data.r> f188535e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.data.W f188536f;

    /* renamed from: g, reason: collision with root package name */
    public final C30713g1 f188537g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f188538h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f188539i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<MessengerStatsdEventFactory> f188540j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.f f188541k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<L> f188542l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<WY.a> f188543m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.K> f188544n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.mvi.rx3.locks.j<IY.a>> f188545o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f188546p;

    public r(Provider provider, dagger.internal.f fVar, Provider provider2, Provider provider3, Provider provider4, com.avito.android.messenger.channels.mvi.data.W w12, C30713g1 c30713g1, Provider provider5, Provider provider6, Provider provider7, dagger.internal.f fVar2, Provider provider8, Provider provider9, Provider provider10, Provider provider11, dagger.internal.u uVar) {
        this.f188531a = provider;
        this.f188532b = fVar;
        this.f188533c = provider2;
        this.f188534d = provider3;
        this.f188535e = provider4;
        this.f188536f = w12;
        this.f188537g = c30713g1;
        this.f188538h = provider5;
        this.f188539i = provider6;
        this.f188540j = provider7;
        this.f188541k = fVar2;
        this.f188542l = provider8;
        this.f188543m = provider9;
        this.f188544n = provider10;
        this.f188545o = provider11;
        this.f188546p = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C31829d(this.f188531a.get(), (InterfaceC47842z) this.f188532b.get(), this.f188533c.get(), this.f188534d.get(), this.f188535e.get(), (com.avito.android.messenger.channels.mvi.data.Y) this.f188536f.get(), (C30277e1) this.f188537g.get(), this.f188538h.get(), this.f188539i.get(), this.f188540j.get(), (InterfaceC28373a) this.f188541k.get(), this.f188542l.get(), this.f188543m.get(), this.f188544n.get(), this.f188545o.get(), (io.reactivex.rxjava3.core.H) this.f188546p.get());
    }
}
