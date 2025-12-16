package com.avito.android.blueprint.date.interval;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishDateIntervalBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105449a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105450b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105451c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f105449a = provider;
        this.f105450b = uVar;
        this.f105451c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105449a.get(), (com.avito.android.util.text.a) this.f105450b.get(), (l) this.f105451c.get());
    }
}
