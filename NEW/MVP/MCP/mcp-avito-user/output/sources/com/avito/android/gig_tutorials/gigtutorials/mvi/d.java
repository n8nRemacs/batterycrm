package com.avito.android.gig_tutorials.gigtutorials.mvi;

import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigTutorialsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_tutorials.gigtutorials.domain.b f161143a;

    /* renamed from: b, reason: collision with root package name */
    public final l f161144b;

    public d(com.avito.android.gig_tutorials.gigtutorials.domain.b bVar, l lVar) {
        this.f161143a = bVar;
        this.f161144b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.gig_tutorials.gigtutorials.domain.a) this.f161143a.get(), (GigTutorialsOpenParams) this.f161144b.f393949a);
    }
}
