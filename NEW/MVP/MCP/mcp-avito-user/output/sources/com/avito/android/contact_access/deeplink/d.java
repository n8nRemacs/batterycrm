package com.avito.android.contact_access.deeplink;

import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ContactsPackagesApplyLinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f126074a;

    public d(e eVar) {
        this.f126074a = eVar;
    }

    public static C43834a a(e eVar) {
        c.f126073a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ContactsPackagesApplyLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ContactsPackagesApplyLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126074a);
    }
}
