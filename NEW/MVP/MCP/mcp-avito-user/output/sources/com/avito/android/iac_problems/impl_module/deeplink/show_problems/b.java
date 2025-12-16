package com.avito.android.iac_problems.impl_module.deeplink.show_problems;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import jM.InterfaceC42283a;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: IacShowProblemBottomSheetLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f168766a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f168767b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f168768c;

    /* renamed from: d, reason: collision with root package name */
    public final f f168769d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f168770e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC42283a> f168771f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.iac_problems.impl_module.problems_bottom_sheet.a> f168772g;

    /* renamed from: h, reason: collision with root package name */
    public final f f168773h;

    public b(Provider provider, dv.b bVar, dv.b bVar2, f fVar, Provider provider2, Provider provider3, Provider provider4, f fVar2) {
        this.f168766a = provider;
        this.f168767b = bVar;
        this.f168768c = bVar2;
        this.f168769d = fVar;
        this.f168770e = provider2;
        this.f168771f = provider3;
        this.f168772g = provider4;
        this.f168773h = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f168766a.get(), (a.f) this.f168767b.get(), (a.d) this.f168768c.get(), (InterfaceC28373a) this.f168769d.get(), this.f168770e.get(), this.f168771f.get(), this.f168772g.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f168773h.get());
    }
}
