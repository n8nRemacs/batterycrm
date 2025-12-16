package io.ktor.util;

import io.ktor.utils.io.InterfaceC41649d1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deflater.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class O extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f400408q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400409r;

    /* renamed from: s, reason: collision with root package name */
    public int f400410s;

    public O() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            r7.f400409r = r8
            int r8 = r7.f400410s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f400410s = r8
            r8 = 0
            boolean r0 = r7 instanceof io.ktor.util.O
            if (r0 == 0) goto L1b
            int r0 = r7.f400410s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1b
            int r0 = r0 - r1
            r7.f400410s = r0
            r0 = r7
            goto L20
        L1b:
            io.ktor.util.O r0 = new io.ktor.util.O
            r0.<init>(r7)
        L20:
            java.lang.Object r1 = r0.f400409r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f400410s
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L4b
            if (r3 == r6) goto L45
            if (r3 == r5) goto L3f
            if (r3 != r4) goto L37
            kotlin.C42729a0.b(r1)
            goto L7b
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            io.ktor.utils.io.d1 r8 = r0.f400408q
            kotlin.C42729a0.b(r1)
            goto L6d
        L45:
            io.ktor.utils.io.d1 r8 = r0.f400408q
            kotlin.C42729a0.b(r1)
            goto L60
        L4b:
            kotlin.C42729a0.b(r1)
            r1 = -29921(0xffffffffffff8b1f, float:NaN)
            short r1 = (short) r1
            short r1 = java.lang.Short.reverseBytes(r1)
            r0.f400408q = r8
            r0.f400410s = r6
            java.lang.Object r1 = r8.y(r1, r0)
            if (r1 != r2) goto L60
            goto L7d
        L60:
            r0.f400408q = r8
            r0.f400410s = r5
            r1 = 8
            java.lang.Object r1 = r8.q(r1, r0)
            if (r1 != r2) goto L6d
            goto L7d
        L6d:
            byte[] r1 = io.ktor.util.Q.f400416a
            r3 = 0
            r0.f400408q = r3
            r0.f400410s = r4
            java.lang.Object r8 = io.ktor.utils.io.C41655f1.a(r8, r1, r0)
            if (r8 != r2) goto L7b
            goto L7d
        L7b:
            kotlin.G0 r2 = kotlin.G0.f406611a
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
