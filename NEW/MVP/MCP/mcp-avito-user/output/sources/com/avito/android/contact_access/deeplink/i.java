package com.avito.android.contact_access.deeplink;

import com.avito.android.contact_access.links.ContactsPackagesBuyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ContactsPackagesBuyLinkHandlerModule_ProvideContactAccessHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f126084a;

    public i(j jVar) {
        this.f126084a = jVar;
    }

    public static C43834a a(j jVar) {
        h.f126083a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ContactsPackagesBuyLink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ContactsPackagesBuyLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126084a);
    }
}
