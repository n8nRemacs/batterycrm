package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43481g;
import kp.InterfaceC43475a;

/* compiled from: ClientsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$3", f = "ClientsActor.kt", i = {}, l = {66, 69, 72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f120301q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120302r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43481g f120303s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43475a f120304t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f120305u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C43481g c43481g, InterfaceC43475a interfaceC43475a, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f120303s = c43481g;
        this.f120304t = interfaceC43475a;
        this.f120305u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f120303s, this.f120304t, this.f120305u, continuation);
        dVar.f120302r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120301q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f120302r;
            RequestType requestTypeC = this.f120303s.c();
            RequestType requestType = RequestType.f120270d;
            InterfaceC43475a interfaceC43475a = this.f120304t;
            if (requestTypeC == requestType) {
                InterfaceC43475a.b bVar = (InterfaceC43475a.b) interfaceC43475a;
                ClientCardData clientCardData = bVar.f413180a;
                if (clientCardData.f120641g) {
                    ClientsInternalAction.OpenArchivingDialog openArchivingDialog = new ClientsInternalAction.OpenArchivingDialog(clientCardData.f120636b);
                    this.f120301q = 1;
                    if (interfaceC43172j.emit(openArchivingDialog, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f120305u.f120345c.d();
                    ClientsInternalAction.HandleDeeplink handleDeeplink = new ClientsInternalAction.HandleDeeplink(bVar.f413180a.f120642h);
                    this.f120301q = 2;
                    if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                ClientsInternalAction.OpenDeal openDeal = new ClientsInternalAction.OpenDeal(((InterfaceC43475a.b) interfaceC43475a).f413180a.f120636b);
                this.f120301q = 3;
                if (interfaceC43172j.emit(openDeal, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
