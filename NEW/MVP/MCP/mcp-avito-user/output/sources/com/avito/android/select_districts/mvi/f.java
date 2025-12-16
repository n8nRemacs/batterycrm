package com.avito.android.select_districts.mvi;

import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
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
import pq0.c;

/* compiled from: SelectDistrictsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select_districts.mvi.SelectDistrictsActor$process$5", f = "SelectDistrictsActor.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectDistrictsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f267036q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f267037r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f267038s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47130a f267039t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pq0.c f267040u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, InterfaceC47130a interfaceC47130a, pq0.c cVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f267038s = kVar;
        this.f267039t = interfaceC47130a;
        this.f267040u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f267038s, this.f267039t, this.f267040u, continuation);
        fVar.f267037r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectDistrictsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f267036q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f267037r;
            k kVar = this.f267038s;
            com.avito.android.select_districts.domain.d dVar = kVar.f267056d;
            InterfaceC47130a.f fVar = (InterfaceC47130a.f) this.f267039t;
            dVar.e(fVar.f428802a);
            c.a aVar = (c.a) this.f267040u;
            String str = fVar.f428802a;
            List<com.avito.conveyor_item.a> list = aVar.f428808b;
            kVar.f267057e.getClass();
            SelectDistrictsInternalAction.Content content = new SelectDistrictsInternalAction.Content(com.avito.android.select_districts.domain.m.a(str, list), false, null, 6, null);
            this.f267036q = 1;
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
