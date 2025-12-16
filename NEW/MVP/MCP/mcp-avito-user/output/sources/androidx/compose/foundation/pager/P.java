package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PagerMeasure.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f29827l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(ArrayList arrayList) {
        super(1);
        this.f29827l = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        ArrayList arrayList;
        int i12;
        int i13;
        K0.a aVar2 = aVar;
        ArrayList arrayList2 = this.f29827l;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            C20820n c20820n = (C20820n) arrayList2.get(i14);
            if (c20820n.f30014n == Integer.MIN_VALUE) {
                androidx.compose.foundation.internal.e.a("position() should be called first");
            }
            List<K0> list = c20820n.f30003c;
            int size2 = list.size();
            int i15 = 0;
            while (i15 < size2) {
                K0 k02 = list.get(i15);
                int i16 = i15 * 2;
                int[] iArr = c20820n.f30012l;
                int i17 = i14;
                long j12 = (iArr[i16 + 1] & 4294967295L) | (iArr[i16] << 32);
                q.a aVar3 = androidx.compose.ui.unit.q.f42862b;
                boolean z12 = c20820n.f30009i;
                boolean z13 = c20820n.f30010j;
                if (z12) {
                    if (z13) {
                        arrayList = arrayList2;
                        i12 = (int) (j12 >> 32);
                    } else {
                        arrayList = arrayList2;
                        i12 = (c20820n.f30014n - ((int) (j12 >> 32))) - (z13 ? k02.f40346c : k02.f40345b);
                    }
                    if (z13) {
                        i13 = (c20820n.f30014n - ((int) (j12 & 4294967295L))) - (z13 ? k02.f40346c : k02.f40345b);
                    } else {
                        i13 = (int) (j12 & 4294967295L);
                    }
                    j12 = (i13 & 4294967295L) | (i12 << 32);
                } else {
                    arrayList = arrayList2;
                }
                long jE2 = androidx.compose.ui.unit.q.e(j12, c20820n.f30004d);
                if (z13) {
                    K0.a.n(aVar2, k02, jE2);
                } else {
                    K0.a.k(aVar2, k02, jE2);
                }
                i15++;
                arrayList2 = arrayList;
                i14 = i17;
            }
            i14++;
        }
        return G0.f406611a;
    }
}
