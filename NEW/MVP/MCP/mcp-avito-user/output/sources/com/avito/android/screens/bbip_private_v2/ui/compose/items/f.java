package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2DaysChips.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.e f261239l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f261240m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f261241n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(BbipPrivateV2State.e eVar, Y41.a<G0> aVar, Y41.l<? super Integer, G0> lVar) {
        super(2);
        this.f261239l = eVar;
        this.f261240m = aVar;
        this.f261241n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        int iIntValue = num.intValue();
        BbipPrivateV2State.e eVar = this.f261239l;
        if (iIntValue == eVar.f261065b.size()) {
            this.f261240m.invoke();
        } else {
            List<Integer> list = eVar.f261065b;
            if (iIntValue < list.size()) {
                this.f261241n.invoke(list.get(iIntValue));
            }
        }
        return G0.f406611a;
    }
}
