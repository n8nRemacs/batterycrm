package com.avito.android.advert_collection.di;

import com.avito.android.advert_collection.di.B;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import gj.C40692c;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: AdvertCollectionModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class t implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f81481a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f81482b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f81483c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f81484d;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f81481a = provider;
        this.f81482b = provider2;
        this.f81483c = provider3;
        this.f81484d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((B.b.f) this.f81481a).f81443a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((B.b.g) this.f81482b).get();
        a.b bVar = (a.b) ((B.b.h) this.f81483c).get();
        Screen screen = (Screen) this.f81484d.get();
        s.f81480a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, new C40692c(true, true), null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210473c0), "AdvertCollection", false, 8, null), 40);
    }
}
