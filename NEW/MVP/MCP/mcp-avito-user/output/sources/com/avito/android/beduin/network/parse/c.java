package com.avito.android.beduin.network.parse;

import Y41.l;
import com.avito.android.beduin.common.component.button.BeduinButtonModel;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.beduin.common.component.segmented_control.BeduinSegmentedControlModel;
import com.avito.android.beduin.common.component.selectStringParameters.BeduinSelectStringParametersModel;
import com.avito.android.beduin.common.component.text.BeduinTextModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: BeduinPromoBlockModelAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f104057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f104058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super(1);
        this.f104057l = str;
        this.f104058m = str2;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        String str;
        BeduinModel beduinModelCopy$default = beduinModel;
        boolean z12 = beduinModelCopy$default instanceof BeduinSegmentedControlModel;
        String str2 = this.f104057l;
        if (z12) {
            beduinModelCopy$default = BeduinSegmentedControlModel.copy$default((BeduinSegmentedControlModel) beduinModelCopy$default, null, null, null, null, null, null, AK.c.k("promoBlock", str2, "Standard"), null, 191, null);
        } else if (beduinModelCopy$default instanceof SingleLineInputModel) {
            SingleLineInputModel singleLineInputModel = (SingleLineInputModel) beduinModelCopy$default;
            beduinModelCopy$default = !L.f(singleLineInputModel.getStyle(), SingleLineInputModel.STYLE_SEARCH) ? SingleLineInputModel.copy$default(singleLineInputModel, null, null, AK.c.k("promoBlock", str2, "DefaultLarge"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554427, null) : singleLineInputModel;
        } else if (beduinModelCopy$default instanceof BeduinSelectStringParametersModel) {
            beduinModelCopy$default = BeduinSelectStringParametersModel.a((BeduinSelectStringParametersModel) beduinModelCopy$default, null, AK.c.k("promoBlock", str2, "DefaultLarge"), null, null, null, null, null, null, null, 262127);
        } else if (beduinModelCopy$default instanceof BeduinButtonModel) {
            BeduinButtonModel beduinButtonModel = (BeduinButtonModel) beduinModelCopy$default;
            String style = beduinButtonModel.getStyle();
            beduinModelCopy$default = BeduinButtonModel.copy$default(beduinButtonModel, null, null, null, null, androidx.compose.ui.graphics.colorspace.e.n("promoBlock", str2, (style == null || !C43066x.q(style, "secondary", true)) ? "Primary" : "Secondary", "Large"), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        } else if (beduinModelCopy$default instanceof BeduinTextModel) {
            BeduinTextModel beduinTextModel = (BeduinTextModel) beduinModelCopy$default;
            String str3 = this.f104058m;
            String str4 = "blue600";
            switch (str3.hashCode()) {
                case -1008851410:
                    if (str3.equals("orange")) {
                        str4 = "orange800";
                        break;
                    }
                    break;
                case -816343937:
                    if (str3.equals("violet")) {
                        str4 = "violet800";
                        break;
                    }
                    break;
                case 112785:
                    if (str3.equals("red")) {
                        str4 = "red600";
                        break;
                    }
                    break;
                case 3027034:
                    str = "blue";
                    str3.equals(str);
                    break;
                case 93618148:
                    if (str3.equals("beige")) {
                        str4 = "beige800";
                        break;
                    }
                    break;
                case 98619139:
                    if (str3.equals("green")) {
                        str4 = "green800";
                        break;
                    }
                    break;
                case 113101865:
                    str = "white";
                    str3.equals(str);
                    break;
                case 497111656:
                    str = "warmgray";
                    str3.equals(str);
                    break;
            }
            beduinModelCopy$default = BeduinTextModel.copy$default(beduinTextModel, null, null, null, null, null, null, null, new UniversalColor(str4, null, null), null, null, null, 1919, null);
        }
        return Collections.singletonList(beduinModelCopy$default);
    }
}
