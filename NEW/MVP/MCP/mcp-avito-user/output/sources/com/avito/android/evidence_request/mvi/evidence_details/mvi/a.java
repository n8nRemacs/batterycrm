package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.C17068c;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EvidenceDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsActor$process$1", f = "EvidenceDetailsActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f149009q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f149010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f149011s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C17068c f149012t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, C17068c c17068c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f149011s = cVar;
        this.f149012t = c17068c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f149011s, this.f149012t, continuation);
        aVar.f149010r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f149009q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f149010r;
            c cVar = this.f149011s;
            EvidenceDetailsInternalAction.FilesPicker filesPicker = new EvidenceDetailsInternalAction.FilesPicker(cVar.f149017b.getF148679a(), cVar.f149016a.b(this.f149012t.f19204d));
            this.f149009q = 1;
            if (interfaceC43172j.emit(filesPicker, this) == coroutine_suspended) {
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
