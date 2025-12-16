package com.avito.android.str_calendar.seller.last_minute_offer.ui;

import Ky0.c;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: LastMinuteOfferFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment$handleEvent$1", f = "LastMinuteOfferFragment.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LastMinuteOfferFragment f288000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ky0.c f288001s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LastMinuteOfferFragment lastMinuteOfferFragment, Ky0.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f288000r = lastMinuteOfferFragment;
        this.f288001s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f288000r, this.f288001s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287999q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.str_calendar.seller.core.c cVar = this.f288000r.f287983q0;
            if (cVar == null) {
                cVar = null;
            }
            c.b bVar = (c.b) this.f288001s;
            boolean z12 = bVar.f9737a;
            UpdatedParametersInfo updatedParametersInfo = bVar.f9738b;
            this.f287999q = 1;
            if (cVar.m(z12, updatedParametersInfo, this) == coroutine_suspended) {
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
