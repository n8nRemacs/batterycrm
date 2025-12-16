package com.avito.android.safedeal.delivery.order_cancellation.data;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256105a;

    /* renamed from: b, reason: collision with root package name */
    public final u f256106b;

    /* renamed from: c, reason: collision with root package name */
    public final u f256107c;

    public d(u uVar, u uVar2, u uVar3) {
        this.f256105a = uVar;
        this.f256106b = uVar2;
        this.f256107c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((R0) this.f256107c.get(), g.a(w.a(this.f256105a)), g.a(w.a(this.f256106b)));
    }
}
