package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f149018a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30381a> f149019b;

    public d(dagger.internal.u uVar, Provider provider) {
        this.f149018a = uVar;
        this.f149019b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC30384d) this.f149018a.get(), this.f149019b.get());
    }
}
