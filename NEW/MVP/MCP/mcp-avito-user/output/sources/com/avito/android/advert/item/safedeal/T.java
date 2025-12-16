package com.avito.android.advert.item.safedeal;

import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31179w;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31180x;

/* compiled from: CartItemInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class T implements dagger.internal.h<S> {

    /* renamed from: a, reason: collision with root package name */
    public final W f78765a;

    /* renamed from: b, reason: collision with root package name */
    public final C31180x f78766b;

    public T(W w12, C31180x c31180x) {
        this.f78765a = w12;
        this.f78766b = c31180x;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S((V) this.f78765a.get(), (C31179w) this.f78766b.get());
    }
}
