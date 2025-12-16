package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import iv0.InterfaceC42115a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerScreenKt$PortfolioProjectBuyerScreen$5$onRefresh$1$1", f = "PortfolioProjectBuyerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280138q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f280139r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Y41.l<? super InterfaceC42115a, G0> lVar, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f280138q = lVar;
        this.f280139r = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f280138q, this.f280139r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f280138q.invoke(InterfaceC42115a.f.f405364a);
        this.f280139r.setValue(Boolean.FALSE);
        return G0.f406611a;
    }
}
