package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PlatformActionsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32187a> f194033a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f194034b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ChannelIacInteractor> f194035c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32129a> f194036d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f194037e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f194038f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f194039g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f194040h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.common.a> f194041i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<u3.l<MultiMessageSendTestGroup>> f194042j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194043k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.mvi.rx3.with_monolithic_state.t<f.InterfaceC5732f>> f194044l;

    public q(Provider<InterfaceC32187a> provider, Provider<InterfaceC31987a> provider2, Provider<ChannelIacInteractor> provider3, Provider<InterfaceC32129a> provider4, Provider<com.avito.android.deep_linking.x> provider5, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider6, Provider<InterfaceC35741a1> provider7, Provider<InterfaceC28373a> provider8, Provider<com.avito.android.messenger.conversation.mvi.common.a> provider9, Provider<u3.l<MultiMessageSendTestGroup>> provider10, Provider<InterfaceC35745a5> provider11, Provider<com.avito.android.mvi.rx3.with_monolithic_state.t<f.InterfaceC5732f>> provider12) {
        this.f194033a = provider;
        this.f194034b = provider2;
        this.f194035c = provider3;
        this.f194036d = provider4;
        this.f194037e = provider5;
        this.f194038f = provider6;
        this.f194039g = provider7;
        this.f194040h = provider8;
        this.f194041i = provider9;
        this.f194042j = provider10;
        this.f194043k = provider11;
        this.f194044l = provider12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f194033a.get(), this.f194034b.get(), this.f194035c.get(), dagger.internal.g.b(this.f194036d), this.f194037e.get(), this.f194038f.get(), this.f194039g.get(), this.f194040h.get(), this.f194041i.get(), this.f194042j.get(), this.f194043k.get(), this.f194044l.get());
    }
}
