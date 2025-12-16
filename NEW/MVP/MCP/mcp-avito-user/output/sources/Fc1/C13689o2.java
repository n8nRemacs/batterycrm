package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.o2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13689o2 {

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.o2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.m0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5712l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C13608f2 f5713m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f5714n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, C13608f2 c13608f2, androidx.compose.runtime.snapshots.D d12) {
            super(1);
            this.f5712l = d12;
            this.f5713m = c13608f2;
            this.f5714n = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.foundation.lazy.m0 m0Var) {
            C13741u1 c13741u1 = C13741u1.f5844l;
            androidx.compose.runtime.snapshots.D<C13602e5> d12 = this.f5712l;
            m0Var.a(d12.size(), null, new K1(d12, c13741u1), new C22096n(-632812321, new Z1(this.f5714n, this.f5713m, d12), true));
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.o2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C13608f2 f5715l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5716m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f5717n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, C13608f2 c13608f2, androidx.compose.runtime.snapshots.D d12) {
            super(2);
            this.f5715l = c13608f2;
            this.f5716m = d12;
            this.f5717n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5717n | 1);
            C13689o2.a(this.f5715l, this.f5716m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Fc1.C13608f2 r12, @Y61.k androidx.compose.runtime.snapshots.D<Fc1.C13602e5> r13, @Y61.l androidx.compose.runtime.A r14, int r15) {
        /*
            r0 = -1182283676(0xffffffffb987c864, float:-2.589851E-4)
            androidx.compose.runtime.B r14 = r14.E(r0)
            r0 = r15 & 14
            if (r0 != 0) goto L16
            boolean r0 = r14.B(r12)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r15
            goto L17
        L16:
            r0 = r15
        L17:
            r1 = r15 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r14.B(r13)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L38
            boolean r1 = r14.c()
            if (r1 != 0) goto L34
            goto L38
        L34:
            r14.f()
            goto L90
        L38:
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L90
            androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
            r2 = 72
            float r2 = (float) r2
            androidx.compose.ui.unit.h$a r3 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r1 = androidx.compose.foundation.layout.C20588k2.f(r1, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r1 = androidx.compose.foundation.layout.C20588k2.d(r1, r2)
            androidx.compose.foundation.layout.k r2 = androidx.compose.foundation.layout.C20585k.f28659a
            r2.getClass()
            androidx.compose.foundation.layout.k$c r4 = androidx.compose.foundation.layout.C20585k.f28664f
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.I(r2)
            boolean r2 = r14.B(r13)
            boolean r3 = r14.B(r12)
            r2 = r2 | r3
            java.lang.Object r3 = r14.t()
            if (r2 != 0) goto L74
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r2) goto L7c
        L74:
            Fc1.o2$a r3 = new Fc1.o2$a
            r3.<init>(r0, r12, r13)
            r14.H(r3)
        L7c:
            r0 = 0
            r14.X(r0)
            r8 = r3
            Y41.l r8 = (Y41.l) r8
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r10 = 24582(0x6006, float:3.4447E-41)
            r11 = 238(0xee, float:3.34E-43)
            r9 = r14
            androidx.compose.foundation.lazy.C20650b.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L90:
            androidx.compose.runtime.c2 r14 = r14.Z()
            if (r14 != 0) goto L97
            goto L9e
        L97:
            Fc1.o2$b r0 = new Fc1.o2$b
            r0.<init>(r15, r12, r13)
            r14.f38184d = r0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13689o2.a(Fc1.f2, androidx.compose.runtime.snapshots.D, androidx.compose.runtime.A, int):void");
    }
}
