package com.avito.android.screens.bbip_private_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f261097a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.domain.b f261098b;

    public f(dagger.internal.l lVar, com.avito.android.screens.bbip_private_v2.domain.b bVar) {
        this.f261097a = lVar;
        this.f261098b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f261097a.f393949a, (com.avito.android.screens.bbip_private_v2.domain.a) this.f261098b.get());
    }
}
