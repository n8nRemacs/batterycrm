package com.avito.android.serp.adapter.filters_tabs_chips;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: FiltersTabsChipsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/serp/Tab;", "selectedTab", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/developments_catalog/serp/Tab;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements l<Tab, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f269963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f269964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FiltersTabsChipsItem f269965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i12, FiltersTabsChipsItem filtersTabsChipsItem) {
        super(1);
        this.f269963l = dVar;
        this.f269964m = i12;
        this.f269965n = filtersTabsChipsItem;
    }

    @Override // Y41.l
    public final G0 invoke(Tab tab) {
        Tab tab2 = tab;
        d dVar = this.f269963l;
        d.a.a(dVar.f269967c, Integer.valueOf(this.f269964m), "filtersTabs", null, null, null, null, null, this.f269965n.f269953e, 124);
        h31.e<InterfaceC47690b> eVar = dVar.f269966b;
        eVar.get().n(tab2.getFiltersDeeplink());
        DeepLink clickstreamDeeplink = tab2.getClickstreamDeeplink();
        if (clickstreamDeeplink != null) {
            InterfaceC47691c.a.a(eVar.get(), clickstreamDeeplink, null, 14);
        }
        return G0.f406611a;
    }
}
