package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: Transformable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y2 {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC22325c r5, androidx.compose.foundation.gestures.InterfaceC20524z1 r6, kotlin.coroutines.jvm.internal.BaseContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.u2
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.u2 r0 = (androidx.compose.foundation.gestures.u2) r0
            int r1 = r0.f28065t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28065t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.u2 r0 = new androidx.compose.foundation.gestures.u2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28064s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28065t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.compose.foundation.gestures.z1 r5 = r0.f28063r
            androidx.compose.ui.input.pointer.c r6 = r0.f28062q
            kotlin.C42729a0.b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L48
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.C42729a0.b(r7)
        L3b:
            r0.f28062q = r5
            r0.f28063r = r6
            r0.f28065t = r3
            java.lang.Object r7 = c(r5, r6, r0)
            if (r7 != r1) goto L48
            goto L4d
        L48:
            l0.g r7 = (l0.g) r7
            if (r7 == 0) goto L3b
            r1 = r7
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y2.a(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.gestures.z1, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ce, code lost:
    
        if (r6 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d0, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5 A[EDGE_INSN: B:104:0x02d5->B:93:0x02d5 BREAK  A[LOOP:0: B:87:0x02c0->B:92:0x02d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e6  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02a1 -> B:86:0x02b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.InterfaceC22325c r30, kotlinx.coroutines.channels.C43108m r31, Y41.l r32, kotlin.coroutines.jvm.internal.BaseContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y2.b(androidx.compose.ui.input.pointer.c, kotlinx.coroutines.channels.m, Y41.l, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.InterfaceC22325c r4, androidx.compose.foundation.gestures.InterfaceC20524z1 r5, kotlin.coroutines.jvm.internal.BaseContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.t2
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.t2 r0 = (androidx.compose.foundation.gestures.t2) r0
            int r1 = r0.f28061t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28061t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.t2 r0 = new androidx.compose.foundation.gestures.t2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28060s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28061t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            androidx.compose.foundation.gestures.z1 r5 = r0.f28059r
            androidx.compose.ui.input.pointer.c r4 = r0.f28058q
            kotlin.C42729a0.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f28058q = r4
            r0.f28059r = r5
            r0.f28061t = r3
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            java.lang.Object r6 = r4.N1(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            androidx.compose.ui.input.pointer.s r6 = (androidx.compose.ui.input.pointer.C22340s) r6
            int r0 = r6.f40281d
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r0 == 0) goto L92
            int r0 = r6.f40282e
            androidx.compose.ui.input.pointer.u$a r2 = androidx.compose.ui.input.pointer.C22342u.f40283b
            r2.getClass()
            int r2 = androidx.compose.ui.input.pointer.C22342u.f40289h
            boolean r0 = androidx.compose.ui.input.pointer.C22342u.a(r0, r2)
            if (r0 != 0) goto L60
            goto L92
        L60:
            r4.a()
            long r4 = r5.a(r6)
            l0.g$a r0 = l0.g.f413384b
            r0.getClass()
            r2 = 0
            boolean r0 = l0.g.d(r4, r2)
            if (r0 == 0) goto L75
            return r1
        L75:
            java.lang.Object r6 = r6.f40278a
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L7f:
            if (r1 >= r0) goto L8d
            java.lang.Object r2 = r6.get(r1)
            androidx.compose.ui.input.pointer.C r2 = (androidx.compose.ui.input.pointer.C) r2
            r2.a()
            int r1 = r1 + 1
            goto L7f
        L8d:
            l0.g r4 = l0.g.a(r4)
            return r4
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y2.c(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.gestures.z1, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
