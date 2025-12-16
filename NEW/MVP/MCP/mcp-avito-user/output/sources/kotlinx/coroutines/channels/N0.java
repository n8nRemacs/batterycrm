package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TickerChannels.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes8.dex */
final class N0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public M0 f410817q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f410818r;

    /* renamed from: s, reason: collision with root package name */
    public int f410819s;

    public N0() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[PHI: r2
  0x005d: PHI (r2v3 kotlinx.coroutines.channels.M0) = (r2v2 kotlinx.coroutines.channels.M0), (r2v5 kotlinx.coroutines.channels.M0) binds: [B:20:0x005a, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:19:0x0050). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f410818r = r9
            int r9 = r8.f410819s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.f410819s = r9
            r1 = r9 & r0
            if (r1 == 0) goto L12
            int r9 = r9 - r0
            r8.f410819s = r9
            r9 = r8
            goto L17
        L12:
            kotlinx.coroutines.channels.N0 r9 = new kotlinx.coroutines.channels.N0
            r9.<init>(r8)
        L17:
            java.lang.Object r0 = r9.f410818r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.f410819s
            r3 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            goto L3b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlinx.coroutines.channels.M0 r2 = r9.f410817q
            kotlin.C42729a0.b(r0)
            goto L5d
        L3b:
            kotlinx.coroutines.channels.M0 r2 = r9.f410817q
            kotlin.C42729a0.b(r0)
            goto L50
        L41:
            kotlin.C42729a0.b(r0)
            r2 = 0
            r9.f410817q = r2
            r9.f410819s = r7
            java.lang.Object r0 = kotlinx.coroutines.C43131e0.b(r3, r9)
            if (r0 != r1) goto L50
            goto L67
        L50:
            kotlin.G0 r0 = kotlin.G0.f406611a
            r9.f410817q = r2
            r9.f410819s = r6
            java.lang.Object r0 = r2.send(r0, r9)
            if (r0 != r1) goto L5d
            goto L67
        L5d:
            r9.f410817q = r2
            r9.f410819s = r5
            java.lang.Object r0 = kotlinx.coroutines.C43131e0.b(r3, r9)
            if (r0 != r1) goto L50
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.N0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
