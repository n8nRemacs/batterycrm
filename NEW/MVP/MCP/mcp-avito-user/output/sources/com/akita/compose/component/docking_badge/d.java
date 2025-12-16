package com.akita.compose.component.docking_badge;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadgeRow.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f61524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f61525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f61526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f61527o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0.f fVar, ArrayList arrayList, int i12, ArrayList arrayList2) {
        super(1);
        this.f61524l = fVar;
        this.f61525m = arrayList;
        this.f61526n = i12;
        this.f61527o = arrayList2;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        l0.f fVar = this.f61524l;
        fVar.f406840b = 0;
        ArrayList arrayList = this.f61525m;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            List list = (List) arrayList.get(i13);
            int size2 = list.size();
            int iMax = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                K0 k02 = (K0) list.get(i14);
                aVar2.e(k02, fVar.f406840b, i12, 0.0f);
                fVar.f406840b = ((Number) ((List) this.f61527o.get(i13)).get(i14)).intValue() + k02.f40345b + fVar.f406840b;
                iMax = Math.max(iMax, k02.f40346c);
            }
            i12 += iMax + this.f61526n;
            fVar.f406840b = 0;
        }
        return G0.f406611a;
    }
}
