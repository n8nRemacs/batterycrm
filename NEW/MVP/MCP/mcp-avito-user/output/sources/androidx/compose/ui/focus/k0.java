package androidx.compose.ui.focus;

import androidx.collection.R0;
import androidx.collection.i1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusTransactionManager.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/k0;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0<FocusTargetNode, FocusStateImpl> f39176a = i1.b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Y41.a<G0>> f39177b = new androidx.compose.runtime.collection.e<>(new Y41.a[16], 0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f39178c;

    /* renamed from: d, reason: collision with root package name */
    public int f39179d;

    public static final void a(k0 k0Var) {
        k0Var.f39176a.g();
        k0Var.f39178c = false;
        androidx.compose.runtime.collection.e<Y41.a<G0>> eVar = k0Var.f39177b;
        Y41.a<G0>[] aVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            aVarArr[i13].invoke();
        }
        eVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.focus.k0 r15) {
        /*
            androidx.collection.R0<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r0 = r15.f39176a
            java.lang.Object[] r1 = r0.f25722b
            long[] r2 = r0.f25721a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L76
            r5 = r4
        Ld:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L71
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L27:
            if (r10 >= r8) goto L6f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L6b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.focus.FocusTargetNode r11 = (androidx.compose.ui.focus.FocusTargetNode) r11
            r11.getClass()
            androidx.compose.ui.node.J0 r12 = androidx.compose.ui.node.C22421l.h(r11)
            androidx.compose.ui.focus.B r12 = r12.getFocusOwner()
            androidx.compose.ui.focus.k0 r12 = r12.getF39106h()
            r12.getClass()
            boolean r13 = androidx.compose.ui.l.f40323d
            if (r13 != 0) goto L63
            androidx.collection.R0<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r12 = r12.f39176a
            java.lang.Object r12 = r12.e(r11)
            androidx.compose.ui.focus.FocusStateImpl r12 = (androidx.compose.ui.focus.FocusStateImpl) r12
            if (r12 == 0) goto L5c
            r11.f39128t = r12
            goto L6b
        L5c:
            java.lang.String r15 = "committing a node that was not updated in the current transaction"
            kotlin.KotlinNothingValueException r15 = androidx.compose.foundation.H.s(r15)
            throw r15
        L63:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "uncommittedFocusState must not be accessed when isTrackFocusEnabled is on"
            r15.<init>(r0)
            throw r15
        L6b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L27
        L6f:
            if (r8 != r9) goto L76
        L71:
            if (r5 == r3) goto L76
            int r5 = r5 + 1
            goto Ld
        L76:
            r0.g()
            r15.f39178c = r4
            androidx.compose.runtime.collection.e<Y41.a<kotlin.G0>> r15 = r15.f39177b
            r15.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k0.b(androidx.compose.ui.focus.k0):void");
    }
}
