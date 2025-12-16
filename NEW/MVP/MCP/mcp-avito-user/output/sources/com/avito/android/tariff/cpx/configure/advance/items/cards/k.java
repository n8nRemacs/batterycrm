package com.avito.android.tariff.cpx.configure.advance.items.cards;

import androidx.compose.foundation.lazy.w0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CpxConfigureAdvanceCardsItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance.items.cards.CpxConfigureAdvanceCardsItemViewImpl$initCards$1$1$1$1$1$1$1", f = "CpxConfigureAdvanceCardsItemView.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295669q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f295670r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f295671s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w0 w0Var, int i12, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f295670r = w0Var;
        this.f295671s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f295670r, this.f295671s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295669q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f295669q = 1;
            w0.c cVar = w0.f29712w;
            if (this.f295670r.k(this.f295671s, 0, this) == coroutine_suspended) {
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
