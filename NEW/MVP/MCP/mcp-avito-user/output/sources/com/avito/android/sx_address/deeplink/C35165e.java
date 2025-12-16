package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressEntryLinks;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressEntryLinksDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35165e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f292822a;

    public C35165e(v vVar) {
        this.f292822a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressEntryLinks.class, new w(), new C43834a.b.C11809b(this.f292822a));
    }
}
