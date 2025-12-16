package com.avito.android.travel_guest_profile.domain.interactors;

import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TravelGuestProfileReviewsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsResult;", "loadingState", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/util/P2;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_guest_profile.domain.interactors.TravelGuestProfileReviewsInteractor$loadReviewsForNextPage$4", f = "TravelGuestProfileReviewsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class o extends SuspendLambda implements Y41.p<P2<? super RatingDetailsResult>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f302031q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f302032r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f302032r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f302032r, continuation);
        oVar.f302031q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super RatingDetailsResult> p22, Continuation<? super G0> continuation) {
        return ((o) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        boolean z12 = ((P2) this.f302031q) instanceof P2.c;
        f fVar = this.f302032r;
        if (z12) {
            fVar.f301996b.set(true);
        } else {
            fVar.f301996b.set(false);
        }
        return G0.f406611a;
    }
}
