package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
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

/* compiled from: DealRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$processAction$2", f = "DealRoomActor.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29855m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29856n f137708s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a.b f137709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29855m(C29856n c29856n, InterfaceC13362a.b bVar, Continuation<? super C29855m> continuation) {
        super(2, continuation);
        this.f137708s = c29856n;
        this.f137709t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29855m c29855m = new C29855m(this.f137708s, this.f137709t, continuation);
        c29855m.f137707r = obj;
        return c29855m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29855m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137706q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137707r;
            u uVar = this.f137708s.f137710a;
            InterfaceC13362a.b.C0130b c0130b = (InterfaceC13362a.b.C0130b) this.f137709t;
            InterfaceC43160i<DealRoomInternalAction> interfaceC43160iE = uVar.e(c0130b.f2739b, c0130b.f2738a, c0130b.f2740c);
            this.f137706q = 1;
            if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
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
