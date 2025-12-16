package com.avito.android.publish.objects.di;

import com.avito.android.analytics.screens.ObjectFillFormScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.publish.objects.di.C33894a;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: ObjectFillFormModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f237601a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f237602b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f237603c;

    public C(Provider<gj.d> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<a.b> provider3) {
        this.f237601a = provider;
        this.f237602b = provider2;
        this.f237603c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((C33894a.c.C33899g) this.f237601a).f237964a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((C33894a.c.C33909q) this.f237602b).get();
        a.b bVar = (a.b) ((C33894a.c.C33910r) this.f237603c).get();
        C33939w.f238031a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(ObjectFillFormScreen.f90436d.f90471b, Collections.singletonList(Owners.f210498i1), "ObjectFillForm", false, 8, null), 56);
    }
}
