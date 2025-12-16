package com.avito.android.tariff_lf.edit_info.viewmodel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class q extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f299115l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(1);
        this.f299115l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        r rVar = this.f299115l;
        ZC0.f fVar = rVar.f299135b0;
        if (fVar != null) {
            QC0.a aVar = fVar.f19982a;
            int i12 = aVar.f13599c.f19976f;
            Map<ZC0.a, List<com.avito.conveyor_item.a>> map = aVar.f13598b;
            Iterator<T> it = map.keySet().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int i13 = ((ZC0.a) it.next()).f19976f;
            while (it.hasNext()) {
                int i14 = ((ZC0.a) it.next()).f19976f;
                if (i13 < i14) {
                    i13 = i14;
                }
            }
            if (i12 != i13) {
                for (ZC0.a aVar2 : map.keySet()) {
                    int i15 = i12 + 1;
                    if (aVar2.f19976f == i15) {
                        aVar.f13599c = aVar2;
                        fVar.f19984c.f19981c = i15;
                        rVar.ke(fVar);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        rVar.f299133Z.postValue(new Object());
        return G0.f406611a;
    }
}
