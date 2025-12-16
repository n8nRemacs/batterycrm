package com.avito.android.publish.scanner.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.scanner.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScannerPublishViewModelWrapperModule_ProvidePublishViewModelWrapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f239207a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f239208b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f239209c;

    public m(l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f239207a = lVar;
        this.f239208b = provider;
        this.f239209c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((a.c.h) this.f239208b).get();
        int iIntValue = ((Integer) this.f239209c.f393949a).intValue();
        this.f239207a.getClass();
        return new k(c02, iIntValue);
    }
}
