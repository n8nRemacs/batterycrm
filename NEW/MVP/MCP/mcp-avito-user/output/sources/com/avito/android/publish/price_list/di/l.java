package com.avito.android.publish.price_list.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: SelectPriceListItemsModule_ProvidePresenterSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.selectable.e> f238509a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.selectable.l> f238510b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.selected.e> f238511c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.selected.l> f238512d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.header.g> f238513e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.group.f> f238514f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.items.spacer.d> f238515g;

    public l(Provider<com.avito.android.publish.price_list.items.selectable.e> provider, Provider<com.avito.android.publish.price_list.items.selectable.l> provider2, Provider<com.avito.android.publish.price_list.items.selected.e> provider3, Provider<com.avito.android.publish.price_list.items.selected.l> provider4, Provider<com.avito.android.publish.price_list.items.header.g> provider5, Provider<com.avito.android.publish.price_list.items.group.f> provider6, Provider<com.avito.android.publish.price_list.items.spacer.d> provider7) {
        this.f238509a = provider;
        this.f238510b = provider2;
        this.f238511c = provider3;
        this.f238512d = provider4;
        this.f238513e = provider5;
        this.f238514f = provider6;
        this.f238515g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.price_list.items.selectable.e eVar = this.f238509a.get();
        com.avito.android.publish.price_list.items.selectable.l lVar = this.f238510b.get();
        com.avito.android.publish.price_list.items.selected.e eVar2 = this.f238511c.get();
        com.avito.android.publish.price_list.items.selected.l lVar2 = this.f238512d.get();
        com.avito.android.publish.price_list.items.header.g gVar = this.f238513e.get();
        com.avito.android.publish.price_list.items.group.f fVar = this.f238514f.get();
        com.avito.android.publish.price_list.items.spacer.d dVar = this.f238515g.get();
        e.f238492a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{eVar, lVar, eVar2, lVar2, gVar, fVar, dVar});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
