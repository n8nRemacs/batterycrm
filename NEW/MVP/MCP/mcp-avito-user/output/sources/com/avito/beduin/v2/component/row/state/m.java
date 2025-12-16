package com.avito.beduin.v2.component.row.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RowStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/row/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/row/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final m f336189l = new m();

    public m() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, e.f336181l)));
        String string = g13.getString("backgroundColor");
        if (string == null) {
            string = "#00000000";
        }
        String str = string;
        ET0.b bVar = (ET0.b) g13.f(f.f336182l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING);
        Boolean boolC = g13.c("visible");
        return new a(str, bVar, aVar, (Y41.a) g13.d(h.f336184l, "onClick", "onClick"), boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(j.f336186l, "onShow", "onShow"), (Y41.a) g13.d(l.f336188l, "onHide", "onHide"), g13.getString("tag"));
    }
}
