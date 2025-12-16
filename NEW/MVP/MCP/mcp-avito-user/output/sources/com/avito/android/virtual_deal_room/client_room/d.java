package com.avito.android.virtual_deal_room.client_room;

import EN0.a;
import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: ClientRoomFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deeplinkResult", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.ClientRoomFragment$observeDeeplinkResult$1", f = "ClientRoomFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f326265q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ClientRoomFragment f326266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ClientRoomFragment clientRoomFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f326266r = clientRoomFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f326266r, continuation);
        dVar.f326265q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((d) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f326265q).f413261b;
        if (interfaceC14249c instanceof ClientEditDeeplink.b) {
            ClientRoomFragment.a aVar = ClientRoomFragment.f326248u0;
            this.f326266r.q5().accept(new a.e((ClientEditDeeplink.b) interfaceC14249c));
        }
        return G0.f406611a;
    }
}
