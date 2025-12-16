package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.validation.InterfaceC36030r0;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30386f implements dagger.internal.h<C30385e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148695a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<FilesInteractor> f148696b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n> f148697c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f148698d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f148699e;

    public C30386f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f148695a = lVar;
        this.f148696b = provider;
        this.f148697c = provider2;
        this.f148698d = provider3;
        this.f148699e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30385e((String) this.f148695a.f393949a, this.f148696b.get(), this.f148697c.get(), this.f148698d.get(), (q) this.f148699e.get());
    }
}
