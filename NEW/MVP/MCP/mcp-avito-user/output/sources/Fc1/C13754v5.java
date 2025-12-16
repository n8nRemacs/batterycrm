package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;

/* renamed from: Fc1.v5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13754v5 extends AbstractC13717r4 {

    /* renamed from: Fc1.v5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            C13754v5.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @Override // Fc1.AbstractC13717r4
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(507927622);
        if ((i12 & 1) == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.E(2048673146);
            if (bE2.c()) {
                bE2.f();
            } else {
                R3.a(C13692o5.f5722a, bE2, 6);
            }
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new M5(0);
            }
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 == null) {
            return;
        }
        c22039c2Z2.f38184d = new a(i12);
    }
}
