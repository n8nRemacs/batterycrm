package com.avito.android.advert_core.auto_select_parameters_v2;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectParametersV2PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f82986a;

    /* renamed from: b, reason: collision with root package name */
    public final l f82987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f82988c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f82986a = provider;
        this.f82987b = lVar;
        this.f82988c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f82986a.get(), (String) this.f82987b.f393949a, this.f82988c.get());
    }
}
