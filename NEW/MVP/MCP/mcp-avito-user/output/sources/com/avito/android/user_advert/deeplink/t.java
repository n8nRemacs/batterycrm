package com.avito.android.user_advert.deeplink;

import com.avito.android.deeplink_handler.view.a;
import nI0.InterfaceC44261b;
import ur.InterfaceC49101b;

/* compiled from: MyAdvertDetailsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f310767a;

    /* renamed from: b, reason: collision with root package name */
    public final nI0.d f310768b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f310769c;

    /* renamed from: d, reason: collision with root package name */
    public final ur.e f310770d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f310771e;

    public t(dv.b bVar, nI0.d dVar, eH0.e eVar, ur.e eVar2, dv.b bVar2) {
        this.f310767a = bVar;
        this.f310768b = dVar;
        this.f310769c = eVar;
        this.f310770d = eVar2;
        this.f310771e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((a.b) this.f310767a.get(), (InterfaceC44261b) this.f310768b.get(), (eH0.c) this.f310769c.get(), (InterfaceC49101b) this.f310770d.get(), (a.InterfaceC4053a) this.f310771e.get());
    }
}
