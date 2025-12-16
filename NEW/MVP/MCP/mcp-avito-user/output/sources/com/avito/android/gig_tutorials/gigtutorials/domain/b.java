package com.avito.android.gig_tutorials.gigtutorials.domain;

import dH.InterfaceC39580a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigTutorialsInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39580a> f161133a;

    public b(Provider<InterfaceC39580a> provider) {
        this.f161133a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f161133a.get());
    }
}
