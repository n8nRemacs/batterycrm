package Fc1;

import android.graphics.Color;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.material3.C21646j2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Z4 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f5355l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13779y3 f5356m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC13779y3 interfaceC13779y3) {
            super(3);
            this.f5355l = str;
            this.f5356m = interfaceC13779y3;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                InterfaceC13779y3 interfaceC13779y3 = this.f5356m;
                C13698p2.a(this.f5355l, null, interfaceC13779y3.f(), interfaceC13779y3.s(), null, a13, 0, 18);
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5357l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5358m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.a aVar) {
            super(2);
            this.f5357l = aVar;
            this.f5358m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5358m | 1);
            Z4.a(this.f5357l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-702648643);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            I6 i62 = (I6) bE2.o(S3.f5172a);
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            String value = i62.getValue();
            if (value != null) {
                boolean zBooleanValue = ((Boolean) ((InterfaceC22204y1) bE2.o(Z2.f5350a)).getF42167b()).booleanValue();
                androidx.compose.material3.X1 x12 = androidx.compose.material3.X1.f35798a;
                long jA2 = C13775y.a(interfaceC13779y3.y());
                long jB2 = androidx.compose.ui.graphics.V.b(Color.parseColor(C13566a5.a(77, interfaceC13779y3.a()).f5864a));
                x12.getClass();
                androidx.compose.material3.W1 w1A = androidx.compose.material3.X1.a(jA2, jB2, bE2, 10);
                float fA2 = interfaceC13779y3.q().a();
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                C21646j2.a(aVar, null, zBooleanValue, androidx.compose.foundation.shape.o.a(fA2), w1A, null, null, null, null, androidx.compose.runtime.internal.r.b(bE2, -1735614001, new a(value, interfaceC13779y3)), bE2, (i13 & 14) | 805306368, 482);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(i12, aVar);
    }
}
