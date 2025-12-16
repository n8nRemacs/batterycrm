package com.avito.android.support_bottom_sheet.gig_deeplink;

import com.avito.android.support_bottom_sheet.GigSupportDialogDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSupportDialogDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f292452a;

    public d(e eVar) {
        this.f292452a = eVar;
    }

    public static C43834a a(e eVar) {
        c.f292451a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSupportDialogDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSupportDialogDeeplink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292452a);
    }
}
