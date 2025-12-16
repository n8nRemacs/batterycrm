package io.ktor.http.content;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {138, 143}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f399972q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f399973r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399974s;

    /* renamed from: t, reason: collision with root package name */
    public int f399975t;

    public m() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:18:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            r7.f399974s = r8
            int r0 = r7.f399975t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r7.f399975t = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f399975t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L61
            r4 = 2
            if (r1 == r3) goto L2c
            if (r1 != r4) goto L24
            java.util.ArrayList r1 = r7.f399973r
            io.ktor.http.content.i r3 = r7.f399972q
            kotlin.C42729a0.b(r8)
            r5 = r3
            r3 = r1
            r1 = r7
            goto L54
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2c:
            io.ktor.http.content.i r1 = r7.f399972q
            kotlin.C42729a0.b(r8)
            io.ktor.http.content.t r8 = (io.ktor.http.content.t) r8
            if (r8 != 0) goto L38
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
            goto L59
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r8)
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L44:
            r8.f399972q = r3
            r8.f399973r = r1
            r8.f399975t = r4
            r3.getClass()
            if (r0 != 0) goto L50
            goto L59
        L50:
            r5 = r3
            r3 = r1
            r1 = r8
            r8 = r2
        L54:
            io.ktor.http.content.t r8 = (io.ktor.http.content.t) r8
            if (r8 != 0) goto L5a
            r0 = r3
        L59:
            return r0
        L5a:
            r3.add(r8)
            r8 = r1
            r1 = r3
            r3 = r5
            goto L44
        L61:
            kotlin.C42729a0.b(r8)
            r7.f399972q = r2
            r7.f399975t = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
