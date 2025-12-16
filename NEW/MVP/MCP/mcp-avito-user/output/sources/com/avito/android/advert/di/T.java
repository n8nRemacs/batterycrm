package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.serp.adapter.C34690c0;
import com.avito.android.serp.adapter.h1;

/* compiled from: AdvertFragmentModule_ProvideGridPositionProvider$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class T implements dagger.internal.h<h1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69120a;

    public T(dagger.internal.l lVar) {
        this.f69120a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f69120a.f393949a;
        C27710t.f69463a.getClass();
        return new C34690c0(resources.getInteger(R.integer.similar_adverts_columns));
    }
}
