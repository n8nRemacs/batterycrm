package com.avito.beduin.v2.avito.component.tab_group.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoTabGroupStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/c;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/tab_group/state/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<G, c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335294l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC36250j.b bVar) {
        super(1);
        this.f335294l = bVar;
    }

    @Override // Y41.l
    public final c invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Integer numA = g13.a("currentTab");
        return new c(numA != null ? numA.intValue() : 0, new ET0.a(C42745f0.C(g13.g("tabs", "tabs", e.f335286l))), com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, s.f335309b), (Y41.l) g13.d(new g(this.f335294l), "onTabSelected", "onTabSelected"), zBooleanValue, (Y41.a) g13.d(i.f335291l, "onShow", "onShow"), (Y41.a) g13.d(k.f335293l, "onHide", "onHide"), g13.getString("tag"));
    }
}
