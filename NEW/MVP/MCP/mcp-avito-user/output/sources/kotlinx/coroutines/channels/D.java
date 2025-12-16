package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.channels.B;

@Metadata(d1 = {"kotlinx/coroutines/channels/G", "kotlinx/coroutines/channels/J", "kotlinx/coroutines/channels/z0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    @kotlin.X
    public static final void a(@Y61.k K0<?> k02, @Y61.l Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = C43311x0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        k02.c(cancellationExceptionA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002e, B:28:0x0064, B:30:0x006c, B:33:0x007f, B:20:0x0045), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002e, B:28:0x0064, B:30:0x006c, B:33:0x007f, B:20:0x0045), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.I0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.K0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.K0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007c -> B:14:0x0031). Please report as a decompilation issue!!! */
    @Y61.l
    @kotlin.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k kotlinx.coroutines.channels.K0 r6, @Y61.k kotlinx.coroutines.channels.I0 r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.t0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.t0 r0 = (kotlinx.coroutines.channels.t0) r0
            int r1 = r0.f410995u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410995u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t0 r0 = new kotlinx.coroutines.channels.t0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f410994t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f410995u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            kotlinx.coroutines.channels.y r6 = r0.f410993s
            kotlinx.coroutines.channels.K0 r7 = r0.f410992r
            kotlinx.coroutines.channels.M0 r2 = r0.f410991q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L35
        L31:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L50
        L35:
            r6 = move-exception
            goto L8b
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlinx.coroutines.channels.y r6 = r0.f410993s
            kotlinx.coroutines.channels.K0 r7 = r0.f410992r
            kotlinx.coroutines.channels.M0 r2 = r0.f410991q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L64
        L49:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.channels.y r8 = r6.iterator()     // Catch: java.lang.Throwable -> L87
        L50:
            r0.f410991q = r7     // Catch: java.lang.Throwable -> L87
            r0.f410992r = r6     // Catch: java.lang.Throwable -> L87
            r0.f410993s = r8     // Catch: java.lang.Throwable -> L87
            r0.f410995u = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L87
            if (r2 != r1) goto L5f
            goto L86
        L5f:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            r0.f410991q = r2     // Catch: java.lang.Throwable -> L35
            r0.f410992r = r7     // Catch: java.lang.Throwable -> L35
            r0.f410993s = r6     // Catch: java.lang.Throwable -> L35
            r0.f410995u = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto L31
            goto L86
        L7f:
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            r7.c(r6)
            r1 = r2
        L86:
            return r1
        L87:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8b:
            throw r6     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
            a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.D.b(kotlinx.coroutines.channels.K0, kotlinx.coroutines.channels.I0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public static final void c(@Y61.k M0 m02, Object obj) {
        Object objW = m02.w(obj);
        if (objW instanceof B.c) {
            Object obj2 = ((B) C43259k.e(EmptyCoroutineContext.INSTANCE, new F(m02, obj, null))).f410774a;
        } else {
            B.b bVar = B.f410772b;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            bVar.getClass();
        }
    }
}
