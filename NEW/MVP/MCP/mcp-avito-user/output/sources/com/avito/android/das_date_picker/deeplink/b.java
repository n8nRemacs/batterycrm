package com.avito.android.das_date_picker.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DasDatePickerLinkHandlerModule_ProvideTariffCardDatePickerLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f132251a;

    public b(e eVar) {
        this.f132251a = eVar;
    }

    public static C43834a a(e eVar) {
        a.f132250a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCardDatePickerLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCardDatePickerLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f132251a);
    }
}
