package com.avito.android.universal_map.map.pin_filters;

import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalMapFiltersRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f305712a;

    /* renamed from: b, reason: collision with root package name */
    public final u f305713b;

    /* renamed from: c, reason: collision with root package name */
    public final u f305714c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f305715d;

    /* renamed from: e, reason: collision with root package name */
    public final u f305716e;

    public f(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f305712a = uVar;
        this.f305713b = uVar2;
        this.f305714c = uVar3;
        this.f305715d = provider;
        this.f305716e = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.b(this.f305712a), (com.avito.android.remote.error.f) this.f305713b.get(), (InterfaceC35745a5) this.f305714c.get(), this.f305715d.get(), (R0) this.f305716e.get());
    }
}
