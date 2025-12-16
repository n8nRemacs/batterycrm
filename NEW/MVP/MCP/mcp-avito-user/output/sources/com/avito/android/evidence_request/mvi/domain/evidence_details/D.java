package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceValidationFormInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.mvi.data.evidence_details.a> f148655a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f148656b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148657c;

    public D(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f148655a = provider;
        this.f148656b = uVar;
        this.f148657c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f148655a.get(), (u) this.f148656b.get(), this.f148657c.get());
    }
}
