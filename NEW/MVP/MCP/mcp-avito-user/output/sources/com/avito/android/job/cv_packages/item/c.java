package com.avito.android.job.cv_packages.item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PackageBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f174399a;

    public c(i iVar) {
        this.f174399a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((h) this.f174399a.get());
    }
}
