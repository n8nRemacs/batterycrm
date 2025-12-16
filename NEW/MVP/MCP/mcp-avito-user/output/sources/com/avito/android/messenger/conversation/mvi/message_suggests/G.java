package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessageSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class G implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32119a> f191894b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.platform_actions.A> f191895c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.common.a> f191896d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32232q> f191897e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<CY.o> f191898f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<CY.m> f191899g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<CY.n> f191900h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191901i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<String> f191902j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<C30277e1> f191903k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f191904l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<u3.l<MultiMessageSendTestGroup>> f191905m;

    public G(Provider<InterfaceC35745a5> provider, Provider<InterfaceC32119a> provider2, Provider<com.avito.android.messenger.conversation.mvi.platform_actions.A> provider3, Provider<com.avito.android.messenger.conversation.mvi.common.a> provider4, Provider<InterfaceC32232q> provider5, Provider<CY.o> provider6, Provider<CY.m> provider7, Provider<CY.n> provider8, Provider<InterfaceC28373a> provider9, Provider<String> provider10, Provider<C30277e1> provider11, Provider<u3.g<SimpleTestGroupWithNone>> provider12, Provider<u3.l<MultiMessageSendTestGroup>> provider13) {
        this.f191893a = provider;
        this.f191894b = provider2;
        this.f191895c = provider3;
        this.f191896d = provider4;
        this.f191897e = provider5;
        this.f191898f = provider6;
        this.f191899g = provider7;
        this.f191900h = provider8;
        this.f191901i = provider9;
        this.f191902j = provider10;
        this.f191903k = provider11;
        this.f191904l = provider12;
        this.f191905m = provider13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f191893a.get(), this.f191894b.get(), this.f191895c.get(), this.f191896d.get(), this.f191897e.get(), this.f191898f.get(), this.f191899g.get(), this.f191900h.get(), this.f191901i.get(), this.f191902j.get(), this.f191903k.get(), this.f191904l.get(), this.f191905m.get());
    }
}
