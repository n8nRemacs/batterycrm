package com.avito.android.evidence_request.details.di;

import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.K;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideFilesInteractorWrapperFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<FilesInteractor> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148428a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f148429b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<b0> f148430c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f148431d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148432e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<K> f148433f;

    public y(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f148428a = provider;
        this.f148429b = provider2;
        this.f148430c = provider3;
        this.f148431d = uVar;
        this.f148432e = provider4;
        this.f148433f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = (AppealId) ((C30376a.b.c) this.f148428a).get();
        com.avito.android.photo_cache.b bVar = (com.avito.android.photo_cache.b) ((C30376a.b.p) this.f148429b).get();
        b0 b0Var = this.f148430c.get();
        com.avito.android.photo_cache.j jVar = (com.avito.android.photo_cache.j) this.f148431d.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C30376a.b.u) this.f148432e).get();
        K k12 = (K) ((C30376a.b.j) this.f148433f).get();
        w.f148426a.getClass();
        return new com.avito.android.evidence_request.details.files.n(appealId.f148206b, bVar, b0Var, jVar, interfaceC35745a5, k12);
    }
}
