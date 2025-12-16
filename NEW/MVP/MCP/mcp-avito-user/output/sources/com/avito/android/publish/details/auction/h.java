package com.avito.android.publish.details.auction;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.C33520f;
import com.avito.android.publish.analytics.InterfaceC33518d;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.publish.details.InterfaceC33746e0;
import com.avito.android.publish.drafts.E;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishAuctionDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233483a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f233484b;

    /* renamed from: c, reason: collision with root package name */
    public final C33520f f233485c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33675a> f233486d;

    /* renamed from: e, reason: collision with root package name */
    public final u f233487e;

    /* renamed from: f, reason: collision with root package name */
    public final u f233488f;

    /* renamed from: g, reason: collision with root package name */
    public final u f233489g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233490h;

    /* renamed from: i, reason: collision with root package name */
    public final u f233491i;

    /* renamed from: j, reason: collision with root package name */
    public final u f233492j;

    public h(u uVar, Provider provider, C33520f c33520f, Provider provider2, u uVar2, u uVar3, u uVar4, Provider provider3, u uVar5, u uVar6) {
        this.f233483a = uVar;
        this.f233484b = provider;
        this.f233485c = c33520f;
        this.f233486d = provider2;
        this.f233487e = uVar2;
        this.f233488f = uVar3;
        this.f233489g = uVar4;
        this.f233490h = provider3;
        this.f233491i = uVar5;
        this.f233492j = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((AttributesTreeConverter) this.f233483a.get(), this.f233484b.get(), (InterfaceC33518d) this.f233485c.get(), this.f233486d.get(), (InterfaceC33746e0) this.f233487e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f233488f.get(), (E) this.f233489g.get(), this.f233490h.get(), (C0) this.f233491i.get(), (InterfaceC35745a5) this.f233492j.get());
    }
}
