package com.avito.android.auto_select.deeplink;

import com.avito.android.deep_linking.links.AutoSelectContactMeLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoSelectDeepLinkHandlerModule_ProvideContactMeLinkParserHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f96076a;

    public w(p pVar) {
        this.f96076a = pVar;
    }

    public static C43834a a(p pVar) {
        t.f96072a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoSelectContactMeLink.class, new s(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoSelectContactMeLink.class), pVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f96076a);
    }
}
