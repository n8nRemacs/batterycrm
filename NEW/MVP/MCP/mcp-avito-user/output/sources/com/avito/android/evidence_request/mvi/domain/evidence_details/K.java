package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.photo_picker.b0;
import javax.inject.Provider;

/* compiled from: FilesInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148674a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.K> f148675b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f148676c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<b0> f148677d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f148678e;

    public K(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f148674a = provider;
        this.f148675b = provider2;
        this.f148676c = provider3;
        this.f148677d = provider4;
        this.f148678e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J(this.f148674a.get(), this.f148675b.get(), this.f148676c.get(), this.f148677d.get(), (com.avito.android.photo_cache.j) this.f148678e.get());
    }
}
