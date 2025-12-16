package com.avito.android.mortgage.phone_confirm.mvi;

import Y41.p;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
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

/* compiled from: PhoneConfirmActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$codeUpdated$1", f = "PhoneConfirmActor.kt", i = {0}, l = {56, 59}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PhoneConfirmInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201587q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f201589s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J00.c f201590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f201591u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, J00.c cVar, c cVar2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f201589s = str;
        this.f201590t = cVar;
        this.f201591u = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f201589s, this.f201590t, this.f201591u, continuation);
        aVar.f201588r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhoneConfirmInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201587q;
        String str = this.f201589s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f201588r;
            PhoneConfirmInternalAction.CodeChanged codeChanged = new PhoneConfirmInternalAction.CodeChanged(str);
            this.f201588r = interfaceC43172j;
            this.f201587q = 1;
            if (interfaceC43172j.emit(codeChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f201588r;
            C42729a0.b(obj);
        }
        int length = com.avito.android.lib.design.input.c.h(str, " ").length();
        J00.c cVar = this.f201590t;
        if (length == cVar.f8708i) {
            InterfaceC43160i<PhoneConfirmInternalAction> interfaceC43160iA = this.f201591u.f201609b.a(cVar.f8701b, cVar.f8702c, str);
            this.f201588r = null;
            this.f201587q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
