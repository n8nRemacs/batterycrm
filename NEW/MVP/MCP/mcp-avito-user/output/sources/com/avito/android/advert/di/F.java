package com.avito.android.advert.di;

import com.avito.android.C29640d;
import com.avito.android.advert.di.t0;
import com.avito.android.advert.item.h2;
import com.avito.android.advert.item.j2;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideBlocksLoggerRequestBuilderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F implements dagger.internal.h<h2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C29640d> f69103a;

    /* renamed from: b, reason: collision with root package name */
    public final j2 f69104b;

    public F(Provider provider, j2 j2Var) {
        this.f69103a = provider;
        this.f69104b = j2Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29640d c29640dQ = ((t0.b.C27722e) this.f69103a).f71015a.Q();
        C27710t.f69463a.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[25];
        Object obj = ((Boolean) c29640dQ.f132222y.a().invoke()).booleanValue() ? (h2) this.f69104b.get() : h2.a.f75823a;
        dagger.internal.t.d(obj);
        return obj;
    }
}
