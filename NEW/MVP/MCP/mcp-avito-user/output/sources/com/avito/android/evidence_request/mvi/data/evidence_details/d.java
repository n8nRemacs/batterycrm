package com.avito.android.evidence_request.mvi.data.evidence_details;

import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.remote.K;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceValidationFormRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K> f148644a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AppealId> f148645b;

    public d(Provider<K> provider, Provider<AppealId> provider2) {
        this.f148644a = provider;
        this.f148645b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f148644a.get(), this.f148645b.get());
    }
}
