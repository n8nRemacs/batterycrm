package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes9.dex */
public final class P2 extends AbstractC13717r4 {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final b f5140l;

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            P2.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends C13623h>, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(List<? extends C13623h> list) {
            List<? extends C13623h> list2 = list;
            P2 p22 = P2.this;
            C13714r1 c13714r1 = p22.f5784b;
            c13714r1.getClass();
            ArrayList arrayList = c13714r1.f5779d;
            arrayList.clear();
            ArrayList arrayList2 = c13714r1.f5780e;
            arrayList2.clear();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C13623h) it.next()).f5536a);
            }
            arrayList.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Integer.valueOf(((C13623h) it2.next()).f5537b));
            }
            arrayList2.addAll(arrayList4);
            p22.b(false);
            InterfaceC13642j0 interfaceC13642j0 = p22.f5792j;
            if (interfaceC13642j0 == null) {
                interfaceC13642j0 = null;
            }
            interfaceC13642j0.a(p22);
            return kotlin.G0.f406611a;
        }
    }

    public P2(@Y61.k I6 i62) {
        super(i62);
        this.f5140l = new b();
    }

    @Override // Fc1.AbstractC13717r4
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(50428947);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            J3.a(this.f5140l, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12);
    }
}
