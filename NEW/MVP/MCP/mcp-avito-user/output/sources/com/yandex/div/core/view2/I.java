package com.yandex.div.core.view2;

import android.content.Context;

/* compiled from: DivTransitionBuilder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f367857a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367858b;

    public I(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f367857a = lVar;
        this.f367858b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H((Context) this.f367857a.f393949a, (S) this.f367858b.get());
    }
}
