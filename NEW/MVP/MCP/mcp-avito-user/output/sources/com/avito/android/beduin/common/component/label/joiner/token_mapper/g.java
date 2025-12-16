package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import Ui.InterfaceC15523b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LinkTokenMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f101673a;

    public g(dagger.internal.f fVar) {
        this.f101673a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC15523b) this.f101673a.get());
    }
}
