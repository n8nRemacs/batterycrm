package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: ClickStreamLocalLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30955f implements dagger.internal.h<C30954e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169142a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f169143b;

    public C30955f(dagger.internal.f fVar, dagger.internal.f fVar2) {
        this.f169142a = fVar;
        this.f169143b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30954e((InterfaceC28373a) this.f169142a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169143b.get());
    }
}
