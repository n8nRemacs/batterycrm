package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.C22061e3;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimeLinePreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.theme.re23.preview.TimeLinePreviewKt$TimeLinePreviewImpl$1$3", f = "TimeLinePreview.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class G3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f65342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.time_line.g f65343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC27462u0.c f65344s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(com.akita.compose.component.time_line.g gVar, AbstractC27462u0.c cVar, Continuation<? super G3> continuation) {
        super(2, continuation);
        this.f65343r = gVar;
        this.f65344s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G3(this.f65343r, this.f65344s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((G3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65342q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC27462u0.c cVar = this.f65344s;
            int iE2 = ((C22061e3) cVar.f65868e).e();
            com.akita.compose.component.time_line.g gVar = this.f65343r;
            ((C22061e3) gVar.f63123b).L3(iE2);
            int iE3 = ((C22061e3) cVar.f65868e).e();
            this.f65342q = 1;
            int i13 = iE3 - 1;
            if (i13 < 0) {
                i13 = 0;
            }
            Object objH = gVar.f63122a.h((gVar.f63126e * i13) + (gVar.f63125d * i13), this);
            if (objH != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objH = kotlin.G0.f406611a;
            }
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
