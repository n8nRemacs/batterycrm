package com.avito.android.rubricator.items.category;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SerpRubricatorCategoryItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255783a;

    public c(u uVar) {
        this.f255783a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f255783a.get());
    }
}
