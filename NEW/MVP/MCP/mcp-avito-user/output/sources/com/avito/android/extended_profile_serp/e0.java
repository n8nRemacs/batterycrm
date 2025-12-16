package com.avito.android.extended_profile_serp;

import iT.C41343c;

/* compiled from: ExtendedProfileSerpViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class e0 implements dagger.internal.h<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.mvi.u f152883a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f152884b;

    public e0(com.avito.android.extended_profile_serp.mvi.u uVar, dagger.internal.u uVar2) {
        this.f152883a = uVar;
        this.f152884b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d0((com.avito.android.extended_profile_serp.mvi.t) this.f152883a.get(), (C41343c) this.f152884b.get());
    }
}
