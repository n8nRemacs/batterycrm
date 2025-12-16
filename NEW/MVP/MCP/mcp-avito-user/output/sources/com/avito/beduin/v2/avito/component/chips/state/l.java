package com.avito.beduin.v2.avito.component.chips.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoChipsStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/chips/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/chips/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334077l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC36250j.b bVar) {
        super(1);
        this.f334077l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        DisplayView displayViewValueOf;
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, q.f334088b);
        String string = g13.getString("displayView");
        if (string == null || (displayViewValueOf = DisplayView.valueOf(string)) == null) {
            displayViewValueOf = DisplayView.f334047b;
        }
        DisplayView displayView = displayViewValueOf;
        AbstractC36250j.b bVar = this.f334077l;
        return new a(displayView, new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, new e(bVar)))), (Y41.l) g13.d(new g(bVar), "onScrollChange", "onScrollChange"), lVarC, zBooleanValue, (Y41.a) g13.d(i.f334074l, "onShow", "onShow"), (Y41.a) g13.d(k.f334076l, "onHide", "onHide"), g13.getString("tag"));
    }
}
