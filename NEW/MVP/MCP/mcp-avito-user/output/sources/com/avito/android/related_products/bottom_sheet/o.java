package com.avito.android.related_products.bottom_sheet;

import cj0.C27210c;
import cj0.InterfaceC27208a;
import cj0.InterfaceC27209b;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RelatedProductsBottomSheetViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$accept$1", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252935q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f252936r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27208a f252937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InterfaceC27208a interfaceC27208a, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f252936r = pVar;
        this.f252937s = interfaceC27208a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f252936r, this.f252937s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252935q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.arch.mvi.c<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b> cVarKe = this.f252936r.ke();
            this.f252935q = 1;
            if (cVarKe.ya(this.f252937s, this) == coroutine_suspended) {
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
