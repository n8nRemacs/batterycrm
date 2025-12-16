package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43123w;

/* compiled from: IacUIActiveFallbackModal.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal.IacUIActiveFallbackModalKt$Preview$emit$1$1", f = "IacUIActiveFallbackModal.kt", i = {0, 0, 1}, l = {138, 139}, m = "invokeSuspend", n = {"index$iv", "v", "index$iv"}, s = {"I$0", "Z$0", "I$0"})
/* loaded from: classes14.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43123w f166964q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f166965r;

    /* renamed from: s, reason: collision with root package name */
    public int f166966s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f166967t;

    /* renamed from: u, reason: collision with root package name */
    public int f166968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<Boolean> f166969v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C43108m f166970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f166969v = list;
        this.f166970w = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f166969v, this.f166970w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f166968u
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L23
            if (r1 != r3) goto L1b
            int r1 = r9.f166966s
            java.util.Iterator r4 = r9.f166965r
            kotlinx.coroutines.channels.w r5 = r9.f166964q
            kotlin.C42729a0.b(r10)
        L17:
            r6 = r5
            r5 = r4
            r4 = r1
            goto L3f
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            boolean r1 = r9.f166967t
            int r4 = r9.f166966s
            java.util.Iterator r5 = r9.f166965r
            kotlinx.coroutines.channels.w r6 = r9.f166964q
            kotlin.C42729a0.b(r10)
            goto L6a
        L2f:
            kotlin.C42729a0.b(r10)
            java.util.List<java.lang.Boolean> r10 = r9.f166969v
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            kotlinx.coroutines.channels.m r1 = r9.f166970w
            r4 = 0
            r5 = r10
            r6 = r1
        L3f:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L86
            java.lang.Object r10 = r5.next()
            int r1 = r4 + 1
            if (r4 < 0) goto L81
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r4 == 0) goto L6c
            r9.f166964q = r6
            r9.f166965r = r5
            r9.f166966s = r1
            r9.f166967t = r10
            r9.f166968u = r2
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r4 = kotlinx.coroutines.C43131e0.b(r7, r9)
            if (r4 != r0) goto L68
            return r0
        L68:
            r4 = r1
            r1 = r10
        L6a:
            r10 = r1
            r1 = r4
        L6c:
            r4 = r5
            r5 = r6
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            r9.f166964q = r5
            r9.f166965r = r4
            r9.f166966s = r1
            r9.f166968u = r3
            java.lang.Object r10 = r5.send(r10, r9)
            if (r10 != r0) goto L17
            return r0
        L81:
            kotlin.collections.C42745f0.H0()
            r10 = 0
            throw r10
        L86:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
