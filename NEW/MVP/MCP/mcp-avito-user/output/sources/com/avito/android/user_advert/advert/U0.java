package com.avito.android.user_advert.advert;

import com.avito.android.user_adverts_common.ux_feedback.d;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.MyAdvertDetailsPresenterImpl$showUxFeedbackFromDeeplink$1", f = "MyAdvertDetailsPresenter.kt", i = {}, l = {2139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class U0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308434q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts_common.ux_feedback.a f308435r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(com.avito.android.user_adverts_common.ux_feedback.a aVar, Continuation<? super U0> continuation) {
        super(2, continuation);
        this.f308435r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new U0(this.f308435r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Boolean> continuation) {
        return ((U0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f308434q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d2 d2VarA = C43175k.a(this.f308435r.f315935c);
            this.f308434q = 1;
            obj = C43175k.y(d2VarA, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return Boxing.boxBoolean(((com.avito.android.user_adverts_common.ux_feedback.d) obj) instanceof d.b);
    }
}
