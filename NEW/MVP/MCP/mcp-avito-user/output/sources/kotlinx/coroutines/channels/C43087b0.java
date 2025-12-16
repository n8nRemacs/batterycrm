package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.M0;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, 272}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: kotlinx.coroutines.channels.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43087b0<E, C extends M0<? super E>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public M0 f410865q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410866r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410867s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410868t;

    /* renamed from: u, reason: collision with root package name */
    public int f410869u;

    public C43087b0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[Catch: all -> 0x0024, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001f, B:23:0x0056, B:16:0x0039, B:18:0x0041, B:20:0x0047, B:26:0x0065, B:15:0x0035), top: B:40:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001f, B:23:0x0056, B:16:0x0039, B:18:0x0041, B:20:0x0047, B:26:0x0065, B:15:0x0035), top: B:40:0x0015 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0045 -> B:23:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0053 -> B:23:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f410868t = r9
            int r0 = r8.f410869u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.f410869u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f410869u
            r2 = 0
            if (r1 == 0) goto L6c
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L27
            kotlinx.coroutines.channels.y r1 = r8.f410867s
            kotlinx.coroutines.channels.K0 r5 = r8.f410866r
            kotlinx.coroutines.channels.M0 r6 = r8.f410865q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L24
            r7 = r8
            goto L56
        L24:
            r9 = move-exception
            r2 = r5
            goto L71
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            kotlinx.coroutines.channels.y r1 = r8.f410867s
            kotlinx.coroutines.channels.K0 r5 = r8.f410866r
            kotlinx.coroutines.channels.M0 r6 = r8.f410865q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L24
            r7 = r8
        L39:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L24
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r9 == 0) goto L65
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L24
            if (r9 == 0) goto L56
            r7.f410865q = r6     // Catch: java.lang.Throwable -> L24
            r7.f410866r = r5     // Catch: java.lang.Throwable -> L24
            r7.f410867s = r1     // Catch: java.lang.Throwable -> L24
            r7.f410869u = r3     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r6.send(r9, r7)     // Catch: java.lang.Throwable -> L24
            if (r9 != r0) goto L56
            goto L6b
        L56:
            r7.f410865q = r6     // Catch: java.lang.Throwable -> L24
            r7.f410866r = r5     // Catch: java.lang.Throwable -> L24
            r7.f410867s = r1     // Catch: java.lang.Throwable -> L24
            r7.f410869u = r4     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r1.a(r7)     // Catch: java.lang.Throwable -> L24
            if (r9 != r0) goto L39
            goto L6b
        L65:
            kotlin.G0 r9 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L24
            r5.c(r2)
            r0 = r6
        L6b:
            return r0
        L6c:
            kotlin.C42729a0.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
        L71:
            throw r9     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43087b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
