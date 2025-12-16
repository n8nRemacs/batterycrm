package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import W80.a;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PositionInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$BannerClosed;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$processBannerClosed$1", f = "PositionInfoActor.kt", i = {0}, l = {147, 148}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PositionInfoInternalAction.BannerClosed>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220508q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f220509r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f220510s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.b f220511t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, a.b bVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f220510s = aVar;
        this.f220511t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f220510s, this.f220511t, continuation);
        eVar.f220509r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PositionInfoInternalAction.BannerClosed> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220508q;
        a.b bVar = this.f220511t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f220509r;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i iVar = this.f220510s.f220485b;
            String str = bVar.f17766a;
            this.f220509r = interfaceC43172j;
            this.f220508q = 1;
            if (iVar.f220385e.a(str, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f220509r;
            C42729a0.b(obj);
        }
        PositionInfoInternalAction.BannerClosed bannerClosed = new PositionInfoInternalAction.BannerClosed(bVar.f17766a);
        this.f220509r = null;
        this.f220508q = 2;
        if (interfaceC43172j.emit(bannerClosed, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
