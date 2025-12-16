package com.avito.android.authorization.deep_linking;

import Zd.InterfaceC19542a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: AuthResultAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28650d implements dagger.internal.h<C28649c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f93760a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f93761b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93762c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f93763d;

    /* renamed from: e, reason: collision with root package name */
    public final Zd.d f93764e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f93765f;

    public C28650d(dv.b bVar, dagger.internal.f fVar, dv.b bVar2, Provider provider, Zd.d dVar, dv.b bVar3) {
        this.f93760a = bVar;
        this.f93761b = fVar;
        this.f93762c = bVar2;
        this.f93763d = provider;
        this.f93764e = dVar;
        this.f93765f = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28649c((a.g) this.f93760a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f93761b.get(), (a.i) this.f93762c.get(), this.f93763d.get(), (InterfaceC19542a) this.f93764e.get(), (a.InterfaceC4053a) this.f93765f.get());
    }
}
