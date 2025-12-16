package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceRequestUploadInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.K> f148719b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f148720c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148721d;

    public s(Provider<AppealId> provider, Provider<com.avito.android.remote.K> provider2, Provider<com.avito.android.account.G> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f148718a = provider;
        this.f148719b = provider2;
        this.f148720c = provider3;
        this.f148721d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f148718a.get(), dagger.internal.g.b(this.f148719b), this.f148720c.get(), this.f148721d.get());
    }
}
