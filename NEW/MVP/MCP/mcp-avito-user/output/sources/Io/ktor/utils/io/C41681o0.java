package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {390}, m = "readDoubleSlow", n = {"this"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41681o0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401227q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401229s;

    /* renamed from: t, reason: collision with root package name */
    public int f401230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41681o0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401229s = abstractC41660h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws java.io.EOFException {
        /*
            r6 = this;
            r0 = 8
            r6.f401228r = r7
            int r7 = r6.f401230t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r1
            r6.f401230t = r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = io.ktor.utils.io.AbstractC41660h0.f400973h
            io.ktor.utils.io.h0 r7 = r6.f401229s
            r7.getClass()
            boolean r2 = r6 instanceof io.ktor.utils.io.C41681o0
            if (r2 == 0) goto L21
            int r2 = r6.f401230t
            r3 = r2 & r1
            if (r3 == 0) goto L21
            int r2 = r2 - r1
            r6.f401230t = r2
            r1 = r6
            goto L26
        L21:
            io.ktor.utils.io.o0 r1 = new io.ktor.utils.io.o0
            r1.<init>(r7, r6)
        L26:
            java.lang.Object r2 = r1.f401228r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.f401230t
            r5 = 1
            if (r4 == 0) goto L41
            if (r4 != r5) goto L39
            io.ktor.utils.io.h0 r7 = r1.f401227q
            kotlin.C42729a0.b(r2)
            goto L4f
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            kotlin.C42729a0.b(r2)
            r1.f401227q = r7
            r1.f401230t = r5
            java.lang.Object r1 = r7.Q(r0, r1)
            if (r1 != r3) goto L4f
            goto L84
        L4f:
            io.ktor.utils.io.core.n r1 = r7.f400980d
            int r2 = r1.f400911f
            int r3 = r1.f400910e
            int r2 = r2 - r3
            if (r2 <= r0) goto L63
            int r2 = r3 + 8
            r1.f400910e = r2
            java.nio.ByteBuffer r1 = r1.f400909d
            double r1 = r1.getDouble(r3)
            goto L7d
        L63:
            io.ktor.utils.io.core.internal.b r2 = r1.u(r0)
            if (r2 == 0) goto L8d
            int r3 = r2.f400875b
            int r4 = r2.f400876c
            int r4 = r4 - r3
            if (r4 < r0) goto L85
            java.nio.ByteBuffer r4 = r2.f400874a
            double r3 = r4.getDouble(r3)
            r2.c(r0)
            io.ktor.utils.io.core.internal.i.a(r1, r2)
            r1 = r3
        L7d:
            r7.M(r0)
            java.lang.Double r3 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r1)
        L84:
            return r3
        L85:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "Not enough bytes to read a long floating point number of size 8."
            r7.<init>(r0)
            throw r7
        L8d:
            io.ktor.utils.io.core.S.a(r0)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41681o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
