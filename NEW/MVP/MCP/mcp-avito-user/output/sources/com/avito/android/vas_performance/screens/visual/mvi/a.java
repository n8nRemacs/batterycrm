package com.avito.android.vas_performance.screens.visual.mvi;

import PL0.a;
import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VisualVasActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.visual.mvi.VisualVasActor$process$1", f = "VisualVasActor.kt", i = {0, 1}, l = {37, 46, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super VisualVasInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f321086q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f321087r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PL0.c f321088s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f321089t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PL0.a f321090u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PL0.c cVar, c cVar2, PL0.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f321088s = cVar;
        this.f321089t = cVar2;
        this.f321090u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f321088s, this.f321089t, this.f321090u, continuation);
        aVar.f321087r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super VisualVasInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f321086q;
        PL0.c cVar = this.f321088s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f321087r;
            ArrayList arrayListA = OL0.a.a(cVar.f13032d);
            if (arrayListA.isEmpty()) {
                DeepLink deepLink = cVar.f13036h;
                VisualVasInternalAction openDeepLink = deepLink != null ? new VisualVasInternalAction.OpenDeepLink(deepLink) : VisualVasInternalAction.FinishFlow.f321137b;
                this.f321087r = interfaceC43172j;
                this.f321086q = 2;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c cVar2 = this.f321089t;
                com.avito.android.vas_performance.screens.visual.mvi.domain.a aVar = cVar2.f321096c;
                ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.avito.android.vas_performance.screens.visual.item.item.a) it.next()).f321049b);
                }
                InterfaceC43160i<VisualVasInternalAction> interfaceC43160iA = aVar.a(cVar2.f321094a, cVar.f13037i, C42745f0.P0(arrayList), ((a.c) this.f321090u).f13021a);
                this.f321087r = interfaceC43172j;
                this.f321086q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f321087r;
            C42729a0.b(obj);
        }
        List<com.avito.conveyor_item.a> list = cVar.f13032d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.vas_performance.screens.visual.item.item.a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (L.f(((com.avito.android.vas_performance.screens.visual.item.item.a) next).f321049b, "short_video")) {
                arrayList3.add(next);
            }
        }
        VisualVasInternalAction.PutVideoVasSelectionParam putVideoVasSelectionParam = new VisualVasInternalAction.PutVideoVasSelectionParam(!arrayList3.isEmpty() && OL0.a.a(arrayList3).isEmpty());
        this.f321087r = null;
        this.f321086q = 3;
        if (interfaceC43172j.emit(putVideoVasSelectionParam, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
