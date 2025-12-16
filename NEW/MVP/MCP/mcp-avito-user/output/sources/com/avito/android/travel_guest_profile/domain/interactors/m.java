package com.avito.android.travel_guest_profile.domain.interactors;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TravelGuestProfileReviewsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_guest_profile.domain.interactors.TravelGuestProfileReviewsInteractor$loadReviewsForNextPage$1", f = "TravelGuestProfileReviewsInteractor.kt", i = {}, l = {65, 65}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<RatingDetailsResult>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f302025q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f302026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f302027s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uri f302028t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, Uri uri, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f302027s = fVar;
        this.f302028t = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f302027s, this.f302028t, continuation);
        mVar.f302026r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<RatingDetailsResult>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f302025q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f302026r;
            InterfaceC14487a interfaceC14487a = this.f302027s.f301995a;
            String string = this.f302028t.toString();
            this.f302026r = interfaceC43172j;
            this.f302025q = 1;
            obj = interfaceC14487a.q(string, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f302026r;
            C42729a0.b(obj);
        }
        this.f302026r = null;
        this.f302025q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
