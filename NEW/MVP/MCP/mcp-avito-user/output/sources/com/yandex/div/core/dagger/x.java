package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.g0;

/* compiled from: DivKitModule_ProvideSendBeaconManagerFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class x implements dagger.internal.h<com.yandex.android.beacon.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f367425a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f367426b;

    public x(dagger.internal.l lVar, g0 g0Var) {
        this.f367425a = lVar;
        this.f367426b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    @Y61.l
    public final Object get() {
        Context context = (Context) this.f367425a.f393949a;
        com.yandex.android.beacon.b bVar = (com.yandex.android.beacon.b) this.f367426b.get();
        int i12 = w.f367424a;
        if (bVar == null) {
            return null;
        }
        return new com.yandex.android.beacon.d(context, bVar);
    }
}
