package com.avito.beduin.v2.avito.component.rich_text.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.text.state.C;
import com.avito.beduin.v2.avito.component.text.state.TextAlign;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoRichTextStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/rich_text/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f334941l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        q[] qVarArr = (q[]) C42745f0.C(g13.g("segments", "segments", c.f334934l)).toArray(new q[0]);
        String string = g13.getString("textAlign");
        if (string == null) {
            string = "Start";
        }
        TextAlign textAlignValueOf = TextAlign.valueOf(string);
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Boolean boolC2 = g13.c("truncate");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Integer numA = g13.a("maxLines");
        return new a(qVarArr, zBooleanValue2, numA != null ? numA.intValue() : 0, textAlignValueOf, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, com.avito.beduin.v2.avito.component.text.state.n.f335362b), (ET0.b) g13.f(d.f334935l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING), (C) g13.f(e.f334936l, "expandableText", "expandableText"), zBooleanValue, (Y41.a) g13.d(g.f334938l, "onShow", "onShow"), (Y41.a) g13.d(i.f334940l, "onHide", "onHide"), g13.getString("tag"));
    }
}
