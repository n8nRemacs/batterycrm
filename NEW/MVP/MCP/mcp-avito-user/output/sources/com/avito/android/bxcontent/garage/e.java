package com.avito.android.bxcontent.garage;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddCarToGarageDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f111103a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f111104b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f111105c;

    /* renamed from: d, reason: collision with root package name */
    public final h f111106d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f111107e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f111108f;

    public e(C30102l3 c30102l3, dagger.internal.f fVar, dv.b bVar, h hVar, Provider provider, Provider provider2) {
        this.f111103a = c30102l3;
        this.f111104b = fVar;
        this.f111105c = bVar;
        this.f111106d = hVar;
        this.f111107e = provider;
        this.f111108f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f111103a.get(), (InterfaceC28373a) this.f111104b.get(), (a.i) this.f111105c.get(), (g) this.f111106d.get(), this.f111107e.get(), this.f111108f.get());
    }
}
