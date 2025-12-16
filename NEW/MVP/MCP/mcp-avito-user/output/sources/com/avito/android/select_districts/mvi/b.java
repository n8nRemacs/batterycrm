package com.avito.android.select_districts.mvi;

import com.avito.android.remote.model.District;
import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pq0.InterfaceC47130a;

/* compiled from: SelectDistrictsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select_districts.mvi.SelectDistrictsActor$process$1", f = "SelectDistrictsActor.kt", i = {0}, l = {35, 37}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectDistrictsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f267016q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f267017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f267018s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47130a f267019t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, InterfaceC47130a interfaceC47130a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f267018s = kVar;
        this.f267019t = interfaceC47130a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f267018s, this.f267019t, continuation);
        bVar.f267017r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectDistrictsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f267016q;
        k kVar = this.f267018s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f267017r;
            com.avito.android.select_districts.domain.j jVar = kVar.f267053a;
            int i13 = ((InterfaceC47130a.h) this.f267019t).f428804a;
            this.f267017r = interfaceC43172j;
            this.f267016q = 1;
            obj = jVar.a(i13, this);
            if (obj == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f267017r;
            C42729a0.b(obj);
        }
        List<District> list = (List) obj;
        kVar.f267056d.c(list);
        SelectDistrictsInternalAction.Content content = new SelectDistrictsInternalAction.Content(kVar.f267055c.b(list), false, null, 6, null);
        this.f267017r = null;
        this.f267016q = 2;
        if (interfaceC43172j.emit(content, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
