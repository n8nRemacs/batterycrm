package com.avito.android.work_profile.data;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WorkProfileRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f330614a;

    /* renamed from: b, reason: collision with root package name */
    public final u f330615b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.work_profile.domain.mapper.d f330616c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.work_profile.domain.mapper.b f330617d;

    public d(u uVar, u uVar2, com.avito.android.work_profile.domain.mapper.d dVar, com.avito.android.work_profile.domain.mapper.b bVar) {
        this.f330614a = uVar;
        this.f330615b = uVar2;
        this.f330616c = dVar;
        this.f330617d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ZP0.a aVar = (ZP0.a) this.f330614a.get();
        h31.e eVarA = g.a(w.a(this.f330615b));
        this.f330616c.getClass();
        return new c(aVar, eVarA, new com.avito.android.work_profile.domain.mapper.c(), (com.avito.android.work_profile.domain.mapper.a) this.f330617d.get());
    }
}
