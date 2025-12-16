package com.avito.android.evidence_request.di;

import com.avito.android.evidence_request.details.files.q;
import com.avito.android.evidence_request.details.files.r;
import com.avito.android.evidence_request.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceWiperModule_ProvideFilesWiperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f148620a;

    public j(Provider<com.avito.android.photo_cache.b> provider) {
        this.f148620a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_cache.b bVar = (com.avito.android.photo_cache.b) ((a.b.C4355b) this.f148620a).get();
        i.f148619a.getClass();
        return new r(bVar);
    }
}
