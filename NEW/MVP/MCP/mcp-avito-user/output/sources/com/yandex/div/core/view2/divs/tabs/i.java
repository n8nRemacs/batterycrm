package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.internal.widget.tabs.v;
import com.yandex.div2.DivTabs;
import com.yandex.div2.Y0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class i extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DivTabs f368786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v<?> f368788n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DivTabs divTabs, com.yandex.div.json.expressions.e eVar, v<?> vVar) {
        super(1);
        this.f368786l = divTabs;
        this.f368787m = eVar;
        this.f368788n = vVar;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        DivTabs divTabs = this.f368786l;
        DivTabs.TabTitleStyle tabTitleStyle = divTabs.f372060y;
        Y0 y02 = tabTitleStyle.f372103q;
        com.yandex.div.json.expressions.b<Long> bVar = tabTitleStyle.f372102p;
        com.yandex.div.json.expressions.e eVar = this.f368787m;
        Long lA2 = bVar == null ? null : bVar.a(eVar);
        long jLongValue = y02.f374036a.a(eVar).longValue() + y02.f374039d.a(eVar).longValue() + (lA2 == null ? (long) (divTabs.f372060y.f372094h.a(eVar).floatValue() * 1.3f) : lA2.longValue());
        Y0 y03 = divTabs.f372061z;
        long jLongValue2 = y03.f374036a.a(eVar).longValue() + y03.f374039d.a(eVar).longValue() + jLongValue;
        v<?> vVar = this.f368788n;
        vVar.getLayoutParams().height = C37931a.J(Long.valueOf(jLongValue2), vVar.getResources().getDisplayMetrics());
        return G0.f406611a;
    }
}
