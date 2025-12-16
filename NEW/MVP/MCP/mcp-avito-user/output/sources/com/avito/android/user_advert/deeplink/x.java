package com.avito.android.user_advert.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MyAdvertRestorationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final O f310781a;

    /* renamed from: b, reason: collision with root package name */
    public final eH0.e f310782b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f310783c;

    public x(O o12, dv.b bVar, eH0.e eVar) {
        this.f310781a = o12;
        this.f310782b = eVar;
        this.f310783c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((L) this.f310781a.get(), (a.InterfaceC4053a) this.f310783c.get(), (eH0.c) this.f310782b.get());
    }
}
