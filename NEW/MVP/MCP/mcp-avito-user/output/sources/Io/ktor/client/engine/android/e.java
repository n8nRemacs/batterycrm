package io.ktor.client.engine.android;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidClientEngine.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/android/e;", "Lio/ktor/client/engine/e;", "ktor-client-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e extends io.ktor.client.engine.e {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // io.ktor.client.engine.InterfaceC41434a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(@Y61.k io.ktor.client.request.e0 r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r9 instanceof io.ktor.client.engine.android.b
            if (r1 == 0) goto L14
            r1 = r9
            io.ktor.client.engine.android.b r1 = (io.ktor.client.engine.android.b) r1
            int r2 = r1.f398864w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f398864w = r2
            goto L19
        L14:
            io.ktor.client.engine.android.b r1 = new io.ktor.client.engine.android.b
            r1.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r1.f398862u
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f398864w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L6a
            if (r3 == r6) goto L5e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kotlin.C42729a0.b(r9)
            goto L5d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.net.HttpURLConnection r8 = r1.f398861t
            Q31.b r3 = r1.f398860s
            java.lang.Object r5 = r1.f398859r
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            java.lang.Object r6 = r1.f398858q
            io.ktor.client.request.e0 r6 = (io.ktor.client.request.e0) r6
            kotlin.C42729a0.b(r9)
            io.ktor.client.engine.android.c r9 = new io.ktor.client.engine.android.c
            r9.<init>(r5, r6, r3)
            r1.f398858q = r0
            r1.f398859r = r0
            r1.f398860s = r0
            r1.f398861t = r0
            r1.f398864w = r4
            java.lang.Object r9 = io.ktor.client.engine.android.k.a(r8, r6, r9, r1)
            if (r9 != r2) goto L5d
            return r2
        L5d:
            return r9
        L5e:
            java.lang.Object r8 = r1.f398859r
            io.ktor.client.request.e0 r8 = (io.ktor.client.request.e0) r8
            java.lang.Object r1 = r1.f398858q
            io.ktor.client.engine.android.e r1 = (io.ktor.client.engine.android.e) r1
            kotlin.C42729a0.b(r9)
            goto L87
        L6a:
            kotlin.C42729a0.b(r9)
            r1.f398858q = r7
            r1.f398859r = r8
            r1.f398864w = r6
            java.util.Set<java.lang.String> r9 = io.ktor.client.engine.C.f398853a
            kotlin.coroutines.CoroutineContext r9 = r1.getF411960f()
            io.ktor.client.engine.u$a r1 = io.ktor.client.engine.u.f398989c
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r1)
            io.ktor.client.engine.u r9 = (io.ktor.client.engine.u) r9
            kotlin.coroutines.CoroutineContext r9 = r9.f398990b
            if (r9 != r2) goto L86
            return r2
        L86:
            r1 = r7
        L87:
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            io.ktor.util.date.a.b(r0)
            io.ktor.http.T0 r9 = r8.f399714a
            java.lang.String r9 = r9.f399910i
            io.ktor.http.f0 r2 = io.ktor.http.C41519f0.f400005a
            r2.getClass()
            java.lang.String r2 = io.ktor.http.C41519f0.f400013i
            io.ktor.http.V r3 = r8.f399716c
            java.lang.String r2 = r3.get(r2)
            io.ktor.http.content.p r8 = r8.f399717d
            if (r2 == 0) goto La9
            long r2 = java.lang.Long.parseLong(r2)
            kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            goto Lac
        La9:
            r8.getF399580a()
        Lac:
            r1.getClass()
            java.net.URL r8 = new java.net.URL
            r8.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.e.b1(io.ktor.client.request.e0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.client.engine.e, io.ktor.client.engine.InterfaceC41434a
    @Y61.k
    public final Set<io.ktor.client.engine.h<?>> m4() {
        return null;
    }
}
