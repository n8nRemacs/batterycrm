package com.avito.android.serp.adapter.empty_placeholder;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptyPlaceholderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f269914a;

    public k(dagger.internal.f fVar) {
        this.f269914a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f269914a));
    }
}
