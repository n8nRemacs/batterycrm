package com.avito.beduin.v2.avito.component.pull_to_refresh;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.pull_to_refresh.a;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoPullToRefreshStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC36250j.b bVar) {
        super(1);
        this.f334868l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(this.f334868l);
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, l.f334877b);
        Boolean boolC = g13.c("isRefreshing");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        a.C10377a c10377a = (a.C10377a) g13.h("child", "child", d.f334865l);
        Y41.a aVar = (Y41.a) g13.d(f.f334867l, "onRefresh", "onRefresh");
        Boolean boolC2 = g13.c("disableScrollWhileRefreshing");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        return new a(lVarC, zBooleanValue, aVar, Boolean.valueOf(zBooleanValue2), c10377a, aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335707e, aVarA.f335703a);
    }
}
