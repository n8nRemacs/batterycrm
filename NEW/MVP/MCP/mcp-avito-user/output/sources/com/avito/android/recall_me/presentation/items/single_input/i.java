package com.avito.android.recall_me.presentation.items.single_input;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleInputPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.recall_me.di.k f251968a;

    public i(com.avito.android.recall_me.di.k kVar) {
        this.f251968a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.jakewharton.rxrelay3.c) this.f251968a.get());
    }
}
