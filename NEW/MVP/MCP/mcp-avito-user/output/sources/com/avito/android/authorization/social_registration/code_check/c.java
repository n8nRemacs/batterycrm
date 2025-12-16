package com.avito.android.authorization.social_registration.code_check;

import Zd.q;
import Zd.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocRegCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f94590a;

    /* renamed from: b, reason: collision with root package name */
    public final i f94591b;

    /* renamed from: c, reason: collision with root package name */
    public final r f94592c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f94593d;

    public c(k kVar, i iVar, r rVar, dagger.internal.f fVar) {
        this.f94590a = kVar;
        this.f94591b = iVar;
        this.f94592c = rVar;
        this.f94593d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.b bVar = (d.b) this.f94590a.get();
        c.b bVar2 = (c.b) this.f94591b.get();
        this.f94592c.getClass();
        return new b(bVar, bVar2, new q(), (InterfaceC28373a) this.f94593d.get());
    }
}
