package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deeplink_handler.view.a;
import fo0.C40457c;
import fo0.InterfaceC40455a;

/* compiled from: PasswordSettingAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C40457c f257567a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f257568b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f257569c;

    public e(C40457c c40457c, dv.b bVar, dv.b bVar2) {
        this.f257567a = c40457c;
        this.f257568b = bVar;
        this.f257569c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC40455a) this.f257567a.get(), (a.InterfaceC4053a) this.f257568b.get(), (a.b) this.f257569c.get());
    }
}
