package com.avito.android.item_map.di;

import com.avito.android.deep_linking.links.ShowPinMapLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ShowPinMapLinkHandlerModule_ProvideShowPinMapLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f173335a;

    /* renamed from: b, reason: collision with root package name */
    public final oO.k f173336b;

    public p(o oVar, oO.k kVar) {
        this.f173335a = oVar;
        this.f173336b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        oO.k kVar = this.f173336b;
        this.f173335a.getClass();
        return new C43834a(ShowPinMapLink.class, null, new C43834a.b.C11809b(kVar));
    }
}
