package io.ktor.util.cio;

import io.ktor.utils.io.W0;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReadersJvm.kt */
@s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", i = {0, 0, 0}, l = {18}, m = "pass", n = {"$this$pass", "buffer", "block"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W0 f400440q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400441r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.l f400442s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400443t;

    /* renamed from: u, reason: collision with root package name */
    public int f400444u;

    public j() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:14:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.f400443t = r7
            int r0 = r6.f400444u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.f400444u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f400444u
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L22
            Y41.l r1 = r6.f400442s
            Y41.l r1 = (Y41.l) r1
            java.nio.ByteBuffer r3 = r6.f400441r
            io.ktor.utils.io.W0 r4 = r6.f400440q
            kotlin.C42729a0.b(r7)
            r7 = r6
            goto L4d
        L22:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2a:
            kotlin.C42729a0.b(r7)
            r7 = 0
            r1 = r7
            r3 = r1
            r4 = r3
            r7 = r6
        L32:
            boolean r5 = r4.x()
            if (r5 != 0) goto L54
            r3.clear()
            r7.f400440q = r4
            r7.f400441r = r3
            r5 = r1
            Y41.l r5 = (Y41.l) r5
            r7.f400442s = r5
            r7.f400444u = r2
            java.lang.Object r5 = r4.w(r3, r7)
            if (r5 != r0) goto L4d
            goto L5c
        L4d:
            r3.flip()
            r1.invoke(r3)
            goto L32
        L54:
            java.lang.Throwable r7 = r4.g()
            if (r7 != 0) goto L5d
            kotlin.G0 r0 = kotlin.G0.f406611a
        L5c:
            return r0
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
