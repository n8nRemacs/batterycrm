package Fc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import com.avito.android.R;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class L0 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5070l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5071m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.snapshots.D<C13602e5> d12, int i12) {
            super(2);
            this.f5070l = d12;
            this.f5071m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5071m | 1);
            L0.a(this.f5070l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k androidx.compose.runtime.snapshots.D<C13602e5> d12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-264186924);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(d12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else if (!d12.isEmpty()) {
            String strB = u0.i.b(R.string.feedback_screenshots_count_hint, new Object[]{String.valueOf(d12.size()), "3"}, bE2);
            C22143q0 c22143q0 = C13707q2.f5762a;
            D2 d2U = ((InterfaceC13779y3) bE2.o(c22143q0)).u();
            N7 n7B = ((InterfaceC13779y3) bE2.o(c22143q0)).B();
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = androidx.compose.foundation.layout.R1.k(0.0f, 16, 1, vVarD);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            C13698p2.a(strB, vVarK, d2U, n7B, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), bE2, 48, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(d12, i12);
    }
}
