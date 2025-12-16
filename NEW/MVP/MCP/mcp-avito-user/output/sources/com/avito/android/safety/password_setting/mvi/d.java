package com.avito.android.safety.password_setting.mvi;

import com.avito.android.credman.o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordSettingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<o> f257486a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safety.password_setting.l f257487b;

    public d(Provider provider, com.avito.android.safety.password_setting.l lVar) {
        this.f257486a = provider;
        this.f257487b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f257486a.get(), (com.avito.android.safety.password_setting.i) this.f257487b.get());
    }
}
