package com.avito.android.mall.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MallMainLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f184268a;

    /* renamed from: b, reason: collision with root package name */
    public final f f184269b;

    public k(dv.b bVar, f fVar) {
        this.f184268a = bVar;
        this.f184269b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a.InterfaceC4053a) this.f184268a.get(), (d) this.f184269b.get());
    }
}
