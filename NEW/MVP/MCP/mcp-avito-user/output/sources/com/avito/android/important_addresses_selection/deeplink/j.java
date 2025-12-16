package com.avito.android.important_addresses_selection.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ImportantAddressesSelectionLinkHandlerModule_ProvideImportantAddressesSelectionDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f169756a;

    public j(h hVar) {
        this.f169756a = hVar;
    }

    public static C43834a a(h hVar) {
        i.f169755a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ImportantAddressesSelectionLink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ImportantAddressesSelectionLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f169756a);
    }
}
