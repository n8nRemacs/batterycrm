package coil.intercept;

import android.content.Context;
import coil.intercept.i;
import coil.request.p;
import coil.request.r;
import coil.view.C27253g;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/intercept/k;", "Lcoil/intercept/i$a;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements i.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f58498a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f58499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f58501d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C27253g f58502e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final coil.f f58503f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58504g;

    public k(@Y61.k p pVar, @Y61.k ArrayList arrayList, int i12, @Y61.k p pVar2, @Y61.k C27253g c27253g, @Y61.k coil.f fVar, boolean z12) {
        this.f58498a = pVar;
        this.f58499b = arrayList;
        this.f58500c = i12;
        this.f58501d = pVar2;
        this.f58502e = c27253g;
        this.f58503f = fVar;
        this.f58504g = z12;
    }

    @Override // coil.intercept.i.a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final p getF58501d() {
        return this.f58501d;
    }

    public final void b(p pVar, i iVar) {
        Context context = pVar.f58659a;
        p pVar2 = this.f58498a;
        if (context != pVar2.f58659a) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's context.").toString());
        }
        if (pVar.f58660b == r.f58715a) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot set the request's data to null.").toString());
        }
        if (pVar.f58661c != pVar2.f58661c) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's target.").toString());
        }
        if (pVar.f58646A != pVar2.f58646A) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (pVar.f58647B == pVar2.f58647B) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k coil.request.p r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof coil.intercept.j
            if (r0 == 0) goto L13
            r0 = r14
            coil.intercept.j r0 = (coil.intercept.j) r0
            int r1 = r0.f58497u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58497u = r1
            goto L18
        L13:
            coil.intercept.j r0 = new coil.intercept.j
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f58495s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58497u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            coil.intercept.i r13 = r0.f58494r
            coil.intercept.k r0 = r0.f58493q
            kotlin.C42729a0.b(r14)
            goto L6f
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.C42729a0.b(r14)
            java.util.ArrayList r6 = r12.f58499b
            int r14 = r12.f58500c
            if (r14 <= 0) goto L49
            int r2 = r14 + (-1)
            java.lang.Object r2 = r6.get(r2)
            coil.intercept.i r2 = (coil.intercept.i) r2
            r12.b(r13, r2)
        L49:
            java.lang.Object r2 = r6.get(r14)
            coil.intercept.i r2 = (coil.intercept.i) r2
            int r7 = r14 + 1
            coil.intercept.k r14 = new coil.intercept.k
            coil.request.p r5 = r12.f58498a
            coil.f r10 = r12.f58503f
            coil.size.g r9 = r12.f58502e
            boolean r11 = r12.f58504g
            r4 = r14
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f58493q = r12
            r0.f58494r = r2
            r0.f58497u = r3
            java.lang.Object r14 = r2.a(r14, r0)
            if (r14 != r1) goto L6d
            return r1
        L6d:
            r0 = r12
            r13 = r2
        L6f:
            coil.request.q r14 = (coil.request.q) r14
            coil.request.p r1 = r14.getF58739b()
            r0.b(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.k.c(coil.request.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
