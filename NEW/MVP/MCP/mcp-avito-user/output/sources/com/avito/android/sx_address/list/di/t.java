package com.avito.android.sx_address.list.di;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: SxAddressListModule_ProvideSharedPreferencesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class t implements dagger.internal.h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f293114a;

    public t(dagger.internal.l lVar) {
        this.f293114a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f293114a.f393949a;
        p.f293111a.getClass();
        return activity.getSharedPreferences("SX_ADDRESS_LIST_PREFERENCES", 0);
    }
}
