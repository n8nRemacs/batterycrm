package com.avito.android.rubricator.list.category.di;

import com.avito.android.J0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import un0.C49082b;
import un0.InterfaceC49081a;

/* compiled from: CategoryListModule_ProvideCategoryListConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<InterfaceC49081a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255899a;

    public d(u uVar) {
        this.f255899a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J0 j02 = (J0) this.f255899a.get();
        int i12 = c.f255898a;
        return new C49082b(j02);
    }
}
