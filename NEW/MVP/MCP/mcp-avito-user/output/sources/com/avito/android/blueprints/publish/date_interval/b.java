package com.avito.android.blueprints.publish.date_interval;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: DateIntervalItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106124a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106125b;

    public b(u uVar, Provider provider) {
        this.f106124a = provider;
        this.f106125b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106124a.get(), (l) this.f106125b.get());
    }
}
