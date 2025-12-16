package com.avito.android.messenger.conversation.mvi.send;

import android.content.res.Resources;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: SendMessagePresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class N0 implements dagger.internal.h<D> {

    /* renamed from: A, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f194293A;

    /* renamed from: B, reason: collision with root package name */
    public final Provider<JY.a> f194294B;

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32232q> f194295a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f194296b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.a> f194297c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f194298d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f194299e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f194300f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f194301g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.video.n f194302h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<String> f194303i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194304j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f194305k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC32208e> f194306l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.l f194307m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.data.W f194308n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<C30277e1> f194309o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<Boolean> f194310p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.y0 f194311q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.Q0> f194312r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.u> f194313s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.u f194314t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f194315u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<InterfaceC32188a> f194316v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<u3.g<MessengerQuickRepliesWithTitleTestGroup>> f194317w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<WY.a> f194318x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f194319y;

    /* renamed from: z, reason: collision with root package name */
    public final Provider<C30277e1> f194320z;

    public N0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.l lVar, Provider provider6, com.avito.android.messenger.conversation.mvi.video.n nVar, Provider provider7, Provider provider8, dagger.internal.l lVar2, Provider provider9, dagger.internal.l lVar3, com.avito.android.messenger.channels.mvi.data.W w12, Provider provider10, Provider provider11, com.avito.android.messenger.conversation.mvi.messages.y0 y0Var, Provider provider12, Provider provider13, dagger.internal.u uVar, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21) {
        this.f194295a = provider;
        this.f194296b = provider2;
        this.f194297c = provider3;
        this.f194298d = provider4;
        this.f194299e = provider5;
        this.f194300f = lVar;
        this.f194301g = provider6;
        this.f194302h = nVar;
        this.f194303i = provider7;
        this.f194304j = provider8;
        this.f194305k = lVar2;
        this.f194306l = provider9;
        this.f194307m = lVar3;
        this.f194308n = w12;
        this.f194309o = provider10;
        this.f194310p = provider11;
        this.f194311q = y0Var;
        this.f194312r = provider12;
        this.f194313s = provider13;
        this.f194314t = uVar;
        this.f194315u = provider14;
        this.f194316v = provider15;
        this.f194317w = provider16;
        this.f194318x = provider17;
        this.f194319y = provider18;
        this.f194320z = provider19;
        this.f194293A = provider20;
        this.f194294B = provider21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f194295a.get(), this.f194296b.get(), this.f194297c.get(), this.f194298d.get(), this.f194299e.get(), (Resources) this.f194300f.f393949a, this.f194301g.get(), (com.avito.android.messenger.conversation.mvi.video.m) this.f194302h.get(), this.f194303i.get(), this.f194304j.get(), (SendMessagePresenter.State) this.f194305k.f393949a, this.f194306l.get(), (OpenedFrom) this.f194307m.f393949a, (com.avito.android.messenger.channels.mvi.data.P) this.f194308n.get(), this.f194309o.get(), this.f194310p.get().booleanValue(), (com.avito.android.messenger.conversation.mvi.messages.x0) this.f194311q.get(), this.f194312r.get(), this.f194313s.get(), (com.avito.android.messenger.conversation.mvi.voice.s0) this.f194314t.get(), this.f194315u.get(), this.f194316v.get(), this.f194317w.get(), this.f194318x.get(), this.f194319y.get(), this.f194320z.get(), this.f194293A.get(), this.f194294B.get());
    }
}
