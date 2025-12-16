package com.avito.android.profile_vk_linking.common.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileVkLinkingGroupManagementLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.e f230972a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f230973b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230974c;

    public d(com.avito.android.profile_vk_linking.common.e eVar, dv.b bVar, dv.b bVar2) {
        this.f230972a = eVar;
        this.f230973b = bVar;
        this.f230974c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.profile_vk_linking.common.c) this.f230972a.get(), (a.InterfaceC4053a) this.f230973b.get(), (a.b) this.f230974c.get());
    }
}
