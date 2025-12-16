package com.avito.android.safety.password_setting.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PasswordSettingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.password_setting.l f257508a;

    public f(com.avito.android.safety.password_setting.l lVar) {
        this.f257508a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.safety.password_setting.i) this.f257508a.get());
    }
}
