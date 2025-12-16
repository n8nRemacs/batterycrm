package com.avito.android.str_seller_orders.strsellerordersrange.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersRangeInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "", "cause", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersrange.domain.StrSellerOrdersRangeInteractorImpl$loadData$3", f = "StrSellerOrdersRangeInteractor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super StrSellerOrdersRangeInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290251q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f290252r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f290253s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f290254t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f290254t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersRangeInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f290254t, continuation);
        dVar.f290252r = interfaceC43172j;
        dVar.f290253s = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290251q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f290252r;
            Throwable th2 = this.f290253s;
            InterfaceC28373a interfaceC28373a = this.f290254t.f290255a;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            interfaceC28373a.c(new NonFatalErrorEvent(message, th2, null, null, 12, null));
            StrSellerOrdersRangeInternalAction.ShowError showError = new StrSellerOrdersRangeInternalAction.ShowError(th2);
            this.f290252r = null;
            this.f290251q = 1;
            if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
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
