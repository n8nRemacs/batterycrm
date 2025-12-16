package com.avito.android.user_advert.advert.delegate.installments;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsSwitcherResourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f308626a;

    public k(l lVar) {
        this.f308626a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Resources) this.f308626a.f393949a);
    }
}
