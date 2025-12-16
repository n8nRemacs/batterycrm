package com.avito.android.mortgage.landing.mvi;

import com.avito.android.mortgage.landing.list.items.offers.OffersItem;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewState;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LandingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$process$2", f = "LandingActor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200102q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200103r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingState f200104s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LandingState landingState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f200104s = landingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f200104s, continuation);
        cVar.f200103r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200102q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200103r;
            LandingViewState landingViewState = this.f200104s.f200241q;
            LandingViewState.Content content = landingViewState instanceof LandingViewState.Content ? (LandingViewState.Content) landingViewState : null;
            if (content == null || (arrayList = content.f200248c) == null) {
                return G0.f406611a;
            }
            Iterator it = arrayList.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (((ParcelableItem) it.next()) instanceof OffersItem) {
                    break;
                }
                i13++;
            }
            LandingInternalAction.ScrollToOffersClicked scrollToOffersClicked = new LandingInternalAction.ScrollToOffersClicked(i13);
            this.f200102q = 1;
            if (interfaceC43172j.emit(scrollToOffersClicked, this) == coroutine_suspended) {
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
