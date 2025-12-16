package com.avito.beduin.v2.avito.component.slider.state;

import Y41.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.slider.state.AvitoSliderState;
import com.avito.beduin.v2.component.common.utils.h;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.B;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: AvitoSliderStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<G, AvitoSliderState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335128l;

    /* compiled from: AvitoSliderStateFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvitoSliderState.Presets.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoSliderState.Presets[] presetsArr = AvitoSliderState.Presets.f335123b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvitoSliderState.Presets[] presetsArr2 = AvitoSliderState.Presets.f335123b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC36250j.b bVar) {
        super(1);
        this.f335128l = bVar;
    }

    @Override // Y41.l
    public final AvitoSliderState invoke(G g12) {
        AvitoSliderState.Presets presetsValueOf;
        String str;
        G g13 = g12;
        AbstractC36250j.b bVar = this.f335128l;
        com.avito.beduin.v2.component.common.utils.a aVarA = h.a(bVar);
        String string = g13.getString("preset");
        com.avito.beduin.v2.theme.l lVarC = null;
        if (string != null && (presetsValueOf = AvitoSliderState.Presets.valueOf(string)) != null) {
            int iOrdinal = presetsValueOf.ordinal();
            if (iOrdinal == 0) {
                str = "sliderDefault";
            } else if (iOrdinal == 1) {
                str = "sliderOverlay";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "sliderInverse";
            }
            lVarC = new B(new e(null, str));
        }
        if (lVarC == null) {
            lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, f.f335132b);
        }
        com.avito.beduin.v2.theme.l lVar = lVarC;
        Integer numA = g13.a("min");
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g13.a("max");
        int iIntValue2 = numA2 != null ? numA2.intValue() : 100;
        Integer numA3 = g13.a("step");
        int iIntValue3 = numA3 != null ? numA3.intValue() : 1;
        Integer numA4 = g13.a("value");
        int iIntValue4 = numA4 != null ? numA4.intValue() : 0;
        Boolean boolC = g13.c("enabled");
        return new AvitoSliderState(boolC != null ? boolC.booleanValue() : true, iIntValue, iIntValue2, iIntValue3, iIntValue4, (l) g13.d(new b(bVar), "onChange", "onChange"), lVar, aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335703a);
    }
}
