package com.avito.android.blueprints.chips_multiselect;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: ChipsMultiselectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105868a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105869b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105870c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f105868a = provider;
        this.f105869b = uVar;
        this.f105870c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105868a.get(), (com.avito.android.util.text.a) this.f105869b.get(), (l) this.f105870c.get());
    }
}
