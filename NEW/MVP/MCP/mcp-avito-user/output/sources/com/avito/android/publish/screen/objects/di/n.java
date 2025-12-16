package com.avito.android.publish.screen.objects.di;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.j> f239916b;

    public n(C34019j c34019j, Provider<com.avito.konveyor.adapter.j> provider) {
        this.f239915a = c34019j;
        this.f239916b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = this.f239916b.get();
        this.f239915a.getClass();
        jVar.setHasStableIds(true);
        return jVar;
    }
}
