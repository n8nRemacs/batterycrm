package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {246}, m = "writeWhile", n = {"this", "block", "shouldContinue"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class U0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N0 f400771q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f400772r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f400773s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400774t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N0 f400775u;

    /* renamed from: v, reason: collision with root package name */
    public int f400776v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(N0 n02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400775u = n02;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:25:0x007a, B:27:0x0099, B:33:0x00af, B:34:0x00b6, B:37:0x00b9, B:38:0x00c0), top: B:41:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:25:0x007a, B:27:0x0099, B:33:0x00af, B:34:0x00b6, B:37:0x00b9, B:38:0x00c0), top: B:41:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:24:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.f400774t = r12
            int r12 = r11.f400776v
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 | r0
            r11.f400776v = r12
            io.ktor.utils.io.N0 r12 = r11.f400775u
            r1 = 0
            r12.getClass()
            boolean r2 = r11 instanceof io.ktor.utils.io.U0
            if (r2 == 0) goto L1e
            int r2 = r11.f400776v
            r3 = r2 & r0
            if (r3 == 0) goto L1e
            int r2 = r2 - r0
            r11.f400776v = r2
            r0 = r11
            goto L23
        L1e:
            io.ktor.utils.io.U0 r0 = new io.ktor.utils.io.U0
            r0.<init>(r12, r11)
        L23:
            java.lang.Object r2 = r0.f400774t
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.f400776v
            r5 = 1
            if (r4 == 0) goto L46
            if (r4 != r5) goto L3e
            kotlin.jvm.internal.l0$a r12 = r0.f400773s
            Y41.l r1 = r0.f400772r
            Y41.l r1 = (Y41.l) r1
            io.ktor.utils.io.N0 r4 = r0.f400771q
            kotlin.C42729a0.b(r2)
            r2 = r12
            r12 = r4
            goto L74
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L46:
            kotlin.C42729a0.b(r2)
        L49:
            boolean r2 = r12.W()
            if (r2 == 0) goto L5d
            java.lang.Throwable r12 = r12.g()
            if (r12 != 0) goto L5c
            kotlinx.coroutines.channels.ClosedSendChannelException r12 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r0 = "Channel closed for write"
            r12.<init>(r0)
        L5c:
            throw r12
        L5d:
            kotlin.jvm.internal.l0$a r2 = new kotlin.jvm.internal.l0$a
            r2.<init>()
            r0.f400771q = r12
            r4 = r1
            Y41.l r4 = (Y41.l) r4
            r0.f400772r = r4
            r0.f400773s = r2
            r0.f400776v = r5
            java.lang.Object r4 = r12.P(r5, r0)
            if (r4 != r3) goto L74
            goto Lae
        L74:
            io.ktor.utils.io.core.m r4 = r12.f400979c
            io.ktor.utils.io.core.internal.b r6 = r4.m(r5)
            java.nio.ByteBuffer r7 = r6.f400874a     // Catch: java.lang.Throwable -> Lb7
            int r8 = r6.f400876c     // Catch: java.lang.Throwable -> Lb7
            int r9 = r6.f400878e     // Catch: java.lang.Throwable -> Lb7
            int r9 = r9 - r8
            V31.e$a r10 = V31.e.f16906b     // Catch: java.lang.Throwable -> Lb7
            java.nio.ByteBuffer r7 = V31.h.c(r7, r8, r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r8 = r1.invoke(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> Lb7
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> Lb7
            r2.f406838b = r8     // Catch: java.lang.Throwable -> Lb7
            int r8 = r7.limit()     // Catch: java.lang.Throwable -> Lb7
            if (r8 != r9) goto Lb9
            int r7 = r7.position()     // Catch: java.lang.Throwable -> Lb7
            r6.a(r7)     // Catch: java.lang.Throwable -> Lb7
            if (r7 < 0) goto Laf
            r4.a()
            r12.N(r7)
            boolean r2 = r2.f406838b
            if (r2 != 0) goto L49
            kotlin.G0 r3 = kotlin.G0.f406611a
        Lae:
            return r3
        Laf:
            java.lang.String r12 = "The returned value shouldn't be negative"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lb7
            throw r0     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r12 = move-exception
            goto Lc1
        Lb9:
            java.lang.String r12 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lb7
            throw r0     // Catch: java.lang.Throwable -> Lb7
        Lc1:
            r4.a()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.U0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
