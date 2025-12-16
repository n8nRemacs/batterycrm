package com.avito.android.upload_doc.view.checkbox;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocCheckboxBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f306981a;

    /* renamed from: b, reason: collision with root package name */
    public final l f306982b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f306983c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f306984d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f306985e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<H> f306986f;

    public b(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f306981a = uVar;
        this.f306982b = lVar;
        this.f306983c = provider;
        this.f306984d = provider2;
        this.f306985e = provider3;
        this.f306986f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f306981a.get(), (GigUploadDocDeeplink.FlowType) this.f306982b.f393949a, this.f306983c.get(), this.f306984d.get(), this.f306985e.get(), this.f306986f.get());
    }
}
