package com.avito.android.job.cv_packages;

import com.avito.android.job.cv_packages.mvi.p;
import com.avito.android.job.cv_packages.mvi.q;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCvPackagesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final q f174420a;

    public l(q qVar) {
        this.f174420a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((p) this.f174420a.get(), null, 2, null);
    }
}
