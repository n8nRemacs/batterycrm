package com.avito.android.early_access;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: EarlyAccessDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.early_access.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30283e implements dagger.internal.h<C30281c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.early_access.di.f f145317a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f145318b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f145319c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f145320d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f145321e;

    public C30283e(com.avito.android.early_access.di.f fVar, dv.b bVar, dagger.internal.f fVar2, C25721c c25721c, dv.b bVar2) {
        this.f145317a = fVar;
        this.f145318b = bVar;
        this.f145319c = fVar2;
        this.f145320d = c25721c;
        this.f145321e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30281c((o) this.f145317a.get(), (a.d) this.f145318b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f145319c.get(), (C25719a) this.f145320d.get(), (a.f) this.f145321e.get());
    }
}
