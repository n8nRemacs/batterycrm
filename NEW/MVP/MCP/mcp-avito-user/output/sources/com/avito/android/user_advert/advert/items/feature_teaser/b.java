package com.avito.android.user_advert.advert.items.feature_teaser;

import com.avito.android.advert_core.feature_teasers.common.dialog.n;
import com.avito.android.advert_core.feature_teasers.common.k;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zH0.C50467b;

/* compiled from: MyAdvertFeatureTeaserItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f309380a;

    /* renamed from: b, reason: collision with root package name */
    public final C50467b f309381b;

    /* renamed from: c, reason: collision with root package name */
    public final u f309382c;

    public b(Provider provider, C50467b c50467b, u uVar) {
        this.f309380a = provider;
        this.f309381b = c50467b;
        this.f309382c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f309380a.get(), (k) this.f309381b.get(), (n) this.f309382c.get());
    }
}
