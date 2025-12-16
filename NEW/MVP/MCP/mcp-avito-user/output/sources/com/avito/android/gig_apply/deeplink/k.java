package com.avito.android.gig_apply.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_apply.ui.n;
import com.avito.android.gig_apply.ui.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final p f159580a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f159581b;

    public k(p pVar, dv.b bVar) {
        this.f159580a = pVar;
        this.f159581b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((n) this.f159580a.get(), (a.InterfaceC4053a) this.f159581b.get());
    }
}
