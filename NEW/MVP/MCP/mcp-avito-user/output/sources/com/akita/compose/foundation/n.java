package com.akita.compose.foundation;

import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.S;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Ripple.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f63625a = S.c(a.f63630l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final o f63626b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final o f63627c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.material.ripple.l f63628d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.material.ripple.l f63629e;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/foundation/m;", "invoke", "()Lcom/akita/compose/foundation/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<m> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f63630l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            T.f39320b.getClass();
            return new m(T.f39323e, n.f63628d, null);
        }
    }

    static {
        androidx.compose.ui.unit.h.f42849c.getClass();
        float f12 = androidx.compose.ui.unit.h.f42851e;
        T.f39320b.getClass();
        long j12 = T.f39330l;
        f63626b = new o(true, f12, j12, null);
        f63627c = new o(false, f12, j12, null);
        f63628d = new androidx.compose.material.ripple.l(0.08f, 0.08f, 0.08f, 0.08f);
        f63629e = new androidx.compose.material.ripple.l(0.06f, 0.06f, 0.06f, 0.06f);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.akita.compose.foundation.m a(@Y61.k com.akita.compose.foundation.p r4, @Y61.l androidx.compose.runtime.A r5) {
        /*
            r0 = 147846728(0x8cff648, float:1.251626E-33)
            r5.C(r0)
            androidx.compose.runtime.J3 r0 = com.akita.compose.foundation.b.f63571a
            java.lang.Object r0 = r5.o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            long r1 = r4.c(r5)
            r4 = 525801409(0x1f5717c1, float:4.554767E-20)
            r5.C(r4)
            boolean r4 = r5.n(r1)
            boolean r0 = r5.j(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r5.t()
            if (r4 != 0) goto L34
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r4) goto L44
        L34:
            com.akita.compose.foundation.m r0 = new com.akita.compose.foundation.m
            androidx.compose.material.ripple.l r4 = new androidx.compose.material.ripple.l
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r3, r3, r3)
            r3 = 0
            r0.<init>(r1, r4, r3)
            r5.H(r0)
        L44:
            com.akita.compose.foundation.m r0 = (com.akita.compose.foundation.m) r0
            r5.h()
            r5.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.foundation.n.a(com.akita.compose.foundation.p, androidx.compose.runtime.A):com.akita.compose.foundation.m");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.akita.compose.foundation.m b(@Y61.k com.akita.compose.foundation.p r6, boolean r7, @Y61.l androidx.compose.runtime.A r8, int r9, int r10) {
        /*
            r0 = -803506359(0xffffffffd01b7749, float:-1.0433144E10)
            r8.C(r0)
            r10 = r10 & 2
            if (r10 == 0) goto L16
            androidx.compose.runtime.J3 r7 = com.akita.compose.foundation.b.f63571a
            java.lang.Object r7 = r8.o(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L16:
            if (r7 == 0) goto L1b
            androidx.compose.material.ripple.l r10 = com.akita.compose.foundation.n.f63629e
            goto L1d
        L1b:
            androidx.compose.material.ripple.l r10 = com.akita.compose.foundation.n.f63628d
        L1d:
            long r0 = r6.c(r8)
            r6 = -2074769725(0xffffffff845586c3, float:-2.509991E-36)
            r8.C(r6)
            boolean r6 = r8.n(r0)
            r2 = r9 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 0
            r4 = 1
            r5 = 32
            if (r2 <= r5) goto L3b
            boolean r7 = r8.j(r7)
            if (r7 != 0) goto L3f
        L3b:
            r7 = r9 & 48
            if (r7 != r5) goto L41
        L3f:
            r7 = r4
            goto L42
        L41:
            r7 = r3
        L42:
            r6 = r6 | r7
            r7 = r9 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r7 <= r2) goto L51
            boolean r7 = r8.B(r10)
            if (r7 != 0) goto L55
        L51:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != r2) goto L56
        L55:
            r3 = r4
        L56:
            r6 = r6 | r3
            java.lang.Object r7 = r8.t()
            if (r6 != 0) goto L66
            androidx.compose.runtime.A$a r6 = androidx.compose.runtime.A.f37866a
            r6.getClass()
            androidx.compose.runtime.A$a$a r6 = androidx.compose.runtime.A.a.f37868b
            if (r7 != r6) goto L6f
        L66:
            com.akita.compose.foundation.m r7 = new com.akita.compose.foundation.m
            r6 = 0
            r7.<init>(r0, r10, r6)
            r8.H(r7)
        L6f:
            com.akita.compose.foundation.m r7 = (com.akita.compose.foundation.m) r7
            r8.h()
            r8.h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.foundation.n.b(com.akita.compose.foundation.p, boolean, androidx.compose.runtime.A, int, int):com.akita.compose.foundation.m");
    }

    @F3
    @Y61.k
    public static final InterfaceC21084v1 c(boolean z12, float f12, long j12) {
        androidx.compose.ui.unit.h.f42849c.getClass();
        if (androidx.compose.ui.unit.h.b(f12, androidx.compose.ui.unit.h.f42851e)) {
            T.f39320b.getClass();
            if (T.d(j12, T.f39330l)) {
                return z12 ? f63626b : f63627c;
            }
        }
        return new o(z12, f12, j12, null);
    }

    public static InterfaceC21084v1 d(float f12, int i12, long j12, boolean z12) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        if ((i12 & 4) != 0) {
            T.f39320b.getClass();
            j12 = T.f39330l;
        }
        return c(z12, f12, j12);
    }
}
