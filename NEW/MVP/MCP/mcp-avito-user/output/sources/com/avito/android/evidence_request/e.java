package com.avito.android.evidence_request;

import com.avito.android.account.G;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceRequestInfoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148621a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f148622b;

    public e(u uVar, Provider provider) {
        this.f148621a = uVar;
        this.f148622b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.evidence_request.repository.a) this.f148621a.get(), this.f148622b.get());
    }
}
