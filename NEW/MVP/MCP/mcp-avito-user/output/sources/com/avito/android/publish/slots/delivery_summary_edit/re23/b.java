package com.avito.android.publish.slots.delivery_summary_edit.re23;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishDeliverySummaryEditItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f243835a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243836b;

    /* renamed from: c, reason: collision with root package name */
    public final u f243837c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f243835a = provider;
        this.f243836b = uVar;
        this.f243837c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243835a.get(), (com.avito.android.util.text.a) this.f243836b.get(), (l) this.f243837c.get());
    }
}
