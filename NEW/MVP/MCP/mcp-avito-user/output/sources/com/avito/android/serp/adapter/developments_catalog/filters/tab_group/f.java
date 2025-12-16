package com.avito.android.serp.adapter.developments_catalog.filters.tab_group;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import java.util.List;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: FiltersTabGroupPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTab", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f269866l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f269867m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FiltersTabGroupItem f269868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, int i12, FiltersTabGroupItem filtersTabGroupItem) {
        super(1);
        this.f269866l = dVar;
        this.f269867m = i12;
        this.f269868n = filtersTabGroupItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        d dVar = this.f269866l;
        com.avito.android.serp.analytics.widgets_tracker.g gVar = dVar.f269863c;
        Integer numValueOf = Integer.valueOf(this.f269867m);
        FiltersTabGroupItem filtersTabGroupItem = this.f269868n;
        d.a.a(gVar, numValueOf, "filtersTabs", null, null, null, null, null, filtersTabGroupItem.f269853f, 124);
        h31.e<InterfaceC47690b> eVar = dVar.f269862b;
        InterfaceC47690b interfaceC47690b = eVar.get();
        List<Tab> list = filtersTabGroupItem.f269851d;
        interfaceC47690b.n(list.get(iIntValue).getFiltersDeeplink());
        DeepLink clickstreamDeeplink = list.get(iIntValue).getClickstreamDeeplink();
        if (clickstreamDeeplink != null) {
            InterfaceC47691c.a.a(eVar.get(), clickstreamDeeplink, null, 14);
        }
        return G0.f406611a;
    }
}
