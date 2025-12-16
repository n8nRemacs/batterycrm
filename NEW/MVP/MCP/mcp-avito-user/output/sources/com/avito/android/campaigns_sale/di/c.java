package com.avito.android.campaigns_sale.di;

import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.campaigns_sale.beduin.custom_actions.BeduinSaveDraftAction;
import com.avito.android.campaigns_sale.beduin.custom_actions.BeduinSetChosenItemsAction;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: CampaignsSaleBeduinModule_ProvideActionHandlerProviderSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<Set<gj.f<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.beduin.custom_actions.c> f113900a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.beduin.custom_actions.a> f113901b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Wi.b> f113902c;

    public c(Provider<com.avito.android.campaigns_sale.beduin.custom_actions.c> provider, Provider<com.avito.android.campaigns_sale.beduin.custom_actions.a> provider2, Provider<Wi.b> provider3) {
        this.f113900a = provider;
        this.f113901b = provider2;
        this.f113902c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.campaigns_sale.beduin.custom_actions.c cVar = this.f113900a.get();
        com.avito.android.campaigns_sale.beduin.custom_actions.a aVar = this.f113901b.get();
        Wi.b bVar = this.f113902c.get();
        b.f113899a.getClass();
        Set setL0 = C42756l.l0(new gj.f[]{new gj.f(BeduinSetChosenItemsAction.class, cVar), new gj.f(BeduinSaveDraftAction.class, aVar), new gj.f(BeduinReloadScreenAction.class, bVar)});
        t.d(setL0);
        return setL0;
    }
}
