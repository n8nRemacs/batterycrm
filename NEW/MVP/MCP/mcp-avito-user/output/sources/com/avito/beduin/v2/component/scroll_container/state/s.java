package com.avito.beduin.v2.component.scroll_container.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollContainerState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/scroll_container/state/d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/scroll_container/state/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class s extends N implements Y41.l<G, d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f336226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AbstractC36250j.b bVar) {
        super(1);
        this.f336226l = bVar;
    }

    @Override // Y41.l
    public final d invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, h.f336213l)));
        AbstractC36250j.b bVar = this.f336226l;
        Y41.l lVar = (Y41.l) g13.d(new j(bVar), "onPageSelected", "onPageSelected");
        String string = g13.getString("backgroundColor");
        if (string == null) {
            string = "#00000000";
        }
        String str = string;
        Integer numA = g13.a("itemSpacing");
        int iIntValue = numA != null ? numA.intValue() : 0;
        ET0.b bVar2 = (ET0.b) g13.f(k.f336217l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING);
        if (bVar2 == null) {
            bVar2 = (ET0.b) g13.f(l.f336218l, "contentInsets", "contentInsets");
        }
        ET0.b bVar3 = bVar2;
        Y41.l lVar2 = (Y41.l) g13.d(new n(bVar), "onPaginationAvailable", "onPaginationAvailable");
        Integer numA2 = g13.a("currentIndex");
        return new d(aVar, str, lVar, Integer.valueOf(iIntValue), numA2 != null ? numA2.intValue() : 0, bVar3, lVar2, zBooleanValue, (Y41.a) g13.d(p.f336223l, "onShow", "onShow"), (Y41.a) g13.d(r.f336225l, "onHide", "onHide"), g13.getString("tag"));
    }
}
