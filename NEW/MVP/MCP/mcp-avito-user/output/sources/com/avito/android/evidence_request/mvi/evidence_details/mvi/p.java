package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.z;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36030r0;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f149083a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f149084b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<FilesInteractor> f149085c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f149086d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC30381a> f149087e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Set<TV0.d<?, ?>>> f149088f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f149089g;

    public p(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f149083a = provider;
        this.f149084b = lVar;
        this.f149085c = provider2;
        this.f149086d = provider3;
        this.f149087e = provider4;
        this.f149088f = provider5;
        this.f149089g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f149083a.get(), (ProofDetailsContent) this.f149084b.f393949a, this.f149085c.get(), this.f149086d.get(), this.f149087e.get(), this.f149088f.get(), (z) this.f149089g.get());
    }
}
