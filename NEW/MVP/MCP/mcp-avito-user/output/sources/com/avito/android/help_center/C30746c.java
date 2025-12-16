package com.avito.android.help_center;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: HelpCenterDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.help_center.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30746c implements dagger.internal.h<C30745b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30753j f161623a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161624b;

    public C30746c(C30753j c30753j, dv.b bVar) {
        this.f161623a = c30753j;
        this.f161624b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30745b((InterfaceC30751h) this.f161623a.get(), (a.InterfaceC4053a) this.f161624b.get());
    }
}
