package com.avito.android.travel_search.ui;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.travel_search.ui.TravelSearchFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.ui.TravelSearchFragment$setupObservers$5", f = "TravelSearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f303238q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TravelSearchFragment f303239r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelSearchFragment travelSearchFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f303239r = travelSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f303239r, continuation);
        eVar.f303238q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super G0> continuation) {
        return ((e) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        DeepLink deepLink = (DeepLink) ((Q) this.f303238q).f406619b;
        TravelSearchFragment.a aVar = TravelSearchFragment.f303202F0;
        TravelSearchFragment travelSearchFragment = this.f303239r;
        pF0.h hVarR5 = travelSearchFragment.r5();
        InterfaceC31062w interfaceC31062w = travelSearchFragment.f303217v0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        hVarR5.accept(new InterfaceC49206a.d(deepLink, interfaceC31062w.W0()));
        return G0.f406611a;
    }
}
