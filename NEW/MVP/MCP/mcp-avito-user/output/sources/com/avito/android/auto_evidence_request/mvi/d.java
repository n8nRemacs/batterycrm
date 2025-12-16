package com.avito.android.auto_evidence_request.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.auto_evidence_request.d> f95260a;

    /* renamed from: b, reason: collision with root package name */
    public final l f95261b;

    /* renamed from: c, reason: collision with root package name */
    public final l f95262c;

    public d(l lVar, l lVar2, Provider provider) {
        this.f95260a = provider;
        this.f95261b = lVar;
        this.f95262c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f95260a.get(), (String) this.f95261b.f393949a, ((Boolean) this.f95262c.f393949a).booleanValue());
    }
}
