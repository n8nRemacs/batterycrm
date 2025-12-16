package com.avito.android.screens.bbip_v2.ui.items.budget;

import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.screens.bbip_v2.ui.items.budget.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipV2BudgetItemView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/akita/compose/component/chips/b;", "chip", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f261592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar) {
        super(2);
        this.f261592l = mVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        int iIntValue = num.intValue();
        InterfaceC27333b interfaceC27333b2 = interfaceC27333b;
        m mVar = this.f261592l;
        Y41.l<? super String, G0> lVar = mVar.f261597d;
        if (lVar != null) {
            ((f.a) lVar).invoke(interfaceC27333b2.getF17944b());
        }
        if (interfaceC27333b2.getF99070e()) {
            mVar.B80(iIntValue, mVar.f261596c.getValue(), false);
        }
        return G0.f406611a;
    }
}
