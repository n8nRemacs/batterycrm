package com.avito.android.verification.links.vtb;

import android.content.pm.PackageManager;
import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yM0.C50145n;

/* compiled from: VerificationVTBLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f324736a;

    /* renamed from: b, reason: collision with root package name */
    public final C50145n f324737b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f324738c;

    public i(Provider provider, C50145n c50145n, Provider provider2) {
        this.f324736a = provider;
        this.f324737b = c50145n;
        this.f324738c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f324736a.get(), (PackageManager) this.f324737b.get(), this.f324738c.get());
    }
}
