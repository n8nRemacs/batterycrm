package com.avito.android.promoblock;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TnsPromoBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<a>> f231795a;

    /* renamed from: b, reason: collision with root package name */
    public final u f231796b;

    public j(u uVar, Provider provider) {
        this.f231795a = provider;
        this.f231796b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f231795a.get(), (com.avito.android.lib.util.groupable_item.b) this.f231796b.get());
    }
}
