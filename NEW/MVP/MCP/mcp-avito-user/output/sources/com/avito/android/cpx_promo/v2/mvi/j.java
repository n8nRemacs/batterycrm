package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ls.InterfaceC43822a;

/* compiled from: CpxPromoV2Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processLimitValueChange$1", f = "CpxPromoV2Actor.kt", i = {0}, l = {291, 298}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127717q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127718r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f127719s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127720t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a.g f127721u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, CpxPromoV2State cpxPromoV2State, a.g gVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f127719s = mVar;
        this.f127720t = cpxPromoV2State;
        this.f127721u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f127719s, this.f127720t, this.f127721u, continuation);
        jVar.f127718r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f127717q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f127718r;
            InterfaceC43822a interfaceC43822a = this.f127719s.f127737e;
            CpxPromoV2State cpxPromoV2State = this.f127720t;
            boolean z12 = !cpxPromoV2State.f127630h.f127669c;
            this.f127721u.getClass();
            CpxPromoV2InternalAction.UpdateLimit updateLimitB = interfaceC43822a.b(z12, null, cpxPromoV2State.f127626d);
            this.f127718r = interfaceC43172j;
            this.f127717q = 1;
            if (interfaceC43172j.emit(updateLimitB, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f127718r;
            C42729a0.b(obj);
        }
        CpxPromoV2InternalAction.Validate validate = CpxPromoV2InternalAction.Validate.f127621b;
        this.f127718r = null;
        this.f127717q = 2;
        if (interfaceC43172j.emit(validate, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
