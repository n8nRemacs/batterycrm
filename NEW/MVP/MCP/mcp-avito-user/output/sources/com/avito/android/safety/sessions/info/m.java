package com.avito.android.safety.sessions.info;

import com.avito.android.account.E;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SessionsInfoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257978a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f257979b;

    /* renamed from: c, reason: collision with root package name */
    public final u f257980c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f257981d;

    public m(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f257978a = lVar;
        this.f257979b = provider;
        this.f257980c = uVar;
        this.f257981d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((SessionsInfoLink.SessionsInfoParams) this.f257978a.f393949a, this.f257979b.get(), (b) this.f257980c.get(), this.f257981d.get());
    }
}
