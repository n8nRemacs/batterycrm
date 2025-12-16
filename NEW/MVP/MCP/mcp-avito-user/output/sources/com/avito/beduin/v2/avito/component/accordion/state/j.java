package com.avito.beduin.v2.avito.component.accordion.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoAccordionStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<G, AvitoAccordionState> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f333725l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final AvitoAccordionState invoke(G g12) {
        G g13 = g12;
        AvitoAccordionState.b bVar = (AvitoAccordionState.b) g13.f(b.f333717l, "title", "title");
        if (bVar == null) {
            bVar = new AvitoAccordionState.b("", null, null, 6, null);
        }
        AvitoAccordionState.b bVar2 = bVar;
        String string = g13.getString("preferredArrowAlignment");
        AvitoAccordionState.ArrowAlignment arrowAlignmentValueOf = string != null ? AvitoAccordionState.ArrowAlignment.valueOf(string) : null;
        AvitoAccordionState.a aVar = (AvitoAccordionState.a) g13.h("content", "content", c.f333718l);
        Boolean boolC = g13.c("loading");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Boolean boolC2 = g13.c(SearchParamsConverterKt.EXPANDED);
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Y41.a aVar2 = (Y41.a) g13.d(e.f333720l, "onClick", "onClick");
        Boolean boolC3 = g13.c("visible");
        return new AvitoAccordionState(bVar2, arrowAlignmentValueOf, aVar, zBooleanValue, zBooleanValue2, aVar2, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, t.f333747b), boolC3 != null ? boolC3.booleanValue() : true, (Y41.a) g13.d(g.f333722l, "onShow", "onShow"), (Y41.a) g13.d(i.f333724l, "onHide", "onHide"), g13.getString("tag"));
    }
}
