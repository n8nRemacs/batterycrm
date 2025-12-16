package com.avito.android.similar_adverts.mvi;

import Lw0.InterfaceC14445b;
import com.avito.android.section.SectionItemConverter;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.similar_adverts.d> f283948a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SectionItemConverter> f283949b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f283950c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f283951d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC14445b> f283952e;

    public c(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f283948a = provider;
        this.f283949b = provider2;
        this.f283950c = lVar;
        this.f283951d = lVar2;
        this.f283952e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f283948a.get(), this.f283949b.get(), (String) this.f283950c.f393949a, ((Boolean) this.f283951d.f393949a).booleanValue(), this.f283952e.get());
    }
}
