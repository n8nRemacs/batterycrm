package com.avito.android.di.module;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConstructorAdvertModule_ProvideConstructorAdvertRichRecycledViewPoolFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class V2 implements dagger.internal.h<RecyclerView.t> {

    /* renamed from: a, reason: collision with root package name */
    public final T2 f144153a;

    public V2(T2 t22) {
        this.f144153a = t22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f144153a.getClass();
        return new RecyclerView.t();
    }
}
