package com.avito.android.evidence_request.details.di;

/* compiled from: EvidenceDetailsItemsModule_ProvideParametersConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<com.avito.android.evidence_request.details.params.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f148414a;

    public o(dagger.internal.u uVar) {
        this.f148414a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.category_parameters.a aVar = (com.avito.android.category_parameters.a) this.f148414a.get();
        f.f148378a.getClass();
        return new com.avito.android.evidence_request.details.params.b(aVar);
    }
}
