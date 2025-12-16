package com.avito.android.screens.bbip_v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f261550a;

    /* renamed from: b, reason: collision with root package name */
    public final u f261551b;

    public f(dagger.internal.l lVar, u uVar) {
        this.f261550a = lVar;
        this.f261551b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f261550a.f393949a, (com.avito.android.screens.bbip_v2.domain.a) this.f261551b.get());
    }
}
