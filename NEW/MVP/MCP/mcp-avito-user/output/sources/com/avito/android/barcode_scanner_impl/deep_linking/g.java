package com.avito.android.barcode_scanner_impl.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import dh.InterfaceC39726b;
import javax.inject.Provider;
import kotlin.InterfaceC49066a;

/* compiled from: BarcodeScannerLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f98880a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f98881b;

    /* renamed from: c, reason: collision with root package name */
    public final Yg.c f98882c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC49066a> f98883d;

    public g(dv.b bVar, dv.b bVar2, Yg.c cVar, Provider provider) {
        this.f98880a = bVar;
        this.f98881b = bVar2;
        this.f98882c = cVar;
        this.f98883d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.b) this.f98880a.get(), (a.InterfaceC4053a) this.f98881b.get(), (InterfaceC39726b) this.f98882c.get(), this.f98883d.get());
    }
}
