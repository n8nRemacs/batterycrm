package com.avito.android.authorization.start_registration.code_check;

import Zd.q;
import Zd.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RegistrationCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f94618a;

    /* renamed from: b, reason: collision with root package name */
    public final e f94619b;

    /* renamed from: c, reason: collision with root package name */
    public final r f94620c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f94621d;

    public b(g gVar, e eVar, r rVar, dagger.internal.f fVar) {
        this.f94618a = gVar;
        this.f94619b = eVar;
        this.f94620c = rVar;
        this.f94621d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.b bVar = (d.b) this.f94618a.get();
        c.b bVar2 = (c.b) this.f94619b.get();
        this.f94620c.getClass();
        return new a(bVar, bVar2, new q(), (InterfaceC28373a) this.f94621d.get());
    }
}
