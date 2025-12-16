package com.avito.android.publish.details.iac;

import android.content.res.Resources;
import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacPermissionRequestHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234737a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f234738b;

    /* renamed from: c, reason: collision with root package name */
    public final u f234739c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f234740d;

    public h(u uVar, Provider provider, u uVar2, dagger.internal.l lVar) {
        this.f234737a = uVar;
        this.f234738b = provider;
        this.f234739c = uVar2;
        this.f234740d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC33535v) this.f234737a.get(), this.f234738b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f234739c.get(), (Resources) this.f234740d.f393949a);
    }
}
