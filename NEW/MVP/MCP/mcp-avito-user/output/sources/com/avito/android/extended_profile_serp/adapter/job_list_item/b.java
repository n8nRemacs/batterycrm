package com.avito.android.extended_profile_serp.adapter.job_list_item;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobAdvertListItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f152596a;

    public b(u uVar) {
        this.f152596a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.a) this.f152596a.get());
    }
}
