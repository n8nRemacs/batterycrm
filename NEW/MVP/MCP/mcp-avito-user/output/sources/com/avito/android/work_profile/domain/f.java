package com.avito.android.work_profile.domain;

import bQ0.InterfaceC25545a;
import com.avito.android.work_profile.profile.gig.mvi.k;
import com.avito.android.work_profile.profile.gig.mvi.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25545a> f330644a;

    /* renamed from: b, reason: collision with root package name */
    public final l f330645b;

    public f(Provider provider, l lVar) {
        this.f330644a = provider;
        this.f330645b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f330644a.get(), (k) this.f330645b.get());
    }
}
