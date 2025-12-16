package com.avito.android.beduin.common.preparer;

import dagger.internal.x;
import dagger.internal.y;
import ei.InterfaceC40108b;

/* compiled from: PromoBlocksGroupModelPreparer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final ei.d f103459a;

    public k(ei.d dVar) {
        this.f103459a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC40108b) this.f103459a.get());
    }
}
