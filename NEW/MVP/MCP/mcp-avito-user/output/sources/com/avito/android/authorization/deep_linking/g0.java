package com.avito.android.authorization.deep_linking;

import Zd.InterfaceC19542a;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: ResetPasswordSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class g0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f93780a;

    /* renamed from: b, reason: collision with root package name */
    public final Zd.d f93781b;

    public g0(dv.b bVar, Zd.d dVar) {
        this.f93780a = bVar;
        this.f93781b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f0((a.InterfaceC4053a) this.f93780a.get(), (InterfaceC19542a) this.f93781b.get());
    }
}
