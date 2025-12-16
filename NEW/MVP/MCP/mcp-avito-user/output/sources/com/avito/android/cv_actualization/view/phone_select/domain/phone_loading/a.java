package com.avito.android.cv_actualization.view.phone_select.domain.phone_loading;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxCvActualizationPhoneSelectInitialLoadPhonesInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.JsxCvActualizationPhoneSelectInitialLoadPhonesInteractor$loadPhones$1", f = "JsxCvActualizationPhoneSelectInitialLoadPhonesInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JsxCvActualizationPhoneSelectInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131334q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131335r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f131336s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131336s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f131336s, continuation);
        aVar.f131335r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JsxCvActualizationPhoneSelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
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
            int r1 = r8.f131334q
            com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.c r2 = r8.f131336s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.C42729a0.b(r9)
            goto Lbb
        L24:
            java.lang.Object r1 = r8.f131335r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L5f
        L2c:
            java.lang.Object r1 = r8.f131335r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L4c
        L34:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f131335r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ShowInitialLoading r1 = new com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ShowInitialLoading
            r1.<init>()
            r8.f131335r = r9
            r8.f131334q = r6
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r1 = r9
        L4c:
            h31.e<com.avito.android.remote.z0> r9 = r2.f131340a
            java.lang.Object r9 = r9.get()
            com.avito.android.remote.z0 r9 = (com.avito.android.remote.InterfaceC34401z0) r9
            r8.f131335r = r1
            r8.f131334q = r5
            java.lang.Object r9 = r9.w(r8)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            r7 = 0
            if (r5 == 0) goto L81
            com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ErrorLoadedContent r2 = new com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ErrorLoadedContent
            com.avito.android.analytics.screens.J$a r3 = new com.avito.android.analytics.screens.J$a
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r9 = r9.getError()
            r3.<init>(r9)
            r2.<init>(r3)
            r8.f131335r = r7
            r8.f131334q = r4
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lbb
            return r0
        L81:
            boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto Lbb
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            com.avito.android.remote.model.user_profile.PhonesList r9 = (com.avito.android.remote.model.user_profile.PhonesList) r9
            java.util.List r9 = r9.getPhones()
            boolean r2 = r2.f131341b
            if (r2 == 0) goto L9e
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La4
        L9e:
            int r2 = r9.size()
            if (r2 <= r6) goto Laa
        La4:
            com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ContentLoaded r2 = new com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ContentLoaded
            r2.<init>(r9)
            goto Lb0
        Laa:
            com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ShowPhoneInput r2 = new com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction$ShowPhoneInput
            r9 = 0
            r2.<init>(r9)
        Lb0:
            r8.f131335r = r7
            r8.f131334q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lbb
            return r0
        Lbb:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
