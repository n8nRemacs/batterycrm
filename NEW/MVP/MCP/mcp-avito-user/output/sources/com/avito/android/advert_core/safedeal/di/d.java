package com.avito.android.advert_core.safedeal.di;

import com.avito.android.advert_core.safedeal.v;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: MyAdvertSafeDealServicesModule_ProvideViewBySafeDealComponentFactory$_avito_advert_core_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final A f84191a;

    public d(A a12) {
        this.f84191a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f84191a.get();
        a.f84187a.getClass();
        return new v(set);
    }
}
