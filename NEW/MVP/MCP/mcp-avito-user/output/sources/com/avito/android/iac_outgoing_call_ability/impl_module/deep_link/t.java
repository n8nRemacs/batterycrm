package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.content.Context;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: IacMakeSupportCallLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168647a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<XL.a> f168648b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f168649c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<BL.a> f168650d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f168651e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168652f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f168653g;

    public t(dagger.internal.f fVar, Provider provider, C30102l3 c30102l3, Provider provider2, Provider provider3, Provider provider4, dagger.internal.f fVar2) {
        this.f168647a = fVar;
        this.f168648b = provider;
        this.f168649c = c30102l3;
        this.f168650d = provider2;
        this.f168651e = provider3;
        this.f168652f = provider4;
        this.f168653g = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.deeplink_handler.handler.composite.a) this.f168647a.get(), this.f168648b.get(), (Context) this.f168649c.get(), this.f168650d.get(), this.f168651e.get(), this.f168652f.get(), (InterfaceC28373a) this.f168653g.get());
    }
}
