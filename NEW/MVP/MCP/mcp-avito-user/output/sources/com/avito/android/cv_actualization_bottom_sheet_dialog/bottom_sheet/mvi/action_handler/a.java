package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxActualizationBottomSheetKeepPhoneActionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.JsxActualizationBottomSheetKeepPhoneActionHandler$handle$1", f = "JsxActualizationBottomSheetKeepPhoneActionHandler.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JsxActualizationBottomSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131484q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f131486s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131486s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f131486s, continuation);
        aVar.f131485r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JsxActualizationBottomSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[RETURN] */
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
            int r1 = r7.f131484q
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.c r2 = r7.f131486s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.C42729a0.b(r8)
            goto Laf
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            java.lang.Object r1 = r7.f131485r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5d
        L28:
            java.lang.Object r1 = r7.f131485r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L48
        L30:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f131485r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$StartKeepingPhone r1 = new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$StartKeepingPhone
            r1.<init>()
            r7.f131485r = r8
            r7.f131484q = r5
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L47
            return r0
        L47:
            r1 = r8
        L48:
            xt.a r8 = r2.f131490a
            r7.f131485r = r1
            r7.f131484q = r4
            h31.e<DP.a> r8 = r8.f442685a
            java.lang.Object r8 = r8.get()
            DP.a r8 = (DP.a) r8
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L5d
            return r0
        L5d:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L80
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            FP.a r8 = (FP.a) r8
            r2.getClass()
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$CloseFlow r4 = new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$CloseFlow
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult$Success r6 = new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult$Success
            com.avito.android.deep_linking.links.DeepLink r2 = r2.f131491b
            java.lang.String r8 = r8.getText()
            r6.<init>(r2, r8)
            r4.<init>(r6)
            goto La4
        L80:
            boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lb2
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r4 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.C35936s.a(r4, r8)
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$CloseFlow r4 = new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction$CloseFlow
            boolean r8 = r2.f131492c
            if (r8 == 0) goto L9f
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult$Success r8 = new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult$Success
            com.avito.android.deep_linking.links.DeepLink r2 = r2.f131491b
            r8.<init>(r2, r5)
            goto La1
        L9f:
            com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult$Error r8 = com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult.Error.f131555b
        La1:
            r4.<init>(r8)
        La4:
            r7.f131485r = r5
            r7.f131484q = r3
            java.lang.Object r8 = r1.emit(r4, r7)
            if (r8 != r0) goto Laf
            return r0
        Laf:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lb2:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
