package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.Q0;
import com.avito.android.messenger.conversation.mvi.sync.W0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MessageListActorSubscriptionsImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H0 implements dagger.internal.h<G0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f189797a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f189798b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.a> f189799c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f189800d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f189801e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f189802f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q0> f189803g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<W0> f189804h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_download.N> f189805i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f189806j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f189807k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.video.h> f189808l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C30277e1> f189809m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<InterfaceC32129a> f189810n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC32038b> f189811o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.E0> f189812p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<WY.a> f189813q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f189814r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<u3.l<MessengerEmptyBuyerChatKeyboardTestGroup>> f189815s;

    public H0(Provider<String> provider, Provider<String> provider2, Provider<com.avito.android.messenger.conversation.mvi.a> provider3, Provider<R0> provider4, Provider<InterfaceC35741a1> provider5, Provider<InterfaceC28373a> provider6, Provider<Q0> provider7, Provider<W0> provider8, Provider<com.avito.android.messenger.conversation.mvi.file_download.N> provider9, Provider<InterfaceC31987a> provider10, Provider<com.avito.android.server_time.f> provider11, Provider<com.avito.android.messenger.conversation.mvi.video.h> provider12, Provider<C30277e1> provider13, Provider<InterfaceC32129a> provider14, Provider<InterfaceC32038b> provider15, Provider<com.avito.android.messenger.channels.mvi.sync.E0> provider16, Provider<WY.a> provider17, Provider<com.avito.android.deep_linking.x> provider18, Provider<u3.l<MessengerEmptyBuyerChatKeyboardTestGroup>> provider19) {
        this.f189797a = provider;
        this.f189798b = provider2;
        this.f189799c = provider3;
        this.f189800d = provider4;
        this.f189801e = provider5;
        this.f189802f = provider6;
        this.f189803g = provider7;
        this.f189804h = provider8;
        this.f189805i = provider9;
        this.f189806j = provider10;
        this.f189807k = provider11;
        this.f189808l = provider12;
        this.f189809m = provider13;
        this.f189810n = provider14;
        this.f189811o = provider15;
        this.f189812p = provider16;
        this.f189813q = provider17;
        this.f189814r = provider18;
        this.f189815s = provider19;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G0(this.f189797a.get(), this.f189798b.get(), this.f189799c.get(), this.f189800d.get(), this.f189801e.get(), this.f189802f.get(), this.f189803g.get(), this.f189804h.get(), this.f189805i.get(), this.f189806j.get(), this.f189807k.get(), this.f189808l.get(), this.f189809m.get(), dagger.internal.g.b(this.f189810n), this.f189811o.get(), this.f189812p.get(), this.f189813q.get(), this.f189814r.get(), this.f189815s.get());
    }
}
