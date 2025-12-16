package com.avito.beduin.v2.avito.component.text.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoTextStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/text/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/text/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<G, C36232a> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f335349l = new h();

    public h() {
        super(1);
    }

    @Override // Y41.l
    public final C36232a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("text");
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = g13.getString("textAlign");
        if (string2 == null) {
            string2 = "Start";
        }
        TextAlign textAlignValueOf = TextAlign.valueOf(string2);
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Boolean boolC2 = g13.c("truncate");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Integer numA = g13.a("maxLines");
        return new C36232a(str, zBooleanValue2, numA != null ? numA.intValue() : 0, textAlignValueOf, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, n.f335362b), (ET0.b) g13.f(C36233b.f335343l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING), (C) g13.f(C36234c.f335344l, "expandableText", "expandableText"), zBooleanValue, (Y41.a) g13.d(C36236e.f335346l, "onShow", "onShow"), (Y41.a) g13.d(g.f335348l, "onHide", "onHide"), g13.getString("tag"));
    }
}
