package com.yandex.div.core.view2.divs;

import com.yandex.div2.C38267b5;
import com.yandex.div2.DivSizeUnit;
import kotlin.Metadata;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class B1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<Long> f368016l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368017m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38267b5 f368018n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f368019o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(com.yandex.div.json.expressions.b<Long> bVar, com.yandex.div.json.expressions.e eVar, C38267b5 c38267b5, com.yandex.div.core.view2.divs.widgets.p pVar) {
        super(1);
        this.f368016l = bVar;
        this.f368017m = eVar;
        this.f368018n = c38267b5;
        this.f368019o = pVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.json.expressions.b<Long> bVar = this.f368016l;
        com.yandex.div.json.expressions.e eVar = this.f368017m;
        long jLongValue = bVar.a(eVar).longValue();
        DivSizeUnit divSizeUnitA = this.f368018n.f374466m.a(eVar);
        Long lValueOf = Long.valueOf(jLongValue);
        com.yandex.div.core.view2.divs.widgets.p pVar = this.f368019o;
        pVar.setLineHeight(C37931a.T(lValueOf, pVar.getResources().getDisplayMetrics(), divSizeUnitA));
        C37931a.e(pVar, Long.valueOf(jLongValue), divSizeUnitA);
        return kotlin.G0.f406611a;
    }
}
