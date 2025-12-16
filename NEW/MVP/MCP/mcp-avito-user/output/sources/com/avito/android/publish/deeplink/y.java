package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: IacForProInfoSheetShowDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232612a;

    public y(dv.b bVar) {
        this.f232612a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((a.d) this.f232612a.get());
    }
}
