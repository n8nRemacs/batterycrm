package com.avito.android.gig_tutorials.gigtutorials;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigTutorialsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_tutorials.gigtutorials.mvi.g f161136a;

    public k(com.avito.android.gig_tutorials.gigtutorials.mvi.g gVar) {
        this.f161136a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.gig_tutorials.gigtutorials.mvi.f) this.f161136a.get(), null, 2, null);
    }
}
