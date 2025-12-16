package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: VerticalFilterPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterPresenterImpl$sendCurrentStateToObservers$1", f = "VerticalFilterPresenterImpl.kt", i = {}, l = {409}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class C extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f273366q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f273367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VerticalPromoBlockItem.VerticalFilterItem f273368s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(v vVar, VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f273367r = vVar;
        this.f273368s = verticalFilterItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f273367r, this.f273368s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f273366q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f273367r.f273599Y;
            this.f273366q = 1;
            if (e2Var.emit(this.f273368s, this) == coroutine_suspended) {
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
