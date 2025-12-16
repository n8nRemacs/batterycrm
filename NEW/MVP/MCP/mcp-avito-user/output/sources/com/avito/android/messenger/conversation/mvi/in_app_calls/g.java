package com.avito.android.messenger.conversation.mvi.in_app_calls;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelIacInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f191392a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<XL.a> f191393b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<LL.b> f191394c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f191395d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191396e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f191397f;

    /* renamed from: g, reason: collision with root package name */
    public final l f191398g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191399h;

    public g(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f191392a = provider;
        this.f191393b = provider2;
        this.f191394c = provider3;
        this.f191395d = provider4;
        this.f191396e = provider5;
        this.f191397f = provider6;
        this.f191398g = lVar;
        this.f191399h = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f191392a.get(), this.f191393b.get(), this.f191394c.get(), this.f191395d.get(), this.f191396e.get(), this.f191397f.get(), (W1) this.f191398g.f393949a, this.f191399h.get());
    }
}
