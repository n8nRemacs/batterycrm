package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: TextFieldCursor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z1 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.J f30628l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30629m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30630n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30631o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(androidx.compose.ui.graphics.J j12, C20985q1 c20985q1, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12) {
        super(3);
        this.f30628l = j12;
        this.f30629m = c20985q1;
        this.f30630n = w12;
        this.f30631o = l12;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v r10, androidx.compose.runtime.A r11, java.lang.Integer r12) {
        /*
            r9 = this;
            androidx.compose.ui.v r10 = (androidx.compose.ui.v) r10
            androidx.compose.runtime.A r11 = (androidx.compose.runtime.A) r11
            java.lang.Number r12 = (java.lang.Number) r12
            r12.intValue()
            r12 = -84507373(0xfffffffffaf68513, float:-6.4000205E35)
            r11.C(r12)
            androidx.compose.runtime.J3 r12 = androidx.compose.ui.platform.Q0.f41214w
            java.lang.Object r12 = r11.o(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            boolean r0 = r11.j(r12)
            java.lang.Object r1 = r11.t()
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            if (r0 != 0) goto L2e
            r2.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L36
        L2e:
            androidx.compose.foundation.text.input.internal.I r1 = new androidx.compose.foundation.text.input.internal.I
            r1.<init>(r12)
            r11.H(r1)
        L36:
            r4 = r1
            androidx.compose.foundation.text.input.internal.I r4 = (androidx.compose.foundation.text.input.internal.I) r4
            androidx.compose.ui.graphics.J r12 = r9.f30628l
            boolean r0 = r12 instanceof androidx.compose.ui.graphics.k1
            if (r0 == 0) goto L4c
            r0 = r12
            androidx.compose.ui.graphics.k1 r0 = (androidx.compose.ui.graphics.k1) r0
            long r0 = r0.f39547b
            r5 = 16
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = 1
        L4d:
            androidx.compose.runtime.J3 r1 = androidx.compose.ui.platform.Q0.f41211t
            java.lang.Object r1 = r11.o(r1)
            androidx.compose.ui.platform.F2 r1 = (androidx.compose.ui.platform.F2) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto Ldc
            androidx.compose.foundation.text.q1 r7 = r9.f30629m
            boolean r1 = r7.b()
            if (r1 == 0) goto Ldc
            androidx.compose.ui.text.input.W r1 = r9.f30630n
            long r5 = r1.f42384b
            boolean r3 = androidx.compose.ui.text.v0.d(r5)
            if (r3 == 0) goto Ldc
            if (r0 == 0) goto Ldc
            r0 = 808460990(0x303022be, float:6.40778E-10)
            r11.C(r0)
            long r5 = r1.f42384b
            androidx.compose.ui.text.v0 r0 = androidx.compose.ui.text.v0.a(r5)
            boolean r3 = r11.u(r4)
            java.lang.Object r5 = r11.t()
            if (r3 != 0) goto L8c
            r2.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L95
        L8c:
            androidx.compose.foundation.text.X1 r5 = new androidx.compose.foundation.text.X1
            r3 = 0
            r5.<init>(r4, r3)
            r11.H(r5)
        L95:
            Y41.p r5 = (Y41.p) r5
            androidx.compose.ui.text.e r3 = r1.f42383a
            androidx.compose.runtime.C22187u0.e(r3, r0, r5, r11)
            boolean r0 = r11.u(r4)
            androidx.compose.ui.text.input.L r3 = r9.f30631o
            boolean r3 = r11.u(r3)
            r0 = r0 | r3
            boolean r1 = r11.B(r1)
            r0 = r0 | r1
            boolean r1 = r11.u(r7)
            r0 = r0 | r1
            boolean r12 = r11.B(r12)
            r12 = r12 | r0
            java.lang.Object r0 = r11.t()
            if (r12 != 0) goto Lc3
            r2.getClass()
            androidx.compose.runtime.A$a$a r12 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r12) goto Ld2
        Lc3:
            androidx.compose.foundation.text.Y1 r0 = new androidx.compose.foundation.text.Y1
            androidx.compose.ui.text.input.L r5 = r9.f30631o
            androidx.compose.ui.text.input.W r6 = r9.f30630n
            androidx.compose.ui.graphics.J r8 = r9.f30628l
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r11.H(r0)
        Ld2:
            Y41.l r0 = (Y41.l) r0
            androidx.compose.ui.v r10 = androidx.compose.ui.draw.o.d(r10, r0)
            r11.h()
            goto Le7
        Ldc:
            r10 = 810474750(0x304edcfe, float:7.525641E-10)
            r11.C(r10)
            r11.h()
            androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
        Le7:
            r11.h()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.Z1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
