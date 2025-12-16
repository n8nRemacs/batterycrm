package com.avito.android.advert.item.service_order_request.redesign;

import com.avito.android.advert.item.service_order_request.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RedesignServiceOrderBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79951a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f79952b;

    public b(u uVar, Provider provider) {
        this.f79951a = uVar;
        this.f79952b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79951a.get(), this.f79952b.get());
    }
}
