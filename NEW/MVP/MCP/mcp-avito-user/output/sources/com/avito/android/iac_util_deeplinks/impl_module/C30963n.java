package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;

/* compiled from: OpenSystemSettingsLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30963n implements dagger.internal.h<C30962m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169154a;

    /* renamed from: b, reason: collision with root package name */
    public final C35868p2 f169155b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f169156c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f169157d;

    public C30963n(dagger.internal.f fVar, C35868p2 c35868p2, dv.b bVar, dagger.internal.f fVar2) {
        this.f169154a = fVar;
        this.f169155b = c35868p2;
        this.f169156c = bVar;
        this.f169157d = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30962m((InterfaceC28373a) this.f169154a.get(), (InterfaceC35845m2) this.f169155b.get(), (a.InterfaceC4053a) this.f169156c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169157d.get());
    }
}
