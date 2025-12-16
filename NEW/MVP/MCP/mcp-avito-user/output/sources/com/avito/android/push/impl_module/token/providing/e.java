package com.avito.android.push.impl_module.token.providing;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.impl_module.token.sending.analytics.j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.A;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompositePushTokenProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f245986a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f245987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245988c;

    /* renamed from: d, reason: collision with root package name */
    public final A f245989d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f245990e;

    public e(dagger.internal.f fVar, Provider provider, Provider provider2, A a12, com.avito.android.push.impl_module.features.b bVar) {
        this.f245986a = fVar;
        this.f245987b = provider;
        this.f245988c = provider2;
        this.f245989d = a12;
        this.f245990e = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f245986a.get();
        j jVar = this.f245987b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f245988c.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f245989d));
        this.f245990e.get();
        return new a(interfaceC28373a, jVar, interfaceC35745a5, eVarA);
    }
}
