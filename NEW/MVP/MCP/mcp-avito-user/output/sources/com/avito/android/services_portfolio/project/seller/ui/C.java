package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.ui.PortfolioProjectSellerScreenKt$PortfolioProjectSellerScreen$7$onRefresh$1$1", f = "PortfolioProjectSellerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class C extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280286q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f280287r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f280286q = interfaceC22204y1;
        this.f280287r = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f280286q, this.f280287r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((Y41.l) this.f280286q.getF42167b()).invoke(InterfaceC43503b.e.f413271a);
        this.f280287r.setValue(Boolean.FALSE);
        return G0.f406611a;
    }
}
