package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 0, 1, 1}, l = {128, 129}, m = "forEachPart", n = {"$this$forEachPart", "partHandler", "$this$forEachPart", "partHandler"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f399968q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.p f399969r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399970s;

    /* renamed from: t, reason: collision with root package name */
    public int f399971t;

    public l() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            r9.f399970s = r10
            int r0 = r9.f399971t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r9.f399971t = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f399971t
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L2e
            if (r1 != r3) goto L26
            Y41.p r1 = r9.f399969r
            Y41.p r1 = (Y41.p) r1
            io.ktor.http.content.i r5 = r9.f399968q
            kotlin.C42729a0.b(r10)
            r10 = r5
            r5 = r1
            r1 = r9
            goto L40
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2e:
            Y41.p r1 = r9.f399969r
            Y41.p r1 = (Y41.p) r1
            io.ktor.http.content.i r5 = r9.f399968q
            kotlin.C42729a0.b(r10)
            r6 = r5
            r5 = r9
            goto L54
        L3a:
            kotlin.C42729a0.b(r10)
            r1 = r9
            r10 = r2
            r5 = r10
        L40:
            r1.f399968q = r10
            r6 = r5
            Y41.p r6 = (Y41.p) r6
            r1.f399969r = r6
            r1.f399971t = r4
            r10.getClass()
            if (r0 != 0) goto L4f
            goto L6a
        L4f:
            r6 = r10
            r10 = r2
            r8 = r5
            r5 = r1
            r1 = r8
        L54:
            io.ktor.http.content.t r10 = (io.ktor.http.content.t) r10
            if (r10 != 0) goto L5b
            kotlin.G0 r0 = kotlin.G0.f406611a
            goto L6a
        L5b:
            r5.f399968q = r6
            r7 = r1
            Y41.p r7 = (Y41.p) r7
            r5.f399969r = r7
            r5.f399971t = r3
            java.lang.Object r10 = r1.invoke(r10, r5)
            if (r10 != r0) goto L6b
        L6a:
            return r0
        L6b:
            r10 = r6
            r8 = r5
            r5 = r1
            r1 = r8
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
