package com.avito.android.publish.slots.delivery_summary.item;

import javax.inject.Provider;

/* compiled from: DeliverySummaryItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f243583a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f243584b;

    public e(dagger.internal.u uVar, Provider provider) {
        this.f243583a = provider;
        this.f243584b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f243583a.get(), (u3.l) this.f243584b.get());
    }
}
