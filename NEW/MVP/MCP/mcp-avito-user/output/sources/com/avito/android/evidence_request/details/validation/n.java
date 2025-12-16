package com.avito.android.evidence_request.details.validation;

import com.avito.android.evidence_request.AppealId;
import com.avito.android.remote.K;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceValidationFormRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K> f148582a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AppealId> f148583b;

    public n(Provider<K> provider, Provider<AppealId> provider2) {
        this.f148582a = provider;
        this.f148583b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f148582a.get(), this.f148583b.get());
    }
}
