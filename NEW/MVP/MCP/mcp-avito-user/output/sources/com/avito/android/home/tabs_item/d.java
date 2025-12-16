package com.avito.android.home.tabs_item;

import Y41.l;
import com.avito.android.home.tabs_item.c;
import com.avito.android.remote.model.HomeTabItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: SectionTabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f162480l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.home_section_tab.a f162481m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f162482n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f162483o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0.f fVar, com.avito.android.serp.adapter.home_section_tab.a aVar, e eVar, int i12) {
        super(1);
        this.f162480l = fVar;
        this.f162481m = aVar;
        this.f162482n = eVar;
        this.f162483o = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        l0.f fVar = this.f162480l;
        int i12 = fVar.f406840b;
        if (i12 != iIntValue) {
            com.avito.android.serp.adapter.home_section_tab.a aVar = this.f162481m;
            HomeTabItem homeTabItem = (HomeTabItem) C42745f0.K(i12, aVar.f270159b);
            HomeTabItem homeTabItem2 = (HomeTabItem) aVar.f270159b.get(iIntValue);
            fVar.f406840b = iIntValue;
            e eVar = this.f162482n;
            eVar.f162485c.K5(new c.a(homeTabItem, homeTabItem2));
            d.a.a(eVar.f162484b, Integer.valueOf(this.f162483o), "feeds_widget", homeTabItem2.getTitle(), null, Integer.valueOf(iIntValue), null, null, aVar.f270161d, 104);
        }
        return G0.f406611a;
    }
}
