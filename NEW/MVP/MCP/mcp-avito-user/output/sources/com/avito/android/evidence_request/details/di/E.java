package com.avito.android.evidence_request.details.di;

import com.avito.android.evidence_request.AppealId;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideUploadingProgressInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148269a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f148270b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148271c;

    public E(Provider<AppealId> provider, Provider<com.avito.android.photo_cache.b> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f148269a = provider;
        this.f148270b = provider2;
        this.f148271c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = this.f148269a.get();
        com.avito.android.photo_cache.b bVar = this.f148270b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f148271c.get();
        w.f148426a.getClass();
        return new com.avito.android.photo_cache.n(appealId.f148206b, bVar, interfaceC35745a5);
    }
}
