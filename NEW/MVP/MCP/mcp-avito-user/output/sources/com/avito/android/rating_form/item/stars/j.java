package com.avito.android.rating_form.item.stars;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StarsItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248671a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248672b;

    public j(dagger.internal.l lVar, u uVar) {
        this.f248671a = uVar;
        this.f248672b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((e) this.f248671a.get(), ((Boolean) this.f248672b.f393949a).booleanValue());
    }
}
