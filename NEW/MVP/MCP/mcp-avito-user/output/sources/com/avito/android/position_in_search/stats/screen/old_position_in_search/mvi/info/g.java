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
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PositionInfoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LW80/a$d;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "<anonymous>", "(LW80/a$d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$processChangeActions$1", f = "PositionInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends SuspendLambda implements Y41.p<a.d, Continuation<? super InterfaceC43160i<? extends PositionInfoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f220532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f220533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<W80.h> f220534s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Y41.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f220533r = aVar2;
        this.f220534s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f220534s, this.f220533r, continuation);
        gVar.f220532q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(a.d dVar, Continuation<? super InterfaceC43160i<? extends PositionInfoInternalAction>> continuation) {
        return ((g) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f220533r.b((a.d) this.f220532q, this.f220534s.invoke());
    }
}
