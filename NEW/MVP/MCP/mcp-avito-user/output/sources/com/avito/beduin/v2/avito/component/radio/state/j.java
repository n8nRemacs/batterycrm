package com.avito.beduin.v2.avito.component.radio.state;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoRadioStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/radio/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/radio/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334897l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC36250j.b bVar) {
        super(1);
        this.f334897l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, r.f334921b);
        Boolean boolC = g13.c(BeduinCartItemModel.CHECKED_STRING);
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Boolean boolC2 = g13.c("enabled");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : true;
        Boolean boolC3 = g13.c("visible");
        boolean zBooleanValue3 = boolC3 != null ? boolC3.booleanValue() : true;
        Boolean boolC4 = g13.c("error");
        return new a(zBooleanValue, zBooleanValue2, boolC4 != null ? boolC4.booleanValue() : false, (Y41.l) g13.d(new c(this.f334897l), "onCheckedChange", "onCheckedChange"), (Y41.a) g13.d(e.f334892l, "onClick", "onClick"), lVarC, zBooleanValue3, (Y41.a) g13.d(g.f334894l, "onShow", "onShow"), (Y41.a) g13.d(i.f334896l, "onHide", "onHide"), g13.getString("tag"));
    }
}
