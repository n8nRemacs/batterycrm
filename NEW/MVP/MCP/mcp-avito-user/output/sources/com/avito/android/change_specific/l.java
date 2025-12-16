package com.avito.android.change_specific;

import Za0.InterfaceC19524a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileChangeSpecificInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f118008a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f118009b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f118010c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f118011d;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f118008a = provider;
        this.f118009b = provider2;
        this.f118010c = provider3;
        this.f118011d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f118008a.get(), dagger.internal.g.b(this.f118009b), this.f118010c.get(), (ExtendedProfileChangeSpecificArguments) this.f118011d.f393949a);
    }
}
