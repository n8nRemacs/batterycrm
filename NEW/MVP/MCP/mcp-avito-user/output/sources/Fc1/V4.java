package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;

/* loaded from: classes9.dex */
public final class V4 extends AbstractC13717r4 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            V4.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @Override // Fc1.AbstractC13717r4
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1984643916);
        if ((i12 & 1) == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.E(272277730);
            if (bE2.c()) {
                bE2.f();
            } else {
                R3.a(W5.f5281a, bE2, 6);
            }
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new C13665l5(0);
            }
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 == null) {
            return;
        }
        c22039c2Z2.f38184d = new a(i12);
    }
}
