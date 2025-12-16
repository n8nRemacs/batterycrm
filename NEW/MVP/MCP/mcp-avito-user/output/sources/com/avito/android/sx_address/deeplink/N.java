package com.avito.android.sx_address.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SxAddressVideoVerificationLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f292812a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f292813b;

    /* renamed from: c, reason: collision with root package name */
    public final y f292814c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f292815d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f292816e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f292817f;

    public N(C30102l3 c30102l3, dv.b bVar, y yVar, dv.b bVar2, dv.b bVar3, Provider provider) {
        this.f292812a = c30102l3;
        this.f292813b = bVar;
        this.f292814c = yVar;
        this.f292815d = bVar2;
        this.f292816e = bVar3;
        this.f292817f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f292812a.get();
        a.b bVar = (a.b) this.f292813b.get();
        this.f292814c.getClass();
        return new M(context, bVar, new x(), (a.InterfaceC4053a) this.f292815d.get(), (a.i) this.f292816e.get(), this.f292817f.get());
    }
}
