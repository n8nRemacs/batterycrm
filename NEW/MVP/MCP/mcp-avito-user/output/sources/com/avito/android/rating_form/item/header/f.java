package com.avito.android.rating_form.item.header;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f248447a;

    public f(l lVar) {
        this.f248447a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Boolean) this.f248447a.f393949a).booleanValue());
    }
}
