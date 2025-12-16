package com.avito.android.mortgage_invite.contact_info.mvi;

import Y41.p;
import a20.C19669a;
import b20.InterfaceC25394a;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
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

/* compiled from: ApplicationContactInfoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.mvi.ApplicationContactInfoActor$process$1", f = "ApplicationContactInfoActor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationContactInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205674q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b20.d f205676s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25394a f205677t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC25394a interfaceC25394a, b20.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f205676s = dVar;
        this.f205677t = interfaceC25394a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f205677t, this.f205676s, continuation);
        aVar.f205675r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationContactInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y10.a aVar;
        List<Y10.b> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205674q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205675r;
            C19669a c19669a = this.f205676s.f56844b;
            Y10.b bVar = null;
            InterfaceC25394a interfaceC25394a = this.f205677t;
            if (c19669a != null && (aVar = c19669a.f20715g) != null && (list = aVar.f19259b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Y10.b) next).f19261a == ((InterfaceC25394a.b) interfaceC25394a).f56825a) {
                        bVar = next;
                        break;
                    }
                }
                bVar = bVar;
            }
            InterfaceC25394a.b bVar2 = (InterfaceC25394a.b) interfaceC25394a;
            if (bVar2.f56826b.length() > 0 || bVar == null || !bVar.f19271k) {
                ApplicationContactInfoInternalAction.AgentFieldUpdated agentFieldUpdated = new ApplicationContactInfoInternalAction.AgentFieldUpdated(bVar2.f56825a, bVar2.f56826b);
                this.f205674q = 1;
                if (interfaceC43172j.emit(agentFieldUpdated, this) == coroutine_suspended) {
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
