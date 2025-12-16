package com.avito.android.di.module;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConstructorAdvertModule_ProvideConstructorAdvertRecycledViewPoolFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U2 implements dagger.internal.h<RecyclerView.t> {

    /* renamed from: a, reason: collision with root package name */
    public final T2 f144144a;

    public U2(T2 t22) {
        this.f144144a = t22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f144144a.getClass();
        return new RecyclerView.t();
    }
}
