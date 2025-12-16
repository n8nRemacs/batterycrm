package com.avito.android.avl.view;

import iT.C41343c;

/* compiled from: AvlPlayerViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.avl.mvi.t f98418a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f98419b;

    public w(com.avito.android.avl.mvi.t tVar, dagger.internal.u uVar) {
        this.f98418a = tVar;
        this.f98419b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((com.avito.android.avl.mvi.s) this.f98418a.get(), (C41343c) this.f98419b.get());
    }
}
