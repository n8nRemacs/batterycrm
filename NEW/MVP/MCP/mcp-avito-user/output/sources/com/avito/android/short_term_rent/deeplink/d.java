package com.avito.android.short_term_rent.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrIncreasedCashbackApplyLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f282259a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f282260b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f282261c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f282262d;

    public d(i iVar, Provider provider, dv.b bVar, C25721c c25721c) {
        this.f282259a = iVar;
        this.f282260b = provider;
        this.f282261c = bVar;
        this.f282262d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f282259a.get(), this.f282260b.get(), (a.i) this.f282261c.get(), (C25719a) this.f282262d.get());
    }
}
