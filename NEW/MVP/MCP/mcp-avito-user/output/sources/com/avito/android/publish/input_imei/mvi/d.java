package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InputImeiActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiActor$process$4", f = "InputImeiActor.kt", i = {0}, l = {68}, m = "invokeSuspend", n = {AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS}, s = {"L$0"})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236376q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236377r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f236378s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f236378s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f236378s, continuation);
        dVar.f236377r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ParametersTree parametersTree;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f236376q;
        f fVar = this.f236378s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f236377r;
            ParametersTree parametersTreeB = fVar.f236391a.b(fVar.f236393c);
            CharParameter charParameter = (CharParameter) parametersTreeB.getFirstParameterOfType(CharParameter.class);
            String value = charParameter != null ? charParameter.getValue() : null;
            if (value == null) {
                value = "";
            }
            InputImeiInternalAction.UpdateImeiText updateImeiText = new InputImeiInternalAction.UpdateImeiText(value);
            this.f236377r = parametersTreeB;
            this.f236376q = 1;
            if (interfaceC43172j.emit(updateImeiText, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            parametersTree = parametersTreeB;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            parametersTree = (ParametersTree) this.f236377r;
            C42729a0.b(obj);
        }
        fVar.f236395e.b(parametersTree);
        return G0.f406611a;
    }
}
