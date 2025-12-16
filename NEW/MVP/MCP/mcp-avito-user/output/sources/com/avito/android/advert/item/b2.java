package com.avito.android.advert.item;

import k4.C42498b;
import k4.C42501e;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LeT/c;", "beduinState", "Lk4/e;", "advertDetailsState", "Lk4/b;", "<anonymous>", "(LeT/c;Lk4/e;)Lk4/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewModel$state$2$1", f = "AdvertDetailsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b2 extends SuspendLambda implements Y41.q<AbstractC40048c, C42501e, Continuation<? super C42498b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f73182q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ C42501e f73183r;

    public b2() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(AbstractC40048c abstractC40048c, C42501e c42501e, Continuation<? super C42498b> continuation) {
        b2 b2Var = new b2(3, continuation);
        b2Var.f73182q = abstractC40048c;
        b2Var.f73183r = c42501e;
        return b2Var.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new C42498b(this.f73183r, this.f73182q);
    }
}
