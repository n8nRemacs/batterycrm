package com.avito.android.screens.bbip_private_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260979a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.domain.b f260980b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.domain.f f260981c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.domain.d f260982d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.data.d f260983e;

    public d(dagger.internal.l lVar, com.avito.android.screens.bbip_private_v2.domain.b bVar, com.avito.android.screens.bbip_private_v2.domain.f fVar, com.avito.android.screens.bbip_private_v2.domain.d dVar, com.avito.android.screens.bbip_private_v2.data.d dVar2) {
        this.f260979a = lVar;
        this.f260980b = bVar;
        this.f260981c = fVar;
        this.f260982d = dVar;
        this.f260983e = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f260979a.f393949a, (com.avito.android.screens.bbip_private_v2.domain.a) this.f260980b.get(), (com.avito.android.screens.bbip_private_v2.domain.e) this.f260981c.get(), (com.avito.android.screens.bbip_private_v2.domain.c) this.f260982d.get(), (com.avito.android.screens.bbip_private_v2.data.a) this.f260983e.get());
    }
}
