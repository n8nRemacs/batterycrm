package com.avito.android.publish.objects.di;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ObjectFillFormModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f237600a;

    public B(dagger.internal.f fVar) {
        this.f237600a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f237600a.get();
        C33939w.f238031a.getClass();
        jVar.setHasStableIds(true);
        return jVar;
    }
}
