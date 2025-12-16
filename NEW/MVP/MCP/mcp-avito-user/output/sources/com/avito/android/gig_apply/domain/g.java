package com.avito.android.gig_apply.domain;

import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotByTimeThresholdInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f159674a;

    /* renamed from: b, reason: collision with root package name */
    public final l f159675b;

    public g(i iVar, l lVar) {
        this.f159674a = iVar;
        this.f159675b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((h) this.f159674a.get(), (GigSlotOpenParams) this.f159675b.f393949a);
    }
}
