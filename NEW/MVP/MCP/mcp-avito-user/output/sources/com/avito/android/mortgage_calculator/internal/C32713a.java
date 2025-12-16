package com.avito.android.mortgage_calculator.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorOfferDescription.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/docking_badge/g;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/docking_badge/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_calculator.internal.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32713a extends kotlin.jvm.internal.N implements Y41.l<com.akita.compose.component.docking_badge.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<B10.a> f204275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f204276m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f204277n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32713a(List list, ArrayList arrayList, ArrayList arrayList2) {
        super(1);
        this.f204275l = list;
        this.f204276m = arrayList;
        this.f204277n = arrayList2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.akita.compose.component.docking_badge.g gVar) {
        com.akita.compose.component.docking_badge.g gVar2 = gVar;
        List<B10.a> list = this.f204275l;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            B10.a aVar = list.get(i12);
            gVar2.a((com.akita.compose.component.docking_badge.i) this.f204277n.get(i12), aVar.f791b, aVar.f790a, (String) this.f204276m.get(i12));
        }
        return kotlin.G0.f406611a;
    }
}
