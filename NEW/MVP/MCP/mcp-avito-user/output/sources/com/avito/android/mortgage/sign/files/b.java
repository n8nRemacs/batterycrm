package com.avito.android.mortgage.sign.files;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SignInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f203649a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IZ.a> f203650b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f203651c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f203652d;

    public b(u uVar, Provider provider, com.avito.android.mortgage.util.e eVar, Provider provider2) {
        this.f203649a = uVar;
        this.f203650b = provider;
        this.f203651c = eVar;
        this.f203652d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f203649a.get();
        h31.e eVarA = g.a(w.a(this.f203650b));
        this.f203651c.getClass();
        return new a(cVar, eVarA, new com.avito.android.mortgage.util.d(), this.f203652d.get());
    }
}
