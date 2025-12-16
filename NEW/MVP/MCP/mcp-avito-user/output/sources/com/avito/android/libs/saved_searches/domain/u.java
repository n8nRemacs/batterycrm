package com.avito.android.libs.saved_searches.domain;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionInteractorRxImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f181483a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f181484b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f181485c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f181486d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f181487e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f181488f;

    public u(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, Provider provider) {
        this.f181483a = uVar;
        this.f181484b = uVar2;
        this.f181485c = uVar3;
        this.f181486d = uVar4;
        this.f181487e = provider;
        this.f181488f = uVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(dagger.internal.g.a(w.a(this.f181483a)), (com.avito.android.db.n) this.f181484b.get(), (TV.c) this.f181485c.get(), (InterfaceC35745a5) this.f181486d.get(), this.f181487e.get(), (com.avito.android.remote.error.f) this.f181488f.get());
    }
}
