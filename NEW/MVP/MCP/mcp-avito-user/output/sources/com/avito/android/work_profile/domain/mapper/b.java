package com.avito.android.work_profile.domain.mapper;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetProfileAppliesToVacancyV2ResponseMapper_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f330659a;

    public b(u uVar) {
        this.f330659a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deep_linking.x) this.f330659a.get());
    }
}
