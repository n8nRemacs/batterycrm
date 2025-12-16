package com.avito.android.beduin.ui.screen.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinScreenLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f104105a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f104106b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f104107c;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f104105a = c30102l3;
        this.f104106b = bVar;
        this.f104107c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f104105a.get(), (a.InterfaceC4053a) this.f104106b.get(), (a.b) this.f104107c.get());
    }
}
