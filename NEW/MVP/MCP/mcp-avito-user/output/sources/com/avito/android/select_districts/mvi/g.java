package com.avito.android.select_districts.mvi;

import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pq0.InterfaceC47130a;

/* compiled from: SelectDistrictsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select_districts.mvi.SelectDistrictsActor$process$6", f = "SelectDistrictsActor.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectDistrictsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f267041q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f267042r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47130a f267043s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC47130a interfaceC47130a, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f267043s = interfaceC47130a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f267043s, continuation);
        gVar.f267042r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectDistrictsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f267041q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f267042r;
            SelectDistrictsInternalAction.Content content = new SelectDistrictsInternalAction.Content(((InterfaceC47130a.e) this.f267043s).f428801a, true, Boxing.boxInt(0));
            this.f267041q = 1;
            if (interfaceC43172j.emit(content, this) == coroutine_suspended) {
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
