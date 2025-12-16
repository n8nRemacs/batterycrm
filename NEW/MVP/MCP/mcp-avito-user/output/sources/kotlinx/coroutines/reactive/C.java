package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: ReactiveFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/reactive/C;", "", "T", "Lorg/reactivestreams/d;", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class C<T> implements org.reactivestreams.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final long f411966b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f411967c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43108m f411968d;

    public C(int i12, @Y61.k BufferOverflow bufferOverflow, long j12) {
        this.f411966b = j12;
        this.f411968d = kotlinx.coroutines.channels.A.a(i12 == 0 ? 1 : i12, bufferOverflow, null, 4);
    }

    @Override // org.reactivestreams.d
    public final void K(@Y61.k org.reactivestreams.e eVar) {
        this.f411967c = eVar;
        if (eVar == null) {
            eVar = null;
        }
        eVar.request(this.f411966b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.B
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.B r0 = (kotlinx.coroutines.reactive.B) r0
            int r1 = r0.f411965s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411965s = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.B r0 = new kotlinx.coroutines.reactive.B
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f411963q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411965s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r5)
            kotlinx.coroutines.channels.B r5 = (kotlinx.coroutines.channels.B) r5
            java.lang.Object r5 = r5.f410774a
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f411965s = r3
            kotlinx.coroutines.channels.m r5 = r4.f411968d
            r5.getClass()
            java.lang.Object r5 = kotlinx.coroutines.channels.C43108m.Q(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.B.b(r5)
            if (r0 != 0) goto L55
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.B.c
            if (r0 == 0) goto L54
            kotlinx.coroutines.channels.B.b(r5)
            r5 = 0
        L54:
            return r5
        L55:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.C.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // org.reactivestreams.d
    public final void e() {
        this.f411968d.h(null);
    }

    @Override // org.reactivestreams.d
    public final void onError(@Y61.l Throwable th2) {
        this.f411968d.h(th2);
    }

    @Override // org.reactivestreams.d
    public final void onNext(@Y61.k T t12) {
        C43108m c43108m = this.f411968d;
        Object objW = c43108m.w(t12);
        B.b bVar = kotlinx.coroutines.channels.B.f410772b;
        if (objW instanceof B.c) {
            throw new IllegalArgumentException(("Element " + t12 + " was not added to channel because it was full, " + c43108m).toString());
        }
    }
}
