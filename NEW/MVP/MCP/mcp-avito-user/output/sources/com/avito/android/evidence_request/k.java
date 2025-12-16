package com.avito.android.evidence_request;

import androidx.view.InterfaceC23487e;
import com.avito.android.evidence_request.details.files.q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceRequestViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f148637a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<c> f148638b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<q> f148639c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f148640d;

    public k(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f148637a = provider;
        this.f148638b = provider2;
        this.f148639c = provider3;
        this.f148640d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f148637a.get(), this.f148638b.get(), this.f148639c.get(), (AppealId) this.f148640d.f393949a);
    }
}
