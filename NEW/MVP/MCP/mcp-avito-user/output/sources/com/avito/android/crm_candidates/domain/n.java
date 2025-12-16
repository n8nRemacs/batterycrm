package com.avito.android.crm_candidates.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmCandidatesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f129414a;

    /* renamed from: b, reason: collision with root package name */
    public final u f129415b;

    /* renamed from: c, reason: collision with root package name */
    public final u f129416c;

    public n(u uVar, u uVar2, u uVar3) {
        this.f129414a = uVar;
        this.f129415b = uVar2;
        this.f129416c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f129414a), (InterfaceC28373a) this.f129415b.get(), (o) this.f129416c.get());
    }
}
