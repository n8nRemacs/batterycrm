package com.avito.android.home;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MainScreenLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final O f162527a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f162528b;

    public v(O o12, dv.b bVar) {
        this.f162527a = o12;
        this.f162528b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((L) this.f162527a.get(), (a.InterfaceC4053a) this.f162528b.get());
    }
}
