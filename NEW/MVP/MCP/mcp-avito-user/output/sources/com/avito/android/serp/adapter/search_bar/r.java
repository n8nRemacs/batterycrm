package com.avito.android.serp.adapter.search_bar;

import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/ticket_view/a;", "ticketState", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "cartState1", "Lkotlin/Q;", "<anonymous>", "(Lcom/avito/android/ticket_view/a;Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.search_bar.SearchBarItemPresenterImpl$initTicketMenuIcon$3", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class r extends SuspendLambda implements Y41.q<com.avito.android.ticket_view.a, InterfaceC31171n, Continuation<? super kotlin.Q<? extends com.avito.android.ticket_view.a, ? extends InterfaceC31171n>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.ticket_view.a f271651q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC31171n f271652r;

    public r() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(com.avito.android.ticket_view.a aVar, InterfaceC31171n interfaceC31171n, Continuation<? super kotlin.Q<? extends com.avito.android.ticket_view.a, ? extends InterfaceC31171n>> continuation) {
        r rVar = new r(3, continuation);
        rVar.f271651q = aVar;
        rVar.f271652r = interfaceC31171n;
        return rVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new kotlin.Q(this.f271651q, this.f271652r);
    }
}
