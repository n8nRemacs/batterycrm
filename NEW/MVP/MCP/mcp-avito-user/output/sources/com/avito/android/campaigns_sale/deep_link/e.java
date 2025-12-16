package com.avito.android.campaigns_sale.deep_link;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CampaignsSaleLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f113894a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f113895b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f113896c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f113897d;

    public e(C25721c c25721c, C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f113894a = c30102l3;
        this.f113895b = bVar;
        this.f113896c = c25721c;
        this.f113897d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f113894a.get(), (C25719a) this.f113896c.get(), (a.InterfaceC4053a) this.f113895b.get(), (a.b) this.f113897d.get());
    }
}
