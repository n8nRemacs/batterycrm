package com.avito.android.blueprints.publish.date;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import u3.l;

/* compiled from: DateItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106107a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106108b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106109c;

    public b(u uVar, u uVar2, u uVar3) {
        this.f106107a = uVar;
        this.f106108b = uVar2;
        this.f106109c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f106107a.get(), (com.avito.android.util.text.a) this.f106108b.get(), (l) this.f106109c.get());
    }
}
