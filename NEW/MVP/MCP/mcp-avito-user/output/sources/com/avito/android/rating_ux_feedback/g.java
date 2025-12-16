package com.avito.android.rating_ux_feedback;

import Mg0.InterfaceC14487a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: RatingUxFeedbackInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ux_feedback/g;", "Lcom/avito/android/rating_ux_feedback/f;", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14487a> f250494a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f250495b;

    /* compiled from: RatingUxFeedbackInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_ux_feedback.RatingUxFeedbackInteractorImpl$getRatingUxFeedback$2", f = "RatingUxFeedbackInteractor.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<RatingUxFeedbackResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f250496q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f250498s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f250498s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return g.this.new a(this.f250498s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<RatingUxFeedbackResult>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f250496q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14487a interfaceC14487a = g.this.f250494a.get();
                this.f250496q = 1;
                obj = interfaceC14487a.f(this.f250498s, this);
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

    @Inject
    public g(@k R0 r02, @k h31.e eVar) {
        this.f250494a = eVar;
        this.f250495b = r02;
    }

    @Override // com.avito.android.rating_ux_feedback.f
    @l
    public final Object f(@l String str, @k Continuation<? super TypedResult<RatingUxFeedbackResult>> continuation) {
        return C43259k.g(this.f250495b.a(), new a(str, null), continuation);
    }
}
