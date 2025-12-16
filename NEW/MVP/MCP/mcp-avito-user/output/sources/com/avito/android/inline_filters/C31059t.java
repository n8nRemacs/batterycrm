package com.avito.android.inline_filters;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: InlineFiltersLocationDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.inline_filters.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31059t implements dagger.internal.h<C31058s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f172368a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f172369b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f172370c;

    public C31059t(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f172368a = uVar;
        this.f172369b = uVar2;
        this.f172370c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31058s((com.avito.android.geo_common.interactor.g) this.f172368a.get(), (InterfaceC30715a) this.f172369b.get(), this.f172370c.get());
    }
}
