package com.avito.android.gig_apply.ui.common;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: SlotProgressWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.ui.common.SlotProgressWidgetView$startTimer$1", f = "SlotProgressWidget.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159971q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f159972r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SlotProgressWidgetView f159973s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SlotProgressWidgetView slotProgressWidgetView, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f159973s = slotProgressWidgetView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f159973s, continuation);
        sVar.f159972r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:14:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f159971q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r7.f159972r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r8)
            goto L3c
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f159972r
            kotlinx.coroutines.T r8 = (kotlinx.coroutines.T) r8
            r1 = r8
        L23:
            boolean r8 = kotlinx.coroutines.U.e(r1)
            if (r8 == 0) goto L4b
            kotlin.time.e$a r8 = kotlin.time.e.f410651c
            kotlin.time.DurationUnit r8 = kotlin.time.DurationUnit.f410635g
            long r3 = kotlin.time.g.g(r2, r8)
            r7.f159972r = r1
            r7.f159971q = r2
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.c(r3, r7)
            if (r8 != r0) goto L3c
            return r0
        L3c:
            com.avito.android.gig_apply.ui.common.SlotProgressWidgetView r8 = r7.f159973s
            long r3 = r8.f159911o
            r5 = 60000(0xea60, float:8.4078E-41)
            long r5 = (long) r5
            long r3 = r3 + r5
            r8.f159911o = r3
            r8.k()
            goto L23
        L4b:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.ui.common.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
