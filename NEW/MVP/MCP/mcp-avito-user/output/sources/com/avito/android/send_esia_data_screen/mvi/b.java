package com.avito.android.send_esia_data_screen.mvi;

import Y41.p;
import dr0.AbstractC39789a;
import dr0.AbstractC39790b;
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

/* compiled from: SendEsiaDataActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ldr0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.send_esia_data_screen.mvi.SendEsiaDataActor$process$2", f = "SendEsiaDataActor.kt", i = {0}, l = {30, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC39790b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f268260q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f268261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f268262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC39789a f268263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AbstractC39789a abstractC39789a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f268262s = eVar;
        this.f268263t = abstractC39789a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f268262s, this.f268263t, continuation);
        bVar.f268261r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC39790b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f268260q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f268261r;
            AbstractC39790b.c cVar = AbstractC39790b.c.f394156a;
            this.f268261r = interfaceC43172j;
            this.f268260q = 1;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f268261r;
            C42729a0.b(obj);
        }
        com.avito.android.send_esia_data_screen.domain.a aVar = this.f268262s.f268274c;
        AbstractC39789a.c cVar2 = (AbstractC39789a.c) this.f268263t;
        InterfaceC43160i<AbstractC39790b> interfaceC43160iA = aVar.a(cVar2.f394151a, cVar2.f394152b);
        this.f268261r = null;
        this.f268260q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
