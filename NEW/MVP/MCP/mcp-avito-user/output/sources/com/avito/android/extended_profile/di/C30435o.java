package com.avito.android.extended_profile.di;

import Ab.C13005a;
import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import javax.inject.Provider;

/* compiled from: ExtendedProfileCommercialModule_ProvideItemVisibilityTracker$_avito_extended_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.di.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30435o implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Ab.c> f149942a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C13005a> f149943b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f149944c;

    public C30435o(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f149942a = provider;
        this.f149943b = provider2;
        this.f149944c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Ab.c cVar = this.f149942a.get();
        C13005a c13005a = this.f149943b.get();
        Bundle bundle = (Bundle) this.f149944c.f393949a;
        C30431k.f149938a.getClass();
        d.a aVar = new d.a(bundle, true);
        aVar.a(cVar);
        aVar.a(c13005a);
        return aVar.b();
    }
}
