package com.avito.android.advert.item.complementary.redesign;

import Tp0.t;
import com.avito.android.advert.viewed.i;
import com.avito.android.favorite.q;
import com.avito.android.section.o;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComplementarySectionRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<o> f74623a;

    /* renamed from: b, reason: collision with root package name */
    public final t f74624b;

    /* renamed from: c, reason: collision with root package name */
    public final q f74625c;

    /* renamed from: d, reason: collision with root package name */
    public final i f74626d;

    /* renamed from: e, reason: collision with root package name */
    public final u f74627e;

    public c(Provider provider, t tVar, q qVar, i iVar, u uVar) {
        this.f74623a = provider;
        this.f74624b = tVar;
        this.f74625c = qVar;
        this.f74626d = iVar;
        this.f74627e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f74623a.get(), this.f74624b, this.f74625c, this.f74626d, (com.avito.konveyor.a) this.f74627e.get());
    }
}
