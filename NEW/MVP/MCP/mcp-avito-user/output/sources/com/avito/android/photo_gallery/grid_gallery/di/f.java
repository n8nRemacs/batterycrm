package com.avito.android.photo_gallery.grid_gallery.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.photo_gallery.grid_gallery.di.b;
import com.avito.android.photo_gallery.grid_gallery.di.e;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: GridGalleryModule_BeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f217190a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f217191b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f217192c;

    /* renamed from: d, reason: collision with root package name */
    public final l f217193d;

    public f(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f217190a = provider;
        this.f217191b = provider2;
        this.f217192c = provider3;
        this.f217193d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((b.c.d) this.f217190a).f217183a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((b.c.e) this.f217191b).get();
        a.b bVar = (a.b) ((b.c.f) this.f217192c).get();
        C28478k c28478k = (C28478k) this.f217193d.f393949a;
        e.a.f217187a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210511l3), "GridGallery", false, 8, null), 56);
    }
}
