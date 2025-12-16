package com.avito.android.upload_doc.mvi.logic;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f306949a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f306950b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f306951c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f306952d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H> f306953e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f306954f;

    public d(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f306949a = uVar;
        this.f306950b = lVar;
        this.f306951c = provider;
        this.f306952d = provider2;
        this.f306953e = provider3;
        this.f306954f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.upload_doc.mvi.interactor.a) this.f306949a.get(), (GigUploadDocDeeplink.FlowType) this.f306950b.f393949a, this.f306951c.get(), this.f306952d.get(), this.f306953e.get(), this.f306954f.get());
    }
}
