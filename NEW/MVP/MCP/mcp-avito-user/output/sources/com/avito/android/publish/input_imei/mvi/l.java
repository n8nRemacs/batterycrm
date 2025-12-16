package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InputImeiBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiBootstrap$initFlow$1", f = "InputImeiBootstrap.kt", i = {0, 1}, l = {59, 64, 67}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236427q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236428r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f236429s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f236429s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f236429s, continuation);
        lVar.f236428r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f236427q
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            com.avito.android.publish.input_imei.mvi.m r6 = r8.f236429s
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.C42729a0.b(r9)
            goto Lb2
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f236428r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L9c
        L2a:
            java.lang.Object r1 = r8.f236428r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L72
        L32:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f236428r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.publish.input_imei.di.m r9 = r6.f236430a
            int r7 = r6.f236431b
            com.avito.android.remote.model.category_parameters.ParametersTree r9 = r9.b(r7)
            com.avito.android.publish.input_imei.h r7 = r6.f236433d
            r7.b(r9)
            java.lang.Class<com.avito.android.remote.model.category_parameters.CharParameter> r7 = com.avito.android.remote.model.category_parameters.CharParameter.class
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r9 = r9.getFirstParameterOfType(r7)
            com.avito.android.remote.model.category_parameters.CharParameter r9 = (com.avito.android.remote.model.category_parameters.CharParameter) r9
            if (r9 == 0) goto L58
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            goto L59
        L58:
            r9 = r5
        L59:
            if (r9 == 0) goto L72
            boolean r7 = kotlin.text.C43066x.K(r9)
            if (r7 == 0) goto L62
            goto L72
        L62:
            com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$UpdateImeiText r7 = new com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$UpdateImeiText
            r7.<init>(r9)
            r8.f236428r = r1
            r8.f236427q = r4
            java.lang.Object r9 = r1.emit(r7, r8)
            if (r9 != r0) goto L72
            return r0
        L72:
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r9 = r6.f236432c
            if (r9 == 0) goto L9c
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params r9 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep.Params) r9
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params$Config r9 = r9.getConfig()
            if (r9 == 0) goto L89
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params$ScanButtonData r9 = r9.getScanButtonData()
            if (r9 == 0) goto L89
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params$ScanButtonData$Position r9 = r9.getPosition()
            goto L8a
        L89:
            r9 = r5
        L8a:
            if (r9 == 0) goto L9c
            com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$AddScanButton r4 = new com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$AddScanButton
            r4.<init>(r9)
            r8.f236428r = r1
            r8.f236427q = r3
            java.lang.Object r9 = r1.emit(r4, r8)
            if (r9 != r0) goto L9c
            return r0
        L9c:
            com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$ConfigureAppBar r9 = new com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction$ConfigureAppBar
            com.avito.android.publish.input_imei.di.m r3 = r6.f236430a
            java.lang.Boolean r3 = r3.h()
            r9.<init>(r3)
            r8.f236428r = r5
            r8.f236427q = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto Lb2
            return r0
        Lb2:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.input_imei.mvi.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
