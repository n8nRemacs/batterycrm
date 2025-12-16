package com.avito.android.messenger.conversation.mvi.multi_message;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiMessagePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.multi_message_send.domain.a> f193757a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.multi_message_send.domain.g> f193758b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.multi_message_send.domain.n> f193759c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.common.a> f193760d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f193761e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<a> f193762f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f193763g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f193764h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<u3.l<MultiMessageSendTestGroup>> f193765i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f193766j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f193767k;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f193757a = provider;
        this.f193758b = provider2;
        this.f193759c = provider3;
        this.f193760d = provider4;
        this.f193761e = uVar;
        this.f193762f = provider5;
        this.f193763g = provider6;
        this.f193764h = provider7;
        this.f193765i = provider8;
        this.f193766j = provider9;
        this.f193767k = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f193757a.get(), this.f193758b.get(), this.f193759c.get(), this.f193760d.get(), (j) this.f193761e.get(), this.f193762f.get(), this.f193763g.get(), this.f193764h.get(), this.f193765i.get(), this.f193766j.get(), this.f193767k.get());
    }
}
