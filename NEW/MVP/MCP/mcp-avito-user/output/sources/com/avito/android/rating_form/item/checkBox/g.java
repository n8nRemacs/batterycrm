package com.avito.android.rating_form.item.checkBox;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableGroupItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f248313a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248314b;

    /* renamed from: c, reason: collision with root package name */
    public final u f248315c;

    public g(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f248313a = provider;
        this.f248314b = lVar;
        this.f248315c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f248313a.get(), ((Boolean) this.f248314b.f393949a).booleanValue(), ((Boolean) this.f248315c.get()).booleanValue());
    }
}
