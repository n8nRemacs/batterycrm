package com.avito.android.blueprint.date.single;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishDateBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105488a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105489b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105490c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f105488a = provider;
        this.f105489b = uVar;
        this.f105490c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105488a.get(), (com.avito.android.util.text.a) this.f105489b.get(), (l) this.f105490c.get());
    }
}
