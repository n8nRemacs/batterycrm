package com.avito.android.profile.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PasswordUpgradeAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Zd.l f221918a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221919b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f221920c;

    public m(Zd.l lVar, dv.b bVar, dv.b bVar2) {
        this.f221918a = lVar;
        this.f221919b = bVar;
        this.f221920c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Zd.i) this.f221918a.get(), (a.InterfaceC4053a) this.f221919b.get(), (a.b) this.f221920c.get());
    }
}
