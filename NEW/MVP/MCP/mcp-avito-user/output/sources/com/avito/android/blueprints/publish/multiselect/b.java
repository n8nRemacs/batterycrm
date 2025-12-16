package com.avito.android.blueprints.publish.multiselect;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: MultiselectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106343a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106344b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106345c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f106343a = provider;
        this.f106344b = uVar;
        this.f106345c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106343a.get(), (com.avito.android.util.text.a) this.f106344b.get(), (l) this.f106345c.get());
    }
}
