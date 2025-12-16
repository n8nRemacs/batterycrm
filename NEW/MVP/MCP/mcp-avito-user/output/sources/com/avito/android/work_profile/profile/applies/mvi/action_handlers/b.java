package com.avito.android.work_profile.profile.applies.mvi.action_handlers;

import com.avito.android.work_profile.domain.c;
import com.avito.android.work_profile.profile.applies.mvi.j;
import com.avito.android.work_profile.profile.applies.mvi.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliesListLoader_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f330880a;

    /* renamed from: b, reason: collision with root package name */
    public final k f330881b;

    public b(c cVar, k kVar) {
        this.f330880a = cVar;
        this.f330881b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.work_profile.domain.b) this.f330880a.get(), (j) this.f330881b.get());
    }
}
