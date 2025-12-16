package com.avito.android.publish.input_imei.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.input_imei.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputImeiPublishViewModelWrapperModule_ProvidePublishViewModelWrapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f236340a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f236341b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f236342c;

    public l(k kVar, Provider provider, dagger.internal.l lVar) {
        this.f236340a = kVar;
        this.f236341b = provider;
        this.f236342c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((a.c.p) this.f236341b).get();
        int iIntValue = ((Integer) this.f236342c.f393949a).intValue();
        this.f236340a.getClass();
        return new j(c02, iIntValue);
    }
}
