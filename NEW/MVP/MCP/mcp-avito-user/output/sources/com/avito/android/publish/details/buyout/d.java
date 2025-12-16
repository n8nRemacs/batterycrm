package com.avito.android.publish.details.buyout;

import com.avito.android.publish.C0;
import com.avito.android.publish.details.InterfaceC33746e0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CollectPublishParamsDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233568a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.auction.a> f233569b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33746e0> f233570c;

    /* renamed from: d, reason: collision with root package name */
    public final u f233571d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233572e;

    /* renamed from: f, reason: collision with root package name */
    public final u f233573f;

    public d(u uVar, u uVar2, u uVar3, Provider provider, Provider provider2, Provider provider3) {
        this.f233568a = uVar;
        this.f233569b = provider;
        this.f233570c = provider2;
        this.f233571d = uVar2;
        this.f233572e = provider3;
        this.f233573f = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((AttributesTreeConverter) this.f233568a.get(), this.f233569b.get(), this.f233570c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f233571d.get(), this.f233572e.get(), (C0) this.f233573f.get());
    }
}
