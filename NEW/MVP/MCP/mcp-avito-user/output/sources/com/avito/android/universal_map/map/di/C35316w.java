package com.avito.android.universal_map.map.di;

import Vi.C15684a;
import com.avito.android.beduin_shared.model.action.custom.applyMapFilters.BeduinApplyMapFiltersAction;
import com.avito.android.map_core.beduin.BeduinFocusOnRegionAction;
import com.avito.android.map_core.beduin.BeduinResetMapAction;
import com.avito.android.map_core.beduin.BeduinSetDefaultLocationAction;
import com.avito.android.map_core.beduin.BeduinSetMapFiltersAction;
import com.avito.android.map_core.beduin.BeduinShowMapTooltipAction;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.map_core.beduin.BeduinUniversalMapShowSavedLocationAction;
import com.avito.android.map_core.beduin.BeduinUpdateSelectedPinAction;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: UniversalMapFragmentModule_ProvideActionHandlerProviderSetFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.universal_map.map.di.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35316w implements dagger.internal.h<Set<gj.f<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C15684a> f305154a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.g> f305155b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.i> f305156c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.c> f305157d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.o> f305158e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.m> f305159f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.a> f305160g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.e> f305161h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f305162i;

    public C35316w(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f305154a = provider;
        this.f305155b = provider2;
        this.f305156c = provider3;
        this.f305157d = provider4;
        this.f305158e = provider5;
        this.f305159f = provider6;
        this.f305160g = provider7;
        this.f305161h = provider8;
        this.f305162i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C15684a c15684a = this.f305154a.get();
        com.avito.android.map_core.beduin.action_handler.g gVar = this.f305155b.get();
        com.avito.android.map_core.beduin.action_handler.i iVar = this.f305156c.get();
        com.avito.android.map_core.beduin.action_handler.c cVar = this.f305157d.get();
        com.avito.android.map_core.beduin.action_handler.o oVar = this.f305158e.get();
        com.avito.android.map_core.beduin.action_handler.m mVar = this.f305159f.get();
        com.avito.android.map_core.beduin.action_handler.a aVar = this.f305160g.get();
        com.avito.android.map_core.beduin.action_handler.e eVar = this.f305161h.get();
        com.avito.android.map_core.beduin.action_handler.k kVar = (com.avito.android.map_core.beduin.action_handler.k) this.f305162i.get();
        C35315v.f305153a.getClass();
        Set setL0 = C42756l.l0(new gj.f[]{new gj.f(BeduinApplyMapFiltersAction.class, c15684a), new gj.f(BeduinSetMapFiltersAction.class, gVar), new gj.f(BeduinShowMapTooltipAction.class, iVar), new gj.f(BeduinResetMapAction.class, cVar), new gj.f(BeduinUpdateSelectedPinAction.class, oVar), new gj.f(BeduinUniversalMapShowSavedLocationAction.class, mVar), new gj.f(BeduinFocusOnRegionAction.class, aVar), new gj.f(BeduinSetDefaultLocationAction.class, eVar), new gj.f(BeduinShowSpecificLocationAction.class, kVar)});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
