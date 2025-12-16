package com.avito.android.extended_profile_serp.di;

import android.content.res.Resources;
import com.avito.android.home.InterfaceC30768c;

/* compiled from: ExtendedProfileSerpModule_ProvideColumnsCountProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<InterfaceC30768c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152861a;

    public p(dagger.internal.l lVar) {
        this.f152861a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f152861a.f393949a;
        C30538h.f152853a.getClass();
        return new C30540j(resources);
    }
}
