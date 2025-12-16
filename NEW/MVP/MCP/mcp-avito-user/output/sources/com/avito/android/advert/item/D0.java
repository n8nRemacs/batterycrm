package com.avito.android.advert.item;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$subscribeRatingLLMSummaryIfNeeded$1$1$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class D0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71608q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f71609r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f71610s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C28136i0 c28136i0, AdvertDetails advertDetails, boolean z12, Continuation<? super D0> continuation) {
        super(2, continuation);
        this.f71608q = c28136i0;
        this.f71609r = advertDetails;
        this.f71610s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new D0(this.f71608q, this.f71609r, this.f71610s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((D0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        S sO2 = this.f71608q.o2(this.f71609r);
        if (sO2 != null) {
            sO2.t(this.f71610s);
        }
        return kotlin.G0.f406611a;
    }
}
