package com.avito.android.publish.scanner;

import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScannerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f239272a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.scanner.mvi.g f239273b;

    public s(Provider provider, com.avito.android.publish.scanner.mvi.g gVar) {
        this.f239272a = provider;
        this.f239273b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f239272a.get(), (com.avito.android.publish.scanner.mvi.f) this.f239273b.get());
    }
}
