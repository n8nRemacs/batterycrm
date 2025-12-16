package com.avito.android.cv_actualization.view.phone_select.domain.phone_update;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxCvActualizationPhoneSelectUpdatePhoneInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.domain.phone_update.JsxCvActualizationPhoneSelectUpdatePhoneInteractor$updatePhone$1", f = "JsxCvActualizationPhoneSelectUpdatePhoneInteractor.kt", i = {0}, l = {19, 20, 21}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JsxCvActualizationPhoneSelectInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131344q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f131346s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f131347t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131346s = cVar;
        this.f131347t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f131346s, this.f131347t, continuation);
        aVar.f131345r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JsxCvActualizationPhoneSelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131344q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f131345r;
            DP.a aVar = this.f131346s.f131350a.get();
            this.f131345r = interfaceC43172j;
            this.f131344q = 1;
            obj = aVar.b(this.f131347t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f131345r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            JsxCvActualizationPhoneSelectInternalAction.PhoneUpdateFailure phoneUpdateFailure = JsxCvActualizationPhoneSelectInternalAction.PhoneUpdateFailure.f131363b;
            this.f131345r = null;
            this.f131344q = 2;
            if (interfaceC43172j.emit(phoneUpdateFailure, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (typedResult instanceof TypedResult.Success) {
            JsxCvActualizationPhoneSelectInternalAction.PhoneUpdatedSuccess phoneUpdatedSuccess = new JsxCvActualizationPhoneSelectInternalAction.PhoneUpdatedSuccess(((HP.a) ((TypedResult.Success) typedResult).getResult()).getText());
            this.f131345r = null;
            this.f131344q = 3;
            if (interfaceC43172j.emit(phoneUpdatedSuccess, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
