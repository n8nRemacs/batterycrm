package com.avito.android.user_advert.deeplink;

import com.avito.android.deeplink_handler.view.a;
import nI0.InterfaceC44261b;

/* compiled from: MyDraftDetailsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f310700a;

    /* renamed from: b, reason: collision with root package name */
    public final nI0.d f310701b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f310702c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f310703d;

    public I(dv.b bVar, nI0.d dVar, eH0.e eVar, dv.b bVar2) {
        this.f310700a = bVar;
        this.f310701b = dVar;
        this.f310702c = eVar;
        this.f310703d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H((a.b) this.f310700a.get(), (InterfaceC44261b) this.f310701b.get(), (eH0.c) this.f310702c.get(), (a.InterfaceC4053a) this.f310703d.get());
    }
}
