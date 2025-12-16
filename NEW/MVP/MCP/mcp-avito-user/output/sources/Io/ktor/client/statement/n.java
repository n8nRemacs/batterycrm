package io.ktor.client.statement;

import io.ktor.client.plugins.A;
import io.ktor.client.plugins.C;
import io.ktor.client.request.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: HttpStatement.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/statement/n;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d0 f399813a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.a f399814b;

    public n(@Y61.k d0 d0Var, @Y61.k io.ktor.client.a aVar) {
        Set setKeySet;
        this.f399813a = d0Var;
        this.f399814b = aVar;
        Map map = (Map) d0Var.f399712f.d(io.ktor.client.engine.i.f398905a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof A) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A a12 = (A) it.next();
            if (C.b(this.f399814b, a12) == null) {
                throw new IllegalArgumentException(("Consider installing " + a12 + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    @kotlin.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.client.statement.d r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.j
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.j r0 = (io.ktor.client.statement.j) r0
            int r1 = r0.f399802t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399802t = r1
            goto L18
        L13:
            io.ktor.client.statement.j r0 = new io.ktor.client.statement.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f399800r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399802t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.getF400145h()
            kotlinx.coroutines.N0$b r2 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            kotlinx.coroutines.C r6 = (kotlinx.coroutines.C) r6
            r6.q3()
            io.ktor.utils.io.W0 r5 = r5.getF399778h()     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            r5.f(r2)     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0.f399799q = r6
            r0.f399802t = r3
            java.lang.Object r5 = r6.A(r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.n.a(io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|54|(1:(1:(1:(1:(2:14|15)(3:16|17|51))(3:21|22|59))(5:24|55|25|42|(1:44)(2:45|46)))(2:29|30))(3:32|33|(1:35)(1:36))|37|57|38|(1:40)(3:41|42|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k Y41.p r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.client.statement.k
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.client.statement.k r0 = (io.ktor.client.statement.k) r0
            int r1 = r0.f399807u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399807u = r1
            goto L18
        L13:
            io.ktor.client.statement.k r0 = new io.ktor.client.statement.k
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f399805s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399807u
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L66
            if (r2 == r7) goto L5a
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f399803q
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto La6
        L40:
            r10 = move-exception
            goto La7
        L43:
            java.lang.Object r10 = r0.f399803q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L97
        L49:
            java.lang.Object r10 = r0.f399804r
            io.ktor.client.statement.d r10 = (io.ktor.client.statement.d) r10
            java.lang.Object r2 = r0.f399803q
            io.ktor.client.statement.n r2 = (io.ktor.client.statement.n) r2
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L55
            goto L89
        L55:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L99
        L5a:
            java.lang.Object r10 = r0.f399804r
            Y41.p r10 = (Y41.p) r10
            java.lang.Object r2 = r0.f399803q
            io.ktor.client.statement.n r2 = (io.ktor.client.statement.n) r2
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L77
        L66:
            kotlin.C42729a0.b(r11)
            r0.f399803q = r9     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399804r = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399807u = r7     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r9.d(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto L76
            return r1
        L76:
            r2 = r9
        L77:
            io.ktor.client.statement.d r11 = (io.ktor.client.statement.d) r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399803q = r2     // Catch: java.lang.Throwable -> L98
            r0.f399804r = r11     // Catch: java.lang.Throwable -> L98
            r0.f399807u = r6     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L86
            return r1
        L86:
            r8 = r11
            r11 = r10
            r10 = r8
        L89:
            r0.f399803q = r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399804r = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399807u = r5     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r10 != r1) goto L96
            return r1
        L96:
            r10 = r11
        L97:
            return r10
        L98:
            r10 = move-exception
        L99:
            r0.f399803q = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399804r = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f399807u = r4     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r2.a(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto La6
            return r1
        La6:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L40
        La7:
            java.lang.Throwable r10 = io.ktor.client.utils.o.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.n.b(Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object c(@Y61.k ContinuationImpl continuationImpl) {
        return b(new l(2, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    @kotlin.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.m
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.m r0 = (io.ktor.client.statement.m) r0
            int r1 = r0.f399812s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399812s = r1
            goto L18
        L13:
            io.ktor.client.statement.m r0 = new io.ktor.client.statement.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f399810q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399812s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r6)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L4f
        L29:
            r6 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.C42729a0.b(r6)
            io.ktor.client.request.d0 r6 = new io.ktor.client.request.d0     // Catch: java.util.concurrent.CancellationException -> L29
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.request.d0 r2 = r5.f399813a     // Catch: java.util.concurrent.CancellationException -> L29
            kotlinx.coroutines.N0 r4 = r2.f399711e     // Catch: java.util.concurrent.CancellationException -> L29
            r6.f399711e = r4     // Catch: java.util.concurrent.CancellationException -> L29
            r6.e(r2)     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.a r2 = r5.f399814b     // Catch: java.util.concurrent.CancellationException -> L29
            r0.f399812s = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = r2.b(r6, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r6 != r1) goto L4f
            return r1
        L4f:
            io.ktor.client.call.b r6 = (io.ktor.client.call.b) r6     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.statement.d r6 = r6.f398806d     // Catch: java.util.concurrent.CancellationException -> L29
            if (r6 == 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            return r6
        L58:
            java.lang.Throwable r6 = io.ktor.client.utils.o.a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.n.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final String toString() {
        return "HttpStatement[" + this.f399813a.f399707a + ']';
    }
}
