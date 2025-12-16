package com.avito.android.iac_dialer_finished.impl_module.messenger_link;

import com.avito.android.iac_dialer_finished.public_module.messenger_link.OpenChannelIfExistLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OpenChannelIfExistLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f166519a;

    public d(e eVar) {
        this.f166519a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f166519a;
        c.f166518a.getClass();
        return new C43834a(OpenChannelIfExistLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OpenChannelIfExistLink.class), eVar));
    }
}
