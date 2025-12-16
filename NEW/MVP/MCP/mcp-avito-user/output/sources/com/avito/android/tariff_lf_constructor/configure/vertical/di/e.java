package com.avito.android.tariff_lf_constructor.configure.vertical.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: ConstructorConfigureVerticalModule_ProvideItemPresenters$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.vertical.items.content.d> f300580a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.d> f300581b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.e f300582c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.text.e f300583d;

    public e(Provider provider, Provider provider2, com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.e eVar, com.avito.android.tariff_lf_constructor.configure.vertical.items.text.e eVar2) {
        this.f300580a = provider;
        this.f300581b = provider2;
        this.f300582c = eVar;
        this.f300583d = eVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_lf_constructor.configure.vertical.items.content.d dVar = this.f300580a.get();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.d dVar2 = this.f300581b.get();
        this.f300582c.getClass();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.d dVar3 = new com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.d();
        this.f300583d.getClass();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.text.d dVar4 = new com.avito.android.tariff_lf_constructor.configure.vertical.items.text.d();
        b.f300574a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, dVar3, dVar4});
        t.d(setL0);
        return setL0;
    }
}
