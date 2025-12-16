package com.akita.compose.component.segmented_control;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.segmented_control.z;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControlScope.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/segmented_control/s;", "Lcom/akita/compose/component/segmented_control/q;", "<init>", "()V", "segmented-control_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f62590a = new ArrayList();

    /* compiled from: SegmentedControlScope.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lcom/akita/compose/component/segmented_control/z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isEnabled", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Lcom/akita/compose/component/segmented_control/z;ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.s<InterfaceC20572g2, z, Boolean, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f62591l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(5);
            this.f62591l = str;
        }

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
                com.akita.compose.foundation.ui.p.b(this.f62591l, aVar.f62616b, null, false, (!zBooleanValue ? aVar.f62618d : aVar.f62617c).c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            return G0.f406611a;
        }
    }

    @Override // com.akita.compose.component.segmented_control.q
    public final void a(@Y61.k Y41.a aVar, @Y61.l Y41.a aVar2, @Y61.k String str, boolean z12) {
        this.f62590a.add(new C22096n(1443442204, new t(z12, aVar, aVar2, new C22096n(-772854100, new a(str), true)), true));
    }
}
