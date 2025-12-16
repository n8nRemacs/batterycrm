package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.gestures.C20438c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.bottom_sheet.BottomSheetKt$BottomSheet$7$1$1", f = "BottomSheet.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.akita.compose.component.bottom_sheet.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27319h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f60604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f60605r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27319h(I i12, Continuation<? super C27319h> continuation) {
        super(2, continuation);
        this.f60605r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C27319h(this.f60605r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C27319h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objF;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f60604q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f60604q = 1;
            I i13 = this.f60605r;
            if (i13.f60521a) {
                throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            }
            SheetValue sheetValue = SheetValue.f60563d;
            if (!i13.f60523c.invoke(sheetValue).booleanValue() || (objF = C20438c.f(i13.f60524d, sheetValue, this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objF = G0.f406611a;
            }
            if (objF == coroutine_suspended) {
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
