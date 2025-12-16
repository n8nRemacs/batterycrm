package com.avito.android.autoteka.deeplinks.directPurchase;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaDirectPurchaseDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f96274a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96275b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f96276c;

    public c(C25721c c25721c, C30102l3 c30102l3, dv.b bVar) {
        this.f96274a = c30102l3;
        this.f96275b = bVar;
        this.f96276c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f96274a.get(), (C25719a) this.f96276c.get(), (a.InterfaceC4053a) this.f96275b.get());
    }
}
