package com.avito.android.upload_doc.view.sections;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocSectionsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f307059a;

    /* renamed from: b, reason: collision with root package name */
    public final u f307060b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f307061c;

    /* renamed from: d, reason: collision with root package name */
    public final l f307062d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f307063e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f307064f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<H> f307065g;

    public b(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f307059a = provider;
        this.f307060b = uVar;
        this.f307061c = provider2;
        this.f307062d = lVar;
        this.f307063e = provider3;
        this.f307064f = provider4;
        this.f307065g = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f307059a.get(), (com.avito.konveyor.a) this.f307060b.get(), this.f307061c.get(), (GigUploadDocDeeplink.FlowType) this.f307062d.f393949a, this.f307063e.get(), this.f307064f.get(), this.f307065g.get());
    }
}
