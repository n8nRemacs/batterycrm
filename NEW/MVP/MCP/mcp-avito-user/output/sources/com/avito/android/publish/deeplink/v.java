package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: IacAnonymousInfoSheetShowDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232609a;

    public v(dv.b bVar) {
        this.f232609a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((a.d) this.f232609a.get());
    }
}
