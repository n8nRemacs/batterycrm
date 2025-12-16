package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ObjectValidateUseCase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.usecase.ObjectValidateUseCase$invoke$2", f = "ObjectValidateUseCase.kt", i = {0, 0, 1, 1}, l = {80, 81, 82, 82}, m = "invokeSuspend", n = {"$this$catch", "error", "$this$catch", "error"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ObjectFillFormInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f240115q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f240116r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f240117s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f240118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f240118t = mVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        j jVar = new j(this.f240118t, continuation);
        jVar.f240116r = interfaceC43172j;
        jVar.f240117s = th2;
        return jVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f240115q
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L33
            if (r1 == r5) goto L29
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.C42729a0.b(r10)
            goto La5
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlinx.coroutines.flow.j r1 = r9.f240116r
            kotlin.C42729a0.b(r10)
            goto L9a
        L29:
            java.lang.Throwable r1 = r9.f240117s
            kotlinx.coroutines.flow.j r5 = r9.f240116r
            kotlin.C42729a0.b(r10)
            r10 = r1
            r1 = r5
            goto L67
        L33:
            java.lang.Throwable r1 = r9.f240117s
            kotlinx.coroutines.flow.j r6 = r9.f240116r
            kotlin.C42729a0.b(r10)
            goto L56
        L3b:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.flow.j r10 = r9.f240116r
            java.lang.Throwable r1 = r9.f240117s
            com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$UpdateValidationProgress r7 = new com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$UpdateValidationProgress
            r8 = 0
            r7.<init>(r8)
            r9.f240116r = r10
            r9.f240117s = r1
            r9.f240115q = r6
            java.lang.Object r6 = r10.emit(r7, r9)
            if (r6 != r0) goto L55
            return r0
        L55:
            r6 = r10
        L56:
            com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$ShowContent r10 = com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction.ShowContent.f240207b
            r9.f240116r = r6
            r9.f240117s = r1
            r9.f240115q = r5
            java.lang.Object r10 = r6.emit(r10, r9)
            if (r10 != r0) goto L65
            return r0
        L65:
            r10 = r1
            r1 = r6
        L67:
            r9.f240116r = r1
            r9.f240117s = r2
            r9.f240115q = r4
            com.avito.android.publish.screen.objects.domain.usecase.m r4 = r9.f240118t
            r4.getClass()
            kotlin.coroutines.SafeContinuation r4 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r9)
            r4.<init>(r5)
            com.avito.android.publish.screen.objects.domain.usecase.k r5 = new com.avito.android.publish.screen.objects.domain.usecase.k
            r5.<init>(r4)
            com.avito.android.publish.screen.objects.domain.usecase.l r6 = new com.avito.android.publish.screen.objects.domain.usecase.l
            r6.<init>(r4)
            r7 = 58
            com.avito.android.error.z.h(r10, r5, r2, r6, r7)
            java.lang.Object r10 = r4.getOrThrow()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r4) goto L97
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r9)
        L97:
            if (r10 != r0) goto L9a
            return r0
        L9a:
            r9.f240116r = r2
            r9.f240115q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto La5
            return r0
        La5:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.usecase.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
