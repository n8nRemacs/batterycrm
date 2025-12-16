package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RatingDetailsNetworkRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/review_action_network_request/ReviewActionNetworkRequestResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsNetworkRequestInteractorImpl$sendNetworkRequest$2", f = "RatingDetailsNetworkRequestInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<ReviewActionNetworkRequestResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f247135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f247136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f247137t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f247138u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f247139v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f247140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, Integer num, Integer num2, Integer num3, String str2, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f247135r = oVar;
        this.f247136s = str;
        this.f247137t = num;
        this.f247138u = num2;
        this.f247139v = num3;
        this.f247140w = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f247135r, this.f247136s, this.f247137t, this.f247138u, this.f247139v, this.f247140w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<ReviewActionNetworkRequestResult>> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String strSubstring;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14487a interfaceC14487a = this.f247135r.f247141a;
            String str = this.f247136s;
            int length = str.length();
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    strSubstring = "";
                    break;
                }
                if (str.charAt(i13) != '/') {
                    strSubstring = str.substring(i13);
                    break;
                }
                i13++;
            }
            String str2 = strSubstring;
            this.f247134q = 1;
            obj = interfaceC14487a.t(str2, this.f247137t, this.f247138u, this.f247139v, this.f247140w, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
