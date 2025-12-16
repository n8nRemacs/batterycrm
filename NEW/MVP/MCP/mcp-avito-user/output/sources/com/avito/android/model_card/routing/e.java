package com.avito.android.model_card.routing;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ModelCardNonTabDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f198054a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f198055b;

    public e(C30102l3 c30102l3, dv.b bVar) {
        this.f198054a = c30102l3;
        this.f198055b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f198054a.get(), (a.InterfaceC4053a) this.f198055b.get());
    }
}
