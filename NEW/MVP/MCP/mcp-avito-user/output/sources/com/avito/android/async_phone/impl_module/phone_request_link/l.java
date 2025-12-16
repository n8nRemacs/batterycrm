package com.avito.android.async_phone.impl_module.phone_request_link;

import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PhoneRequestLinkHandlerModule_ProvidePhoneRequestDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f92187a;

    /* renamed from: b, reason: collision with root package name */
    public final e f92188b;

    public l(m mVar, e eVar) {
        this.f92187a = mVar;
        this.f92188b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f92188b.getClass();
        d dVar = new d();
        m mVar = this.f92187a;
        k.f92186a.getClass();
        return new C43834a(PhoneRequestLink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhoneRequestLink.class), mVar));
    }
}
