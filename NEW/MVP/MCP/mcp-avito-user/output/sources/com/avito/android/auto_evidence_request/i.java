package com.avito.android.auto_evidence_request;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f95178a;

    public i(Provider<InterfaceC35863o4> provider) {
        this.f95178a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f95178a.get());
    }
}
