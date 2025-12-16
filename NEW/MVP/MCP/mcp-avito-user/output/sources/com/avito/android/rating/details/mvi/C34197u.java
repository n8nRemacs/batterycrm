package com.avito.android.rating.details.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$20", f = "RatingDetailsActor.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating.details.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34197u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247497q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247498r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247499s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34197u(com.avito.android.rating.details.mvi.entity.a aVar, Continuation<? super C34197u> continuation) {
        super(2, continuation);
        this.f247499s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34197u c34197u = new C34197u(this.f247499s, continuation);
        c34197u.f247498r = obj;
        return c34197u;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34197u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink uri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247497q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247498r;
            ReviewActionNetworkRequestResult.Info info = ((a.j) this.f247499s).f247396a;
            String message = info.getMessage();
            ReviewActionNetworkRequestResult.Button button = info.getButton();
            String title = button != null ? button.getTitle() : null;
            ReviewActionNetworkRequestResult.Button button2 = info.getButton();
            RatingDetailsInternalAction.ShowToastBar showToastBar = new RatingDetailsInternalAction.ShowToastBar(message, title, (button2 == null || (uri = button2.getUri()) == null) ? null : new a.i(uri, null, null, 6, null), 0, 8, null);
            this.f247497q = 1;
            if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
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
