package com.avito.android.travel_search.ui;

import com.avito.android.travel_search.ui.TravelSearchFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoading", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.ui.TravelSearchFragment$setupObservers$3", f = "TravelSearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f303234q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TravelSearchFragment f303235r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelSearchFragment travelSearchFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f303235r = travelSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f303235r, continuation);
        cVar.f303234q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((c) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Boolean bool = (Boolean) this.f303234q;
        TravelSearchFragment.a aVar = TravelSearchFragment.f303202F0;
        this.f303235r.r5().accept(new InterfaceC49206a.i(bool.booleanValue()));
        return G0.f406611a;
    }
}
