package com.avito.android.evidence_request.mvi.evidence_details.di;

import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideUploadingProgressInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148982a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f148983b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148984c;

    public v(Provider<AppealId> provider, Provider<com.avito.android.photo_cache.b> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f148982a = provider;
        this.f148983b = provider2;
        this.f148984c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = this.f148982a.get();
        com.avito.android.photo_cache.b bVar = this.f148983b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f148984c.get();
        d.f148929a.getClass();
        return new com.avito.android.photo_cache.n(appealId.f148723b, bVar, interfaceC35745a5);
    }
}
