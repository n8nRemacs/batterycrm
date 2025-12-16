package com.avito.android.c2c_trx.deeplinks;

import Pl.C14802c;
import Pl.InterfaceC14800a;
import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddAutoToC2CTrxDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f113300a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f113301b;

    /* renamed from: c, reason: collision with root package name */
    public final C14802c f113302c;

    /* renamed from: d, reason: collision with root package name */
    public final f f113303d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f113304e;

    /* renamed from: f, reason: collision with root package name */
    public final f f113305f;

    public d(C30102l3 c30102l3, dv.b bVar, C14802c c14802c, f fVar, Provider provider, f fVar2) {
        this.f113300a = c30102l3;
        this.f113301b = bVar;
        this.f113302c = c14802c;
        this.f113303d = fVar;
        this.f113304e = provider;
        this.f113305f = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f113300a.get(), (a.g) this.f113301b.get(), (InterfaceC14800a) this.f113302c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f113303d.get(), this.f113304e.get(), (com.avito.android.deep_linking.x) this.f113305f.get());
    }
}
