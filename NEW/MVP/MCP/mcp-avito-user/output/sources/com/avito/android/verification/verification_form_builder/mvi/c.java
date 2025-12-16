package com.avito.android.verification.verification_form_builder.mvi;

import TM0.c;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor$handleHomeClick$1", f = "FormBuilderActor.kt", i = {}, l = {86, 87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FormBuilderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325423q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325424r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TM0.c f325425s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TM0.c cVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f325425s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f325425s, continuation);
        cVar.f325424r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FormBuilderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        FormBuilderScreenData formBuilderScreenData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325423q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325424r;
            TM0.c cVar = this.f325425s;
            c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
            if (bVar == null || (formBuilderScreenData = bVar.f15624b) == null || !formBuilderScreenData.f325353d) {
                FormBuilderInternalAction.BackAction backAction = FormBuilderInternalAction.BackAction.f325433b;
                this.f325423q = 2;
                if (interfaceC43172j.emit(backAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FormBuilderInternalAction.CloseAction closeAction = FormBuilderInternalAction.CloseAction.f325434b;
                this.f325423q = 1;
                if (interfaceC43172j.emit(closeAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
