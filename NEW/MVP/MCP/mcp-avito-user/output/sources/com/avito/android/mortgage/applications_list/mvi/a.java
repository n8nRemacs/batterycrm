package com.avito.android.mortgage.applications_list.mvi;

import SZ.a;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
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

/* compiled from: ApplicationsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.applications_list.mvi.ApplicationsListActor$process$1", f = "ApplicationsListActor.kt", i = {0}, l = {40, 41}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ApplicationsListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198432q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f198433r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SZ.a f198434s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f198435t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SZ.a aVar, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f198434s = aVar;
        this.f198435t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f198434s, this.f198435t, continuation);
        aVar.f198433r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198432q;
        SZ.a aVar = this.f198434s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f198433r;
            ApplicationsListInternalAction.ApplicationDeleteClicked applicationDeleteClicked = new ApplicationsListInternalAction.ApplicationDeleteClicked(((a.b) aVar).f15048a);
            this.f198433r = interfaceC43172j;
            this.f198432q = 1;
            if (interfaceC43172j.emit(applicationDeleteClicked, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f198433r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<ApplicationsListInternalAction> interfaceC43160iA = this.f198435t.f198438a.a(((a.b) aVar).f15048a);
        this.f198433r = null;
        this.f198432q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
