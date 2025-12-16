package com.avito.android.advert.item.similars;

import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.section.SectionResponseV3Converter_Factory;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComplementaryInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f80331a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<fa.d> f80332b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f80333c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f80334d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f80335e;

    /* renamed from: f, reason: collision with root package name */
    public final SectionResponseV3Converter_Factory f80336f;

    public r(dagger.internal.l lVar, Provider provider, dagger.internal.l lVar2, Provider provider2, Provider provider3, SectionResponseV3Converter_Factory sectionResponseV3Converter_Factory) {
        this.f80331a = lVar;
        this.f80332b = provider;
        this.f80333c = lVar2;
        this.f80334d = provider2;
        this.f80335e = provider3;
        this.f80336f = sectionResponseV3Converter_Factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((String) this.f80331a.f393949a, dagger.internal.g.b(this.f80332b), (ScreenSource) this.f80333c.f393949a, this.f80334d.get(), this.f80335e.get(), this.f80336f.get());
    }
}
