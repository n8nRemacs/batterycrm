package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21894u {
    @InterfaceC21537e7
    @Y61.k
    public static final <T> N6<T> a(@Y61.k Y41.l<? super O6<T>, kotlin.G0> lVar) {
        O6 o62 = new O6();
        lVar.invoke(o62);
        return new C21768o9(o62.f35240a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Y41.a r4, Y41.p r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.r
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.r r0 = (androidx.compose.material3.r) r0
            int r1 = r0.f37187r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37187r = r1
            goto L18
        L13:
            androidx.compose.material3.r r0 = new androidx.compose.material3.r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37186q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37187r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)     // Catch: androidx.compose.material3.C21712m -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            androidx.compose.material3.s r6 = new androidx.compose.material3.s     // Catch: androidx.compose.material3.C21712m -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.C21712m -> L43
            r0.f37187r = r3     // Catch: androidx.compose.material3.C21712m -> L43
            java.lang.Object r4 = kotlinx.coroutines.U.c(r6, r0)     // Catch: androidx.compose.material3.C21712m -> L43
            if (r4 != r1) goto L43
            goto L45
        L43:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21894u.b(Y41.a, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @InterfaceC21537e7
    @Y61.l
    public static final Object c(@Y61.k C21916v c21916v, Object obj, float f12, @Y61.k SuspendLambda suspendLambda) {
        C21804q c21804q = new C21804q(c21916v, f12, null);
        int i12 = C21916v.f37488p;
        Object objB = c21916v.b(obj, MutatePriority.f26797b, c21804q, suspendLambda);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }
}
