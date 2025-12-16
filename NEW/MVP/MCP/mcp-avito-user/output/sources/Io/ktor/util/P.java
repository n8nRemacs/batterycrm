package io.ktor.util;

import io.ktor.utils.io.InterfaceC41649d1;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deflater.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class P extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f400411q;

    /* renamed from: r, reason: collision with root package name */
    public Deflater f400412r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400413s;

    /* renamed from: t, reason: collision with root package name */
    public int f400414t;

    public P() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f400413s = r9
            int r9 = r8.f400414t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.f400414t = r9
            r9 = 0
            boolean r0 = r8 instanceof io.ktor.util.P
            if (r0 == 0) goto L1b
            int r0 = r8.f400414t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1b
            int r0 = r0 - r1
            r8.f400414t = r0
            r0 = r8
            goto L20
        L1b:
            io.ktor.util.P r0 = new io.ktor.util.P
            r0.<init>(r8)
        L20:
            java.lang.Object r1 = r0.f400413s
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f400414t
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L46
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            kotlin.C42729a0.b(r1)
            goto L76
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            java.util.zip.Deflater r9 = r0.f400412r
            io.ktor.utils.io.d1 r3 = r0.f400411q
            kotlin.C42729a0.b(r1)
            r1 = r9
            r9 = r3
            goto L60
        L46:
            kotlin.C42729a0.b(r1)
            long r6 = r9.getValue()
            int r1 = (int) r6
            int r1 = java.lang.Integer.reverseBytes(r1)
            r0.f400411q = r9
            r0.f400412r = r9
            r0.f400414t = r5
            java.lang.Object r1 = r9.o(r1, r0)
            if (r1 != r2) goto L5f
            goto L78
        L5f:
            r1 = r9
        L60:
            int r1 = r1.getTotalIn()
            int r1 = java.lang.Integer.reverseBytes(r1)
            r3 = 0
            r0.f400411q = r3
            r0.f400412r = r3
            r0.f400414t = r4
            java.lang.Object r9 = r9.o(r1, r0)
            if (r9 != r2) goto L76
            goto L78
        L76:
            kotlin.G0 r2 = kotlin.G0.f406611a
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
