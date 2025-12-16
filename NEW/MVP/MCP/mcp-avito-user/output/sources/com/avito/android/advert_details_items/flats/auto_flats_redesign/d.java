package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import Y41.p;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_details_items.flats.auto_flats_redesign.AdvertDetailsFlatTwoColumnWithDotsKt$FlatsTwoColumnWithDots$1$1$2$1", f = "AdvertDetailsFlatTwoColumnWithDots.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f84690q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.advert.k f84691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f84692s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z12, com.avito.android.advert_core.advert.k kVar, boolean z13, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f84690q = z12;
        this.f84691r = kVar;
        this.f84692s = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f84690q, this.f84691r, this.f84692s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        boolean z12 = this.f84690q;
        com.avito.android.advert_core.advert.k kVar = this.f84691r;
        if (z12 && kVar != null) {
            kVar.g0();
        }
        if (this.f84692s && kVar != null) {
            kVar.h2();
        }
        return G0.f406611a;
    }
}
