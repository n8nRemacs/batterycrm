package com.avito.android.auto_evidence_request.di;

import com.avito.android.auto_evidence_request.di.l;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidencePhotoPickerModule_ProvideImageUploadedProgressInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f95054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f95055b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f95056c;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f95054a = lVar;
        this.f95055b = provider;
        this.f95056c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f95054a.f393949a;
        com.avito.android.photo_cache.b bVar = (com.avito.android.photo_cache.b) ((l.b.e) this.f95055b).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((l.b.h) this.f95056c).get();
        a.f95053a.getClass();
        return new com.avito.android.photo_cache.n(str, bVar, interfaceC35745a5);
    }
}
