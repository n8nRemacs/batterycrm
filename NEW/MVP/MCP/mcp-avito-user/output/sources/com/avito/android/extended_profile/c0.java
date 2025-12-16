package com.avito.android.extended_profile;

import com.avito.android.extended_profile.mvi.C30474y;
import com.avito.android.extended_profile.mvi.C30475z;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import eA.InterfaceC39978a;
import iT.C41343c;
import javax.inject.Provider;

/* compiled from: ExtendedProfileMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class c0 implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<eA.g> f149403a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39978a> f149404b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<eA.m> f149405c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f149406d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f149407e;

    /* renamed from: f, reason: collision with root package name */
    public final C30475z f149408f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<n.a> f149409g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<gD.f> f149410h;

    public c0(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar, C30475z c30475z, Provider provider5, Provider provider6) {
        this.f149403a = provider;
        this.f149404b = provider2;
        this.f149405c = provider3;
        this.f149406d = provider4;
        this.f149407e = lVar;
        this.f149408f = c30475z;
        this.f149409g = provider5;
        this.f149410h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        eA.g gVar = this.f149403a.get();
        InterfaceC39978a interfaceC39978a = this.f149404b.get();
        eA.m mVar = this.f149405c.get();
        com.avito.android.extended_profile_ux_feedback.b bVar = this.f149406d.get();
        C41343c c41343c = (C41343c) this.f149407e.f393949a;
        C30474y c30474y = (C30474y) this.f149408f.get();
        h31.e eVarB = dagger.internal.g.b(this.f149409g);
        this.f149410h.get();
        return new X(gVar, interfaceC39978a, mVar, bVar, c41343c, c30474y, eVarB);
    }
}
