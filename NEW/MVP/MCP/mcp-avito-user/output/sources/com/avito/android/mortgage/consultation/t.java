package com.avito.android.mortgage.consultation;

import com.akita.compose.component.chips.InterfaceC27333b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageConsultationScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idx", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t extends N implements Y41.p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f198647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ XZ.d f198648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(XZ.d dVar, Y41.l lVar) {
        super(2);
        this.f198647l = lVar;
        this.f198648m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        List<WZ.b> list;
        WZ.b bVar;
        int iIntValue = num.intValue();
        WZ.a aVar = this.f198648m.f18924m;
        String str = (aVar == null || (list = aVar.f17942d) == null || (bVar = list.get(iIntValue)) == null) ? null : bVar.f17945c;
        if (str == null) {
            str = "";
        }
        this.f198647l.invoke(str);
        return G0.f406611a;
    }
}
