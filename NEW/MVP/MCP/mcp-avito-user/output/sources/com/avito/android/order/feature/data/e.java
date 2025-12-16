package com.avito.android.order.feature.data;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f209528a;

    /* renamed from: b, reason: collision with root package name */
    public final u f209529b;

    /* renamed from: c, reason: collision with root package name */
    public final u f209530c;

    public e(u uVar, u uVar2, u uVar3) {
        this.f209528a = uVar;
        this.f209529b = uVar2;
        this.f209530c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f209528a)), (R0) this.f209529b.get(), (dD.b) this.f209530c.get());
    }
}
