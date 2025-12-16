package com.avito.android.autoteka.deeplinks.payment;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPaymentDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f96286a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96287b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f96288c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f96289d;

    public c(C25721c c25721c, C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f96286a = c30102l3;
        this.f96287b = bVar;
        this.f96288c = bVar2;
        this.f96289d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f96286a.get(), (C25719a) this.f96289d.get(), (a.InterfaceC4053a) this.f96287b.get(), (a.b) this.f96288c.get());
    }
}
