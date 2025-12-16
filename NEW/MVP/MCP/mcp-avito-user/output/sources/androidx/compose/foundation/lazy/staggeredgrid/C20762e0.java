package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridMeasure.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20762e0 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f29614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20758c0 f29615m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29616n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20762e0(androidx.compose.foundation.lazy.layout.Q q12, C20758c0 c20758c0, ArrayList arrayList) {
        super(1);
        this.f29614l = arrayList;
        this.f29615m = c20758c0;
        this.f29616n = q12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        List<K0> list;
        int i12;
        int i13;
        K0 k02;
        C22267c c22267c;
        K0 k03;
        int i14;
        int i15;
        int i16;
        K0.a aVar2 = aVar;
        ArrayList arrayList = this.f29614l;
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            l0 l0Var = (l0) arrayList.get(i17);
            boolean zI1 = this.f29616n.I1();
            if (l0Var.f29659o == -1) {
                androidx.compose.foundation.internal.e.a("position() should be called first");
            }
            List<K0> list2 = l0Var.f29647c;
            int size2 = list2.size();
            int i18 = 0;
            while (i18 < size2) {
                K0 k04 = list2.get(i18);
                int i19 = l0Var.f29660p;
                boolean z12 = l0Var.f29648d;
                int i22 = i19 - (z12 ? k04.f40346c : k04.f40345b);
                int i23 = l0Var.f29661q;
                int i24 = i17;
                long j12 = l0Var.f29664t;
                ArrayList arrayList2 = arrayList;
                int i25 = size;
                C20737p c20737pA = l0Var.f29654j.a(i18, l0Var.f29646b);
                if (c20737pA != null) {
                    if (zI1) {
                        c20737pA.f29499r = j12;
                        list = list2;
                        i12 = size2;
                        i13 = i18;
                        k02 = k04;
                    } else {
                        list = list2;
                        i12 = size2;
                        long j13 = c20737pA.f29499r;
                        C20737p.f29480s.getClass();
                        i13 = i18;
                        k02 = k04;
                        long jE2 = androidx.compose.ui.unit.q.e(!androidx.compose.ui.unit.q.c(j13, C20737p.f29481t) ? c20737pA.f29499r : j12, ((androidx.compose.ui.unit.q) ((C22082i3) c20737pA.f29498q).getF42167b()).f42864a);
                        if ((l0Var.i(j12) <= i22 && l0Var.i(jE2) <= i22) || (l0Var.i(j12) >= i23 && l0Var.i(jE2) >= i23)) {
                            c20737pA.b();
                        }
                        j12 = jE2;
                    }
                    c22267c = c20737pA.f29495n;
                } else {
                    list = list2;
                    i12 = size2;
                    i13 = i18;
                    k02 = k04;
                    c22267c = null;
                }
                C20758c0 c20758c0 = this.f29615m;
                if (c20758c0.f29601l) {
                    q.a aVar3 = androidx.compose.ui.unit.q.f42862b;
                    if (z12) {
                        i15 = (int) (j12 >> 32);
                        k03 = k02;
                    } else {
                        int i26 = l0Var.f29659o - ((int) (j12 >> 32));
                        if (z12) {
                            k03 = k02;
                            i14 = k03.f40346c;
                        } else {
                            k03 = k02;
                            i14 = k03.f40345b;
                        }
                        i15 = i26 - i14;
                    }
                    if (z12) {
                        i16 = (l0Var.f29659o - ((int) (j12 & 4294967295L))) - (z12 ? k03.f40346c : k03.f40345b);
                    } else {
                        i16 = (int) (j12 & 4294967295L);
                    }
                    j12 = (i16 & 4294967295L) | (i15 << 32);
                } else {
                    k03 = k02;
                }
                long jE3 = androidx.compose.ui.unit.q.e(j12, c20758c0.f29598i);
                if (!zI1 && c20737pA != null) {
                    c20737pA.f29494m = jE3;
                }
                if (c22267c != null) {
                    K0.a.l(aVar2, k03, jE3, c22267c);
                } else {
                    K0.a.k(aVar2, k03, jE3);
                }
                i18 = i13 + 1;
                list2 = list;
                i17 = i24;
                arrayList = arrayList2;
                size = i25;
                size2 = i12;
            }
            i17++;
        }
        return kotlin.G0.f406611a;
    }
}
