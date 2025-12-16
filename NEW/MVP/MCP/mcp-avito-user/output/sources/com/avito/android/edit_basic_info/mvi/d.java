package com.avito.android.edit_basic_info.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditBasicInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_basic_info.interactor.c f146126a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f146127b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f146128c;

    /* renamed from: d, reason: collision with root package name */
    public final u f146129d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f146130e;

    public d(com.avito.android.edit_basic_info.interactor.c cVar, dagger.internal.l lVar, Provider provider, u uVar, Provider provider2) {
        this.f146126a = cVar;
        this.f146127b = lVar;
        this.f146128c = provider;
        this.f146129d = uVar;
        this.f146130e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.edit_basic_info.interactor.a) this.f146126a.get(), (EditBasicInfoArguments) this.f146127b.f393949a, this.f146128c.get(), (InterfaceC33460e) this.f146129d.get(), this.f146130e.get());
    }
}
