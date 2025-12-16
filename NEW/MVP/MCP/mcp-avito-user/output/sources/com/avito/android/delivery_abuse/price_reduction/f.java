package com.avito.android.delivery_abuse.price_reduction;

import com.akita.compose.component.bottom_sheet.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PriceReductionBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_abuse.price_reduction.PriceReductionBottomSheetKt$HandleEvents$1$1$1", f = "PriceReductionBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f134839q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f134840r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f134841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.a<G0> aVar, I i12, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f134840r = aVar;
        this.f134841s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f134840r, this.f134841s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f134839q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ((b) this.f134840r).invoke();
            this.f134839q = 1;
            if (this.f134841s.a(this) == coroutine_suspended) {
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
