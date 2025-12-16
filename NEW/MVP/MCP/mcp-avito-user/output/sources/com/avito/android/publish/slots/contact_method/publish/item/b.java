package com.avito.android.publish.slots.contact_method.publish.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishContactMethodItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f243339a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243340b;

    /* renamed from: c, reason: collision with root package name */
    public final u f243341c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f243339a = provider;
        this.f243340b = uVar;
        this.f243341c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243339a.get(), (com.avito.android.util.text.a) this.f243340b.get(), (l) this.f243341c.get());
    }
}
