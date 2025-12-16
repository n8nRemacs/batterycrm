package com.avito.android.publish.slots.delivery_summary_edit.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliverySummaryEditItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f243783a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243784b;

    public b(u uVar, Provider provider) {
        this.f243783a = provider;
        this.f243784b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243783a.get(), (u3.l) this.f243784b.get());
    }
}
