package com.avito.android.beduin.common.component.imagesRow;

import Oh.C14689b;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinImagesRowComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f101481a;

    /* renamed from: b, reason: collision with root package name */
    public final C14689b f101482b;

    public d(dagger.internal.f fVar, C14689b c14689b) {
        this.f101481a = fVar;
        this.f101482b = c14689b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f101481a), (f) this.f101482b.get());
    }
}
