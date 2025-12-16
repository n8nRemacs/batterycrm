package com.avito.android.tariff.cpx.info.advance.mvi;

import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoAdvanceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f296343a;

    public g(dagger.internal.l lVar) {
        this.f296343a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((TariffCpxInfoAdvanceShowLinkBody) this.f296343a.f393949a);
    }
}
