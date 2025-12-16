package com.avito.android.bxcontent.di.module;

import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideErrorFormatterConfig$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class B implements dagger.internal.h<com.avito.android.serp.k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f110879a;

    public B(Provider<C36135w2> provider) {
        this.f110879a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = this.f110879a.get();
        C29070s.f111022a.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C36135w2.f327457X;
        kotlin.reflect.n<Object> nVar = nVarArr[36];
        boolean zBooleanValue = ((Boolean) c36135w2.f327464G.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar2 = nVarArr[37];
        return new com.avito.android.serp.k(zBooleanValue, ((Boolean) c36135w2.f327465H.a().invoke()).booleanValue());
    }
}
