package com.avito.android.comfortable_deal.end_deal;

import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/akita/compose/component/chips/b;", "chip", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(Y41.l<? super String, G0> lVar) {
        super(2);
        this.f122059l = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        num.intValue();
        InterfaceC27333b interfaceC27333b2 = interfaceC27333b;
        EndDealField.ChipDateInput.Chip chip = interfaceC27333b2 instanceof EndDealField.ChipDateInput.Chip ? (EndDealField.ChipDateInput.Chip) interfaceC27333b2 : null;
        if (chip != null) {
            this.f122059l.invoke(chip.f122254b);
        }
        return G0.f406611a;
    }
}
