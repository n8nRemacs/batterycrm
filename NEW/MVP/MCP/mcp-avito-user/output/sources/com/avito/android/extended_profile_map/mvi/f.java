package com.avito.android.extended_profile_map.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sc.InterfaceC48155d;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileMapActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_phone_dialog.g> f151286a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50427a> f151287b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f151288c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f151289d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC48155d> f151290e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f151291f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f151292g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f151293h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f151294i;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f151286a = provider;
        this.f151287b = provider2;
        this.f151288c = provider3;
        this.f151289d = provider4;
        this.f151290e = provider5;
        this.f151291f = provider6;
        this.f151292g = provider7;
        this.f151293h = lVar;
        this.f151294i = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f151286a.get(), this.f151287b.get(), this.f151288c.get(), this.f151289d.get(), this.f151290e.get(), this.f151291f.get(), this.f151292g.get(), (String) this.f151293h.f393949a, (String) this.f151294i.f393949a);
    }
}
