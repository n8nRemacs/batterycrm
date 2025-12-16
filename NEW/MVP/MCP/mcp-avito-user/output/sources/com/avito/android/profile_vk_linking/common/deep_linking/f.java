package com.avito.android.profile_vk_linking.common.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileVkLinkingStartLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.e f230987a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f230988b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230989c;

    public f(com.avito.android.profile_vk_linking.common.e eVar, dv.b bVar, dv.b bVar2) {
        this.f230987a = eVar;
        this.f230988b = bVar;
        this.f230989c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.profile_vk_linking.common.c) this.f230987a.get(), (a.InterfaceC4053a) this.f230988b.get(), (a.b) this.f230989c.get());
    }
}
