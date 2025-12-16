package com.avito.android.travel_search.mvi;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.rec.ScreenSource;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.mvi.TravelSearchActor$process$1", f = "TravelSearchActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TravelSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303124q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f303125r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49206a f303126s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f303127t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC49206a interfaceC49206a, e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f303126s = interfaceC49206a;
        this.f303127t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f303126s, this.f303127t, continuation);
        aVar.f303125r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TravelSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Bundle bundle;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303124q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f303125r;
            InterfaceC49206a.b bVar = (InterfaceC49206a.b) this.f303126s;
            if (L.f(bVar.f440561c, Boxing.boxBoolean(true))) {
                bundle = bVar.f440560b;
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putParcelable("tree_parent", this.f303127t.f303144d.getParent());
                    bundle.putParcelable("screen_source", ScreenSource.TRAVEL_SEARCH.f251786d);
                }
            } else {
                bundle = bVar.f440560b;
            }
            DeepLink noMatchLink = bVar.f440559a;
            if (noMatchLink == null) {
                noMatchLink = new NoMatchLink();
            }
            TravelSearchInternalAction.HandleDeeplink handleDeeplink = new TravelSearchInternalAction.HandleDeeplink(bundle, noMatchLink, bVar.f440562d);
            this.f303124q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
