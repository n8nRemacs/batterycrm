package com.avito.android.publish.details.item_wrapper;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPostProcessorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234784a;

    public d(u uVar) {
        this.f234784a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f234784a.get());
    }
}
