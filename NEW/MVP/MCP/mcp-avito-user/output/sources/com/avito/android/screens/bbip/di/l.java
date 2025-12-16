package com.avito.android.screens.bbip.di;

import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: BbipListModule_ProvideItemPresentersFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.screens.bbip.ui.items.budget.e> f260228a;

    /* renamed from: b, reason: collision with root package name */
    public final u f260229b;

    public l(u uVar, Provider provider) {
        this.f260228a = provider;
        this.f260229b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.screens.bbip.ui.items.budget.e eVar = this.f260228a.get();
        com.avito.android.screens.bbip.ui.items.duration.e eVar2 = (com.avito.android.screens.bbip.ui.items.duration.e) this.f260229b.get();
        i.f260222a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{eVar, eVar2});
        t.d(setL0);
        return setL0;
    }
}
