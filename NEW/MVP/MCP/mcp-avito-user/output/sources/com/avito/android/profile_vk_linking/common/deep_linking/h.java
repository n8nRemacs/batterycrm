package com.avito.android.profile_vk_linking.common.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileVkRequestTokenLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.e f230996a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f230997b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230998c;

    public h(com.avito.android.profile_vk_linking.common.e eVar, dv.b bVar, dv.b bVar2) {
        this.f230996a = eVar;
        this.f230997b = bVar;
        this.f230998c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.profile_vk_linking.common.c) this.f230996a.get(), (a.InterfaceC4053a) this.f230997b.get(), (a.b) this.f230998c.get());
    }
}
