package com.avito.android.autoteka.deeplinks.choosingPurchase;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.f;

/* compiled from: AutotekaChoosingPurchaseDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96264a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f96265b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f96266c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f96267d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<f<ChoosingPurchaseTestGroup>> f96268e;

    public c(dv.b bVar, C30102l3 c30102l3, dv.b bVar2, C25721c c25721c, Provider provider) {
        this.f96264a = bVar;
        this.f96265b = c30102l3;
        this.f96266c = bVar2;
        this.f96267d = c25721c;
        this.f96268e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f96264a.get(), (Context) this.f96265b.get(), (a.InterfaceC4053a) this.f96266c.get(), (C25719a) this.f96267d.get(), this.f96268e.get());
    }
}
