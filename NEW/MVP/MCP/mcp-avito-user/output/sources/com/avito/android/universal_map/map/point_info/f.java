package com.avito.android.universal_map.map.point_info;

import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalMapPointInfoRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f305805a;

    /* renamed from: b, reason: collision with root package name */
    public final u f305806b;

    /* renamed from: c, reason: collision with root package name */
    public final u f305807c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f305808d;

    /* renamed from: e, reason: collision with root package name */
    public final u f305809e;

    public f(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f305805a = uVar;
        this.f305806b = uVar2;
        this.f305807c = uVar3;
        this.f305808d = provider;
        this.f305809e = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.b(this.f305805a), (com.avito.android.remote.error.f) this.f305806b.get(), (InterfaceC35745a5) this.f305807c.get(), this.f305808d.get(), (R0) this.f305809e.get());
    }
}
