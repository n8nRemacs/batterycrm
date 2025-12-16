package com.avito.android.publish.screen.objects.di;

import com.avito.android.analytics.screens.ObjectFillFormScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.publish.screen.objects.di.C33986a;
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
public final class o implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239917a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<gj.d> f239918b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f239919c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a.b> f239920d;

    public o(C34019j c34019j, Provider<gj.d> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<a.b> provider3) {
        this.f239917a = c34019j;
        this.f239918b = provider;
        this.f239919c = provider2;
        this.f239920d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((C33986a.c.C33991g) this.f239918b).f239846a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((C33986a.c.C34001q) this.f239919c).get();
        a.b bVar = (a.b) ((C33986a.c.C34002r) this.f239920d).get();
        this.f239917a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(ObjectFillFormScreen.f90436d.f90471b, Collections.singletonList(Owners.f210498i1), "ObjectFillForm", false, 8, null), 56);
    }
}
