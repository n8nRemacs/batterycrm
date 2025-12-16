package com.avito.android.evidence_request.details.validation;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceValidationFormInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f148576a;

    /* renamed from: b, reason: collision with root package name */
    public final u f148577b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148578c;

    public j(u uVar, Provider provider, Provider provider2) {
        this.f148576a = provider;
        this.f148577b = uVar;
        this.f148578c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f148576a.get(), (a) this.f148577b.get(), this.f148578c.get());
    }
}
