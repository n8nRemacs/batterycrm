package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import Oq.InterfaceC14725a;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MessageListActorDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f189844a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f189845b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<String> f189846c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f189847d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32129a> f189848e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f189849f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C30277e1> f189850g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<ChannelIacInteractor> f189851h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<DY.a> f189852i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f189853j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC32291u0> f189854k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_download.N> f189855l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.voice.A> f189856m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.video.h> f189857n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.messages.b0> f189858o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f189859p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f189860q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<CY.k> f189861r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f189862s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.a> f189863t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.analytics.b> f189864u;

    /* renamed from: v, reason: collision with root package name */
    public final dagger.internal.u f189865v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<u3.g<AssistantUxImprovementsBuyerTestGroup>> f189866w;

    public K(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, dagger.internal.u uVar, Provider provider22) {
        this.f189844a = provider;
        this.f189845b = provider2;
        this.f189846c = provider3;
        this.f189847d = provider4;
        this.f189848e = provider5;
        this.f189849f = provider6;
        this.f189850g = provider7;
        this.f189851h = provider8;
        this.f189852i = provider9;
        this.f189853j = provider10;
        this.f189854k = provider11;
        this.f189855l = provider12;
        this.f189856m = provider13;
        this.f189857n = provider14;
        this.f189858o = provider15;
        this.f189859p = provider16;
        this.f189860q = provider17;
        this.f189861r = provider18;
        this.f189862s = provider19;
        this.f189863t = provider20;
        this.f189864u = provider21;
        this.f189865v = uVar;
        this.f189866w = provider22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J(this.f189844a.get(), this.f189845b.get(), this.f189846c.get(), this.f189847d.get(), dagger.internal.g.b(this.f189848e), this.f189849f.get(), this.f189850g.get(), this.f189851h.get(), this.f189852i.get(), this.f189853j.get(), this.f189854k.get(), this.f189855l.get(), this.f189856m.get(), this.f189857n.get(), this.f189858o.get(), this.f189859p.get(), this.f189860q.get(), this.f189861r.get(), this.f189862s.get(), this.f189863t.get(), this.f189864u.get(), (InterfaceC14725a) this.f189865v.get(), this.f189866w.get());
    }
}
