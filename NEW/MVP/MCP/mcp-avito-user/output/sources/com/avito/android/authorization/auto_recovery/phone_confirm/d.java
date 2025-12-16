package com.avito.android.authorization.auto_recovery.phone_confirm;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AutoRecoveryCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final r f93214a;

    /* renamed from: b, reason: collision with root package name */
    public final p f93215b;

    /* renamed from: c, reason: collision with root package name */
    public final h f93216c;

    /* renamed from: d, reason: collision with root package name */
    public final u f93217d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f93218e;

    public d(r rVar, p pVar, h hVar, u uVar, dagger.internal.f fVar) {
        this.f93214a = rVar;
        this.f93215b = pVar;
        this.f93216c = hVar;
        this.f93217d = uVar;
        this.f93218e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((d.b) this.f93214a.get(), (d.b) this.f93215b.get(), (c.b) this.f93216c.get(), (Y1) this.f93217d.get(), (InterfaceC28373a) this.f93218e.get());
    }
}
