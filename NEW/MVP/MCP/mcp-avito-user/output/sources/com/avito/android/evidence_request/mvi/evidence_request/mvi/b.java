package com.avito.android.evidence_request.mvi.evidence_request.mvi;

import Wz.InterfaceC15811a;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f149144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Wz.d> f149145b;

    /* renamed from: c, reason: collision with root package name */
    public final u f149146c;

    public b(l lVar, u uVar, Provider provider) {
        this.f149144a = lVar;
        this.f149145b = provider;
        this.f149146c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((AppealId) this.f149144a.f393949a, this.f149145b.get(), (InterfaceC15811a) this.f149146c.get());
    }
}
