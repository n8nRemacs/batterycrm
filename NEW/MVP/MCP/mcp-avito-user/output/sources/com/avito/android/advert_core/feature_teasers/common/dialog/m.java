package com.avito.android.advert_core.feature_teasers.common.dialog;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import zH0.C50467b;

/* compiled from: CommonFeatureTeaserDialogFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83648a;

    /* renamed from: b, reason: collision with root package name */
    public final B9.c f83649b;

    /* renamed from: c, reason: collision with root package name */
    public final C50467b f83650c;

    /* renamed from: d, reason: collision with root package name */
    public final d f83651d;

    public m(u uVar, B9.c cVar, C50467b c50467b, d dVar) {
        this.f83648a = uVar;
        this.f83649b = cVar;
        this.f83650c = c50467b;
        this.f83651d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.konveyor.a) this.f83648a.get(), (com.avito.konveyor.adapter.h) this.f83649b.get(), (com.avito.android.advert_core.feature_teasers.common.k) this.f83650c.get(), (b) this.f83651d.get());
    }
}
