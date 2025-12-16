package de0;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: EditAdvertRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393991a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f393992b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f393993c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f393991a = uVar;
        this.f393992b = provider;
        this.f393993c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC39718c) this.f393991a.get(), this.f393992b.get(), this.f393993c.get());
    }
}
