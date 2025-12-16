package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$nextStep$1", f = "PersonFormActor.kt", i = {}, l = {603, 605}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32655g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201227q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32649a f201229s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G00.c f201230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32655g(G00.c cVar, C32649a c32649a, Continuation continuation) {
        super(2, continuation);
        this.f201229s = c32649a;
        this.f201230t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32655g c32655g = new C32655g(this.f201230t, this.f201229s, continuation);
        c32655g.f201228r = obj;
        return c32655g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32655g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201227q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201228r;
            this.f201229s.getClass();
            G00.c cVar = this.f201230t;
            int iJ2 = C42745f0.J(cVar.f6149g);
            int i13 = cVar.f6150h;
            if (iJ2 == i13) {
                PersonFormInternalAction.CloseFlow closeFlow = PersonFormInternalAction.CloseFlow.f201176b;
                this.f201227q = 1;
                if (interfaceC43172j.emit(closeFlow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                PersonFormInternalAction.OpenStep openStep = new PersonFormInternalAction.OpenStep(cVar.f6149g, i13 + 1);
                this.f201227q = 2;
                if (interfaceC43172j.emit(openStep, this) == coroutine_suspended) {
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
