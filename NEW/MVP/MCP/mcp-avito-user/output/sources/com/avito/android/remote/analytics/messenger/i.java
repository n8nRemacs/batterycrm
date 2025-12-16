package com.avito.android.remote.analytics.messenger;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.n;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import lj0.C43784d;
import lj0.InterfaceC43782b;

/* compiled from: MessengerNetworkErrorsReporterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes17.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final A f253212a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f253213b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n> f253214c;

    /* renamed from: d, reason: collision with root package name */
    public final C43784d f253215d;

    public i(A a12, dagger.internal.f fVar, Provider provider, C43784d c43784d) {
        this.f253212a = a12;
        this.f253213b = fVar;
        this.f253214c = provider;
        this.f253215d = c43784d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Set) this.f253212a.get(), (InterfaceC28373a) this.f253213b.get(), this.f253214c.get(), (InterfaceC43782b) this.f253215d.get());
    }
}
