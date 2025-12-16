package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2ListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.b f158246a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.b f158247b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.c f158248c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.c f158249d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.c f158250e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.c f158251f;

    public i(com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.b bVar, com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.b bVar2, com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.c cVar, com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.c cVar2, com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.c cVar3, com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.c cVar4) {
        this.f158246a = bVar;
        this.f158247b = bVar2;
        this.f158248c = cVar;
        this.f158249d = cVar2;
        this.f158250e = cVar3;
        this.f158251f = cVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.a aVar = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.a) this.f158246a.get();
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.a aVar2 = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.a) this.f158247b.get();
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.b bVar = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.b) this.f158248c.get();
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.b bVar2 = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.b) this.f158249d.get();
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.b bVar3 = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.b) this.f158250e.get();
        com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.b bVar4 = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.b) this.f158251f.get();
        g.f158244a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        return c10493a.a();
    }
}
