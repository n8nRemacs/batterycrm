package com.avito.beduin.v2.avito.component.tooltip.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.tooltip.state.TooltipPosition;
import com.avito.beduin.v2.engine.component.G;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;

/* compiled from: AvitoTooltipStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/tooltip/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f335450l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) throws NumberFormatException {
        G g13 = g12;
        TooltipPosition.a aVar = TooltipPosition.f335423c;
        String string = g13.getString("position");
        if (string == null) {
            string = "top";
        }
        aVar.getClass();
        Iterator it = ((AbstractC42738c) TooltipPosition.f335425e).iterator();
        while (it.hasNext()) {
            TooltipPosition tooltipPosition = (TooltipPosition) it.next();
            if (tooltipPosition.f335426b.equals(string)) {
                Boolean boolC = g13.c("tailVisible");
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
                Boolean boolC2 = g13.c("closeOnClick");
                boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : true;
                Y41.a aVar2 = (Y41.a) g13.d(c.f335441l, "onClose", "onClose");
                com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, o.f335454b);
                Boolean boolC3 = g13.c("visible");
                boolean zBooleanValue3 = boolC3 != null ? boolC3.booleanValue() : true;
                Y41.a aVar3 = (Y41.a) g13.d(e.f335443l, "onShow", "onShow");
                Y41.a aVar4 = (Y41.a) g13.d(g.f335445l, "onHide", "onHide");
                Boolean boolC4 = g13.c("show");
                boolean zBooleanValue4 = boolC4 != null ? boolC4.booleanValue() : true;
                String string2 = g13.getString("tag");
                String string3 = g13.getString("contentWidth");
                int i12 = -2;
                if (string3 != null) {
                    m.f335451c.getClass();
                    if (!string3.equals("wrapContent")) {
                        i12 = Integer.parseInt(string3);
                    }
                }
                int i13 = i12;
                p pVar = (p) g13.f(j.f335448l, "content", "content");
                if (pVar == null) {
                    throw new IllegalStateException("Content in tooltip should be not null");
                }
                r rVar = (r) g13.h("child", "child", k.f335449l);
                if (rVar != null) {
                    return new a(tooltipPosition, zBooleanValue, zBooleanValue2, pVar, aVar2, rVar, lVarC, zBooleanValue4, i13, zBooleanValue3, aVar3, aVar4, string2);
                }
                throw new IllegalStateException("Component in tooltip should be not null");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
