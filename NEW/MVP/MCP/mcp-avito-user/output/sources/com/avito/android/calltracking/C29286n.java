package com.avito.android.calltracking;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;

/* compiled from: CalltrackingDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.calltracking.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29286n implements dagger.internal.h<C29285m> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f113758a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f113759b;

    public C29286n(C30102l3 c30102l3, dv.b bVar) {
        this.f113758a = c30102l3;
        this.f113759b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29285m((Context) this.f113758a.get(), (a.InterfaceC4053a) this.f113759b.get());
    }
}
