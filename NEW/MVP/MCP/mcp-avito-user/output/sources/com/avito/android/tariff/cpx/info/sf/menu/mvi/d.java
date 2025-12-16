package com.avito.android.tariff.cpx.info.sf.menu.mvi;

import com.avito.android.tariff.cpx.info.sf.menu.domain.TariffCpxInfoSfMenuContent;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoSfMenuBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296798a;

    public d(l lVar) {
        this.f296798a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((TariffCpxInfoSfMenuContent) this.f296798a.f393949a);
    }
}
