package com.avito.android.comfortable_deal.client_room.mvi;

import fp.d;
import fp.e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lfp/e;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.mvi.ClientRoomActor$process$1", f = "ClientRoomActor.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super fp.e>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119883q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119884r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f119885s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fp.d f119886t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, fp.d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f119885s = hVar;
        this.f119886t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f119885s, this.f119886t, continuation);
        aVar.f119884r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super fp.e> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f119883q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f119884r;
            this.f119885s.f119905a.c(((d.c) this.f119886t).f396097a);
            e.b bVar = e.b.f396105a;
            this.f119883q = 1;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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
