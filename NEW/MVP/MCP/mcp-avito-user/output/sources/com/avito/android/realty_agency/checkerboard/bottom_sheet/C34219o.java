package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LotItemOptionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.bottom_sheet.LotItemOptionsBottomSheetKt$LotListAdditionalOptionsBottomSheet$3$1$1$1", f = "LotItemOptionsBottomSheet.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34219o extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251045q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f251046r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34219o(com.akita.compose.component.bottom_sheet.I i12, Continuation<? super C34219o> continuation) {
        super(2, continuation);
        this.f251046r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34219o(this.f251046r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C34219o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251045q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f251045q = 1;
            if (this.f251046r.a(this) == coroutine_suspended) {
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
