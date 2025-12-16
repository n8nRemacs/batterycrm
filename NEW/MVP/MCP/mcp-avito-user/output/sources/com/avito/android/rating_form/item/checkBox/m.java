package com.avito.android.rating_form.item.checkBox;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableGroupItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f248325a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248326b;

    /* renamed from: c, reason: collision with root package name */
    public final u f248327c;

    public m(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f248325a = provider;
        this.f248326b = lVar;
        this.f248327c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f248325a.get(), ((Boolean) this.f248326b.f393949a).booleanValue(), ((Boolean) this.f248327c.get()).booleanValue());
    }
}
