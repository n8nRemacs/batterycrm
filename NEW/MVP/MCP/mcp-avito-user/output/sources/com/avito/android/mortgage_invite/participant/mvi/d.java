package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import o20.C44572a;
import p20.C46879d;
import p20.InterfaceC46876a;

/* compiled from: ParticipantActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.mvi.ParticipantActor$process$4", f = "ParticipantActor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ParticipantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206180q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206181r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C46879d f206182s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC46876a f206183t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C46879d c46879d, InterfaceC46876a interfaceC46876a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f206182s = c46879d;
        this.f206183t = interfaceC46876a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f206182s, this.f206183t, continuation);
        dVar.f206181r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ParticipantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C44572a c44572a;
        List<o20.d> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206180q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f206181r;
            o20.c cVar = this.f206182s.f428146b;
            o20.d dVar = null;
            InterfaceC46876a interfaceC46876a = this.f206183t;
            if (cVar != null && (c44572a = cVar.f419326f) != null && (list = c44572a.f419315b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((o20.d) next).f419328a == ((InterfaceC46876a.C12252a) interfaceC46876a).f428123a) {
                        dVar = next;
                        break;
                    }
                }
                dVar = dVar;
            }
            if (dVar != null && dVar.f419336i) {
                InterfaceC46876a.C12252a c12252a = (InterfaceC46876a.C12252a) interfaceC46876a;
                ParticipantInternalAction.SetAgentFieldEmptyByMasked setAgentFieldEmptyByMasked = new ParticipantInternalAction.SetAgentFieldEmptyByMasked(c12252a.f428123a, c12252a.f428124b);
                this.f206180q = 1;
                if (interfaceC43172j.emit(setAgentFieldEmptyByMasked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
