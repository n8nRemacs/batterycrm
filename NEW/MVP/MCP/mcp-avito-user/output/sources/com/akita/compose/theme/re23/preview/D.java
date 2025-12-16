package com.akita.compose.theme.re23.preview;

import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomSheetPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.theme.re23.preview.BottomSheetPreviewKt$BottomSheetPreviewImpl$4$2$1$1$2$1", f = "BottomSheetPreview.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class D extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f65301q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f65302r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f65303s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f65302r = uVar;
        this.f65303s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new D(this.f65302r, this.f65303s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((D) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65301q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
            this.f65301q = 1;
            if (this.f65302r.a(this.f65303s, "Bottom ToastBar", kotlin.G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
