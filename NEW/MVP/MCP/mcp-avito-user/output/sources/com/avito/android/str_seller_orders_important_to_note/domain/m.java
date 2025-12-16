package com.avito.android.str_seller_orders_important_to_note.domain;

import Yz0.InterfaceC18351a;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerImportantToNoteInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18351a> f291353a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f291354b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d1> f291355c;

    public m(Provider<InterfaceC18351a> provider, Provider<R0> provider2, Provider<d1> provider3) {
        this.f291353a = provider;
        this.f291354b = provider2;
        this.f291355c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f291353a.get(), this.f291354b.get(), this.f291355c.get());
    }
}
