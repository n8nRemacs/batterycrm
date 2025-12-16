package com.avito.android.user_advert.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MyAdvertActivationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35466b implements dagger.internal.h<C35465a> {

    /* renamed from: a, reason: collision with root package name */
    public final O f310707a;

    /* renamed from: b, reason: collision with root package name */
    public final eH0.e f310708b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f310709c;

    public C35466b(O o12, dv.b bVar, eH0.e eVar) {
        this.f310707a = o12;
        this.f310708b = eVar;
        this.f310709c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35465a((L) this.f310707a.get(), (a.InterfaceC4053a) this.f310709c.get(), (eH0.c) this.f310708b.get());
    }
}
