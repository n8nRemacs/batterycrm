package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.user_advert.advert.delegate.multi_urgency.e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiUrgencyToggleUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyToggleUseCaseImpl$toggle$2", f = "MultiUrgencyToggleUseCase.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308722q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f308723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.multi_urgency.c f308724s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.user_advert.advert.items.multi_urgency.c cVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f308724s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f308724s, continuation);
        gVar.f308723r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f308722q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f308723r;
            e.a aVar = new e.a(com.avito.android.user_advert.advert.items.multi_urgency.c.a(this.f308724s, 0L, null, false, 767));
            this.f308722q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
