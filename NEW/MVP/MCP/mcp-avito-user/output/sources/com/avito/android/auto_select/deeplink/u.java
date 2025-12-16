package com.avito.android.auto_select.deeplink;

import com.avito.android.deep_linking.links.AutoSelectBookingCompletionLink;
import dagger.internal.x;
import dagger.internal.y;
import lD.C43617a;
import lD.C43619c;
import lv.C43834a;

/* compiled from: AutoSelectDeepLinkHandlerModule_ProvideBookingCompletionLinkParserHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f96073a;

    /* renamed from: b, reason: collision with root package name */
    public final C43619c f96074b;

    public u(c cVar, C43619c c43619c) {
        this.f96073a = cVar;
        this.f96074b = c43619c;
    }

    public static C43834a a(c cVar, C43617a c43617a) {
        t.f96072a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoSelectBookingCompletionLink.class, new f(c43617a), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoSelectBookingCompletionLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f96073a, (C43617a) this.f96074b.get());
    }
}
