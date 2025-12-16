package com.avito.android.profile_vk_linking.common.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileVkLinkedGroupLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.e f230963a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f230964b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230965c;

    public b(com.avito.android.profile_vk_linking.common.e eVar, dv.b bVar, dv.b bVar2) {
        this.f230963a = eVar;
        this.f230964b = bVar;
        this.f230965c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.profile_vk_linking.common.c) this.f230963a.get(), (a.InterfaceC4053a) this.f230964b.get(), (a.b) this.f230965c.get());
    }
}
