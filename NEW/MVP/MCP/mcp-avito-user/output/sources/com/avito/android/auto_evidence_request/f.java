package com.avito.android.auto_evidence_request;

import com.avito.android.remote.K;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K> f95109a;

    /* renamed from: b, reason: collision with root package name */
    public final i f95110b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f95111c;

    public f(Provider provider, i iVar, Provider provider2) {
        this.f95109a = provider;
        this.f95110b = iVar;
        this.f95111c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f95109a.get(), (g) this.f95110b.get(), this.f95111c.get());
    }
}
