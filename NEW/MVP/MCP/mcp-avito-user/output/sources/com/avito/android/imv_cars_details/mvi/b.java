package com.avito.android.imv_cars_details.mvi;

import WM.a;
import Y41.p;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvCarsDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_cars_details.mvi.ImvCarsDetailsActor$process$1$1", f = "ImvCarsDetailsActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ImvCarsDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169974q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f169975r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f169976s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.conveyor_item.a> f169977t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ WM.a f169978u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e eVar, List<? extends com.avito.conveyor_item.a> list, WM.a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f169976s = eVar;
        this.f169977t = list;
        this.f169978u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f169976s, this.f169977t, this.f169978u, continuation);
        bVar.f169975r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ImvCarsDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f169974q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f169975r;
            com.avito.android.imv_cars_details.domain.d dVar = this.f169976s.f169988b;
            a.c cVar = (a.c) this.f169978u;
            ImvCarsDetailsInternalAction.UpdateItems updateItems = new ImvCarsDetailsInternalAction.UpdateItems(dVar.b(this.f169977t, cVar.f17877a, cVar.f17878b));
            this.f169974q = 1;
            if (interfaceC43172j.emit(updateItems, this) == coroutine_suspended) {
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
