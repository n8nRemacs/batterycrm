package com.avito.android.user_adverts_views.advert_item.factory;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import ur.InterfaceC49101b;
import wJ0.InterfaceC49521b;
import wJ0.InterfaceC49522c;
import xJ0.InterfaceC49850b;

/* compiled from: UserAdvertItemViewModule_ProvideUserAdvertItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<InterfaceC49521b> {

    /* renamed from: a, reason: collision with root package name */
    public final b f316495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49522c> f316496b;

    /* renamed from: c, reason: collision with root package name */
    public final l f316497c;

    /* renamed from: d, reason: collision with root package name */
    public final l f316498d;

    public c(b bVar, Provider provider, l lVar, l lVar2) {
        this.f316495a = bVar;
        this.f316496b = provider;
        this.f316497c = lVar;
        this.f316498d = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49522c interfaceC49522c = this.f316496b.get();
        InterfaceC49850b.InterfaceC12859b interfaceC12859b = (InterfaceC49850b.InterfaceC12859b) this.f316497c.f393949a;
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f316498d.f393949a;
        this.f316495a.getClass();
        if (!(interfaceC12859b instanceof InterfaceC49850b.InterfaceC12859b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC49850b.InterfaceC12859b.a aVar = (InterfaceC49850b.InterfaceC12859b.a) interfaceC12859b;
        return new com.avito.android.user_adverts_views.advert_item.b(interfaceC49522c, aVar.f442338a, aVar.f442339b, interfaceC49101b);
    }
}
