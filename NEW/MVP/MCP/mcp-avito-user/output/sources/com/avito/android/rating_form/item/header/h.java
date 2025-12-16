package com.avito.android.rating_form.item.header;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248452a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248453b;

    public h(l lVar, u uVar) {
        this.f248452a = uVar;
        this.f248453b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((d) this.f248452a.get(), ((Boolean) this.f248453b.f393949a).booleanValue());
    }
}
