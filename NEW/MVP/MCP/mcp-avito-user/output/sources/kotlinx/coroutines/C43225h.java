package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Await.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43225h {
    @Y61.l
    public static final <T> Object a(@Y61.k Collection<? extends InterfaceC43076a0<? extends T>> collection, @Y61.k Continuation<? super List<? extends T>> continuation) {
        return collection.isEmpty() ? C42784z0.f406748b : new C43130e((InterfaceC43076a0[]) collection.toArray(new InterfaceC43076a0[0])).a(continuation);
    }

    @Y61.l
    public static final Object b(@Y61.k InterfaceC43076a0[] interfaceC43076a0Arr, @Y61.k ContinuationImpl continuationImpl) {
        return interfaceC43076a0Arr.length == 0 ? C42784z0.f406748b : new C43130e(interfaceC43076a0Arr).a(continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k java.util.ArrayList r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.C43222g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.g r0 = (kotlinx.coroutines.C43222g) r0
            int r1 = r0.f411854s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411854s = r1
            goto L18
        L13:
            kotlinx.coroutines.g r0 = new kotlinx.coroutines.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f411853r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411854s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r4 = r0.f411852q
            kotlin.C42729a0.b(r5)
            goto L3a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.N0 r5 = (kotlinx.coroutines.N0) r5
            r0.f411852q = r4
            r0.f411854s = r3
            java.lang.Object r5 = r5.A(r0)
            if (r5 != r1) goto L3a
            return r1
        L51:
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C43225h.c(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
