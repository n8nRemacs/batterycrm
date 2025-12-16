package com.avito.android.advert_core.feature_teasers.common.dialog;

import com.avito.android.K0;
import com.avito.android.L0;
import dagger.internal.x;
import dagger.internal.y;
import zH0.C50467b;

/* compiled from: AdvertDetailsFeatureTeaserDialogItemsAdapter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C50467b f83622a;

    /* renamed from: b, reason: collision with root package name */
    public final L0 f83623b;

    public d(C50467b c50467b, L0 l02) {
        this.f83622a = c50467b;
        this.f83623b = l02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_core.feature_teasers.common.k kVar = (com.avito.android.advert_core.feature_teasers.common.k) this.f83622a.get();
        this.f83623b.getClass();
        return new b(kVar, new K0());
    }
}
