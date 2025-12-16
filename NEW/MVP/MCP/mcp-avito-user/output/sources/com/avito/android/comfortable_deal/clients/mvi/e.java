package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43477c;
import kp.C43481g;
import kp.InterfaceC43475a;

/* compiled from: ClientsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$4", f = "ClientsActor.kt", i = {0, 0}, l = {97, 98}, m = "invokeSuspend", n = {"$this$flow", "isArchived"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Boolean f120306q;

    /* renamed from: r, reason: collision with root package name */
    public int f120307r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120308s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43481g f120309t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43475a f120310u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f120311v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C43481g c43481g, InterfaceC43475a interfaceC43475a, g gVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f120309t = c43481g;
        this.f120310u = interfaceC43475a;
        this.f120311v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f120309t, this.f120310u, this.f120311v, continuation);
        eVar.f120308s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Boolean boolBoxBoolean;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120307r;
        InterfaceC43475a interfaceC43475a = this.f120310u;
        C43481g c43481g = this.f120309t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f120308s;
            C43477c c43477c = c43481g.f413210d;
            boolBoxBoolean = c43477c != null ? Boxing.boxBoolean(c43477c.f413194b) : null;
            ClientsInternalAction.UpdateClientsFilterQuery updateClientsFilterQuery = new ClientsInternalAction.UpdateClientsFilterQuery(((InterfaceC43475a.m) interfaceC43475a).f413191a);
            this.f120308s = interfaceC43172j2;
            this.f120306q = boolBoxBoolean;
            this.f120307r = 1;
            if (interfaceC43172j2.emit(updateClientsFilterQuery, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            boolBoxBoolean = this.f120306q;
            interfaceC43172j = (InterfaceC43172j) this.f120308s;
            C42729a0.b(obj);
        }
        InterfaceC43160i<ClientsInternalAction> interfaceC43160iA = this.f120311v.f120343a.a(0, c43481g.c(), ((InterfaceC43475a.m) interfaceC43475a).f413191a, boolBoxBoolean);
        this.f120308s = null;
        this.f120306q = null;
        this.f120307r = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
