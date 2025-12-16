package com.avito.android.publish.input_vin.mvi;

import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.util.R0;
import javax.inject.Provider;
import me0.C44072a;
import me0.C44073b;

/* compiled from: LoadCategoryParametersByVinUseCase_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f236598a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f236599b;

    /* renamed from: c, reason: collision with root package name */
    public final C44073b f236600c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C0> f236601d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f236602e;

    public A(dagger.internal.u uVar, Provider provider, C44073b c44073b, Provider provider2, dagger.internal.l lVar) {
        this.f236598a = uVar;
        this.f236599b = provider;
        this.f236600c = c44073b;
        this.f236601d = provider2;
        this.f236602e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z((PublishParametersInteractor) this.f236598a.get(), this.f236599b.get(), (C44072a) this.f236600c.get(), this.f236601d.get(), ((Integer) this.f236602e.f393949a).intValue());
    }
}
