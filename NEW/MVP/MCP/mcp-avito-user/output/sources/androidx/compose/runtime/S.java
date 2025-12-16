package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {

    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y1<?>[] f38143l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<A, Integer, kotlin.G0> f38144m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f38145n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y1<?>[] y1Arr, Y41.p<? super A, ? super Integer, kotlin.G0> pVar, int i12) {
            super(2);
            this.f38143l = y1Arr;
            this.f38144m = pVar;
            this.f38145n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(A a12, Integer num) {
            num.intValue();
            Y1<?>[] y1Arr = this.f38143l;
            Y1[] y1Arr2 = (Y1[]) Arrays.copyOf(y1Arr, y1Arr.length);
            int iA2 = C22066f2.a(this.f38145n | 1);
            S.b(y1Arr2, this.f38144m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y1<?> f38146l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<A, Integer, kotlin.G0> f38147m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f38148n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y1<?> y12, Y41.p<? super A, ? super Integer, kotlin.G0> pVar, int i12) {
            super(2);
            this.f38146l = y12;
            this.f38147m = pVar;
            this.f38148n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38148n | 1);
            S.a(this.f38146l, this.f38147m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.runtime.Y1<?> r10, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r11, @Y61.l androidx.compose.runtime.A r12, int r13) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            androidx.compose.runtime.B r12 = r12.E(r0)
            androidx.compose.runtime.O1 r0 = r12.S()
            androidx.compose.runtime.G1 r1 = androidx.compose.runtime.G.f37969b
            r2 = 201(0xc9, float:2.82E-43)
            r12.z0(r2, r1)
            java.lang.Object r1 = r12.t()
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            boolean r2 = kotlin.jvm.internal.L.f(r1, r2)
            r3 = 0
            if (r2 == 0) goto L26
            r1 = r3
            goto L28
        L26:
            androidx.compose.runtime.T3 r1 = (androidx.compose.runtime.T3) r1
        L28:
            androidx.compose.runtime.X1 r2 = r10.f38165a
            androidx.compose.runtime.T3 r4 = r2.c(r10, r1)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L37
            r12.H(r4)
        L37:
            boolean r5 = r12.f37887P
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L4f
            boolean r1 = r10.f38171g
            if (r1 != 0) goto L47
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L4b
        L47:
            androidx.compose.runtime.internal.J r0 = r0.P3(r2, r4)
        L4b:
            r12.f37881J = r7
        L4d:
            r1 = r6
            goto L87
        L4f:
            androidx.compose.runtime.K2 r5 = r12.f37878G
            int r8 = r5.f38003g
            int[] r9 = r5.f37998b
            java.lang.Object r5 = r5.b(r8, r9)
            androidx.compose.runtime.O1 r5 = (androidx.compose.runtime.O1) r5
            boolean r8 = r12.c()
            if (r8 == 0) goto L63
            if (r1 != 0) goto L6e
        L63:
            boolean r8 = r10.f38171g
            if (r8 != 0) goto L7c
            boolean r8 = r0.containsKey(r2)
            if (r8 != 0) goto L6e
            goto L7c
        L6e:
            if (r1 == 0) goto L75
            boolean r1 = r12.f37911w
            if (r1 != 0) goto L75
            goto L7a
        L75:
            boolean r1 = r12.f37911w
            if (r1 == 0) goto L7a
            goto L80
        L7a:
            r0 = r5
            goto L80
        L7c:
            androidx.compose.runtime.internal.J r0 = r0.P3(r2, r4)
        L80:
            boolean r1 = r12.f37913y
            if (r1 != 0) goto L86
            if (r5 == r0) goto L4d
        L86:
            r1 = r7
        L87:
            if (r1 == 0) goto L90
            boolean r2 = r12.f37887P
            if (r2 != 0) goto L90
            r12.p0(r0)
        L90:
            boolean r2 = r12.f37911w
            androidx.compose.runtime.I0 r4 = r12.f37912x
            r4.c(r2)
            r12.f37911w = r1
            r12.f37882K = r0
            androidx.compose.runtime.G1 r1 = androidx.compose.runtime.G.f37970c
            androidx.compose.runtime.D0$a r2 = androidx.compose.runtime.D0.f37948b
            r2.getClass()
            r2 = 202(0xca, float:2.83E-43)
            r12.x0(r2, r1, r0, r6)
            int r0 = r13 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.invoke(r12, r0)
            r12.X(r6)
            r12.X(r6)
            int r0 = r4.b()
            if (r0 == 0) goto Lbf
            r6 = r7
        Lbf:
            r12.f37911w = r6
            r12.f37882K = r3
            androidx.compose.runtime.c2 r12 = r12.Z()
            if (r12 == 0) goto Ld0
            androidx.compose.runtime.S$b r0 = new androidx.compose.runtime.S$b
            r0.<init>(r10, r11, r13)
            r12.f38184d = r0
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.S.a(androidx.compose.runtime.Y1, Y41.p, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, androidx.compose.runtime.internal.J$a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, androidx.compose.runtime.internal.J$a] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.runtime.Y1<?>[] r9, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r10, @Y61.l androidx.compose.runtime.A r11, int r12) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            androidx.compose.runtime.B r11 = r11.E(r0)
            androidx.compose.runtime.O1 r0 = r11.S()
            androidx.compose.runtime.G1 r1 = androidx.compose.runtime.G.f37969b
            r2 = 201(0xc9, float:2.82E-43)
            r11.z0(r2, r1)
            boolean r1 = r11.f37887P
            androidx.compose.runtime.G1 r2 = androidx.compose.runtime.G.f37971d
            r3 = 1
            r4 = 0
            r5 = 204(0xcc, float:2.86E-43)
            if (r1 == 0) goto L45
            androidx.compose.runtime.internal.J r1 = androidx.compose.runtime.internal.K.a()
            androidx.compose.runtime.O1 r1 = androidx.compose.runtime.V.b(r9, r0, r1)
            androidx.compose.runtime.internal.J$a r0 = r0.builder()
            r0.putAll(r1)
            androidx.compose.runtime.internal.J r0 = r0.build()
            r11.z0(r5, r2)
            r11.j0()
            r11.H0(r0)
            r11.j0()
            r11.H0(r1)
            r11.X(r4)
            r11.f37881J = r3
        L43:
            r1 = r4
            goto La3
        L45:
            androidx.compose.runtime.K2 r1 = r11.f37878G
            int r6 = r1.f38003g
            java.lang.Object r1 = r1.h(r6, r4)
            androidx.compose.runtime.O1 r1 = (androidx.compose.runtime.O1) r1
            androidx.compose.runtime.K2 r6 = r11.f37878G
            int r7 = r6.f38003g
            java.lang.Object r6 = r6.h(r7, r3)
            androidx.compose.runtime.O1 r6 = (androidx.compose.runtime.O1) r6
            androidx.compose.runtime.O1 r7 = androidx.compose.runtime.V.b(r9, r0, r6)
            boolean r8 = r11.c()
            if (r8 == 0) goto L7b
            boolean r8 = r11.f37913y
            if (r8 != 0) goto L7b
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L6e
            goto L7b
        L6e:
            int r0 = r11.f37900l
            androidx.compose.runtime.K2 r2 = r11.f37878G
            int r2 = r2.q()
            int r2 = r2 + r0
            r11.f37900l = r2
            r0 = r1
            goto L43
        L7b:
            androidx.compose.runtime.internal.J$a r0 = r0.builder()
            r0.putAll(r7)
            androidx.compose.runtime.internal.J r0 = r0.build()
            r11.z0(r5, r2)
            r11.j0()
            r11.H0(r0)
            r11.j0()
            r11.H0(r7)
            r11.X(r4)
            boolean r2 = r11.f37913y
            if (r2 != 0) goto La2
            boolean r1 = kotlin.jvm.internal.L.f(r0, r1)
            if (r1 != 0) goto L43
        La2:
            r1 = r3
        La3:
            if (r1 == 0) goto Lac
            boolean r2 = r11.f37887P
            if (r2 != 0) goto Lac
            r11.p0(r0)
        Lac:
            boolean r2 = r11.f37911w
            androidx.compose.runtime.I0 r5 = r11.f37912x
            r5.c(r2)
            r11.f37911w = r1
            r11.f37882K = r0
            androidx.compose.runtime.G1 r1 = androidx.compose.runtime.G.f37970c
            androidx.compose.runtime.D0$a r2 = androidx.compose.runtime.D0.f37948b
            r2.getClass()
            r2 = 202(0xca, float:2.83E-43)
            r11.x0(r2, r1, r0, r4)
            int r0 = r12 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r11, r0)
            r11.X(r4)
            r11.X(r4)
            int r0 = r5.b()
            if (r0 == 0) goto Ldb
            goto Ldc
        Ldb:
            r3 = r4
        Ldc:
            r11.f37911w = r3
            r0 = 0
            r11.f37882K = r0
            androidx.compose.runtime.c2 r11 = r11.Z()
            if (r11 == 0) goto Lee
            androidx.compose.runtime.S$a r0 = new androidx.compose.runtime.S$a
            r0.<init>(r9, r10, r12)
            r11.f38184d = r0
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.S.b(androidx.compose.runtime.Y1[], Y41.p, androidx.compose.runtime.A, int):void");
    }

    public static C22143q0 c(Y41.a aVar) {
        return new C22143q0(aVar, L3.f38023a);
    }

    @Y61.k
    public static final J3 d(@Y61.k Y41.a aVar) {
        return new J3(aVar, null);
    }
}
