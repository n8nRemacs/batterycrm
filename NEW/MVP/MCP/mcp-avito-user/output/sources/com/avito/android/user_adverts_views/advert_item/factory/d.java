package com.avito.android.user_adverts_views.advert_item.factory;

import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts_views.advert_item.m;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import wJ0.InterfaceC49522c;

/* compiled from: UserAdvertItemViewModule_ProvideUserAdvertItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<InterfaceC49522c> {

    /* renamed from: a, reason: collision with root package name */
    public final b f316499a;

    /* renamed from: b, reason: collision with root package name */
    public final l f316500b;

    /* renamed from: c, reason: collision with root package name */
    public final l f316501c;

    /* renamed from: d, reason: collision with root package name */
    public final l f316502d;

    /* renamed from: e, reason: collision with root package name */
    public final l f316503e;

    public d(b bVar, l lVar, l lVar2, l lVar3, l lVar4) {
        this.f316499a = bVar;
        this.f316500b = lVar;
        this.f316501c = lVar2;
        this.f316502d = lVar3;
        this.f316503e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f316500b);
        h31.e eVarB2 = dagger.internal.g.b(this.f316501c);
        InterfaceC25571b interfaceC25571b = (InterfaceC25571b) this.f316502d.f393949a;
        C19616a c19616a = (C19616a) this.f316503e.f393949a;
        this.f316499a.getClass();
        return new m(eVarB, eVarB2, interfaceC25571b, c19616a);
    }
}
