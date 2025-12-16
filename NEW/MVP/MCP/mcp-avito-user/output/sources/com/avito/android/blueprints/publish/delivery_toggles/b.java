package com.avito.android.blueprints.publish.delivery_toggles;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishDeliveryTogglesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106181a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106182b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106183c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f106181a = provider;
        this.f106182b = uVar;
        this.f106183c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106181a.get(), (com.avito.android.util.text.a) this.f106182b.get(), (l) this.f106183c.get());
    }
}
