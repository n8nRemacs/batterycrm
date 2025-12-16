package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.extended_profile_serp.InterfaceC30552o;

/* compiled from: ExtendedProfileSerpBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f153051a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f153052b;

    public r(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f153051a = uVar;
        this.f153052b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC30552o) this.f153051a.get(), (ExtendedProfileSerpConfig) this.f153052b.f393949a);
    }
}
