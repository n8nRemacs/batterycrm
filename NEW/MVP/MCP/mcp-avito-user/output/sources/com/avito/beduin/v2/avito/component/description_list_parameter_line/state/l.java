package com.avito.beduin.v2.avito.component.description_list_parameter_line.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.description_list_parameter_line.state.DescriptionListLineStyle;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoDescriptionListParameterLineState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f334295l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        DescriptionListLineStyle descriptionListLineStyle;
        G g13 = g12;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, s.f334312b);
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, g.f334290l)));
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        DescriptionListLineStyle.a aVar2 = DescriptionListLineStyle.f334265c;
        String string = g13.getString("lineStyle");
        DescriptionListLineStyle descriptionListLineStyle2 = DescriptionListLineStyle.f334266d;
        aVar2.getClass();
        DescriptionListLineStyle[] descriptionListLineStyleArrValues = DescriptionListLineStyle.values();
        int length = descriptionListLineStyleArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                descriptionListLineStyle = null;
                break;
            }
            descriptionListLineStyle = descriptionListLineStyleArrValues[i12];
            if (descriptionListLineStyle.f334269b.equals(string)) {
                break;
            }
            i12++;
        }
        return new a(aVar, lVarC, descriptionListLineStyle == null ? descriptionListLineStyle2 : descriptionListLineStyle, zBooleanValue, (Y41.a) g13.d(i.f334292l, "onShow", "onShow"), (Y41.a) g13.d(k.f334294l, "onHide", "onHide"), g13.getString("tag"));
    }
}
