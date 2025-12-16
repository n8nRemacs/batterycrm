package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21385w {
    @InterfaceC21154e4
    @Y61.k
    public static final <T> InterfaceC21153e3<T> a(@Y61.k Y41.l<? super C21166f3<T>, kotlin.G0> lVar) {
        C21166f3 c21166f3 = new C21166f3();
        lVar.invoke(c21166f3);
        return new C21339s5(c21166f3.f33561a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Y41.a r4, Y41.p r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.C21346t
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.t r0 = (androidx.compose.material.C21346t) r0
            int r1 = r0.f34205r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34205r = r1
            goto L18
        L13:
            androidx.compose.material.t r0 = new androidx.compose.material.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34204q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34205r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            androidx.compose.material.u r6 = new androidx.compose.material.u     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.f34205r = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.U.c(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            goto L45
        L43:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21385w.b(Y41.a, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static androidx.compose.ui.v c(androidx.compose.ui.v vVar, C21398x c21398x, Orientation orientation, boolean z12, boolean z13, int i12) {
        boolean z14 = (i12 & 8) != 0 ? false : z13;
        return androidx.compose.foundation.gestures.V0.b(vVar, c21398x.f34352f, orientation, z12, null, ((C22082i3) c21398x.f34359m).getF42167b() != null, new r(c21398x, null), z14, 32);
    }

    @Y61.l
    @InterfaceC21154e4
    public static final Object d(@Y61.k C21398x c21398x, Object obj, float f12, @Y61.k ContinuationImpl continuationImpl) {
        C21333s c21333s = new C21333s(c21398x, f12, null);
        int i12 = C21398x.f34346p;
        Object objB = c21398x.b(obj, MutatePriority.f26797b, c21333s, continuationImpl);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    public static Object e(C21398x c21398x, Object obj, SuspendLambda suspendLambda) {
        return d(c21398x, obj, ((C22040c3) c21398x.f34358l).f(), suspendLambda);
    }
}
