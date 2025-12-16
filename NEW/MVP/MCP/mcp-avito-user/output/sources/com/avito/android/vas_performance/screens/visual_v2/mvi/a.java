package com.avito.android.vas_performance.screens.visual_v2.mvi;

import RL0.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VisualVasV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.mvi.VisualVasV2Actor$process$1", f = "VisualVasV2Actor.kt", i = {}, l = {39, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super VisualVasV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f321244q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f321245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RL0.c f321246s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f321247t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RL0.c cVar, d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f321246s = cVar;
        this.f321247t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f321246s, this.f321247t, continuation);
        aVar.f321245r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super VisualVasV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f321244q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f321245r;
            RL0.c cVar = this.f321246s;
            List<c.e> list = cVar.f14357e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((c.e) obj2).f14396d) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                c.C0960c c0960c = cVar.f14360h;
                VisualVasV2InternalAction openDeepLink = (c0960c == null || (deepLink = c0960c.f14382c) == null) ? VisualVasV2InternalAction.FinishFlow.f321273b : new VisualVasV2InternalAction.OpenDeepLink(deepLink);
                this.f321244q = 2;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                d dVar = this.f321247t;
                com.avito.android.vas_performance.screens.visual_v2.domain.a aVar = dVar.f321258c;
                String strValueOf = String.valueOf(dVar.f321256a);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((c.e) it.next()).f14393a);
                }
                InterfaceC43160i<VisualVasV2InternalAction> interfaceC43160iA = aVar.a(strValueOf, cVar.f14361i, C42745f0.P0(arrayList2));
                this.f321244q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
