package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressRevalidateLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressRevalidateDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35168h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final K f292825a;

    public C35168h(K k12) {
        this.f292825a = k12;
    }

    public static C43834a a(K k12) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressRevalidateLink.class, new L(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressRevalidateLink.class), k12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292825a);
    }
}
