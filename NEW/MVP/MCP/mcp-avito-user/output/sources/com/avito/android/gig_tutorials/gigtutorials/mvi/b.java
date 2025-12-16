package com.avito.android.gig_tutorials.gigtutorials.mvi;

import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigTutorialsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_tutorials.gigtutorials.domain.b f161139a;

    /* renamed from: b, reason: collision with root package name */
    public final l f161140b;

    public b(com.avito.android.gig_tutorials.gigtutorials.domain.b bVar, l lVar) {
        this.f161139a = bVar;
        this.f161140b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.gig_tutorials.gigtutorials.domain.a) this.f161139a.get(), (GigTutorialsOpenParams) this.f161140b.f393949a);
    }
}
