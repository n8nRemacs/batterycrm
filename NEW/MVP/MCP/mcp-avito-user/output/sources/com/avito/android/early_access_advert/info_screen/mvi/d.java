package com.avito.android.early_access_advert.info_screen.mvi;

import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessAdvertInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f145734a;

    public d(l lVar) {
        this.f145734a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((EarlyAccessAdvert) this.f145734a.f393949a);
    }
}
