package com.avito.android.auto_select.deeplink;

import com.avito.android.deep_linking.links.AutoSelectConfirmationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoSelectDeepLinkHandlerModule_ProvideConfirmationLinkParserHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f96075a;

    public v(j jVar) {
        this.f96075a = jVar;
    }

    public static C43834a a(j jVar) {
        t.f96072a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoSelectConfirmationLink.class, new m(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoSelectConfirmationLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f96075a);
    }
}
