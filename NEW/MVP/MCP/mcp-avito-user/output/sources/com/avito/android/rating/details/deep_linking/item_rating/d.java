package com.avito.android.rating.details.deep_linking.item_rating;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemRatingsLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.h f246958a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f246959b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f246960c;

    public d(com.avito.android.rating.h hVar, dv.b bVar, C25721c c25721c) {
        this.f246958a = hVar;
        this.f246959b = bVar;
        this.f246960c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f246958a.get(), (a.InterfaceC4053a) this.f246959b.get(), (C25719a) this.f246960c.get());
    }
}
