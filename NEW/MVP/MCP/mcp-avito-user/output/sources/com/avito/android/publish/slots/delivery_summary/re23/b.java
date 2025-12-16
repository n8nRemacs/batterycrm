package com.avito.android.publish.slots.delivery_summary.re23;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDeliverySummaryAddItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f243692a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243693b;

    /* renamed from: c, reason: collision with root package name */
    public final u f243694c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f243692a = provider;
        this.f243693b = uVar;
        this.f243694c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243692a.get(), (com.avito.android.util.text.a) this.f243693b.get(), (u3.l) this.f243694c.get());
    }
}
