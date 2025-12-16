package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: RecomposeScopeImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/H;", "composition", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/H;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22055d2 extends kotlin.jvm.internal.N implements Y41.l<H, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22039c2 f38283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.collection.M0<Object> f38285n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22055d2(C22039c2 c22039c2, int i12, androidx.collection.M0<Object> m02) {
        super(1);
        this.f38283l = c22039c2;
        this.f38284m = i12;
        this.f38285n = m02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.H r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.compose.runtime.H r1 = (androidx.compose.runtime.H) r1
            androidx.compose.runtime.c2 r2 = r0.f38283l
            int r3 = r2.f38185e
            int r4 = r0.f38284m
            if (r3 != r4) goto La9
            androidx.collection.M0<java.lang.Object> r3 = r2.f38186f
            androidx.collection.M0<java.lang.Object> r5 = r0.f38285n
            boolean r3 = kotlin.jvm.internal.L.f(r5, r3)
            if (r3 == 0) goto La9
            boolean r3 = r1 instanceof androidx.compose.runtime.M
            if (r3 == 0) goto La9
            long[] r3 = r5.f25647a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto La9
            r8 = 0
        L24:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3e:
            if (r13 >= r11) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8b
            int r14 = r8 << 3
            int r14 = r14 + r13
            java.lang.Object[] r15 = r5.f25648b
            r15 = r15[r14]
            int[] r7 = r5.f25649c
            r7 = r7[r14]
            if (r7 == r4) goto L58
            r7 = 1
            goto L59
        L58:
            r7 = 0
        L59:
            if (r7 == 0) goto L81
            r12 = r1
            androidx.compose.runtime.M r12 = (androidx.compose.runtime.M) r12
            androidx.collection.R0<java.lang.Object, java.lang.Object> r0 = r12.f38030h
            androidx.compose.runtime.collection.i.c(r0, r15, r2)
            boolean r0 = r15 instanceof androidx.compose.runtime.InterfaceC22074h0
            if (r0 == 0) goto L81
            r0 = r15
            androidx.compose.runtime.h0 r0 = (androidx.compose.runtime.InterfaceC22074h0) r0
            r17 = r1
            androidx.collection.R0<java.lang.Object, java.lang.Object> r1 = r12.f38030h
            boolean r1 = r1.c(r0)
            if (r1 != 0) goto L79
            androidx.collection.R0<java.lang.Object, java.lang.Object> r1 = r12.f38033k
            androidx.compose.runtime.collection.i.d(r1, r0)
        L79:
            androidx.collection.R0<androidx.compose.runtime.h0<?>, java.lang.Object> r0 = r2.f38187g
            if (r0 == 0) goto L83
            r0.k(r15)
            goto L83
        L81:
            r17 = r1
        L83:
            if (r7 == 0) goto L88
            r5.g(r14)
        L88:
            r0 = 8
            goto L8e
        L8b:
            r17 = r1
            r0 = r12
        L8e:
            long r9 = r9 >> r0
            int r13 = r13 + 1
            r12 = r0
            r1 = r17
            r0 = r18
            goto L3e
        L97:
            r17 = r1
            r0 = r12
            if (r11 != r0) goto La9
            goto L9f
        L9d:
            r17 = r1
        L9f:
            if (r8 == r6) goto La9
            int r8 = r8 + 1
            r0 = r18
            r1 = r17
            goto L24
        La9:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22055d2.invoke(java.lang.Object):java.lang.Object");
    }
}
