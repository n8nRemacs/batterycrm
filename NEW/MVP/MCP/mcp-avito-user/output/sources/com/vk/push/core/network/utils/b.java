package com.vk.push.core.network.utils;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.Response;

/* compiled from: CallHandler.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 176)
@DebugMetadata(c = "com.vk.push.core.network.utils.CallHandlerKt", f = "CallHandler.kt", i = {0, 1, 1}, l = {21, 22}, m = "handleCall", n = {"parseSuccess", "parseSuccess", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class b<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f367124q;

    /* renamed from: r, reason: collision with root package name */
    public Response f367125r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f367126s;

    /* renamed from: t, reason: collision with root package name */
    public int f367127t;

    public b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001f, B:25:0x0060, B:27:0x0068, B:28:0x007d, B:30:0x0083, B:31:0x008a, B:14:0x0032, B:21:0x0045, B:17:0x0039), top: B:40:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001f, B:25:0x0060, B:27:0x0068, B:28:0x007d, B:30:0x0083, B:31:0x008a, B:14:0x0032, B:21:0x0045, B:17:0x0039), top: B:40:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            r6.f367126s = r7
            int r0 = r6.f367127t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.f367127t = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f367127t
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2e
            if (r1 != r3) goto L26
            okhttp3.Response r0 = r6.f367125r
            Y41.l r1 = r6.f367124q
            Y41.l r1 = (Y41.l) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L23
            goto L60
        L23:
            r7 = move-exception
            goto La1
        L26:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2e:
            Y41.l r1 = r6.f367124q
            Y41.l r1 = (Y41.l) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L23
            goto L45
        L36:
            kotlin.C42729a0.b(r7)
            r6.f367124q = r2     // Catch: java.lang.Exception -> L23
            r6.f367127t = r4     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = com.vk.push.core.network.utils.d.a(r2, r6)     // Catch: java.lang.Exception -> L23
            if (r7 != r0) goto L44
            goto La8
        L44:
            r1 = r2
        L45:
            okhttp3.Response r7 = (okhttp3.Response) r7     // Catch: java.lang.Exception -> L23
            kotlinx.coroutines.scheduling.b r4 = kotlinx.coroutines.C43262l0.f411947c     // Catch: java.lang.Exception -> L23
            com.vk.push.core.network.utils.c r5 = new com.vk.push.core.network.utils.c     // Catch: java.lang.Exception -> L23
            r5.<init>(r7, r2)     // Catch: java.lang.Exception -> L23
            r2 = r1
            Y41.l r2 = (Y41.l) r2     // Catch: java.lang.Exception -> L23
            r6.f367124q = r2     // Catch: java.lang.Exception -> L23
            r6.f367125r = r7     // Catch: java.lang.Exception -> L23
            r6.f367127t = r3     // Catch: java.lang.Exception -> L23
            java.lang.Object r2 = kotlinx.coroutines.C43259k.g(r4, r5, r6)     // Catch: java.lang.Exception -> L23
            if (r2 != r0) goto L5e
            goto La8
        L5e:
            r0 = r7
            r7 = r2
        L60:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L23
            boolean r2 = com.vk.push.core.network.utils.l.a(r7)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L7d
            m21.a r7 = com.vk.push.core.network.utils.l.b(r7)     // Catch: java.lang.Exception -> L23
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L23
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L23
            r0.<init>(r7)     // Catch: java.lang.Exception -> L23
            int r7 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L23
            kotlin.Z$b r7 = new kotlin.Z$b     // Catch: java.lang.Exception -> L23
            r7.<init>(r0)     // Catch: java.lang.Exception -> L23
            goto L9f
        L7d:
            boolean r2 = r0.isSuccessful()     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L8a
            java.lang.Object r7 = r1.invoke(r7)     // Catch: java.lang.Exception -> L23
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L23
            goto L9f
        L8a:
            com.vk.push.core.network.exception.VkpnsRequestException r7 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r0.message()     // Catch: java.lang.Exception -> L23
            int r0 = r0.code()     // Catch: java.lang.Exception -> L23
            r7.<init>(r1, r0)     // Catch: java.lang.Exception -> L23
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L23
            kotlin.Z$b r0 = new kotlin.Z$b     // Catch: java.lang.Exception -> L23
            r0.<init>(r7)     // Catch: java.lang.Exception -> L23
            r7 = r0
        L9f:
            r0 = r7
            goto La8
        La1:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r7)
        La8:
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r7) goto Laf
            return r0
        Laf:
            kotlin.Z r7 = kotlin.Z.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.utils.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
