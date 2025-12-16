package com.akita.compose.component.segmented_control;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.A;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.segmented_control.z;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControlScope.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lcom/akita/compose/component/segmented_control/z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isEnabled", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Lcom/akita/compose/component/segmented_control/z;ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r extends N implements Y41.s<InterfaceC20572g2, z, Boolean, A, Integer, G0> {
    @Override // Y41.s
    public final G0 invoke(InterfaceC20572g2 interfaceC20572g2, z zVar, Boolean bool, A a12, Integer num) {
        int i12;
        z zVar2 = zVar;
        boolean zBooleanValue = bool.booleanValue();
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 112) == 0) {
            i12 = (a13.B(zVar2) ? 32 : 16) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 896) == 0) {
            i12 |= a13.j(zBooleanValue) ? 256 : 128;
        }
        if ((i12 & 5841) == 1168 && a13.c()) {
            a13.f();
        } else {
            z.a aVar = zVar2.f62609b;
            com.akita.compose.foundation.ui.p.a(null, aVar.f62616b, null, false, (!zBooleanValue ? aVar.f62618d : aVar.f62617c).c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        return G0.f406611a;
    }
}
