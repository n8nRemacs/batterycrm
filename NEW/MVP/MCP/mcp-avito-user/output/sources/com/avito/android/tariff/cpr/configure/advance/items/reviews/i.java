package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import androidx.compose.foundation.lazy.w0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CprConfigureAdvanceReviewsItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.items.reviews.CprConfigureAdvanceReviewsItemViewImpl$initReviews$3$1$1$1$1$1$1", f = "CprConfigureAdvanceReviewsItemView.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295294q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f295295r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f295296s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w0 w0Var, int i12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f295295r = w0Var;
        this.f295296s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f295295r, this.f295296s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295294q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f295294q = 1;
            w0.c cVar = w0.f29712w;
            if (this.f295295r.k(this.f295296s, 0, this) == coroutine_suspended) {
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
