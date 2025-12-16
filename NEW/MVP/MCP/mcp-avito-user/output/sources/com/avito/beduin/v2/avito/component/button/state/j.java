package com.avito.beduin.v2.avito.component.button.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoButtonStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/button/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/button/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<G, C36216a> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f333955l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final C36216a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("text");
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = g13.getString("subtitle");
        Boolean boolC = g13.c("enabled");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Boolean boolC2 = g13.c("visible");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : true;
        Boolean boolC3 = g13.c("loading");
        return new C36216a(str, string2, zBooleanValue, boolC3 != null ? boolC3.booleanValue() : false, (Y41.a) g13.d(c.f333948l, "onClick", "onClick"), com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, u.f333992b), (v) g13.f(d.f333949l, "iconStart", "iconStart"), (v) g13.f(e.f333950l, "iconEnd", "iconEnd"), zBooleanValue2, (Y41.a) g13.d(g.f333952l, "onShow", "onShow"), (Y41.a) g13.d(i.f333954l, "onHide", "onHide"), g13.getString("tag"));
    }
}
