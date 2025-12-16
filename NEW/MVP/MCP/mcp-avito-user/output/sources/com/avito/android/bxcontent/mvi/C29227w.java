package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import gj.InterfaceC40691b;
import hl.C40953a;
import hl.C40956d;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: BxContentBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.mvi.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29227w implements dagger.internal.h<C29225v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f112606a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f112607b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f112608c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f112609d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f112610e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.a> f112611f;

    /* renamed from: g, reason: collision with root package name */
    public final C40956d f112612g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f112613h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f112614i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f112615j;

    public C29227w(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C40956d c40956d, Provider provider6, dagger.internal.u uVar, Provider provider7) {
        this.f112606a = lVar;
        this.f112607b = provider;
        this.f112608c = provider2;
        this.f112609d = provider3;
        this.f112610e = provider4;
        this.f112611f = provider5;
        this.f112612g = c40956d;
        this.f112613h = provider6;
        this.f112614i = uVar;
        this.f112615j = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29225v((BxContentArguments) this.f112606a.f393949a, this.f112607b, this.f112608c.get(), this.f112609d.get(), this.f112610e.get(), this.f112611f.get(), (C40953a) this.f112612g.get(), this.f112613h.get(), (InterfaceC34736h0) this.f112614i.get(), this.f112615j.get());
    }
}
