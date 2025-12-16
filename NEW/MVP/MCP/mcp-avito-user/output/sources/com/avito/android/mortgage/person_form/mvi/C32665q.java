package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$verificationFlowActionClick$1", f = "PersonFormActor.kt", i = {}, l = {614}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32665q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201296q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201297r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G00.c f201298s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32649a f201299t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32665q(G00.c cVar, C32649a c32649a, Continuation<? super C32665q> continuation) {
        super(2, continuation);
        this.f201298s = cVar;
        this.f201299t = c32649a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32665q c32665q = new C32665q(this.f201298s, this.f201299t, continuation);
        c32665q.f201297r = obj;
        return c32665q;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32665q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201296q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201297r;
            G00.c cVar = this.f201298s;
            JZ.u uVar = cVar.f6154l;
            if (uVar == null) {
                return G0.f406611a;
            }
            InterfaceC43160i<PersonFormInternalAction> interfaceC43160iA = this.f201299t.f200898d.a(cVar.f6144b, cVar.f6145c, cVar.c(), uVar);
            this.f201296q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
