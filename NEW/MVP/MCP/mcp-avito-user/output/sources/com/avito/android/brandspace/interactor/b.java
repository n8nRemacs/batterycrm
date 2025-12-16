package com.avito.android.brandspace.interactor;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BrandspaceAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f107748a;

    /* renamed from: b, reason: collision with root package name */
    public final u f107749b;

    public b(u uVar, Provider provider) {
        this.f107748a = provider;
        this.f107749b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f107748a.get(), (InterfaceC40691b) this.f107749b.get());
    }
}
