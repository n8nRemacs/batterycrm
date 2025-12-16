package com.avito.beduin.v2.avito.component.checkbox.state;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoCheckboxStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/checkbox/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/checkbox/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334022l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC36250j.b bVar) {
        super(1);
        this.f334022l = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, p.f334046b);
        String string = g13.getString("value");
        CheckboxValue checkboxValue = null;
        if (string != null) {
            CheckboxValue.f333999c.getClass();
            Iterator it = ((AbstractC42738c) CheckboxValue.f334003g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CheckboxValue) next).f334004b.equals(string)) {
                    checkboxValue = next;
                    break;
                }
            }
            checkboxValue = checkboxValue;
        }
        CheckboxValue checkboxValue2 = checkboxValue;
        Boolean boolC = g13.c(BeduinCartItemModel.CHECKED_STRING);
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Boolean boolC2 = g13.c("error");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Boolean boolC3 = g13.c("enabled");
        boolean zBooleanValue3 = boolC3 != null ? boolC3.booleanValue() : true;
        Boolean boolC4 = g13.c("visible");
        return new a(checkboxValue2, zBooleanValue, zBooleanValue3, zBooleanValue2, (Y41.l) g13.d(new c(this.f334022l), "onCheckedChange", "onCheckedChange"), lVarC, boolC4 != null ? boolC4.booleanValue() : true, (Y41.a) g13.d(e.f334019l, "onShow", "onShow"), (Y41.a) g13.d(g.f334021l, "onHide", "onHide"), g13.getString("tag"));
    }
}
