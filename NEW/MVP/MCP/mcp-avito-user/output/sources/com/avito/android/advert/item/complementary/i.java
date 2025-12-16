package com.avito.android.advert.item.complementary;

import Tp0.s;
import com.avito.android.favorite.q;
import com.avito.android.section.o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RestyleComplementarySectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<o> f74611a;

    /* renamed from: b, reason: collision with root package name */
    public final s f74612b;

    /* renamed from: c, reason: collision with root package name */
    public final q f74613c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert.viewed.i f74614d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f74615e;

    public i(Provider provider, s sVar, q qVar, com.avito.android.advert.viewed.i iVar, Provider provider2) {
        this.f74611a = provider;
        this.f74612b = sVar;
        this.f74613c = qVar;
        this.f74614d = iVar;
        this.f74615e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = this.f74611a.get();
        com.avito.konveyor.a aVar = this.f74615e.get();
        return new h(oVar, this.f74612b, this.f74613c, this.f74614d, aVar);
    }
}
