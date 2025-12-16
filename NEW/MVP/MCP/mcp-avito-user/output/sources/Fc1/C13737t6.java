package Fc1;

import android.graphics.Color;
import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.t6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13737t6 {

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.t6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N7 f5837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N7 n72) {
            super(1);
            this.f5837l = n72;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            float f12 = C13593d5.f5455c / 2;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            long jA2 = l0.h.a(gVar2.M0(f12 - C13593d5.f5454b), 0.0f);
            long jI2 = l0.g.i(l0.h.a(0.0f, l0.g.h(gVar2.v1())), jA2);
            long j12 = l0.g.j(l0.h.a(l0.n.e(gVar2.i()), l0.g.h(gVar2.v1())), jA2);
            long jB2 = androidx.compose.ui.graphics.V.b(Color.parseColor(C13566a5.a(77, this.f5837l).f5864a));
            float fM02 = gVar2.M0(C13593d5.f5453a);
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, jB2, jI2, j12, fM02, androidx.compose.ui.graphics.m1.f39699c, null, 0, 480);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.t6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f5838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, int i12) {
            super(2);
            this.f5838l = z12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C13737t6.a(this.f5838l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1134096480);
        if ((((bE2.j(z12) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            C20835r0.a(6, new a(((Boolean) ((InterfaceC22204y1) bE2.o(C13788z3.f5920a)).getF42167b()).booleanValue() ? interfaceC13779y3.w() : z12 ? interfaceC13779y3.t() : interfaceC13779y3.r()), bE2, C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), C13593d5.f5453a));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(z12, i12);
    }
}
