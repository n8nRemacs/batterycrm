package com.avito.android.advert_core.auto_select_manager_info;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectManagerInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82930a;

    public b(u uVar) {
        this.f82930a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f82930a.get());
    }
}
