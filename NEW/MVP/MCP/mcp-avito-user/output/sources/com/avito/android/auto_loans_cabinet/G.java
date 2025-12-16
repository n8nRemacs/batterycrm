package com.avito.android.auto_loans_cabinet;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: AutoLoanCabinetViewLoanDetailsBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_loans_cabinet.AutoLoanCabinetViewLoanDetailsBottomSheetKt$AutoLoanCabinetViewLoanDetailsBottomSheet$hideBottomSheet$1", f = "AutoLoanCabinetViewLoanDetailsBottomSheet.kt", i = {}, l = {43, 45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class G extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95321q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f95322r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(com.akita.compose.component.bottom_sheet.I i12, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f95322r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G(this.f95322r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95321q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.akita.compose.component.bottom_sheet.I i13 = this.f95322r;
            if (i13.b()) {
                this.f95321q = 1;
                if (i13.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        this.f95321q = 2;
        if (C43131e0.b(150L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
