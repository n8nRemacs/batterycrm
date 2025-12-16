package com.avito.android.user_advert.advert.delegate.short_term_rent;

import com.avito.android.advert_core.short_term_rent.g;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortTermRentPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f308830a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308831b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308832c;

    public d(u uVar, u uVar2, Provider provider) {
        this.f308830a = provider;
        this.f308831b = uVar;
        this.f308832c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f308830a.get(), (InterfaceC35745a5) this.f308831b.get(), (com.avito.android.advert_core.short_term_rent.d) this.f308832c.get());
    }
}
