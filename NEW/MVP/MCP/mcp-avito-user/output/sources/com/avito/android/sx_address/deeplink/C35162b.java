package com.avito.android.sx_address.deeplink;

import com.avito.android.SelectAddressListLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSelectAddressListDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35162b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35171k f292819a;

    public C35162b(C35171k c35171k) {
        this.f292819a = c35171k;
    }

    public static C43834a a(C35171k c35171k) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SelectAddressListLink.class, new C35172l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SelectAddressListLink.class), c35171k));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292819a);
    }
}
