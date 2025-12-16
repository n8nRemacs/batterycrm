package com.avito.android.authorization.reset_password.code_check;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResetPasswordCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final k f94118a;

    /* renamed from: b, reason: collision with root package name */
    public final i f94119b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f94120c;

    public d(k kVar, i iVar, dagger.internal.f fVar) {
        this.f94118a = kVar;
        this.f94119b = iVar;
        this.f94120c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((d.b) this.f94118a.get(), (c.b) this.f94119b.get(), (InterfaceC28373a) this.f94120c.get());
    }
}
