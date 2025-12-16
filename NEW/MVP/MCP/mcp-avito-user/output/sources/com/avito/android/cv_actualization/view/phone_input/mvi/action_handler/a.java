package com.avito.android.cv_actualization.view.phone_input.mvi.action_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization.view.phone_input.mvi.entity.JsxCvActualizationPhoneInputInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxCvActualizationPhoneInputConfirmClickedActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.mvi.action_handler.JsxCvActualizationPhoneInputConfirmClickedActionHandler$handle$1", f = "JsxCvActualizationPhoneInputConfirmClickedActionHandler.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 30, 30, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JsxCvActualizationPhoneInputInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f131274q;

    /* renamed from: r, reason: collision with root package name */
    public int f131275r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f131276s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f131277t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f131278u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131277t = str;
        this.f131278u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f131277t, this.f131278u, continuation);
        aVar.f131276s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JsxCvActualizationPhoneInputInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization.view.phone_input.mvi.action_handler.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
