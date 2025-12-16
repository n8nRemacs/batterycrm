package com.avito.android.vas_performance.di.visual_legacy;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: LegacyVisualVasListModule_ProvideItemPresentersFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final k f320187a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.screens.visual.item.header.d> f320188b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d> f320189c;

    public n(k kVar, Provider<com.avito.android.vas_performance.screens.visual.item.header.d> provider, Provider<com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d> provider2) {
        this.f320187a = kVar;
        this.f320188b = provider;
        this.f320189c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.visual.item.header.d dVar = this.f320188b.get();
        com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d dVar2 = this.f320189c.get();
        this.f320187a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2});
        t.d(setL0);
        return setL0;
    }
}
