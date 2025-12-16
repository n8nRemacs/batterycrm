package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;

/* loaded from: classes9.dex */
public final class D0 extends AbstractC13717r4 {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final b f4841l;

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            D0.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            D0 d02 = D0.this;
            C13714r1 c13714r1 = d02.f5784b;
            c13714r1.f5779d.clear();
            c13714r1.f5779d.add(String.valueOf(iIntValue));
            d02.b(false);
            InterfaceC13642j0 interfaceC13642j0 = d02.f5792j;
            if (interfaceC13642j0 == null) {
                interfaceC13642j0 = null;
            }
            interfaceC13642j0.a(d02);
            return kotlin.G0.f406611a;
        }
    }

    public D0(@Y61.k I6 i62) {
        super(i62);
        this.f4841l = new b();
    }

    @Override // Fc1.AbstractC13717r4
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(824246278);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C13652k1.a(this.f4841l, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12);
    }
}
