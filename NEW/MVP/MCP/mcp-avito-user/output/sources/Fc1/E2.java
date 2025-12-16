package Fc1;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class E2 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f4899l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f4899l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f4899l.setValue(Boolean.valueOf(!r0.getF42167b().booleanValue()));
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20793y f4900l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C13602e5 f4901m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f4902n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f4903o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC20793y interfaceC20793y, C13602e5 c13602e5, InterfaceC22204y1<Boolean> interfaceC22204y1, int i12) {
            super(2);
            this.f4900l = interfaceC20793y;
            this.f4901m = c13602e5;
            this.f4902n = interfaceC22204y1;
            this.f4903o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f4903o | 1);
            C13602e5 c13602e5 = this.f4901m;
            InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f4902n;
            E2.a(this.f4900l, c13602e5, interfaceC22204y1, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.foundation.lazy.InterfaceC20793y r16, @Y61.k Fc1.C13602e5 r17, @Y61.k androidx.compose.runtime.InterfaceC22204y1<java.lang.Boolean> r18, @Y61.l androidx.compose.runtime.A r19, int r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 917518987(0x36b03a8b, float:5.252024E-6)
            r4 = r19
            androidx.compose.runtime.B r3 = r4.E(r3)
            androidx.compose.ui.v$a r4 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.v r4 = r0.e(r4)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r3.I(r5)
            boolean r5 = r3.B(r2)
            java.lang.Object r6 = r3.t()
            if (r5 != 0) goto L2e
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L36
        L2e:
            Fc1.E2$a r6 = new Fc1.E2$a
            r6.<init>(r2)
            r3.H(r6)
        L36:
            r15 = 0
            r3.X(r15)
            Y41.a r6 = (Y41.a) r6
            androidx.compose.ui.v r4 = Fc1.C13775y.b(r4, r6)
            androidx.compose.ui.f$a r5 = androidx.compose.ui.InterfaceC22215f.f39074a
            r5.getClass()
            androidx.compose.ui.i r5 = androidx.compose.ui.InterfaceC22215f.a.f39080f
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3.I(r6)
            r6 = 6
            androidx.compose.ui.layout.i0 r5 = androidx.compose.foundation.layout.C20632w.e(r5, r15, r3, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.I(r6)
            int r6 = r3.f37888Q
            androidx.compose.runtime.O1 r7 = r3.S()
            androidx.compose.ui.node.h$a r8 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r8.getClass()
            Y41.a<androidx.compose.ui.node.h> r8 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.internal.n r4 = androidx.compose.ui.layout.M.c(r4)
            androidx.compose.runtime.i<?> r9 = r3.f37890b
            if (r9 == 0) goto Ldf
            r3.A()
            boolean r9 = r3.f37887P
            if (r9 == 0) goto L78
            r3.b(r8)
            goto L7b
        L78:
            r3.d()
        L7b:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r8 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r8, r3, r5)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r5, r3, r7)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r7 = r3.f37887P
            if (r7 != 0) goto L99
            java.lang.Object r7 = r3.t()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
            if (r7 != 0) goto L9c
        L99:
            Fc1.C13653k2.a(r6, r3, r6, r5)
        L9c:
            androidx.compose.runtime.J2 r5 = androidx.compose.runtime.J2.a(r3)
            Fc1.A2.a(r4, r5, r3)
            androidx.compose.foundation.layout.z r4 = androidx.compose.foundation.layout.C20644z.f28804a
            androidx.compose.ui.graphics.k r4 = new androidx.compose.ui.graphics.k
            android.graphics.Bitmap r5 = r1.f5488b
            r4.<init>(r5)
            androidx.compose.ui.layout.n$a r5 = androidx.compose.ui.layout.InterfaceC22374n.f40491a
            r5.getClass()
            androidx.compose.ui.layout.n$a$e r8 = androidx.compose.ui.layout.InterfaceC22374n.a.f40494c
            r10 = 0
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r13 = 24632(0x6038, float:3.4517E-41)
            r14 = 236(0xec, float:3.31E-43)
            r12 = r3
            androidx.compose.foundation.C20806p1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.X(r15)
            r4 = 1
            r3.X(r4)
            r3.X(r15)
            r3.X(r15)
            androidx.compose.runtime.c2 r3 = r3.Z()
            if (r3 != 0) goto Ld5
            goto Lde
        Ld5:
            Fc1.E2$b r4 = new Fc1.E2$b
            r5 = r20
            r4.<init>(r0, r1, r2, r5)
            r3.f38184d = r4
        Lde:
            return
        Ldf:
            androidx.compose.runtime.C22190v.b()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.E2.a(androidx.compose.foundation.lazy.y, Fc1.e5, androidx.compose.runtime.y1, androidx.compose.runtime.A, int):void");
    }
}
