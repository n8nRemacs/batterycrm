package com.avito.android.publish.slots.generate_text_buttons;

import Y41.p;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import dl0.InterfaceC39749a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ol0.C44817a;

/* compiled from: GenerateTextButtonsSlotWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.generate_text_buttons.GenerateTextButtonsSlotWrapper$previousText$1", f = "GenerateTextButtonsSlotWrapper.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243969q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f243970r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f243970r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f243970r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f243969q;
        c cVar = this.f243970r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC39749a interfaceC39749a = cVar.f243946c;
            String str = cVar.f243954k;
            this.f243969q = 1;
            obj = interfaceC39749a.b(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            TypedResult.Success success = (TypedResult.Success) typedResult;
            cVar.f243950g.setValue(((C44817a) success.getResult()).getText());
            cVar.f243955l = ((C44817a) success.getResult()).getIsMoreHistory() ? GenerateTextButtonsItem.State.f243985d : GenerateTextButtonsItem.State.f243983b;
        } else if (typedResult instanceof TypedResult.Error) {
            cVar.f243950g.setErrorMessage(((TypedResult.Error) typedResult).getError().getF244063c());
        }
        cVar.f243952i.accept(new f.b(SlotType.GENERATE_TEXT_BUTTONS, null));
        return G0.f406611a;
    }
}
