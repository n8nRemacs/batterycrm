package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealRouteDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealRouteDeeplinkHandler$doHandle$1", f = "ComfortableDealRouteDeeplinkHandler.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121977q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f121978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealRouteDeeplink f121979s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ComfortableDealRouteDeeplink comfortableDealRouteDeeplink, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f121978r = rVar;
        this.f121979s = comfortableDealRouteDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f121978r, this.f121979s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121977q;
        r rVar = this.f121978r;
        a.g gVar = rVar.f121981g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(rVar.d(), true);
            String str = this.f121979s.f121853b;
            this.f121977q = 1;
            obj = rVar.f121982h.s(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        gVar.g(rVar.d(), false);
        if (typedResult instanceof TypedResult.Success) {
            dp.o oVar = (dp.o) ((TypedResult.Success) typedResult).getResult();
            rVar.i(u.f121988b, rVar.f121980f, oVar.getDeeplink());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            rVar.j(AbstractC14250d.b.f9170c);
        }
        return G0.f406611a;
    }
}
