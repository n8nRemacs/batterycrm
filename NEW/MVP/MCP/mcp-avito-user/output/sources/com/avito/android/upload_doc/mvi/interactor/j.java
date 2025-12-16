package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iH.InterfaceC41285a;
import javax.inject.Provider;

/* compiled from: GigUploadDocInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41285a> f306927a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MG0.a> f306928b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f306929c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f306930d;

    /* renamed from: e, reason: collision with root package name */
    public final u f306931e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f306932f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C> f306933g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f306934h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<E> f306935i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<H> f306936j;

    public j(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f306927a = provider;
        this.f306928b = provider2;
        this.f306929c = lVar;
        this.f306930d = provider3;
        this.f306931e = uVar;
        this.f306932f = provider4;
        this.f306933g = provider5;
        this.f306934h = provider6;
        this.f306935i = provider7;
        this.f306936j = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f306927a.get(), this.f306928b.get(), (GigUploadDocDeeplink.FlowType) this.f306929c.f393949a, this.f306930d.get(), (com.avito.android.photo_picker.converter.f) this.f306931e.get(), this.f306932f.get(), this.f306933g.get(), this.f306934h.get(), this.f306935i.get(), this.f306936j.get());
    }
}
