package com.avito.android.search.filter.adapter.category_group;

import android.content.res.Resources;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: CategoryGroupItemWidthProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f262032a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f262033b;

    public A(dagger.internal.l lVar, Provider provider) {
        this.f262032a = provider;
        this.f262033b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z((Resources) this.f262033b.f393949a, this.f262032a.get());
    }
}
