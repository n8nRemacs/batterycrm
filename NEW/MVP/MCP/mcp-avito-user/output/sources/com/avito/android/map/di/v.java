package com.avito.android.map.di;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MapModule_ProvideMapViewPortProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<com.avito.android.map_core.view.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f184882a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f184883b;

    public v(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f184882a = lVar;
        this.f184883b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        View viewFindViewById;
        View view = (View) this.f184882a.f393949a;
        Resources resources = (Resources) this.f184883b.f393949a;
        r.f184873a.getClass();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.map_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        } else {
            viewFindViewById = null;
        }
        return new com.avito.android.map_core.view.f(viewFindViewById, resources);
    }
}
