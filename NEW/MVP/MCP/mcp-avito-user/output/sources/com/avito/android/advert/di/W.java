package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: AdvertFragmentModule_ProvideIsTablet$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class W implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69122a;

    public W(dagger.internal.l lVar) {
        this.f69122a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f69122a.f393949a;
        C27710t.f69463a.getClass();
        return Boolean.valueOf(resources.getBoolean(R.bool.is_tablet));
    }
}
