package com.avito.android.onboarding;

import com.avito.android.C36135w2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: BxOnboardingStepInteractorProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f208680a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f208681b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f208682c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f208683d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f208684e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f208685f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<E> f208686g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<E> f208687h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<E> f208688i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<E> f208689j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<E> f208690k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<E> f208691l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f208692m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f208693n;

    public H(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13) {
        this.f208680a = provider;
        this.f208681b = provider2;
        this.f208682c = provider3;
        this.f208683d = provider4;
        this.f208684e = provider5;
        this.f208685f = provider6;
        this.f208686g = provider7;
        this.f208687h = provider8;
        this.f208688i = provider9;
        this.f208689j = provider10;
        this.f208690k = provider11;
        this.f208691l = provider12;
        this.f208692m = uVar;
        this.f208693n = provider13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G(this.f208680a.get(), this.f208681b.get(), this.f208682c.get(), this.f208683d.get(), this.f208684e.get(), this.f208685f.get(), this.f208686g.get(), this.f208687h.get(), this.f208688i.get(), this.f208689j.get(), this.f208690k.get(), this.f208691l.get(), (E) this.f208692m.get(), this.f208693n.get());
    }
}
