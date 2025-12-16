package com.avito.android.select.sectioned_multiselect.container;

import com.avito.android.select.sectioned_multiselect.core.N;
import com.avito.android.select.sectioned_multiselect.core.O;
import com.avito.android.select.sectioned_multiselect.core.P;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectContainerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.container.di.e f266455a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f266456b;

    /* renamed from: c, reason: collision with root package name */
    public final O f266457c;

    public f(com.avito.android.select.sectioned_multiselect.container.di.e eVar, Provider provider, O o12) {
        this.f266455a = eVar;
        this.f266456b = provider;
        this.f266457c = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((P) this.f266455a.get(), this.f266456b.get(), (N) this.f266457c.get());
    }
}
