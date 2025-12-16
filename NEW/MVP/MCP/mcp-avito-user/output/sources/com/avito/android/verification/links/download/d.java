package com.avito.android.verification.links.download;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: VerificationDownloadLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f324200a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324201b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324202c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f324203d;

    /* renamed from: e, reason: collision with root package name */
    public final i f324204e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324205f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f324206g;

    public d(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, dv.b bVar3, i iVar, Provider provider, Provider provider2) {
        this.f324200a = c30102l3;
        this.f324201b = bVar;
        this.f324202c = bVar2;
        this.f324203d = bVar3;
        this.f324204e = iVar;
        this.f324205f = provider;
        this.f324206g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f324200a.get(), (a.g) this.f324201b.get(), (a.i) this.f324202c.get(), (a.h) this.f324203d.get(), (e) this.f324204e.get(), this.f324205f.get(), this.f324206g.get());
    }
}
